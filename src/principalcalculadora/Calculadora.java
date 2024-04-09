
package principalcalculadora;

public class Calculadora {

    public Calculadora() {
    }
    
    
    
    public int sumar(int numero1, int numero2){
   
       int resultado= numero1+numero2;
       return resultado;
   
   } 
    
    
    
     public int restar(int numero1, int numero2){
   
       int resultado= numero1-numero2;
       return resultado;
   
   } 
   
      
     public int multiplicar(int numero1, int numero2){
   
       int resultado= numero1*numero2;
       return resultado;
   
   }    
      
    
     public int dividir(int numero1, int numero2){
   
       int resultado= numero1/numero2;
       return resultado;
   
   }   
      
     
     
         public int calcular(int numero1, int numero2, String valor){
             int resultado = 0;
             if(valor=="/"){
             
       resultado= numero1/numero2;
       
             
             }else{
             if(valor=="*"){
             
       resultado= numero1*numero2;
      
             
             }else{
             if(valor=="-"){
             
       resultado= numero1-numero2;
       
             
             }else{
             if(valor=="+"){
             
       resultado= numero1+numero2;
       
             
             }
             }
             }
             
             }
                 
   
             
             
      return  resultado;
   }  
     
     
     
      
}
