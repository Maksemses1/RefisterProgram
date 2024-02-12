public class LoginAndRegister {
    private static final String[] logins = new String[10];
    private static final String[] Passwords = new String[10];

    static public String getLoginAtIndex(int index){
        return logins[index];
    }
    public static void Login(String valueLogin, String valuePassword){
        Main.window.getContentPane().removeAll();
        Main.window.getContentPane().repaint();
        System.out.println("Пытаюсь войти");
        int codeTryLogin = tryLogin(valueLogin, valuePassword);
        if (codeTryLogin >= 0){
            UserInformation.setIndexUser(codeTryLogin);
            Main.startUserWindow(InterfaceMenu.UserWindow.getUserWindowLabel(codeTryLogin),
                    InterfaceMenu.UserWindow.getUserWindowButton());
        }
        else{
            Main.startLoginMenu(InterfaceMenu.LoginMenu.getLoginMenuButton(),
                    InterfaceMenu.LoginMenu.getLoginMenuTextField(),
                    InterfaceMenu.LoginMenu.getLoginMenuLabel("Данные введены не коректно"));
        }
    }

    public static void tryCreateAccount(String Login, String Password, String PasswordRepeat){
        Main.window.getContentPane().removeAll();
        Main.window.getContentPane().repaint();
        System.out.println(Login +"   "+Password+"    "+PasswordRepeat);
        if (!Password.equals(PasswordRepeat)){
            Main.startCreateAccountMenu(InterfaceMenu.CreateAccountMenu.getCreateAccountButton(),
                    InterfaceMenu.CreateAccountMenu.getCreateAccountField(),
                    InterfaceMenu.CreateAccountMenu.getCreateAccountLabel());
            System.out.println("Не совпадают");
        }
        else {
            for (int i = 0; i<logins.length;i++){
                if (logins[i] != null) {
                    if (logins[i].equals(Login)){
                        Main.startCreateAccountMenu(InterfaceMenu.CreateAccountMenu.getCreateAccountButton(),
                                InterfaceMenu.CreateAccountMenu.getCreateAccountField(),
                                InterfaceMenu.CreateAccountMenu.getCreateAccountLabel());
                        System.out.println("Занято");
                        break;
                    }
                }
                else {
                    logins[i] = Login;
                    Passwords[i] = Password;
                    System.out.println("Создан");
                    Main.startMainMenu(InterfaceMenu.getMainMenu());
                    break;
                }

            }
        }
    }


    public static int tryLogin(String valueLogin, String valuePassword){
        for (int i = 0; i<logins.length;i++){
            if(logins[i] != null){
                if (logins[i].equals(valueLogin) && Passwords[i].equals(valuePassword)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
