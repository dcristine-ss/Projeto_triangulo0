package principal;

import javax.swing.JOptionPane;
import model.Triangulo;

public class Principal {

    public static void main(String[] args) {
//Declara e instância o objeto
        Triangulo tri1 = new Triangulo();
//Entrada
        tri1.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo")));
        tri1.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a algura do triângulo")));
//Saída
        JOptionPane.showMessageDialog(null, "A área do triângulo é " + tri1.getArea());
    }
}
