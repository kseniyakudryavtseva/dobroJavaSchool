package lesson08;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.function.Executable;

public class LoginServiceTest {
    MyLoginService myLoginService = new MyLoginService(1);

    @BeforeEach
    public void beforeEach() {
        myLoginService = new MyLoginService(1);
    }

    @Test
    public void testRegisterOk() {
        myLoginService.register("testovy_klient1", "12345678900_@", "12345678900_@");
    }

    @Test
    public void testRegisterWrongLoginException() {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                myLoginService.register("testovy_klient@", "12345678900_@", "12345678900_@");
            }
        };
        Assertions.assertThrows(WrongLoginException.class, executable);
    }

    @Test
    public void testRegisterShortLogin() {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                myLoginService.register("tes", "12345678900_@", "12345678900_@");
            }
        };
        Assertions.assertThrows(WrongLoginException.class, executable);
    }

    @Test
    public void testRegisterUserAlreadyExist() {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                myLoginService.register("test", "12345678900_@", "12345678900_@");
                myLoginService.register("test", "12345678900_@", "12345678900_@");
            }
        };
        Assertions.assertThrows(WrongLoginException.class, executable);
    }

    @Test
    public void testRegisterShortPassword() {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                myLoginService.register("test", "123", "123");

            }
        };
        Assertions.assertThrows(WrongPasswordException.class, executable);
    }

    @Test
    public void testRegisterPasswordMismatch() {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                myLoginService.register("test", "12345678900", "12345678901");

            }
        };
        Assertions.assertThrows(WrongPasswordException.class, executable);
    }

    @Test
    public void testRegisterLimitExceeded() {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                myLoginService.register("test", "12345678900", "12345678900");
                myLoginService.register("test1", "12345678900", "12345678900");

            }
        };
        Assertions.assertThrows(UserLimitExceededException.class, executable);
    }


    @Test
    public void testLoginError() {
        Executable executable = new Executable() {
            @Override
            public void execute() throws Throwable {
                myLoginService.login("testovyklient9", "12345678900");
            }
        };
        Assertions.assertThrows(AuthException.class, executable);

    }

    @Test
    public void testLoginOk() {
        myLoginService.register("testovy_klient1", "12345678900_@", "12345678900_@");
        myLoginService.login("testovy_klient1", "12345678900_@");
    }
}
