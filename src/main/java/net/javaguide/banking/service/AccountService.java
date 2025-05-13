package net.javaguide.banking.service;

import net.javaguide.banking.dto.AccountDTO;

import java.util.List;

public interface AccountService {

    AccountDTO createAccount(AccountDTO accountDTO);

    AccountDTO getAccountById(Long id);

    AccountDTO deposit(Long id, double amount);

    AccountDTO withdrow(Long id, double amount);

    List<AccountDTO> getAllAccounts();

    void deleteAccountById(Long id);

}
