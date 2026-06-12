public interface OperacaoMatematica {
    public int calcula(int a, int b);

    default void abc(int a){
        System.out.println(a+15);
    }

    static void imprime(){
        System.out.println("abc");
    }
}
