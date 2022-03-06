package Desafio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao3 {

        public static void main(String[] args) throws InterruptedException {

            Scanner input = new Scanner(System.in);
            /* Entrada do usuário */
            String str = input.nextLine();
            List<String> subStr = new ArrayList<>();
            int b = 0;
            /* Remover espaço da string  */
            String[] newStr = str.split(" ");
            str = "";
            //Convertendo o Array de string em String
            for(int i = 0; i< newStr.length; i++){
                str += newStr[i];
            }
            /* Cálculo raiz quadrada (Sempre arredodando o resultado para cima) */
            double r = Math.ceil(Math.sqrt(str.length()));
            /* Dividindo a string em substring com base na raiz quadrada */
            for(int i = 1; i<r+1; i++){
                int a = i * (int)r ;
                if(a > str.length()){
                    b = a - str.length();
                }
                subStr.add(str.substring(a-(int)r, a-b));
            }
            String finalStr = "";
            /* Juntando as colunas da lista de substring para formar a string final */
            for (int i = 0; i < subStr.size(); i++) {
                for (int j = 0; j < r; j++) {
                    if(subStr.get(j).length() > i){
                        finalStr += subStr.get(j).toCharArray()[i];
                    }
                }
                finalStr += " ";
            }
            System.out.println(finalStr);
        }
        /* AVISO: SE FOR COPIAR MEU CÓDIGO, COLOQUEM CRÉDITOS */
}
