package com.PatikaDev.View;

import com.PatikaDev.Helper.Config;
import com.PatikaDev.Helper.Helper;
import com.PatikaDev.Model.Patika;

import javax.swing.*;

public class UpdatePatikaGUI extends JFrame{
    private JPanel wrapper;
    private JTextField fld_patika_name;
    private JButton btn_update;
    private Patika patika;
    public UpdatePatikaGUI(Patika patika) {
        this.patika = patika;
        add(wrapper);
        setSize(300, 150);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        fld_patika_name.setText(patika.getName());
        btn_update.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_patika_name)) {
                Helper.showMessage("fill");
            } else {
                if (Patika.update(patika.getId(), fld_patika_name.getText())) {
                    Helper.showMessage("done");
                }
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        Helper.setLayout();
        Patika p = new Patika(1, "Frontend");
        UpdatePatikaGUI up = new UpdatePatikaGUI(p);
    }
}
