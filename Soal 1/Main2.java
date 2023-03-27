import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Circle circ = new Circle();
        circ.setColor("Green");
        System.out.println(circ);
        Cylinder Tabung1 = new Cylinder(7);
        Cylinder Tabung2 = new Cylinder(7, 10 );
        Cylinder Tabung3 = new Cylinder(7, "Red", 10);
        Cylinder[] listTabung = { Tabung1, Tabung2, Tabung3 };
        
        for(int i = 0; i<3; i++){
            System.out.println("Tabung ke " + (i+1));
            System.out.print("Masukkan jari jari baru : ");
            listTabung[i].setRadius(sc.nextDouble());
            System.out.println("Radius tabung = " + listTabung[i].getRadius());
            System.out.print("Masukkan warna baru : ");
            listTabung[i].setColor(sc.next());
            System.out.println("Warna tabung = " + listTabung[i].getColor());
            System.out.print("Masukkan tinggi baru : ");
            listTabung[i].setHeight(sc.nextDouble());
            System.out.println("Tinggi tabung = " + listTabung[i].getHeight());
            System.out.println("Volume tabung = " + listTabung[i].hitungVolume());
            System.out.println(listTabung[i] + "\n");
        }
    }
}
