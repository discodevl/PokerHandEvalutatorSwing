package com.don.poker;

import com.don.poker.control.ControlFrame;
import com.don.poker.control.ControlView;
import com.don.poker.model.Model;
import com.don.poker.view.DialogView;
import com.don.poker.view.Frame;
import com.don.poker.view.View;
import javax.swing.SwingUtilities;

public class Application {
    
    private static Application singleton = new Application();
    
    private Application() {}
    
    public static Application getInstance() {
        return singleton;
    }
    
    ControlFrame cFrame = new ControlFrame();
    ControlView cView = new ControlView();
    Frame frame = new Frame();
    View view = new View();
    Model model = new Model();
    DialogView dialogV = new DialogView(frame, true);

    public ControlFrame getControlFrame() {
        return cFrame;
    }
    
    public DialogView getDialogView() {
        return dialogV;
    }

    public ControlView getControlView() {
        return cView;
    }

    public Frame getFrame() {
        return frame;
    }

    public View getView() {
        return view;
    }

    public Model getModel() {
        return model;
    }
    
    private void exe() {
        frame.init();
        view.init();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Application.getInstance().exe();
            }
        });
    }

}
