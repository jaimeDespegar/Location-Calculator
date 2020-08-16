package implementation.view;

import views.MyViewComponent;
import views.View;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class LoginComponent implements MyViewComponent {

    private LoginViewConfiguration loginViewConfiguration;

    @Override
    public List<JComponent> getComponents(View context) {
        List<JComponent> components = new ArrayList<>();
        JButton button = new JButton("Loggin Settings");
        button.setBounds(325, 53, 120, 23);
        button.addActionListener(i -> this.init(context));
        components.add(button);
        return components;
    }

    private void init(View context) {
        this.loginViewConfiguration = new LoginViewConfiguration(context);
    }

}