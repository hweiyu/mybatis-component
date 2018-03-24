package hwy.frame;

import javax.swing.*;

public class FrameComponent {

    private JPanel panel;

    private JLabel urlLabel;
    private JTextField urlText;

    private JLabel usernameLabel;
    private JTextField usernameText;

    private JLabel passwordLabel;
    private JTextField passwordText;

    private JLabel tableLabel;
    private JTextField tableText;

    private JLabel outLabel;
    private JTextField outText;

    private JButton createBtn;

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getUrlLabel() {
        return urlLabel;
    }

    public void setUrlLabel(JLabel urlLabel) {
        this.urlLabel = urlLabel;
    }

    public JTextField getUrlText() {
        return urlText;
    }

    public void setUrlText(JTextField urlText) {
        this.urlText = urlText;
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
}
