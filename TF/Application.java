import java.util.Scanner;
/**
 * Escreva uma descrição da classe Application aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Application
{
   public static void main (String args []) {
       Scanner teclado = new Scanner (System.in);
       int opcao = 0;
       CadastroBarcos cadastroBarcos = new CadastroBarcos ();
       Passeio passeio = null;
       while (opcao != 11) {
            System.out.println("1 – Incluir barco");
            System.out.println("2 – Remover barco");
            System.out.println("3 – Mostrar barcos");
            System.out.println("4 – Pesquisar e mostrar barco por nome");
            System.out.println("5 – Criar passeio");
            System.out.println("6 – Mostrar passeio");
            System.out.println("7 – Adicionar passageiro no passeio");
            System.out.println("8 – Remover passageiro do passeio");
            System.out.println("9 – Quantidade de passageiros por profissão");
            System.out.println("10 – Valor total arrecadado pelo passeio");
            System.out.println("11 – Sair do programa");

           System.out.println ("Digite a opcao que deseja fazer: ");
           opcao = teclado.nextInt();
           
           if (opcao == 1) {
               System.out.println ("Digite o codigo do barco");
               int codigo = teclado.nextInt();
               teclado.nextLine();
               System.out.println ("Digite o nome do barco");
               String nome = teclado.nextLine();
               System.out.println ("Digite a lotacao do barco");
               int lotacao = teclado.nextInt();
               
               Barco b1 = new Barco (nome, codigo, lotacao);
               if (cadastroBarcos.adicionaBarco (b1)){
                   System.out.println ("Barco inserido com sucesso");
                } else {
                    System.out.println ("Nao foi possivel adicionar o barco");
                }
               } else {
                   if (opcao == 2) {
                    teclado.nextLine();
                    System.out.println ("Digite o nome do barco que deseja remover");
                    String nome = teclado.nextLine ();
                       if (cadastroBarcos.removeBarco (nome)) {
                           System.out.println ("Barco removido com sucesso");
                     } else {
                    System.out.println ("Nao foi possivel achar um barco com esse nome para ser removido");
                    }
                } else {
                    if (opcao == 3) {
                        cadastroBarcos.mostraBarcos();
                    } else {
                    if (opcao == 4) {
                        teclado.nextLine();
                        System.out.println ("Digite o nome do barco que deseja achar");
                        String nome = teclado.nextLine();
                        Barco barcoEncontrado = cadastroBarcos.buscaBarcoNome (nome);
                        if (barcoEncontrado != null){
                            System.out.println ("Barco encontrado: " + barcoEncontrado);
                        } else {
                            System.out.println ("Nenhum barco foi encontrado");
                        }
                    } else { 
                        if(opcao == 5) {
                            if (passeio == null) {
                            teclado.nextLine();
                            System.out.println ("Informe o nome do barco do passeio");
                            String nomePasseio = teclado.nextLine();
                            Barco barcopasseio = cadastroBarcos.buscaBarcoNome(nomePasseio);
                            if (barcopasseio != null) {
                                    System.out.println ("Informe o valor do bilhete do passeio");
                                    double valorBilhete = teclado.nextDouble();
                                    passeio = new Passeio (barcopasseio, valorBilhete);
                                    System.out.println ("Passeio criado com sucesso");
                            } else {
                                    System.out.println ("Nao foi possivel criar esse passeio");
                                }
                            } else {
                                System.out.println ("Ja existe um passeio criado");
                            }
                        }
                            if (opcao == 6) {
                                if (passeio != null) {
                                    passeio.mostraPasseio();
                                } else{
                                    System.out.println ("Nao tem nenhum passeio criado");
                                }
                            } else{
                                if (opcao == 7) {
                                    if (passeio != null) {
                                        teclado.nextLine();
                                        System.out.println ("Digite o nome do passageiro");
                                        String nomePassageiro = teclado.nextLine();
                                        System.out.println ("Digite a idade do passageiro");
                                        int idade = teclado.nextInt();
                                        teclado.nextLine();
                                        System.out.println ("Digite o nome da profissao do passageiro");
                                        String profissao = teclado.nextLine();
                                        
                                        Passageiro p1 = new Passageiro (nomePassageiro, idade, profissao);
                                        if (passeio.adicionaPassageiro (p1)) {
                                            System.out.println ("Passageiro adicionado com sucesso");
                                        } else {
                                            System.out.println ("Nao foi possivel adicionar o passageiro");
                                        }
                                        } else {
                                            System.out.println ("Nenhum passeio criado");
                                        }
                                } else {
                                            if (opcao == 8) {
                                                if (passeio != null) {
                                            teclado.nextLine();
                                            System.out.println ("Digite o nome do passageiro que deseja remover");
                                            String nomePassageiro = teclado.nextLine ();
                                           if (passeio.removePassageiro (nomePassageiro)) {
                                           System.out.println ("Passageiro removido com sucesso");
                                        } else {
                                                System.out.println ("Nao foi possivel achar um passageiro com esse nome para ser removido");
                                            }
                                                } else { 
                                                    System.out.println("Nenhum passeio criado");
                                            }
                                        }
                                             else {
                                                if (opcao == 9) {
                                                    if (passeio != null){ 
                                                    teclado.nextLine();
                                                    System.out.println ("Informe a profissao que deseja contar");
                                                    String contador = teclado.nextLine();
                                                    passeio.buscaPasProfissao(contador);
                                                 } else { 
                                                    System.out.println("Nenhum passeio criado");
                                            }
                                        } else {
                                                if (opcao == 10) {
                                                    if (passeio != null) {
                                                        System.out.println("O Total arrecadado com o passeio foi de:  " + passeio.buscaValorPasseio ());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                 }
            }
            }
        }
