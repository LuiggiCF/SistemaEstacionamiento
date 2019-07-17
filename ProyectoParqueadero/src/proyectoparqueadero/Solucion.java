
package proyectoparqueadero;

/**
 *
 * @author Luiggi
 */
public class Solucion {
    String solucionSt = "";
    int solucionInt = 0;
    
    public String Solucion(int objetivo, int monedasVal[], int monedasCant[]){
        ordInsercion(monedasVal, monedasCant);
        int i = 0;
        while(solucionInt != objetivo){
            i = monedasVal.length-1;
            int j = 0;
            while(i >= 0){
                if (solucionInt + monedasVal[i] <= objetivo) {
                    solucionInt += monedasVal[i];  
                    monedasCant[i] = monedasCant[i] - 1; 
                    j++;
                }
                else{
                    if (j == 1) {
                        solucionSt +="\n "+j+" Moneda/Billete de "+monedasVal[i]; 
                    }
                    else if(j > 1){
                        solucionSt += "\n "+j+" Monedas/Billetes de "+monedasVal[i];
                    }
                    i = i - 1;
                    j = 0;
                    if(solucionInt + monedasVal[0] > objetivo){
                        solucionInt = objetivo;
                    }
                }
            }
        }
        return solucionSt;
    }
    
    public static void ordInsercion (int [] a, int[] b){//Menor a Mayor
    int i, j;
    int aux, aux2 ;
  
    for (i = 1; i < a.length; i++)
    {
     
      j = i;
      aux = a[i];
            aux2 = b[i];
      // se localiza el punto de inserción explorando hacia abajo
      while (j > 0 && aux < a[j-1])
      {
        // desplazar elementos hacia la derecha para hacer espacio 
        a[j] = a[j-1];
            b[j] = b[j-1];
        j--;
      }
      a[j] = aux;
            b[j] = aux2;
    }
  }

}
