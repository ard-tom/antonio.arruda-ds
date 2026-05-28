package main;
public class Casa extends Imovel{
        private int areaTerreno;
        public Casa(int idImovel, String endereco, double valor, int areaTerreno) {
            super(idImovel, endereco, valor);
            this.areaTerreno=areaTerreno;
        }
        @Override
        public void getInfo(){
        super.getInfo();
        System.out.println("Area Terreno: "+ areaTerreno);
        }
}
