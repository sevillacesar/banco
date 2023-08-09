package com.example.banco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String type;
    private Double value;
    private String description;
    private Integer accountId;
}
