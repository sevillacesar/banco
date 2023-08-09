package com.example.banco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String code;
    private String firstname;
    private String lastname;
    private Integer age;
    private String userType;
    private String position;
    private List<AccountDTO> accounts;
}
