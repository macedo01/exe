package lista;

public class main {
    public static void main(String[] args) {
        ListaDupla i = new ListaDupla();
        System.out.println(i);

        i.inserirInicio("João");
        System.out.println(i);
        i.inserirInicio("José");
        System.out.println(i);
        i.inserirInicio("Maria");
        System.out.println(i);
        i.inserirInicio("Alice");
        System.out.println(i);
        i.inserirInicio("Carlos");
        System.out.println(i);

        i.inserirMeio(2,"Ana");
        System.out.println(i);
        System.out.println("Retirando: " + i.retirar(1));
        System.out.println(i);

        i.retirarInicio();
        System.out.println(i);

        i.retirarInicio();
        System.out.println(i);
        i.retirarPorvalor("Maria");

    }
}
