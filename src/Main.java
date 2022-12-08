public class Main {
    public static void main(String[] args) {
    //Instancias
    Geometria_Mateo fig_cuadrado = new Geometria_Mateo();
    Geometria_Mateo fig_triangulo = new Geometria_Mateo();
    Geometria_Mateo fig_regtangulo = new Geometria_Mateo();
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
                if (op_figuras == 1){
                    fig_cuadrado.cuadrado_areas(fig_cuadrado);
                }
                if (op_figuras == 2){
                    fig_triangulo.triangulo_area(fig_triangulo);
                }
                if (op_figuras == 3){
                    fig_regtangulo.rectangulo_area(fig_regtangulo);
                }
                break;
            case 2:
                op_figuras = menu_de_figuras.menu_figuras();
                if (op_figuras == 1){
                    fig_cuadrado.cuadrado_perimetro(fig_cuadrado);
                }
                if (op_figuras == 2){
                    op_figuras = menu_de_figuras.menu_triangulos();
                    if (op_figuras ==5 ){
                    fig_triangulo.triangulo_perimetro_equi(fig_triangulo);
                    }
                    else if (op_figuras ==6) {
                    fig_triangulo.triangulo_perimetro_iso(fig_triangulo);
                    }
                    else if (op_figuras == 7){
                    fig_triangulo.triangulo_perimetro_esca(fig_triangulo);
                    }
                }
                if (op_figuras == 3){
                    fig_regtangulo.rectangulo_perimetro(fig_regtangulo);
                }
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