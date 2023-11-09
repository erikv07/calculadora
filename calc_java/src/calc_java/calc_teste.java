package calc_java;

public class calc_teste {
public static void main(String [] args){
        
		// teste de soma 
	calc Somar = new calc();
        
        // teste da soma com um zero e um inteiro 
        int result_soma = Somar.somar(15,0);
        System.out.println("O resultado da soma e:  " + result_soma);
        
        
        // teste de soma com dois numeros inteiros 
        result_soma = Somar.somar(3,2 );
        System.out.println("O resultado da soma e:  " + result_soma);
        
        
        // teste de soma com um numero negativo e um inteiro 
        result_soma = Somar.somar(-1,3);
        System.out.println("O resultado da soma e:  " + result_soma);
        
        
        // teste de soma com dois numeros negativos 
        result_soma = Somar.somar(-1,-3);
        System.out.println("O resultado da soma e:  " + result_soma);
        
        
        // teste de soma com um zero e um numero negativo 
        result_soma = Somar.somar(-1,0);
        System.out.println("O resultado da soma e:  " + result_soma);
        
        // teste de soma com parenteses 
        result_soma = Somar.somar(2, (2 +2));
         System.out.println("O resultado da soma e:  " + result_soma);
        
        
        
        // teste da subtração
         calc Subtracao = new calc();
        
        // teste da subtração com um zero e um inteiro 
        int result_subtracao = Subtracao.subtracao(0, 16);
        System.out.println("O resultado da subtracao e:  "  + result_subtracao);
        
        
       // teste de subtração com dois numeros inteiros 
         result_subtracao = Subtracao.subtracao(7, 16);
         System.out.println("O resultado da subtracao e:  "  + result_subtracao);
         
         //teste de subtração com um numero negativo e um inteiro 
          result_subtracao = Subtracao.subtracao(-1, 16);
          System.out.println("O resultado da subtracao e:  "  + result_subtracao);
        
         
        // teste de subtração com dois numeros negativos 
          result_subtracao = Subtracao.subtracao(-1, -16);
          System.out.println("O resultado da subtracao e:  "  + result_subtracao);
          
          
        //  teste de subtração com um zero e um numero negativo 
          result_subtracao = Subtracao.subtracao(-3, -12);
          System.out.println("O resultado da subtracao e:  "  + result_subtracao);
         
          
        // teste de subtração com parenteses 
          result_subtracao = Subtracao.subtracao(3, (5-12));
          System.out.println("O resultado da subtracao e:  "  + result_subtracao);
         
         
        
          // teste de multiplicacao
          calc Multiplicacao = new calc();
          
        
        // teste da multiplicacao com um zero e um inteiro 
        int result_multiplicacao = Multiplicacao.multiplicacao(0, 16);
        System.out.println("O resultado da multiplicacao  e:  "  + result_multiplicacao);
        
        
        
         // teste de multiplicacao com dois numeros inteiros 
         result_multiplicacao = Multiplicacao.multiplicacao(7, 0);
         System.out.println("O resultado da multiplicacao e:  "  + result_multiplicacao );
         
         
         //teste de mutiplicacao com um numero negativo e um inteiro 
          result_multiplicacao = Multiplicacao.multiplicacao(-1, 16);
          System.out.println("O resultado da multiplicacao e:  "  + result_multiplicacao);
          
          
          // teste de multiplicacao com dois numeros negativos 
          result_multiplicacao = Multiplicacao.multiplicacao(-1, -16);
          System.out.println("O resultado da multiplicacao e:  "  + result_multiplicacao);
          
          
          
          //  teste de multiplicacao com um zero e um numero negativo 
          result_multiplicacao = Multiplicacao.multiplicacao(0, -6);
          System.out.println("O resultado da multiplicacao e:  "  + result_multiplicacao);
          
          // teste de multiplicacao com parenteses 
          result_multiplicacao = Multiplicacao.multiplicacao(3, (5*12));
          System.out.println("O resultado da multiplicacao e:  "  + result_multiplicacao);
          
       // teste de divisao
          calc Divisao = new calc();
         
          
       // teste da divisão com um zero e um inteiro 
          int result_divisao = Divisao.divisao(0, 16);
          System.out.println("O resultado da divisao  e:  "  + result_divisao);
          
              
           // teste de divisao com dois numeros inteiros 
              result_divisao = Divisao.divisao(7, 7);
              System.out.println("O resultado da divisao e:  "  + result_divisao );
              
              
              
        // teste de diviso com dois numeros negativos
              result_divisao = Divisao.divisao(-7, -7);
              System.out.println(" O resultado da divisao e: " + result_divisao);
              
              
              
        // teste de divisao com um numero zero e um negativo
              result_divisao = Divisao.divisao(0, -7);
              System.out.println(" O resultado da divisao e: " + result_divisao);
              
              
        // teste de divisao com parenteses 
              result_divisao = Divisao.divisao(0, (7/7));
              System.out.println(" O resultado da divisao e: " + result_divisao);
          
          
         
          
           
}
}
