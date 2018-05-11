import java.util.Scanner;   

//package aulas;
        
    public class Aula_01{
    
        public static void main(String[] args){
            
        String nome;
            
            Scanner Ler_nome = new Scanner(System.in);
            
                System.out.println("Digite seu nome: ");
                        
                        nome = Ler_nome.next(); 

                            System.out.printf("Nome: %s ", nome);
        }
        
    }
