import java.util.Scanner;
public class Geometria_Mateo {
    //Atributos
    float base;
    float altura;
    float total;
    Scanner entrada = new Scanner(System.in);
    //Constructor
    public Geometria_Mateo(){
        base = 0;
        altura = 0;
        total = 0;
    }
    //Menu de opciones
    int menu(){
        int op = -1;
        while ((op < 0) || (op > 4)) {
            System.out.println("------------------------------------------------");
            System.out.println("| BIENVENIDO AL CALCULO DE FIGURAS GEOMETRICAS |");
            System.out.println("------------------------------------------------");
            System.out.println("---------------------------------------------");
            System.out.println("|     1.- CALCULAR EL AREA                  |");
            System.out.println("|                                           |");
            System.out.println("|     2.- CALCULAR EL PERIMETRO             |");
            System.out.println("|                                           |");
            System.out.println("|     3.- CALCULAR EL VOLUMEN               |");
            System.out.println("|                                           |");
            System.out.println("|     4.- SALIR                             |");
            System.out.println("---------------------------------------------");
            System.out.print("Ingrese la opcion que desea ejecutar: ");
            op = entrada.nextInt();

            if((op < 0) || (op > 4)){
                System.out.println("--------------------");
                System.out.println("| Opcion no valida |");
                System.out.println("--------------------");
            }
        }
        return op;
    }//Fin del menu
    //Menu para escoger las figuras
    int menu_figuras(){
        int op = -1;
        while ((op < 0) || (op > 4)) {
            System.out.println("--------------------------------");
            System.out.println("| ESCOJA UNA FIGURA GEOMETRICA |");
            System.out.println("--------------------------------");
            System.out.println("---------------------------------------------");
            System.out.println("|     1.- Cuadrados                         |");
            System.out.println("|                                           |");
            System.out.println("|     2.- Triangulos                        |");
            System.out.println("|                                           |");
            System.out.println("|     3.- Rectangulos                       |");
            System.out.println("|                                           |");
            System.out.println("|     4.- SALIR                             |");
            System.out.println("---------------------------------------------");
            System.out.print("Ingrese la opcion que desea ejecutar: ");
            op = entrada.nextInt();

            if((op < 0) || (op > 4)){
                System.out.println("--------------------");
                System.out.println("| Opcion no valida |");
                System.out.println("--------------------");
            }
        }
        return op;
    }//Fin del menu_figuras
    //Metodos
    public void cuadrados(Geometria_Mateo datos1){
        System.out.println("Ingrese la base del cuadrado");
        datos1.setBase(entrada.nextFloat());
        System.out.println("Ingrese la altura del cuadrado");
        datos1.setAltura(entrada.nextFloat());

    }
    //SETTER AND GETTER

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
