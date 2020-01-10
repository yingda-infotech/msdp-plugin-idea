package cn.com.git.msdp.plugin;

import cn.com.git.msdp.plugin.business.BusinessDialog;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class BusinessGenerator extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        BusinessDialog dialog = new BusinessDialog();
        dialog.pack();
        dialog.setVisible(true);
    }
}
