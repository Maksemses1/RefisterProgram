import javax.swing.*;

public class Main {
    static JFrame window = new JFrame("Program");
    public static void main(String[] args) {
        AddActionsButton.addActionsButton();
        InterfaceMenu interfaceMenu = new InterfaceMenu();
        window.setBounds(200,200, 500,500);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton[] mainMenu = interfaceMenu.getMainMenu();


        startMainMenu(mainMenu);
    }
    static void startMainMenu(JButton[] mainMenu){
        window.getContentPane().removeAll();
        window.getContentPane().repaint();
        for (JButton button : mainMenu){
            button.setVisible(true);
            window.add(button);
        }
        window.setLayout(null);
        window.setVisible(true);
    }

    static void startLoginMenu(JButton[] LoginMenuButton, JTextField[] LoginMenuTextField, JLabel[] LoginMenuLabel){
        window.getContentPane().removeAll();
        window.getContentPane().repaint();
        for (JButton button : LoginMenuButton){
            button.setVisible(true);
            window.add(button);
        }
        for (JTextField textField : LoginMenuTextField){
            textField.setVisible(true);
            window.add(textField);
        }
        for (JLabel label : LoginMenuLabel){
            label.setVisible(true);
            window.add(label);
        }
        window.setLayout(null);
        window.setVisible(true);
    }

    static void startCreateAccountMenu(JButton[] CreateAccountMenuButton, JTextField[] CreateAccountMenuTextField, JLabel[] CreateAccountMenuLabel){
        window.getContentPane().removeAll();
        window.getContentPane().repaint();
        for (JButton button : CreateAccountMenuButton){
            button.setVisible(true);
            window.add(button);
        }
        for (JTextField textField : CreateAccountMenuTextField){
            textField.setVisible(true);
            window.add(textField);
        }
        for (JLabel label : CreateAccountMenuLabel){
            label.setVisible(true);
            window.add(label);
        }
        window.setLayout(null);
        window.setVisible(true);
    }

    static void startUserWindow(JLabel[] userWindowLabel, JButton[] userWindowButton){
        window.getContentPane().removeAll();
        window.getContentPane().repaint();
        for (JLabel label : userWindowLabel){
            label.setVisible(true);
            window.add(label);
        }
        for (JButton button : userWindowButton){
            button.setVisible(true);
            window.add(button);
        }

        window.setLayout(null);
        window.setVisible(true);
    }
    static void startUserWindow(JLabel[] userWindowLabel, JButton[] userWindowButton, JTextField[] userWindowTextField){
        window.getContentPane().removeAll();
        window.getContentPane().repaint();
        for (JLabel label : userWindowLabel){
            label.setVisible(true);
            window.add(label);
        }
        for (JButton button : userWindowButton){
            button.setVisible(true);
            window.add(button);
        }
        for (JTextField textField : userWindowTextField){
            textField.setVisible(true);
            window.add(textField);
        }

        window.setLayout(null);
        window.setVisible(true);
    }
}
