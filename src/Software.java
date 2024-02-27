import java.util.*;

public class Software{
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String RESET = "\033[0m";

    static int contador;
    int codigo;

    Software(){
     contador++;   
    }

    public Software(String nome, Double valor, int cont){
        this.nome=nome;
        this.valor=valor;
        this.codigo=cont+1;
    }

    //Atributos
    private String nome;
    private Double valor;

    private Desenvolvedor desenvolvedor;
    private Cliente cliente;
    int op=0;

    Scanner scanner = new Scanner(System.in);

    //Get e Set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    //Metodos
    public void cadastrar(String nome, Double valor, Desenvolvedor dev, Cliente cliente){
        this.nome=nome;
        this.valor=valor;
        this.desenvolvedor=dev;
        this.cliente=cliente;
        this.codigo=contador;
    }

    public void alterar(String nome){
        this.nome=nome;
    }

    public void alterarvalor(Double taxa){
        this.valor=this.valor+(this.valor*(taxa/100));
    }

    public void alterarvalor(){
        this.valor=this.valor+(this.valor*0.1);
    }

    public void infor(){
    }

    public void verdados(){
        System.out.println(ANSI_GREEN+"##  DADOS  ##\n\nNome do Software: "+this.nome+"\nValor: R$"+this.valor+"0");
        System.out.println("Dev: "+desenvolvedor.getNome()+"\nCliente: "+cliente.getNome()+"\nCódigo: "+codigo+RESET);
        this.infor();
        System.out.println("========================================");
        while(op==0){
            System.out.println("1.Voltar");
            op=scanner.nextInt();
        }
        op=0;
    }
}