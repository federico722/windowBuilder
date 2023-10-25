import java.util.ArrayList;

import javax.swing.JOptionPane;
public class Logica {

	
ArrayList<Double> listaVentas;
	
	public void iniciar() {
		listaVentas=new ArrayList<Double>();
		//llenarVentas();
		//System.out.println(listaVentas);
		//calcularPromedio();
		//calcularMesMayor();
		presentarVentana();
	}

	private void presentarVentana() {
		VentanaMeses miVentana=new VentanaMeses();
		miVentana.frame.setVisible(true);
	}

	private void calcularMesMayor() {
		int mayorMes=0;
		double ventaMayor=0;
		for (int i = 0; i < listaVentas.size(); i++) {
			if (listaVentas.get(i)>=ventaMayor) {
				ventaMayor=listaVentas.get(i);
				mayorMes=i+1;
			}
		}
		
		validarMeses(ventaMayor);

		System.out.println("Con una venta de : "+ventaMayor);
	}

	private void validarMeses(double ventaMayor) {
		String meses="";
		for (int i = 0; i <listaVentas.size(); i++) {
			if (ventaMayor==listaVentas.get(i)) {
				meses+=(i+1)+"|";
			}
		}
		
		System.out.println("Las ventas se encontraron en el mes(eses) "+meses);
	}

	private void calcularPromedio() {
		double suma=0;
		double promedio=0;
		
		for (int i = 0; i < listaVentas.size(); i++) {
			suma+=listaVentas.get(i);
		}
		promedio=suma/listaVentas.size();
		System.out.println("El promedio es: "+promedio);
	}

	private void llenarVentas() {
		int meses=Integer.parseInt(JOptionPane.
				showInputDialog("Ingrese la cantidad de meses a validar"));
	
		double venta=0;
		for (int i = 0; i < meses; i++) {
			venta=Double.parseDouble(JOptionPane.
					showInputDialog("Ingrese la venta del mes "+(i+1)));
			listaVentas.add(venta);
		}
	
	}
	
}
