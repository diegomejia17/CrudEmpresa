package DTO;

import lombok.Data;

import java.util.Date;

@Data
public class CompanyDTO {
    //create DTO for company
    private Long id;
    private String name;
    private String nit;
    private String address;
    private Date foundationDate;

    public boolean isComplete(){
        return name != null && nit != null && address != null && foundationDate != null;
    }
}
