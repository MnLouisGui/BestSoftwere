public class S_Pc extends Software{
    public S_Pc(String nome, Double valor, int cont){
        super(nome, valor, cont);
    }

    @Override public void infor(){
        System.out.println("Pc");
    }
}
