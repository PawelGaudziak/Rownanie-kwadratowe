import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Okienko {
	
	// Obiekt okna
	JFrame frame = new JFrame("Równanie kwadratowe");
	// Obiekty pól tekstowych
	JTextField ParamA = new JTextField();
	JTextField ParamB = new JTextField();
	JTextField ParamC = new JTextField();
	JTextArea ta = new JTextArea();
	
	JLabel l1 = new JLabel("Podaj parametr a");
	JLabel l2 = new JLabel("Podaj parametr b");
	JLabel l3 = new JLabel("Podaj parametr c");
	// Obiekt etykiety - tu bêdzie wynik
	JLabel result = new JLabel("Kliknij przycisk oblicz!");
	// Obiekt przycisku
	JButton calc = new JButton("Oblicz");
	JButton btnExit = new JButton("Wyjœcie");
	
	// tutaj tworzê proste okno i w³aœciwoœci jego komponentów
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
		// nas³uchiwanie wciœniecia przycisku
	
		calc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				// wywo³anie fuckji wykonuj¹cej obliczenia
				calcAction();
			
			}
		});
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		// ustawienie w³asciwoœci okna
		frame.setSize(350,500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	private void setLineWrap(boolean b) {
	}
	// obs³uga akcji wœciœniêcia przycisku oblicz
	public void calcAction() {
		// odczytujemy wartoœci z pól i rzutujemy je do zmiennych Double
		double a = Double.valueOf(ParamA.getText());
		double b = Double.valueOf(ParamB.getText());
		double c = Double.valueOf(ParamC.getText());
		// tutaj powinno siê wykonaæ równanie -> pozostawiam do dokoñczenia
		// ...
		if (a==0) 
		{
			//System.out.println("To nie jest równanie kwadratowe a=0!");
		ta.setText("To nie jest równanie kwadratowe a=0!");
		}
			else 
			{
				double delta = b*b - 4*a*c;
					double wynik;
		if (delta<0) 
		{
			//System.out.println("Równanie nie posiada rozwi¹zañ");
		ta.setText("Równanie nie posiada rozwi¹zañ");
		}
		else if (delta==0) {
			double wynik1 = (-b/(2*a));
			//System.out.println("Równanie posiada jedno rozwi¹zanie: x= " + wynik1);
		ta.setText("Równanie posiada jedno rozwi¹zanie: x= " + wynik1);
		}
		else  {
				double wynik1 = (-b - (Math.sqrt(delta)))/2*a;
				//System.out.println("Rozwi¹zanie, x1= " + wynik1);
			ta.setText("Rozwi¹zanie, x1= \n" + wynik1);
					
				double wynik2 = (-b + (Math.sqrt(delta)))/2*a;
					//System.out.println("Rozwi¹zanie, x2= " + wynik2);
				ta.setText("Rozwi¹zanie, x2= " + wynik2);
			
		}
		}
			
	//jjjjj
	}
	// zak³adam, ¿e mam ju¿ wynik i wypisuje go na etykiecie wynikowej
		//ta.setText("Moje dane: " + a + " " + b + " " + c);
	public static void main(String[] args) {
		Okienko o = new Okienko();
		o.frameCreator();
		
	}

}
