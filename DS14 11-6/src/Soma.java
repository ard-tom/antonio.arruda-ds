public class Soma extends heranca implements OperacaoMatematica{

    @Override
    public int calcula(int a, int b){
        return a+b;
    }
    @Override
    public void abc(int a){
        System.out.println(a+15);
    }
}
