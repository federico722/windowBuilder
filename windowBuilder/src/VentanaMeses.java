import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaMeses implements ActionListener {

	 JFrame frame;
	private JTextField textMes1;
	private JTextField textMes2;
	private JTextField textMes3;
	private JTextField textMes4;
	private JTextField textMes5;
	private JTextField textMes6;
	private JTextField textMes7;
	private JTextField textMes8;
	private JTextField textMes9;
	private JTextField textMes10;
	private JTextField textMes11;
	private JTextField textMes12;
    private JButton btnCalcularProm;
    private JButton btnCalcularMayor;


	

	/**
	 * Create the application.
	 */
	public VentanaMeses() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 710, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setTitle("VENTANA MESES!");
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		JLabel lblTitulo = new JLabel("VENTAS MESES");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTitulo.setBounds(0, 0, 696, 31);
		frame.getContentPane().add(lblTitulo);
		
		textMes1 = new JTextField();
		textMes1.setBounds(117, 41, 86, 19);
		frame.getContentPane().add(textMes1);
		textMes1.setColumns(10);
		
		JLabel lblEnero = new JLabel("ENERO:");
		lblEnero.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEnero.setBounds(35, 41, 72, 21);
		frame.getContentPane().add(lblEnero);
		
	    btnCalcularProm = new JButton("PROMEDIO");
		btnCalcularProm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCalcularProm.setBounds(27, 345, 260, 31);
		btnCalcularProm.addActionListener(this);
		frame.getContentPane().add(btnCalcularProm);
		
		btnCalcularMayor = new JButton("NUMERO MAYOR");
		btnCalcularMayor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCalcularMayor.setBounds(406, 345, 260, 31);
		btnCalcularProm.addActionListener(this);
		frame.getContentPane().add(btnCalcularMayor);
		
		JLabel lblFebrero = new JLabel("FEBRERO:");
		lblFebrero.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblFebrero.setBounds(234, 41, 92, 21);
		frame.getContentPane().add(lblFebrero);
		
		textMes2 = new JTextField();
		textMes2.setColumns(10);
		textMes2.setBounds(336, 41, 86, 19);
		frame.getContentPane().add(textMes2);
		
		JLabel lblMarzo = new JLabel("MARZO:");
		lblMarzo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblMarzo.setBounds(462, 41, 72, 21);
		frame.getContentPane().add(lblMarzo);
		
		textMes3 = new JTextField();
		textMes3.setColumns(10);
		textMes3.setBounds(544, 41, 86, 19);
		frame.getContentPane().add(textMes3);
		
		JLabel lblAbril = new JLabel("ABRIL:");
		lblAbril.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAbril.setBounds(35, 100, 72, 21);
		frame.getContentPane().add(lblAbril);
		
		textMes4 = new JTextField();
		textMes4.setColumns(10);
		textMes4.setBounds(117, 102, 86, 19);
		frame.getContentPane().add(textMes4);
		
		JLabel lblMayo = new JLabel("MAYO:");
		lblMayo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblMayo.setBounds(234, 100, 92, 21);
		frame.getContentPane().add(lblMayo);
		
		textMes5 = new JTextField();
		textMes5.setColumns(10);
		textMes5.setBounds(336, 102, 86, 19);
		frame.getContentPane().add(textMes5);
		
		JLabel lblJunio = new JLabel("JUNIO:");
		lblJunio.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblJunio.setBounds(462, 100, 72, 21);
		frame.getContentPane().add(lblJunio);
		
		textMes6 = new JTextField();
		textMes6.setColumns(10);
		textMes6.setBounds(544, 102, 86, 19);
		frame.getContentPane().add(textMes6);
		
		JLabel lblJulio = new JLabel("JULIO:");
		lblJulio.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblJulio.setBounds(35, 151, 72, 21);
		frame.getContentPane().add(lblJulio);
		
		textMes7 = new JTextField();
		textMes7.setColumns(10);
		textMes7.setBounds(117, 153, 86, 19);
		frame.getContentPane().add(textMes7);
		
		JLabel lblAgosto = new JLabel("AGOSTO:");
		lblAgosto.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAgosto.setBounds(234, 151, 92, 21);
		frame.getContentPane().add(lblAgosto);
		
		textMes8 = new JTextField();
		textMes8.setColumns(10);
		textMes8.setBounds(336, 153, 86, 19);
		frame.getContentPane().add(textMes8);
		
		JLabel lblSeptiembre = new JLabel("SEPTIEMBRE:");
		lblSeptiembre.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSeptiembre.setBounds(462, 151, 114, 21);
		frame.getContentPane().add(lblSeptiembre);
		
		textMes9 = new JTextField();
		textMes9.setColumns(10);
		textMes9.setBounds(580, 153, 86, 19);
		frame.getContentPane().add(textMes9);
		
		JLabel lblOctubre = new JLabel("OCTUBRE:");
		lblOctubre.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblOctubre.setBounds(35, 204, 86, 21);
		frame.getContentPane().add(lblOctubre);
		
		textMes10 = new JTextField();
		textMes10.setColumns(10);
		textMes10.setBounds(128, 206, 86, 19);
		frame.getContentPane().add(textMes10);
		
		JLabel lblNoviembre = new JLabel("NOVIEMBRE:");
		lblNoviembre.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNoviembre.setBounds(234, 204, 107, 21);
		frame.getContentPane().add(lblNoviembre);
		
		textMes11 = new JTextField();
		textMes11.setColumns(10);
		textMes11.setBounds(348, 206, 86, 19);
		frame.getContentPane().add(textMes11);
		
		JLabel lblDiciembre = new JLabel("DICIEMBRE:");
		lblDiciembre.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDiciembre.setBounds(462, 204, 114, 21);
		frame.getContentPane().add(lblDiciembre);
		
		textMes12 = new JTextField();
		textMes12.setColumns(10);
		textMes12.setBounds(580, 206, 86, 19);
		frame.getContentPane().add(textMes12);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnCalcularProm== e.getSource()) {
			
		}
		
	}
}
