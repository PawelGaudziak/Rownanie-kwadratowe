import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Okienko {
	
	// Obiekt okna
	JFrame frame = new JFrame("R�wnanie kwadratowe");
	// Obiekty p�l tekstowych
	JTextField ParamA = new JTextField();
	JTextField ParamB = new JTextField();
	JTextField ParamC = new JTextField();
	JTextArea ta = new JTextArea();
	
	JLabel l1 = new JLabel("Podaj parametr a");
	JLabel l2 = new JLabel("Podaj parametr b");
	JLabel l3 = new JLabel("Podaj parametr c");
	// Obiekt etykiety - tu b�dzie wynik
	JLabel result = new JLabel("Kliknij przycisk oblicz!");
	// Obiekt przycisku
	JButton calc = new JButton("Oblicz");
	JButton btnExit = new JButton("Wyj�cie");
	
	// tutaj tworz� proste okno i w�a�ciwo�ci jego komponent�w
	public void frameCreator(){
		// Ustawienie rozmiaru i pozycji
		ParamA.setBounds(50,50, 100, 20);
		ParamB.setBounds(50,100, 100, 20);
		ParamC.setBounds(50,150, 100, 20);
		l1.setBounds(50,30, 100, 20);
		l2.setBounds(50,80, 100, 20);
		l3.setBounds(50,130, 100, 20);
		ta.setBounds(50, 300, 200, 100);
		result.setBounds(50,200, 200, 20);
		calc.setBounds(50,250, 100, 30);
		btnExit.setBounds(150, 250, 100, 30);
		// dodanie wszystkich kontrolek do okna
		frame.add(ParamA); frame.add(ParamB); frame.add(ParamC);
		frame.add(result); frame.add(calc); frame.add(ta);
		frame.add(l1); frame.add(l2); frame.add(l3); frame.add(btnExit);
		setLineWrap(true);
		// nas�uchiwanie wci�niecia przycisku
	
		calc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				// wywo�anie fuckji wykonuj�cej obliczenia
				calcAction();
			
			}
		});
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		// ustawienie w�asciwo�ci okna
		frame.setSize(350,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	private void setLineWrap(boolean b) {
	}
	// obs�uga akcji w�ci�ni�cia przycisku oblicz
	public void calcAction() {
		// odczytujemy warto�ci z p�l i rzutujemy je do zmiennych Double
		double a = Double.valueOf(ParamA.getText());
		double b = Double.valueOf(ParamB.getText());
		double c = Double.valueOf(ParamC.getText());
		// tutaj powinno si� wykona� r�wnanie -> pozostawiam do doko�czenia
		// ...
		if (a==0) 
		{
			//System.out.println("To nie jest r�wnanie kwadratowe a=0!");
		ta.setText("To nie jest r�wnanie kwadratowe a=0!");
		}
			else 
			{
				double delta = b*b - 4*a*c;
					double wynik;
		if (delta<0) 
		{
			//System.out.println("R�wnanie nie posiada rozwi�za�");
		ta.setText("R�wnanie nie posiada rozwi�za�");
		}
		else if (delta==0) {
			double wynik1 = (-b/(2*a));
			//System.out.println("R�wnanie posiada jedno rozwi�zanie: x= " + wynik1);
		ta.setText("R�wnanie posiada jedno rozwi�zanie: x= " + wynik1);
		}
		else  {
				double wynik1 = (-b - (Math.sqrt(delta)))/2*a;
				//System.out.println("Rozwi�zanie, x1= " + wynik1);
			ta.setText("Rozwi�zanie, x1= \n" + wynik1);
					
				double wynik2 = (-b + (Math.sqrt(delta)))/2*a;
					//System.out.println("Rozwi�zanie, x2= " + wynik2);
				ta.setText("Rozwi�zanie, x2= " + wynik2);
			
		}
		}
			
	//jjjjj
	}
	// zak�adam, �e mam ju� wynik i wypisuje go na etykiecie wynikowej
		//ta.setText("Moje dane: " + a + " " + b + " " + c);
	public static void main(String[] args) {
		Okienko o = new Okienko();
		o.frameCreator();
		
	}

}
