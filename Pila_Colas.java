/*
 * Pila_Colas
 */
import java.util.Stack;

public class Pila_Colas {

    public static void main(String[] args) throws Exception{
        System.out.println( equilibrioParentesis("((a+b)*5)-7"));
  
      }
    
}

public static boolean equilibrioParentesis(String expMat){
boolean flag = false;
Stack<String> pila = new Stack<>();

//expMat.length() -> devuelve la longitud de la expMat
for(int i = 0; i <expMat.length();i++){


    pila.push (String.valueOf(expMat.charAt(i)));

}

    int pa = 0;
    int pc = 0;
for(int i = 0; i<pila.size(); i++){
    if(pila.peek().equals("(")){
        pa+=1;
        pila.pop();
    }else if (pila.peek().equals(")")){
        pc -= 1;
        pila.pop();
    }else{
        pila.pop();
    }


}

System.out.println(pa +"-"+pc);
return flag= (pa == pc) ? true : false;
}
