import java.util.Scanner;
public class Geometria_Mateo {
    //Atributos
    float base;
    float altura;
    float total;
    float lados;
    float lado2;
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
        while ((op < 0) || (op > 3)) {
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
            System.out.println("---------------------------------------------");
            System.out.print("Ingrese la opcion que desea ejecutar: ");
            op = entrada.nextInt();

            if((op < 0) || (op > 3)){
                System.out.println("--------------------");
                System.out.println("| Opcion no valida |");
                System.out.println("--------------------");
            }
        }
        return op;
    }//Fin del menu_figuras
    int menu_triangulos(){
        int op = -1;
        while ((op < 5) || (op > 7)) {
            System.out.println("--------------------------------");
            System.out.println("| ESCOJA el tipo de triangulo  |");
            System.out.println("--------------------------------");
            System.out.println("---------------------------------------------");
            System.out.println("|     5.- Equilatero                        |");
            System.out.println("|                                           |");
            System.out.println("|     6.- Isoseles                          |");
            System.out.println("|                                           |");
            System.out.println("|     7.- Escaleno                          |");
            System.out.println("|                                           |");
            System.out.println("---------------------------------------------");
            System.out.print("Ingrese la opcion que desea ejecutar: ");
            op = entrada.nextInt();

            if((op < 5) || (op > 7)){
                System.out.println("--------------------");
                System.out.println("| Opcion no valida |");
                System.out.println("--------------------");
            }
        }
        return op;
    }//Fin del menu_triangulos
    //Metodos
    // Areas de las figuras geometricas
    public void cuadrado_areas(Geometria_Mateo datos1){
        System.out.println("Ingrese la base del cuadrado");
        datos1.setBase(entrada.nextFloat());
        System.out.println("Ingrese la altura del cuadrado");
        datos1.setAltura(entrada.nextFloat());
        if (getBase() != getAltura()){
            System.out.println("Si la base o la altura son diferentes, no es un cuadrado");
        }
        else {
            total = getAltura() * getBase();
            System.out.println("El area del cuadrado es: " + total);
        }
    }
    public void triangulo_area(Geometria_Mateo datos2){
        System.out.println("Ingrese la base del triangulo");
        datos2.setBase(entrada.nextFloat());
        System.out.println("Ingrese la altura del triangulo");
        datos2.setAltura(entrada.nextFloat());
        total = (getBase() * getAltura()) / 2;
        System.out.println("El area del triangulo es: " + total);
    }
    public void rectangulo_area(Geometria_Mateo datos3){
        System.out.println("Ingrese la base del regtangulo");
        datos3.setBase(entrada.nextFloat());
        System.out.println("Ingrese la altura del regtangulo");
        datos3.setAltura(entrada.nextFloat());
        total = getBase() * getAltura();
        System.out.println("El area del regtangulo es: " + total);

    }
    //Perimetro de las figuras geometricas
    public void cuadrado_perimetro(Geometria_Mateo datos4){
        System.out.println("Ingrese la dimension del cuadrado");
        datos4.setLados(entrada.nextFloat());
        total = getLados() + getLados() + getLados() + getLados();
        System.out.println("El perimetro del cuadrado es: " +  total);
    }
    public void triangulo_perimetro_equi(Geometria_Mateo datos5){
        System.out.println("Ingrese el lado del triangulo");
        datos5.setLados(entrada.nextFloat());
        total = getLados() * 3;
        System.out.println("El perimetro del triangulo equilatero es: " + total);
    }
    public void triangulo_perimetro_iso(Geometria_Mateo datos5){
        System.out.println("Ingrese el valor de los lados del triangulo");
        datos5.setLados(entrada.nextFloat());
        System.out.println("Ingrese la base del triangulo");
        datos5.setBase(entrada.nextFloat());
        total = (2 * getLados()) + getBase();
        System.out.println("El perimetro del triangulo isoseles es: " + total);
    }
    public void triangulo_perimetro_esca(Geometria_Mateo datos5){
        System.out.println("Ingrese el primer lado del triangulo");
        datos5.setLados(entrada.nextFloat());
        System.out.println("Ingrese el segundo lado del triangulo");
        datos5.setLado2(entrada.nextFloat());
        System.out.println("Ingrese el tercer lado del triangulo");
        datos5.setBase(entrada.nextFloat());
        total = getLados() + getLado2() + getBase();
        System.out.println("El perimetro del triangulo escaleno es: " + total);
    }
    public void rectangulo_perimetro(Geometria_Mateo datos6){
        System.out.println("Ingrese la altura del rectangulo");
        datos6.setAltura(entrada.nextFloat());
        System.out.println("Ingrese la base del rectangulo");
        datos6.setBase(entrada.nextFloat());
        total = getAltura() + getAltura() + getBase() + getBase();
        System.out.println("El perimetro del regtangulo es: " +  total);
    }
    //Volumen de las figuras geometricas

    //SETTER AND GETTER

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLados() {
        return lados;
    }

    public void setLados(float lados) {
        this.lados = lados;
    }

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
