package Desafio2;

import java.util.Arrays;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Entrada do usuário */
        String number = input.nextLine();

        int arr[]= new int[number.length()];
        /* Converter tipo string para int e adicionando ao array */
        for(int i = 0; i<number.length(); i++){
            if(Character.isDigit(number.charAt(i))){
                arr[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
            }
        }
        /* Ordenando o array  */
        Arrays.sort(arr);
        int x = 0;
        /* Cálculo para saber a mediana */
        x = (arr.length - 1) / 2;

        System.out.println(arr[x]);


    }
}
