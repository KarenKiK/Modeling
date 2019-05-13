package ru.itpark.service;

import ru.itpark.domain.Account;
import ru.itpark.repository.AccountRepository;

public class AccountService {
    private AccountRepository repository;

    // ограничить весь мир в способе создания наших объектов
    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    // бизнес-логика
    public void transfer(int senderId, int recipientId) {
        Account sender = repository.getByIndex(senderId);
        Account recipient = repository.getByIndex(recipientId);
        // TODO: проверки и перевод
    }
}
