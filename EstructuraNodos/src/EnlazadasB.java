public class EnlazadasB {
    public static void main(String[] args) {
        MetodosB obj = new MetodosB();
        int op  =0;
        do {
            op = obj.menu();
           switch (op){
               case 1 : obj.ingresar();
               break;
               case 2: obj.recorrer();
                   break;
               case 3: obj.eliminar();
                   break;

           }
        }while (op !=0);

    }
}
