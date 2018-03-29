package hwy.frame;

import hwy.constant.FrameCons;
import hwy.exception.BusinessException;
import hwy.handle.HandlerChain;
import hwy.model.param.ConfigParam;
import hwy.model.param.ConnectionParam;
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
    public void actionPerformed(ActionEvent event) {
        // 判断触发源是否为按钮
        if (event.getSource() == this.button) {
            try {
                new HandlerChain(getConfig()).result();
                JOptionPane.showMessageDialog(panel, "完成", "操作结果", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(panel, e.getMessage(),
                        "错误说明", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private ConfigParam getConfig() {
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
        return new ConfigParam(
                textMap.get(FrameCons.OUTPATH_TEXT_NAME),
                textMap.get(FrameCons.PACKAGEPATH_TEXT_NAME),
                getJdbcConfig(textMap));
    }

    private ConnectionParam getJdbcConfig(Map<String, String> textMap) {
        return new ConnectionParam(
                textMap.get(FrameCons.IP_TEXT_NAME),
                textMap.get(FrameCons.PORT_TEXT_NAME),
                textMap.get(FrameCons.DATABASE_TEXT_NAME),
                textMap.get(FrameCons.USERNAME_TEXT_NAME),
                textMap.get(FrameCons.PASSWORD_TEXT_NAME),
                textMap.get(FrameCons.TABLE_TEXT_NAME));
    }
}
