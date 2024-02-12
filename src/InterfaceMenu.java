import javax.swing.*;
import java.awt.*;

public class InterfaceMenu {
    // MainMenu
    static JButton join = new JButton("Войти в аккаунт");
    static JButton createAccount = new JButton("Создать аккаунт");
    static JButton ReturnButton = new JButton("Вернуться");

    public static JButton[] getMainMenu(){
        join.setBounds(165,190,150,50);
        createAccount.setBounds(165,260,150,50);
        return new JButton[]{join, createAccount};

    }
    static class CreateAccountMenu{
        static JTextField login = new JTextField();
        static JTextField password = new JTextField();
        static JTextField passwordRepeat = new JTextField();

        static JLabel loginText = new JLabel("Введите логин: ");
        static JLabel passwordText = new JLabel("Введите пароль: ");
        static JLabel passwordRepeatText = new JLabel("Повторите пароль: ");

        static JButton createAccountButton = new JButton("Зарегестрировать");

        static public JTextField[] getCreateAccountField(){
            login.setBounds(80, 50, 321, 50);
            login.setFont(new Font(null,0,26));
            password.setBounds(80, 140, 321, 50);
            password.setFont(new Font(null,0,26));
            passwordRepeat.setBounds(80, 230, 321, 50);
            passwordRepeat.setFont(new Font(null,0,26));

            return new JTextField[]{login, password, passwordRepeat};
        }

        static public JLabel[] getCreateAccountLabel(){
            loginText.setBounds(80, 0, 321, 70);
            loginText.setFont(new Font(null,0,20));
            passwordText.setBounds(80, 90, 321, 70);
            passwordText.setFont(new Font(null,0,20));
            passwordRepeatText.setBounds(80, 180, 321, 70);
            passwordRepeatText.setFont(new Font(null,0,20));
            return new JLabel[]{loginText, passwordText, passwordRepeatText};
        }

        static public JButton[] getCreateAccountButton(){
            createAccountButton.setFont(new Font(null,0,23));
            createAccountButton.setBounds(15,320,235,100);
            ReturnButton.setBounds(270, 320,200,100);
            ReturnButton.setFont(new Font(null, Font.PLAIN, 23));
            return new JButton[]{createAccountButton, ReturnButton};
        }
    }
    static class LoginMenu {
        static JTextField login = new JTextField();
        static JTextField password = new JTextField();
        static JButton confirm = new JButton("Войти");

        static JLabel MenuLoginErrorText = new JLabel("");
        static JLabel MenuLoginLoginText = new JLabel("Введите логин: ");
        static JLabel MenuLoginPasswordText = new JLabel("Введите пароль: ");
        public static JTextField[] getLoginMenuTextField() {
            login.setBounds(80, 100, 321, 70);
            login.setFont(new Font(null,0,30));
            password.setBounds(80, 220, 321, 70);
            password.setFont(new Font(null,0,30));
            return new JTextField[]{login, password};
        }


        public static JButton[] getLoginMenuButton() {
            confirm.setFont(new Font(null,0,23));
            confirm.setBounds(15,320,235,100);
            ReturnButton.setBounds(270, 320,200,100);
            ReturnButton.setFont(new Font(null, Font.PLAIN, 23));
            return new JButton[]{confirm, ReturnButton};
        }

        public static JLabel[] getLoginMenuLabel(String error) {
            MenuLoginErrorText.setBounds(20, 10, 500, 50);
            MenuLoginErrorText.setText(error);
            MenuLoginLoginText.setBounds(80, 50, 321, 70);
            MenuLoginLoginText.setFont(new Font(null,0,20));
            MenuLoginPasswordText.setBounds(80, 170, 321, 70);
            MenuLoginPasswordText.setFont(new Font(null,0,20));
            return new JLabel[]{MenuLoginLoginText, MenuLoginPasswordText, MenuLoginErrorText};
        }

        public static JLabel[] getLoginMenuLabel() {
            MenuLoginLoginText.setBounds(80, 50, 321, 70);
            MenuLoginLoginText.setFont(new Font(null,0,20));
            MenuLoginPasswordText.setBounds(80, 170, 321, 70);
            MenuLoginPasswordText.setFont(new Font(null,0,20));
            return new JLabel[]{MenuLoginLoginText, MenuLoginPasswordText, MenuLoginErrorText};
        }
    }

    static class UserWindow{
        static JLabel HiMessageText = new JLabel();
        static JLabel nicknameText = new JLabel();
        static JButton OpenMoreInfoButton = new JButton("Информация профиля");
        static JButton ExitFromAccountButton = new JButton("Выйти с аккаунта");

        public static JLabel[] getUserWindowLabel(int ID){
            HiMessageText.setText("Привет пользователь!");
            nicknameText.setText(LoginAndRegister.getLoginAtIndex(ID));
            nicknameText.setBounds(50, 100,500,50);
            nicknameText.setFont(new Font(null, 0, 40));
            HiMessageText.setBounds(50,50,500,50);
            HiMessageText.setFont(new Font(null, 0, 40));
            return new JLabel[]{HiMessageText, nicknameText};
        }
        public static JButton[] getUserWindowButton(){
            OpenMoreInfoButton.setBounds(40,270,200,100);
            OpenMoreInfoButton.setFont(new Font(null, 0, 15));
            ExitFromAccountButton.setBounds(260, 270,200,100);
            ExitFromAccountButton.setFont(new Font(null, 0, 23));
            return new JButton[]{OpenMoreInfoButton, ExitFromAccountButton};
        }
    }

}
