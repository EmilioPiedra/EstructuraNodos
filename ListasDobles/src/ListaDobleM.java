public class ListaDobleM {
    public static void main(String[] args) {
        ListaDoble obj = new ListaDoble();
        int n =0;
        do {
            obj.menu();
            n= obj.leer.nextInt();
            switch (n){
                case 1: obj.crearLista();
                    break;
                case 2: obj.mostrarlista();
                    break;
                case 3: obj.mostrarlistaInversa();
                    break;
            }

        } while (n!=4);
    }
}
