import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddActionsButton {
    static public void addActionsButton(){
        ActionListener ClickJoin = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.startLoginMenu(InterfaceMenu.LoginMenu.getLoginMenuButton(), InterfaceMenu.LoginMenu.getLoginMenuTextField(), InterfaceMenu.LoginMenu.getLoginMenuLabel());
            }
        };
        InterfaceMenu.join.addActionListener(ClickJoin);

        ActionListener ClickCreateAccount = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.startCreateAccountMenu(InterfaceMenu.CreateAccountMenu.getCreateAccountButton(),
                        InterfaceMenu.CreateAccountMenu.getCreateAccountField(),
                        InterfaceMenu.CreateAccountMenu.getCreateAccountLabel());
            }
        };
        InterfaceMenu.createAccount.addActionListener(ClickCreateAccount);

        ActionListener clickButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valueLogin = InterfaceMenu.CreateAccountMenu.login.getText();
                String valuePassword = InterfaceMenu.CreateAccountMenu.password.getText();
                String valuePasswordRepeat = InterfaceMenu.CreateAccountMenu.passwordRepeat.getText();
                LoginAndRegister.tryCreateAccount(valueLogin, valuePassword, valuePasswordRepeat);

            }
        };
        InterfaceMenu.CreateAccountMenu.createAccountButton.addActionListener(clickButton);

        ActionListener ClickButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valueLogin = InterfaceMenu.LoginMenu.login.getText();
                String valuePassword = InterfaceMenu.LoginMenu.password.getText();
                LoginAndRegister.Login(valueLogin, valuePassword);
            }
        };
        InterfaceMenu.LoginMenu.confirm.addActionListener(ClickButton);

        ActionListener clickOpen = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserInformation.starterInformMenu();
            }
        };
        ActionListener clickExit = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.startMainMenu(InterfaceMenu.getMainMenu());
            }
        };
        InterfaceMenu.UserWindow.OpenMoreInfoButton.addActionListener(clickOpen);
        InterfaceMenu.UserWindow.ExitFromAccountButton.addActionListener(clickExit);


        ActionListener ClickReturnButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.startUserWindow(InterfaceMenu.UserWindow.getUserWindowLabel(UserInformation.getIndexUser()), InterfaceMenu.UserWindow.getUserWindowButton());
            }
        };
        ActionListener ClickRefillButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.startUserWindow(UserInformation.getLabelInformArray(), UserInformation.getButtonRefillInformArray(), UserInformation.getTextFieldInform());
            }
        };
        UserInformation.RefillInformationUserButton.addActionListener(ClickRefillButton);
        UserInformation.ReturnButton.addActionListener(ClickReturnButton);

        ActionListener SaveInform = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valueFirstName = UserInformation.FirstNameTextField.getText();
                String valueSecondName = UserInformation.SecondNameTextField.getText();
                String valueAge = UserInformation.ageTextField.getText();
                UserInformation.SaveInformInArray(valueFirstName, valueSecondName, valueAge);
            }
        };
        UserInformation.SaveButton.addActionListener(SaveInform);

        ActionListener ReturnMainMenu = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.startMainMenu(InterfaceMenu.getMainMenu());
            }
        };
        InterfaceMenu.ReturnButton.addActionListener(ReturnMainMenu);
    }
}
