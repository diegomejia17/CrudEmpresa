package com.registro.comercio.Service.Impl;

import DTO.CompanyDTO;
import com.registro.comercio.Commons.GenericServiceImpl;
import com.registro.comercio.DAO.CompanyDAO;

import com.registro.comercio.Service.API.CompanyServiceAPI;

import com.registro.comercio.model.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ComerceServiceImpl extends GenericServiceImpl<Company, Long> implements CompanyServiceAPI {
    private final CompanyDAO companyDAO;

    @Override
    public CrudRepository<Company, Long> getDao() {
        return companyDAO;
    }

    @Override
    public ResponseEntity<CompanyDTO> save(CompanyDTO companyDTO) {

        if(!companyDTO.isComplete()) return ResponseEntity.badRequest().build();
       Company company = new Company();
        company.setAddress(companyDTO.getAddress());
        company.setNit(companyDTO.getNit());
        company.setName(companyDTO.getName());
        company.setFoundationDate(companyDTO.getFoundationDate());
        companyDAO.save(company);
        return new ResponseEntity<>(companyDTO, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<CompanyDTO> update(Long id, CompanyDTO companyDTO) {
        if(!companyDTO.isComplete()) return ResponseEntity.badRequest().build();

        Company company = companyDAO.findById(id).orElse(null);
        if(company == null) return ResponseEntity.notFound().build();

        company.setAddress(companyDTO.getAddress());
        company.setNit(companyDTO.getNit());
        company.setName(companyDTO.getName());
        company.setFoundationDate(companyDTO.getFoundationDate());
        companyDAO.save(company);
        return new ResponseEntity<>(companyDTO, HttpStatus.OK);
    }
}
