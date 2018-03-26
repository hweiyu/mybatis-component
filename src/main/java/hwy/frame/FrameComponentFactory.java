package hwy.frame;

import hwy.constant.FrameCons;
import hwy.model.Position;

import javax.swing.*;

public class FrameComponentFactory {

    private FrameComponent component;

    private Position labelPos;

    private Position textPos;

    public FrameComponent create() {
        createBase();
        initResources();
        createPanel();
        return result();
    }

    private void createBase() {
        this.component = new FrameComponent();
        int step = 30;
        this.labelPos = new Position(10, 20, 100, 25, step);
        this.textPos = new Position(120, 20, 300, 25, step);
    }

    private void initResources() {
        initPanel();
        initJdbcConnect();
        initOutPath();
        initPackage();
        initButton();
    }

    private void initPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.component.setPanel(panel);
    }

    private void initJdbcConnect() {
        initIp();
        initPort();
        initDatabase();
        initUsername();
        initPassword();
        initTable();
    }

    private void initIp() {
        JLabel ipLabel = createLabel(FrameCons.IP_LABEL, labelPos);
        this.component.setIpLabel(ipLabel);
        JTextField ipText = createTextField(FrameCons.IP_TEXT_NAME, textPos);
        this.component.setIpText(ipText);
    }

    private void initPort() {
        JLabel portLabel = createLabel(FrameCons.PORT_LABEL, labelPos.nextY());
        this.component.setPortLabel(portLabel);
        JTextField portText = createTextField(FrameCons.PORT_TEXT_NAME, textPos.nextY());
        this.component.setPortText(portText);
    }

    private void initDatabase() {
        JLabel databaseLabel = createLabel(FrameCons.DATABASE_LABEL, labelPos.nextY());
        this.component.setDatabaseLabel(databaseLabel);
        JTextField databaseText = createTextField(FrameCons.DATABASE_TEXT_NAME, textPos.nextY());
        this.component.setDatabaseText(databaseText);
    }

    private void initUsername() {
        JLabel usernameLabel = createLabel(FrameCons.USERNAME_LABEL, labelPos.nextY());
        this.component.setUsernameLabel(usernameLabel);
        JTextField usernameText = createTextField(FrameCons.USERNAME_TEXT_NAME, textPos.nextY());
        this.component.setUsernameText(usernameText);
    }

    private void initPassword() {
        JLabel passwordLabel = createLabel(FrameCons.PASSWORD_LABEL, labelPos.nextY());
        this.component.setPasswordLabel(passwordLabel);
        JTextField passwordText = createTextField(FrameCons.PASSWORD_TEXT_NAME, textPos.nextY());
        this.component.setPasswordText(passwordText);
    }

    private void initTable() {
        JLabel tableLabel = createLabel(FrameCons.TABLE_LABEL, labelPos.nextY());
        this.component.setTableLabel(tableLabel);
        JTextField tableText = createTextField(FrameCons.TABLE_TEXT_NAME, textPos.nextY());
        this.component.setTableText(tableText);
    }

    private void initOutPath() {
        JLabel outLabel = createLabel(FrameCons.OUTPATH_LABEL, labelPos.nextY());
        this.component.setOutLabel(outLabel);
        JTextField outText = createTextField(FrameCons.OUTPATH_TEXT_NAME, textPos.nextY());
        this.component.setOutText(outText);
    }

    private void initPackage() {
        JLabel packageLabel = createLabel(FrameCons.PACKAGEPATH_LABEL, labelPos.nextY());
        this.component.setPackageLabel(packageLabel);
        JTextField packageText = createTextField(FrameCons.PACKAGEPATH_TEXT_NAME, textPos.nextY());
        this.component.setPackageText(packageText);
    }

    private void initButton() {
        JButton createBtn = new JButton(FrameCons.CREATE_BUTTON_NAME);
        createBtn.setBounds(labelPos.nextY().convertToRect());
        createBtn.addActionListener(new FrameButtonAction(createBtn, this.component.getPanel()));
        this.component.setCreateBtn(createBtn);
    }

    private JLabel createLabel(String text, Position pos) {
        JLabel label = new JLabel(text);
        label.setBounds(pos.convertToRect());
        return label;
    }

    private JTextField createTextField(String name, Position pos) {
        int textColumns = 20;
        JTextField textField = new JTextField(textColumns);
        textField.setName(name);
        textField.setBounds(pos.convertToRect());
        return textField;
    }

    private void createPanel() {
        JPanel panel = this.component.getPanel();
        panel.add(this.component.getIpLabel());
        panel.add(this.component.getIpText());
        panel.add(this.component.getPortLabel());
        panel.add(this.component.getPortText());
        panel.add(this.component.getDatabaseLabel());
        panel.add(this.component.getDatabaseText());
        panel.add(this.component.getUsernameLabel());
        panel.add(this.component.getUsernameText());
        panel.add(this.component.getPasswordLabel());
        panel.add(this.component.getPasswordText());
        panel.add(this.component.getTableLabel());
        panel.add(this.component.getTableText());
        panel.add(this.component.getOutLabel());
        panel.add(this.component.getOutText());
        panel.add(this.component.getPackageLabel());
        panel.add(this.component.getPackageText());
        panel.add(this.component.getCreateBtn());
    }

    private FrameComponent result() {
        return this.component;
    }

}
