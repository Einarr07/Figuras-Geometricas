public class Main {
    public static void main(String[] args) {
    Geometria_Mateo fig_cuadrado = new Geometria_Mateo();
    //
    Geometria_Mateo menu_de_figuras = new Geometria_Mateo();
    Geometria_Mateo menu_de_opciones = new Geometria_Mateo();
    //
    int op_figuras = 0;
    boolean salir = false;
    //
    while(!salir){
        switch (menu_de_opciones.menu()){
            case 1:
                op_figuras = menu_de_figuras.menu_figuras();
                if (op_figuras >= 1){
                    fig_cuadrado.cuadrados(fig_cuadrado);
                }
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
                salir = true;
                break;
            default:
                System.out.println("-------------------");
                System.out.println("| OPCION NO VALIDA|");
                System.out.println("-------------------");

    }

    }//Fin del bucle
        System.out.println("-------------------------");
        System.out.println("| GRACIAS, VUELVA PRONTO |");
        System.out.println("-------------------------");
    }
}