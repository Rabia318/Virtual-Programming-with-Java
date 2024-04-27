package ders1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class deneme2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int vize,ödev,final1;
		
		
		String svize=JOptionPane.showInputDialog("Lutfen vize notunu giriniz:");
		vize=Integer.parseInt(svize);
		
		while(vize<0 || vize>100) {
			
			svize=JOptionPane.showInputDialog(null,"Lutfen vize notunu dikkatli bir şekilde giriniz !","vize",JOptionPane.WARNING_MESSAGE);
			vize=Integer.parseInt(svize);
			
			
		}
		
		String södev=JOptionPane.showInputDialog("Lutfen ödev notunu giriniz:");
		ödev=Integer.parseInt(södev);
		
		while(ödev<0 || ödev>100) {
			
			södev=JOptionPane.showInputDialog(null,"Lutfen ödev notunu dikkatli bir şekilde giriniz !","ödev",JOptionPane.WARNING_MESSAGE);
			ödev=Integer.parseInt(södev);
			
		}
		
		String sfinal1=JOptionPane.showInputDialog("Lutfen final notunu giriniz:");
		final1=Integer.parseInt(sfinal1);
		
		while(final1<0 || final1>100) {
			
			sfinal1=JOptionPane.showInputDialog(null,"Lutfen final notunu dikkatli bir şekil de giriniz !","final1",JOptionPane.WARNING_MESSAGE);
			final1=Integer.parseInt(sfinal1);
			
		}
		
		double notOrt=vize*0.3+ödev*0.2+final1*0.5;
		String sonuc="";
		
		if(notOrt>50) {
			
			sonuc=notOrt + " ile geçtiniz ... Tebrikler :) :) :)";
		}
		else {
			
			sonuc=notOrt + " ile kaldınız ... Lütfen daha gayretli olunuz !";
			
		}
		
		JOptionPane.showMessageDialog(null, sonuc);
		
		
		
		JFrame jf= new JFrame();
		
		jf.setTitle("İlk Ders");
		
		jf.setSize(500,500);
		
		jf.setLocation(200,300);
		
		jf.getContentPane().setLayout(new FlowLayout());
		
		JTextField txt1= new JTextField(25);
		
		JButton btn1 =new JButton("Gönder");
		
		JLabel lbl1 =new JLabel();
		
		lbl1.setText("Lütfen isminizi giriniz :)");
		
		jf.getContentPane().add(lbl1);
		jf.getContentPane().add(txt1);
		jf.getContentPane().add(btn1);
		//jf.getContentPane().add(lbl1)
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				lbl1.setText("Merhaba "+ txt1.getText()+" ilk derse hoşgeldin");
				
			}
		});
		
		
		JButton btn2= new JButton("Tıkla");
		JButton btn3= new JButton("İsim");
		
		
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane panel= new JOptionPane();
				
				panel.showMessageDialog(null,"Merhaba bu yeni bir pencere");
				
				
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String isim=JOptionPane.showInputDialog("Lutfen isminizi girer misiniz?");
				
				// showMessageDialog iki ya de 4 parametre alır aksi takdirde hata verir. 
				
				JOptionPane.showMessageDialog(null,isim);
			}
			
			
			
		});
		
		
	
	  jf.getContentPane().add(btn2);
	  jf.getContentPane().add(btn3);
		
	jf.setResizable(false);	
		
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
