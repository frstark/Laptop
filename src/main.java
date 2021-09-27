import com.sun.tools.javac.Main;

public class main {
    public static void main(String[] args){
        System.out.println("Ausgabe aus der main()-Methode");


        Gehaeuse gehaeuse1 = new Gehaeuse("55772","Samsung","XYZ","schwarz","Plastik",55,12,5);

        //Mainboard-Komponente
            Ram ram1 = new Ram("1233","Samsung"," x700");
            Prozessor prozessor1 = new Prozessor("2333","Intel","i7");
        Mainboard mainboard1 = new Mainboard("4588","AMD","McMainboard",8,prozessor1,ram1) ;

        Bildschirm bildschirm1 = new Bildschirm("4555","Samsung","Q@@€€X___8aA");

        Festplatte festplatte1 = new Festplatte("45556","Thosiba","1TBSSD");

        Laptop laptop1 = new Laptop("45556","Acer","HomeOffice",1119.99,gehaeuse1,mainboard1,bildschirm1,festplatte1);


        System.out.println(laptop1);









    }






}
