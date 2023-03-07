package com.registro.comercio.Controller;

import DTO.CompanyDTO;
import com.registro.comercio.Service.API.CompanyServiceAPI;
import com.registro.comercio.Service.Impl.ComerceServiceImpl;
import com.registro.comercio.model.Company;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/companies")
public class CompanyController {
    private final ComerceServiceImpl companyServiceImpl;
    @GetMapping("")
    public List<Company> getAll(){
        return companyServiceImpl.getAll();
    }
    @GetMapping("/{id}")
    public Company get (@PathVariable  Long id){
        return companyServiceImpl.get(id);
    }
    @PostMapping("")
    public ResponseEntity<CompanyDTO> save(@RequestBody CompanyDTO companyDTO){
        return companyServiceImpl.save(companyDTO);
    }

    @PutMapping ("/{id}")
    public ResponseEntity<CompanyDTO> update(@PathVariable Long id, @RequestBody CompanyDTO companyDTO){
        return companyServiceImpl.update(id, companyDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
         companyServiceImpl.delete(id);
    }







}
