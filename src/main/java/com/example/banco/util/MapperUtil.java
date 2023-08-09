package com.example.banco.util;

import com.example.banco.dto.AccountDTO;
import com.example.banco.dto.TransactionDTO;
import com.example.banco.dto.UserDTO;
import com.example.banco.entity.Account;
import com.example.banco.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapperUtil {
    public static UserDTO mapperUserToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setCode(user.getCode());
        userDTO.setFirstname(user.getFirstname());
        userDTO.setLastname(user.getLastname());
        userDTO.setUserType(user.getUserType());
        userDTO.setAge(user.getAge());
        List<AccountDTO> accountsDTO = new ArrayList<>();
        for (Account account: user.getAccounts()) {
            List<TransactionDTO> transactionsDTO = account.getTransactions()
                    .stream()
                    .map(tx -> new TransactionDTO(tx.getId(), tx.getType(), tx.getValue(), tx.getDescription(), tx.getAccount().getId()))
                    .collect(Collectors.toList());
            AccountDTO accountDTO = new AccountDTO(account.getId(), account.getAccountCode(), account.getCreatedDate(), account.getUser().getId(), transactionsDTO);
            accountsDTO.add(accountDTO);
        }
        userDTO.setAccounts(accountsDTO);
        return userDTO;
    }
}
