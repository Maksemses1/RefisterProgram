import javax.swing.*;
import java.awt.*;

public class UserInformation {
    private static final String[] FirstName = new String[10];
    private static final String[] SecondName = new String[10];
    private static final String[] Age = new String[10];

    private static int indexUser;

    static JLabel FirstNameLabel = new JLabel();
    static JLabel SecondNameLabel = new JLabel();
    static JLabel ageLabel = new JLabel();

    static JButton RefillInformationUserButton = new JButton("Редактировать информацию");
    static JButton ReturnButton = new JButton("Вернуться");
    static JButton SaveButton = new JButton("Сохранить");

    static JTextField FirstNameTextField = new JTextField();
    static JTextField SecondNameTextField = new JTextField();
    static JTextField ageTextField = new JTextField();
    public static void setIndexUser(int indexUser) {
        UserInformation.indexUser = indexUser;
    }

    public static int getIndexUser() {
        return indexUser;
    }

    static public void starterInformMenu(){
        Main.startUserWindow(getLabelInformArray(indexUser), getButtonInformArray());
    }

    static public void SaveInformInArray(String valueFirstName, String valueSecondName, String valueAge){
        FirstName[indexUser] = valueFirstName;
        SecondName[indexUser] = valueSecondName;
        Age[indexUser] = valueAge;
        Main.startUserWindow(getLabelInformArray(indexUser), getButtonInformArray());
    }

    static public JLabel[] getLabelInformArray(int index){
        FirstNameLabel.setText("Имя: "+FirstName[index]);
        SecondNameLabel.setText("Фамилия: "+SecondName[index]);
        ageLabel.setText("Возраст: "+Age[index]);
        FirstNameLabel.setBounds(20,40,450,50);
        FirstNameLabel.setFont(new Font(null, Font.PLAIN, 40));
        SecondNameLabel.setBounds(20,120,450,50);
        SecondNameLabel.setFont(new Font(null, Font.PLAIN, 40));
        ageLabel.setBounds(20,200,450,50);
        ageLabel.setFont(new Font(null, Font.PLAIN, 40));
        return new JLabel[]{FirstNameLabel, SecondNameLabel, ageLabel};
    }

    static public JLabel[] getLabelInformArray(){
        FirstNameLabel.setText("Имя: ");
        SecondNameLabel.setText("Фамилия: ");
        ageLabel.setText("Возраст: ");
        FirstNameLabel.setBounds(20,40,450,50);
        FirstNameLabel.setFont(new Font(null, Font.PLAIN, 40));
        SecondNameLabel.setBounds(20,120,450,50);
        SecondNameLabel.setFont(new Font(null, Font.PLAIN, 40));
        ageLabel.setBounds(20,200,450,50);
        ageLabel.setFont(new Font(null, Font.PLAIN, 40));
        return new JLabel[]{FirstNameLabel, SecondNameLabel, ageLabel};
    }

    static public JButton[] getButtonInformArray(){
        RefillInformationUserButton.setBounds(15,320,235,100);
        RefillInformationUserButton.setFont(new Font(null, Font.PLAIN, 14));
        ReturnButton.setBounds(270, 320,200,100);
        ReturnButton.setFont(new Font(null, Font.PLAIN, 23));
        return new JButton[]{ReturnButton, RefillInformationUserButton};
    }
    static public JButton[] getButtonRefillInformArray(){
        SaveButton.setBounds(15,320,235,100);
        SaveButton.setFont(new Font(null, Font.PLAIN, 20));
        ReturnButton.setBounds(270, 320,200,100);
        ReturnButton.setFont(new Font(null, Font.PLAIN, 23));
        return new JButton[]{ReturnButton, SaveButton};
    }

    static public JTextField[] getTextFieldInform(){
        FirstNameTextField.setBounds(120,40,200,50);
        SecondNameTextField.setBounds(210,120,200,50);
        ageTextField.setBounds(190,200,200,50);
        FirstNameTextField.setText(FirstName[indexUser]);
        SecondNameTextField.setText(SecondName[indexUser]);
        ageTextField.setText(Age[indexUser]);
        FirstNameTextField.setFont(new Font(null, Font.PLAIN, 25));
        SecondNameTextField.setFont(new Font(null, Font.PLAIN, 25));
        ageTextField.setFont(new Font(null, Font.PLAIN, 25));
        return new JTextField[]{FirstNameTextField,SecondNameTextField,ageTextField};
    }
}
