package com.example.banco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String accountCode;
    private Date createdDate;
    private Integer userId;
    private List<TransactionDTO> transactions;
}
