package actions;

import gui.Frame;
import gui.InternalFrame;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

public class RedoAction extends AbstractAction {

	public RedoAction() {
        ClassLoader cl = this.getClass().getClassLoader();
		
		
		putValue(NAME, "Redo");
		putValue(SMALL_ICON, new ImageIcon(cl.getResource("redo.png")));
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke("ctrl shift Z"));
        putValue(ACTION_COMMAND_KEY, "Redo");
        putValue(SHORT_DESCRIPTION, "Redo");
		
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Action [" + e.getActionCommand() + "] performed!");
        InternalFrame view=(InternalFrame) Frame.getInstance().getDesk().getSelectedFrame();
        if (view == null) return;
		view.getCommandManager().doCommand();
    }
}