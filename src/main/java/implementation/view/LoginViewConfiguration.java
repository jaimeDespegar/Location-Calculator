package implementation.view;

import views.PanelConfiguration;
import views.View;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class LoginViewConfiguration extends JFrame implements PanelConfiguration {

	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField txtPassword;
	private JButton btnIngresar;
	private JLabel lblUserName;

	public LoginViewConfiguration(View mainView) {
		super();

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(800, 180, 343, 183);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(this.contentPane);
		this.contentPane.setLayout(null);
		this.contentPane.add(this.buildPanel(mainView));
		this.setVisible(true);
	}

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

		lblUserName = new JLabel("");
		lblUserName.setBounds(230, 26, 213, 14);
		mainView.getMainPanel().add(lblUserName);

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
		btnIngresar.setBounds(108, 88, 95, 23);
		panel.add(btnIngresar);

		return panel;
	}

	private void paintScreen(View mainView) {
		((JLabel) mainView.getMainPanel().getComponentAt(230,26)).setText("¡Hola usuario " + this.txtUser.getText() + "!");
		mainView.repaint();
		this.dispose();
	}

}