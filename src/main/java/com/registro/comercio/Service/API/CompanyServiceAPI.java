package com.registro.comercio.Service.API;

import DTO.CompanyDTO;
import com.registro.comercio.Commons.GenericServiceAPI;
import com.registro.comercio.model.Company;
import org.springframework.http.ResponseEntity;

public interface CompanyServiceAPI extends GenericServiceAPI<Company, Long> {

    ResponseEntity<CompanyDTO> save(CompanyDTO companyDTO);
    ResponseEntity<CompanyDTO> update(Long id, CompanyDTO companyDTO);
}
