package hwy.frame;

import hwy.constant.FrameCons;
import hwy.exception.BusinessException;
import hwy.model.Param;
import hwy.util.StringUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class FrameButtonAction implements ActionListener {

    private JButton button;

    private JPanel panel;

    FrameButtonAction(JButton button, JPanel panel) {
        this.button = button;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 判断触发源是否为按钮
        if (e.getSource() == this.button) {
            try {
                Param param = getParam();
                //todo
            } catch (BusinessException be) {
                JOptionPane.showMessageDialog(panel, be.getMessage(), "错误说明", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private Param getParam() {
        Map<String, String> textMap = new HashMap<String, String>();
        for (Component component : panel.getComponents()) {
            if (component instanceof JTextField) {
                JTextField cur = (JTextField) component;
                if (StringUtil.isEmpty(cur.getText())) {
                    throw new BusinessException(cur.getName() + " is null");
                }
                textMap.put(cur.getName(), cur.getText());
            }
        }
        return new Param(
                textMap.get(FrameCons.URL_TEST_NAME),
                textMap.get(FrameCons.USERNAME_TEST_NAME),
                textMap.get(FrameCons.PASSWORD_TEST_NAME),
                textMap.get(FrameCons.TABLE_TEST_NAME),
                textMap.get(FrameCons.OUTPATH_TEST_NAME));
    }
}
