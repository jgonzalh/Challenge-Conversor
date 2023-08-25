import javax.swing.JOptionPane;


public class Main{
	
	
	public static int retornarMenu() {
		int eleccion = JOptionPane.showConfirmDialog(null, "¿Desea volver al menú principal?");
		return eleccion;
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
		int volverMenu = 0;
		
		while(volverMenu == 0) {
		
		
			float valorDolar = (float) 870.31023;
			float valorEuro = (float) 945.80614;
			float valorLibra = (float) 1107.2173;
			float valorYen = (float) 5.9452755;
			float valorWon = (float) 0.6487306;
			
			
			
			Object[] menuPrincipal = {"Conversor de moneda", "Conversor de temperatura"};
			Object[] menuMoneda = {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen Japonés", "De Pesos a Won sul-coreano", "De Dólar a Peso", "De Euro a Peso", "De Libra a Peso", "De Yen Japonés a Peso", "De Won sul-coreano a Peso"};
			Object[] menuTemperatura = {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Kelvin a Celsius", "De Kelvin a Fahrenheit"};
			
			String opcion_menuPrincipal = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de conversor a utilizar", "Conversor", JOptionPane.PLAIN_MESSAGE, null, menuPrincipal, "Conversor de moneda");
			String cantidadIngresada = JOptionPane.showInputDialog(null, "Introduzca el valor de la moneda a convertir:");
			
			float cantidadIngresadaFloat = Float.parseFloat(cantidadIngresada);
			
			if(opcion_menuPrincipal.toString() == "Conversor de moneda") {
				String tipoConversionMoneda = (String) JOptionPane.showInputDialog(null, "Seleccione la moneda a convertir", "Selector de divisas", JOptionPane.PLAIN_MESSAGE, null, menuMoneda, "De Pesos a Dólar");
				
				float resultado;
				
				switch (tipoConversionMoneda) {
				case "De Pesos a Dólar":
					resultado = cantidadIngresadaFloat/valorDolar;
					JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
//					System.out.println(volverMenu.getClass().getSimpleName());
					volverMenu = (int) retornarMenu();
					
					break;
				case "De Pesos a Euro":
					resultado = cantidadIngresadaFloat/valorEuro;
					JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
					
					break;
				case "De Pesos a Libras":
					resultado = cantidadIngresadaFloat/valorLibra;
					JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
					break;
				case "De Pesos a Yen Japonés":
					resultado = cantidadIngresadaFloat/valorYen;
					JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
					break;
				case "De Pesos a Won sul-coreano":
					resultado = cantidadIngresadaFloat/valorWon;
					JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
					break;
				case "De Dólar a Peso":
					resultado = cantidadIngresadaFloat*valorDolar;
					JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
					break;
				case "De Euro a Peso":
					resultado = cantidadIngresadaFloat*valorEuro;
					JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
					break;
				case "De Libra a Peso":
					resultado = cantidadIngresadaFloat*valorLibra;
					JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
					break;
				case "De Yen Japonés a Peso":
					resultado = cantidadIngresadaFloat*valorYen;
					JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
					break;
				case "De Won sul-coreano a Peso":
					resultado = cantidadIngresadaFloat*valorWon;
					JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
					break;
				default:
					System.out.println("");
					
				
				}
				
				
				
				
			}else if(opcion_menuPrincipal.toString() == "Conversor de temperatura") {
				String tipoConversionTemperatura = (String) JOptionPane.showInputDialog(null, "texto", "titulo", JOptionPane.PLAIN_MESSAGE, null, menuTemperatura, "De Grados a Celcius");
				
				
				float resultado;
				
				switch (tipoConversionTemperatura) {
				case "De Celsius a Fahrenheit":
					resultado = (float) (((cantidadIngresadaFloat*9)/5)+32);
					JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
					break;
				case "De Celsius a Kelvin":
					resultado = (float) (cantidadIngresadaFloat + 273.15);
					JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
					break;
				case "De Fahrenheit a Celsius":
					resultado = (float) ((cantidadIngresadaFloat-32)*5/9);
					JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
					break;
				case "De Fahrenheit a Kelvin":
					resultado = (float) ((cantidadIngresadaFloat+459.67)*5/9);
					JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
					break;
				case "De Kelvin a Celsius":
					resultado = (float) (cantidadIngresadaFloat - 273.15);
					JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
					break;
				case "De Kelvin a Fahrenheit":
					resultado = (float) ((cantidadIngresadaFloat*9/5) - 459.67);
					JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
					break;
				
				default:
					System.out.println("");
				
				}
			}
		
		}
	
	}	
}
	
	
	