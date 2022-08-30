package com.techelevator.tenmo.model;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Objects;

@Component
public class Account {

    @NotBlank
    private long accountId;
    @NotBlank
    private long userId;
    private BigDecimal balance;
    private String username;

    public Account() {
    }

    public Account(long accountId, long userId, BigDecimal balance) {
        this.accountId = accountId;
        this.userId = userId;
        this.balance = balance;
    }

    public Account(long accountId, long userId, BigDecimal balance, String username) {
        this.accountId = accountId;
        this.userId = userId;
        this.balance = balance;
        this.username = username;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return getUserId() == account.getUserId() && getAccountId() == account.getAccountId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getAccountId());
    }
}
