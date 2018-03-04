package ch.juventus.example;

public interface AccountRepository {

    Account findById(String id);

    void update(Account account);
}
