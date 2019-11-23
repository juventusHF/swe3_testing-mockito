package ch.juventus.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TransferServiceImplTest {

    @Mock
    private AccountRepository accountRepository;

    private Account fromAccount = new Account("1", BigDecimal.valueOf(50));
    private Account toAccount = new Account("2", BigDecimal.valueOf(80));

    @BeforeEach
    public void setupMocks() {
        // TODO
        // train the accountRepository mock
        //   return fromAccount when findById("1") is invoked
        //   return toAccount when findById("2") is invoked
    }

    @Test
    public void testTransferMoney() {

        TransferServiceImpl service = new TransferServiceImpl(accountRepository);
        service.transferMoney(fromAccount.getId(), toAccount.getId(), BigDecimal.valueOf(25.50));

        assertEquals(BigDecimal.valueOf(24.50), fromAccount.getBalance());
        assertEquals(BigDecimal.valueOf(105.50), toAccount.getBalance());

        // TODO
        // verify that accountRepository.update was called for fromAccount and toAccount

    }

}