package hwy.frame;

import javax.swing.*;

/**
 * 主窗体中的所有组件
 */
public class FrameComponent {

    private JPanel panel;

    private JLabel ipLabel;
    private JTextField ipText;

    private JLabel portLabel;
    private JTextField portText;

    private JLabel databaseLabel;
    private JTextField databaseText;

    private JLabel usernameLabel;
    private JTextField usernameText;

    private JLabel passwordLabel;
    private JTextField passwordText;

    private JLabel tableLabel;
    private JTextField tableText;

    private JLabel outLabel;
    private JTextField outText;

    private JLabel packageLabel;
    private JTextField packageText;

    private JButton createBtn;

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getIpLabel() {
        return ipLabel;
    }

    public void setIpLabel(JLabel ipLabel) {
        this.ipLabel = ipLabel;
    }

    public JTextField getIpText() {
        return ipText;
    }

    public void setIpText(JTextField ipText) {
        this.ipText = ipText;
    }

    public JLabel getPortLabel() {
        return portLabel;
    }

    public void setPortLabel(JLabel portLabel) {
        this.portLabel = portLabel;
    }

    public JTextField getPortText() {
        return portText;
    }

    public void setPortText(JTextField portText) {
        this.portText = portText;
    }

    public JLabel getDatabaseLabel() {
        return databaseLabel;
    }

    public void setDatabaseLabel(JLabel databaseLabel) {
        this.databaseLabel = databaseLabel;
    }

    public JTextField getDatabaseText() {
        return databaseText;
    }

    public void setDatabaseText(JTextField databaseText) {
        this.databaseText = databaseText;
    }

    public JLabel getUsernameLabel() {
        return usernameLabel;
    }

    public void setUsernameLabel(JLabel usernameLabel) {
        this.usernameLabel = usernameLabel;
    }

    public JTextField getUsernameText() {
        return usernameText;
    }

    public void setUsernameText(JTextField usernameText) {
        this.usernameText = usernameText;
    }

    public JLabel getPasswordLabel() {
        return passwordLabel;
    }

    public void setPasswordLabel(JLabel passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public JTextField getPasswordText() {
        return passwordText;
    }

    public void setPasswordText(JTextField passwordText) {
        this.passwordText = passwordText;
    }

    public JLabel getTableLabel() {
        return tableLabel;
    }

    public void setTableLabel(JLabel tableLabel) {
        this.tableLabel = tableLabel;
    }

    public JTextField getTableText() {
        return tableText;
    }

    public void setTableText(JTextField tableText) {
        this.tableText = tableText;
    }

    public JLabel getOutLabel() {
        return outLabel;
    }

    public void setOutLabel(JLabel outLabel) {
        this.outLabel = outLabel;
    }

    public JTextField getOutText() {
        return outText;
    }

    public void setOutText(JTextField outText) {
        this.outText = outText;
    }

    public JButton getCreateBtn() {
        return createBtn;
    }

    public void setCreateBtn(JButton createBtn) {
        this.createBtn = createBtn;
    }

    public JLabel getPackageLabel() {
        return packageLabel;
    }

    public void setPackageLabel(JLabel packageLabel) {
        this.packageLabel = packageLabel;
    }

    public JTextField getPackageText() {
        return packageText;
    }

    public void setPackageText(JTextField packageText) {
        this.packageText = packageText;
    }
}
