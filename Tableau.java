package vue;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tableau extends JFrame {

public Tableau(){
  this.setLocationRelativeTo(null);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setTitle("JTable");
  this.setSize(300, 120);

  //Les donn<E9>es du tableau
  Object []T1 = {"MEGA", 10,7}; 
  Object []T2 = {"GONDOLE", 8, 8};
  Object []T3 = {"DELICE", 9, 8};
  Object[][] data = {
    {T1[0], T1[1],T1[2],
    	(Double.valueOf(T1[1].toString())+Double.valueOf(T1[2].toString()))/2},
    {T2[0], T2[1],T2[2],
        	(Double.valueOf(T2[1].toString())+Double.valueOf(T2[2].toString()))/2},
    {T3[0], T3[1],T3[2],
            	(Double.valueOf(T3[1].toString())+Double.valueOf(T3[2].toString()))/2}
    
  };

  //Les titres des colonnes
  String  title[] = {"RESTO", "QUAL_SERVICE", "HIGIENE","MOYENNE"};
  JTable tableau = new JTable(data, title);
  //Nous ajoutons notre tableau <E0> notre contentPane dans un scroll
  //Sinon les titres des colonnes ne s'afficheront pas !
  this.getContentPane().add(new JScrollPane(tableau));
}   

public static void main(String[] args){
        Tableau fen = new Tableau();
  fen.setVisible(true);
} 	
}
