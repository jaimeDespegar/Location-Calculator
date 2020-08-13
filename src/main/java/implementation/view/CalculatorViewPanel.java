package implementation.view;

import views.PanelConfiguration;
import views.View;
import javax.swing.*;

public class CalculatorViewPanel implements PanelConfiguration {

    private JTextField txtUser;
    private JTextField txtPassword;
    private JButton btnIngresar;

    @Override
    public JPanel buildPanel(View mainView) {
        JPanel panel = new JPanel();
        panel.setBounds(10, 11, 307, 123);
        panel.setLayout(null);

        JLabel lblNombreYApellido = new JLabel("User");
        lblNombreYApellido.setBounds(10, 11, 113, 14);
        panel.add(lblNombreYApellido);

        JLabel lblTelfono = new JLabel("Password");
        lblTelfono.setBounds(10, 52, 113, 14);
        panel.add(lblTelfono);

        txtUser = new JTextField();
        txtUser.setBounds(133, 8, 164, 20);
        panel.add(txtUser);
        txtUser.setColumns(10);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(133, 49, 164, 20);
        panel.add(txtPassword);
        txtPassword.setColumns(10);

        btnIngresar = new JButton("Ingresar");
        btnIngresar.addActionListener(i -> this.paintScreen(mainView));
        btnIngresar.setBounds(108, 88, 89, 23);
        panel.add(btnIngresar);

        return panel;
    }

    private void paintScreen(View mainView) {
        JLabel lblTelfono = new JLabel("My user is Jaime!");
        lblTelfono.setBounds(15, 82, 213, 14);
        mainView.getMainPanel().add(lblTelfono);
        mainView.repaint();
        mainView.closeViewConfiguration();
    }

}