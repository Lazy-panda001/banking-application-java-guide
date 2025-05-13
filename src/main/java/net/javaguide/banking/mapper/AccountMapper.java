package net.javaguide.banking.mapper;

import net.javaguide.banking.dto.AccountDTO;
import net.javaguide.banking.entity.Account;

public class AccountMapper {

    // AccountDTO --> to AccountEntity JPA
    public static Account mapTpAccount(AccountDTO accountDTO) {
        Account account = new Account(
                accountDTO.getAccountHolderName(),
                accountDTO.getBalance(),
                accountDTO.getId()
        );

        return account;
    }

    // Account JPA Entity to --> AccountDTO

    public static AccountDTO mapToAccountDTO(Account account) {
        AccountDTO accountDTO = new AccountDTO(
                account.getAccountHolderName(),
                account.getBalance(),
                account.getId()
        );

        return accountDTO;
    }
}
