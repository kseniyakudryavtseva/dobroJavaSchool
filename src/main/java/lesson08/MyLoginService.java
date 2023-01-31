package lesson08;

public class MyLoginService implements LoginService {
    private final int maxSize;
    private int currentSize = 0;
    private User[] users;

    public MyLoginService(int size) {
        this.maxSize = size;
        this.users = new User[size];
    }


    @Override
    public void register(String login, String password, String confirmPassword) throws WrongLoginException,
            WrongPasswordException, UserLimitExceededException {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (users[i].getLogin().equals(login)) {
                    throw new WrongLoginException("Пользователь с логином " + login + " уже зарегистрирован в системе");
                }
            }
        }
        char[] loginResult = login.toCharArray();
        for (int i = 0; i < loginResult.length; i++) {
            if (!Character.isLetterOrDigit(loginResult[i])) {
                if (loginResult[i] != '_') {
                    System.out.println(!(Character.isLetterOrDigit(loginResult[i])));
                    throw new WrongLoginException("Логин содержит недопустимый символ " + loginResult[i]);
                }
            }
            if (loginResult.length < 3 || loginResult.length > 20) {
                throw new WrongLoginException("Логин должен быть больше 3х символов и меньше 20");
            }
        }
        //проверки пароля
        char[] passwordResult = password.toCharArray();
        for (int i = 0; i < passwordResult.length; i++) {
            if (!Character.isLetterOrDigit(passwordResult[i])) {
                if (passwordResult[i] != '_' && passwordResult[i] != '@' && passwordResult[i] != '$') {
                    throw new WrongPasswordException("Пароль содержит недопустимый символ " + passwordResult[i]);
                }
            }
            if (passwordResult.length < 10 || passwordResult.length > 20) {
                throw new WrongPasswordException("Пароль должен быть больше 10 символов и меньше 20");
            }
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        if (maxSize > currentSize) {
            users[currentSize] = new User(login, password.hashCode());
            System.out.println("Пользователь " + login + " зарегистрирован в системе");
            currentSize++;
        } else throw new UserLimitExceededException("Пользователь " + login + " не зарегистрирован. Превышен лимит");
    }

    @Override
    public void login(String login, String password) throws AuthException {
        boolean flag = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null ) {
                if (users[i].getLogin().equals(login)) {
                    if (users[i].getPasswordHash() == password.hashCode()) {
                        System.out.println("Пользователь " + login + " авторизован успешно");
                        flag = true;
                    }
                }
            }
        }
        if (!flag) {
            throw new AuthException("Неверный логин или пароль");
        }
    }
}

