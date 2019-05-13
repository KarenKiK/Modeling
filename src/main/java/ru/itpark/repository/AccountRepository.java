package ru.itpark.repository;

import ru.itpark.domain.Account;

public class AccountRepository {
    private Account[] items = new Account[1000]; // null
    private int index = 0;

    // CRUD
    // Create - создавать/добавлять объект
    // Read - читать (список/конкретный)
    // Update - обновлять
    // Delete - удалять
    public void add(Account account) {
        items[index] = account;
        index++;
    }

    public void updateByIndex(Account account, int index) {
        items[index] = account;
    }

    public Account getByIndex(int index) {
        return items[index];
    }
}
