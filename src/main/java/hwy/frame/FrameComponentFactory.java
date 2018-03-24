package hwy.frame;

import hwy.constant.FrameCons;

import javax.swing.*;

public class FrameComponentFactory {

    private FrameComponent component;

    public FrameComponent create() {
        createBase();
        initResources();
        createPanel();
        return result();
    }

    private void createBase() {
        this.component = new FrameComponent();
    }

    private void initResources() {
        initPanel();
        initUrl();
        initUsername();
        initPassword();
        initTable();
        initOutPath();
        initButton();
    }

    private void initPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.component.setPanel(panel);
    }

    private void initUrl() {
        JLabel urlLabel = createLabel("database url : ", 10, 20, 80, 25);
        this.component.setUrlLabel(urlLabel);
        JTextField urlText = createTextField(FrameCons.URL_TEST_NAME, 20, 100, 20, 550, 25);
        this.component.setUrlText(urlText);
    }

    private void initUsername() {
        JLabel usernameLabel = createLabel("user name : ", 10, 50, 80, 25);
        this.component.setUsernameLabel(usernameLabel);
        JTextField usernameText = createTextField(FrameCons.USERNAME_TEST_NAME, 20, 100, 50, 300, 25);
        this.component.setUsernameText(usernameText);
    }

    private void initPassword() {
        JLabel passwordLabel = createLabel("password : ", 10, 80, 80, 25);
        this.component.setPasswordLabel(passwordLabel);
        JTextField passwordText = createTextField(FrameCons.PASSWORD_TEST_NAME, 20, 100, 80, 300, 25);
        this.component.setPasswordText(passwordText);
    }

    private void initTable() {
        JLabel tableLabel = createLabel("table name : ", 10, 110, 80, 25);
        this.component.setTableLabel(tableLabel);
        JTextField tableText = createTextField(FrameCons.TABLE_TEST_NAME, 20, 100, 110, 300, 25);
        this.component.setTableText(tableText);
    }

    private void initOutPath() {
        JLabel outLabel = createLabel("output path : ", 10, 140, 80, 25);
        this.component.setOutLabel(outLabel);
        JTextField outText = createTextField(FrameCons.OUTPATH_TEST_NAME, 20, 100, 140, 300, 25);
        this.component.setOutText(outText);
    }

    private JLabel createLabel(String text, int x, int y, int width, int height) {
        JLabel label = new JLabel(text);
        label.setBounds(x, y, width, height);
        return label;
    }

    private JTextField createTextField(String name, int columns, int x, int y, int width, int height) {
        JTextField textField = new JTextField(columns);
        textField.setName(name);
        textField.setBounds(x, y, width, height);
        return textField;
    }

    private void initButton() {
        JButton createBtn = new JButton("create");
        createBtn.setBounds(10, 170, 80, 25);
        createBtn.addActionListener(new FrameButtonAction(createBtn, this.component.getPanel()));
        this.component.setCreateBtn(createBtn);
    }

    private void createPanel() {
        JPanel panel = this.component.getPanel();
        panel.add(this.component.getUrlLabel());
        panel.add(this.component.getUrlText());
        panel.add(this.component.getUsernameLabel());
        panel.add(this.component.getUsernameText());
        panel.add(this.component.getPasswordLabel());
        panel.add(this.component.getPasswordText());
        panel.add(this.component.getTableLabel());
        panel.add(this.component.getTableText());
        panel.add(this.component.getOutLabel());
        panel.add(this.component.getOutText());
        panel.add(this.component.getCreateBtn());
    }

    private FrameComponent result() {
        return this.component;
    }

}
