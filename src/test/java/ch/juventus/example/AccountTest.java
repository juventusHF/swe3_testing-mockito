package ch.juventus.example;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void testAddBalance() {
        Account account = new Account("1", BigDecimal.valueOf(20));
        account.addToBalance(BigDecimal.valueOf(10));
        assertEquals(BigDecimal.valueOf(30), account.getBalance());
    }

}