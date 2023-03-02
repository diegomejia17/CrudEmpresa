package com.registro.comercio.DAO;

import com.registro.comercio.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyDAO extends JpaRepository<Company,Long> {

}
