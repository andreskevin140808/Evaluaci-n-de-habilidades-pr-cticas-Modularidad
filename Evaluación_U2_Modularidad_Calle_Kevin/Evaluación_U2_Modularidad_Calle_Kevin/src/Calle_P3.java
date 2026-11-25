public class Calle_P3 {
    static void m(int a, int[] v) { 
        a++; v[1] += a; }
public static void main(String[] args) {
    int a = 5; int[] v = {1, 2, 3}; m(a, v); 
System.out.println(a + " " + v[1]);
}
}
/*Salida exacta
5 8
En este caso a no cambia debido a que a se lo ocupa como parametro por lo cual no se lo modifica 
y en el caso de v[1] sí debido a que es una matriz la cual se esta viendo alterada por lo que 
se dice es un contador que va sumando hasta que cumple cierta condición.
 */