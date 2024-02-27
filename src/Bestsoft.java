import java.util.*;

public class Bestsoft{
    public static void main(String[] args) throws Exception {
        //objetos
        Software software=new Software();
        Desenvolvedor desenvolvedor1=new Desenvolvedor();
        Desenvolvedor desenvolvedor2=new Desenvolvedor();
        Cliente cliente1=new Cliente();
        Cliente cliente2=new Cliente();

        //Leitor
        Scanner scanner=new Scanner(System.in);

        //var
        int resp=1;

        desenvolvedor1.setNome("Luis");
        desenvolvedor2.setNome("Geovanna");

        cliente1.setNome("Romeu");
        cliente2.setNome("Rai");

        while(resp==1){
            System.out.println("###### Bestsoftware ######");
            System.out.println("========================================");
            System.out.println("## Menu ##\n\n1.Cadastrar\n2.Ver dados\n3.Alterar\n4.Sair");
            int op=scanner.nextInt();
            System.out.println("========================================");
            switch (op) {
                case 1:
                    Desenvolvedor dev=null;
                    Cliente cliente=null;
                    System.out.println("Nome do software");
                    String nome = scanner.nextLine(); nome = scanner.nextLine();
                    System.out.println("========================================");
                    System.out.println("Valor do software");
                    Double valor = scanner.nextDouble();
                    System.out.println("========================================");
                    //dev
                    System.out.println("Qual dev está desenvolvendo?\n1."+desenvolvedor1.getNome()+"\n2."+desenvolvedor2.getNome());
                    System.out.println("========================================");
                    op=scanner.nextInt();
                    switch (op) {
                        case 1:
                            dev = desenvolvedor1;
                            break;
                        case 2:
                            dev = desenvolvedor2;
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    //Cliente
                    System.out.println("========================================");
                    System.out.println("Qual cliente?\n1."+cliente1.getNome()+"\n2."+cliente2.getNome());
                    System.out.println("========================================");
                    op=scanner.nextInt();
                    switch (op) {
                        case 1:
                            cliente = cliente1;
                            break;
                        case 2:
                            cliente = cliente2;
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    software.cadastrar(nome, valor, dev, cliente );
                    break;
                case 2:
                    software.verdados();
                    break;
                case 3:
                    System.out.println("## Menu Alterar ##\n1.Alterar Nome\n2.Alterar Valor\n3.Alterar Cliente\n4.Alterar Dev\n5.Sair");
                    op=scanner.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Qual o novo nome?");
                            nome=scanner.nextLine(); nome=scanner.nextLine();
                            valor=software.getValor();
                            software.alterar(nome);
                            break;
                        case 2:
                            System.out.println("Como deseja alterar valor em %?\n1.Taxa +10%\n2.Taxa personalizada");
                            op=scanner.nextInt();
                            if(op==1){
                                System.out.println("========================================");
                                software.alterarvalor();
                            }if(op==2){
                                System.out.println("========================================");
                                System.out.println("Qual o novo Valor?");
                                valor=scanner.nextDouble();
                                software.alterarvalor(valor);
                            }else{
                                System.out.println("Opção errada");
                            }
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Opção errada!!!");
                            break;
                    }
                    break;
                case 4:
                    resp=0;
                    break;
                default:
                    System.out.println("Opção errada!!!");
                    break;
            }
        }
    }
}
