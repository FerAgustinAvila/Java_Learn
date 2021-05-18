package org.ferdev.junitapp.model;

import org.ferdev.junitapp.exceptions.AmountInsufficientException;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

class AccountTest {
    Account account;

    @BeforeEach
    void initMethodTest(){
        this.account = new Account("Lanza", new BigDecimal("10000.2341"));
        System.out.println("iniciando el metodo");
    }

    @AfterEach
    void tearDown() {
        System.out.println("finalizando metodo de prueba");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("init el test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("end el test");
    }

    @Test
    @DisplayName("Probando el nombre de la cuenta corriente")
//    @Disabled // Deshabilita el test, pero se muestra de todas formas en la consola
    void testNombreAccount() {

//        Forza el error
//        fail();

//        Account account = new Account("Lanza", new BigDecimal("10000.2341"));
//      account.setPersona("Lanza");

        String expected = "Lanza";
        String real = account.getPersona();
//        assertNotNull( real, "La cuenta no puede ser nula" );
        assertNotNull( real, () -> "La cuenta no puede ser nula" );


        assertEquals( expected, real, "La cuenta ingresada esta mal, es " + expected + "!");
        assertTrue( real.equals("Lanza") );
    }

    @Test
    @DisplayName("Probando el saldo de la cc")
    void testSaldoAccount() {
        assertNotNull( account.getSaldo() );

//        assertEquals(1000.2156, account.getSaldo().doubleValue());
        assertEquals(10000.2341, account.getSaldo().doubleValue());
        assertFalse( account.getSaldo().compareTo( BigDecimal.ZERO ) < 0 );
        assertTrue( account.getSaldo().compareTo( BigDecimal.ZERO ) > 0 );
    }

    @Test
    void testReferAccount() {

        account = new Account("Fran Caceres", new BigDecimal("522525.123"));
        Account account2 = new Account("Fran Caceres", new BigDecimal("522525.123"));

//        assertNotEquals(account2, account1);
        assertEquals(account2, account);
    }

    @Test
    void testDebitoAccount() {
        account = new Account("Maxi Baggini", new BigDecimal("1000.12345"));

        account.debito(new BigDecimal(100));
        assertNotNull( account.getSaldo() );
        assertEquals(900, account.getSaldo().intValue());
        assertEquals("900.12345", account.getSaldo().toPlainString());
    }

    @Test
    void testCreditoAccount() {
        account = new Account("Maxi Baggini", new BigDecimal("1000.12345"));

        account.credito(new BigDecimal(100));
        assertNotNull( account.getSaldo() );
        assertEquals(1100, account.getSaldo().intValue());
        assertEquals("1100.12345", account.getSaldo().toPlainString());
    }

    @Test
    void testAmountInsufficientException() {
        account = new Account("Maxi Baggini", new BigDecimal("1000.12345"));

        Exception exception = assertThrows(AmountInsufficientException.class, ()->{
            account.debito( new BigDecimal(1500));
        });

        String actual = exception.getMessage();
        String expected = "Dinero insuficiente";
        assertEquals(expected, actual);
    }

    @Test
    void testTransferAmount() {

        Account destiny = new Account("Lucas Chavez", new BigDecimal("2500"));
        Account origin = new Account("Maxi Conci", new BigDecimal("1500"));

        Bank bank = new Bank();
        bank.setName("Banco Cordobe");
        bank.transfer( destiny, origin, new BigDecimal( 500 ));
        assertEquals("1000", origin.getSaldo().toPlainString() );
        assertEquals("3000", destiny.getSaldo().toPlainString() );

    }

    @Test
    void testRelationsAccountsBank() {

        Account destiny = new Account("Lucas Chavez", new BigDecimal("2500"));
        Account origin = new Account("Maxi Conci", new BigDecimal("1500"));

        Bank bank = new Bank();
        bank.addAccount( destiny );
        bank.addAccount( origin );
        bank.setName("Banco Cordobe");
        bank.transfer( destiny, origin, new BigDecimal( 500 ));

        assertAll(
                ()-> assertEquals("1000", origin.getSaldo().toPlainString() ),
                ()-> assertEquals("3000", destiny.getSaldo().toPlainString() ),
                ()-> assertEquals(2, bank.getAccounts().size() ),
                ()-> assertEquals("Banco Cordobe", destiny.getBank().getName()),
                ()-> assertTrue(bank.getAccounts().stream().anyMatch(ac -> ac.getPersona().equals("Maxi Conci")))

        );

/*
        assertEquals("1000", origin.getSaldo().toPlainString() );
        assertEquals("3000", destiny.getSaldo().toPlainString() );

        assertEquals(2, bank.getAccounts().size() );
        assertEquals("Banco Cordobe", destiny.getBank().getName());
        assertEquals("Maxi Conci", bank.getAccounts().stream()
                .filter(ac -> ac.getPersona().equals("Maxi Conci"))
                .findFirst().get().getPersona());

        assertTrue(bank.getAccounts().stream()
                .filter(ac -> ac.getPersona().equals("Maxi Conci"))
                .findFirst().isPresent());

        assertTrue(bank.getAccounts().stream()
                .anyMatch(ac -> ac.getPersona().equals("Maxi Conci")));
*/

    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void onlyWindows() {

    }

    @Test
    @EnabledOnOs({ OS.LINUX, OS.MAC})
    void onlyLinuxMac() {

    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    void notWindows() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void onlyJdk11(){

    }


    @Test
    @DisplayName("Probando env")
    void testSaldoAccountDev() {
        boolean isDev = "dev".equals(System.getProperty("ENV"));

        assumeTrue( isDev );
        assertNotNull( account.getSaldo() );

        assertEquals(10000.2341, account.getSaldo().doubleValue());
        assertFalse( account.getSaldo().compareTo( BigDecimal.ZERO ) < 0 );
        assertTrue( account.getSaldo().compareTo( BigDecimal.ZERO ) > 0 );
    }


}