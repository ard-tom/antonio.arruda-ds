public interface Saudacao {
    default void dizerOla(){
        System.out.println("Olá (default)!");
    }

    static void dizerTchau(){
        System.out.println("Tchau (static)!");
    }
}
