import java.rmi.NotBoundException;
import java.util.NoSuchElementException;

public class examinador {
    public static boolean isMutant(String[] dna) throws LetraInvalida {
        int e = dna.length;

        int contador = 0;

        //corroboramos que tengan las letras validas (A,T,G,C)
        try {
            for (int i = 0; i < e; i++) {
                for (char cha:dna[i].toCharArray()) {
                        if (cha == 'A' || cha== 'T' || cha == 'G' || cha== 'C') {
                        }else {
                            throw new LetraInvalida();
                        }
                    }
                }

                /*for (int j = 0; j < e; j++) {
                    if (aCaracteres[i] != 'A' || aCaracteres[i] != 'T' || aCaracteres[i] != 'G' || aCaracteres[i] != 'C') {
                        throw new LetraInvalida();
                    }
                }*/
            /*System.out.println(contCar+" ");
        if (contCar!=36){
            System.out.println("caracteres ingresados incorrectamente");
            return false;
        }*/



            char[][] dnaMatriz = new char[e][e];

            // Rellenar la matriz de ADN
            for (int i = 0; i < e; i++) {
                dnaMatriz[i] = dna[i].toCharArray();
            }


            for (int i = 0; i < e; i++) {
                for (int j = 0; j < e; j++) {
                    //vertical
                    //si tiene 3 espacios mas y esos contienen los mismos caracteres sumamos 1)
                    if (j + 3 < e && dnaMatriz[i][j] == dnaMatriz[i][j + 1] &&
                            dnaMatriz[i][j] == dnaMatriz[i][j + 2] &&
                            dnaMatriz[i][j] == dnaMatriz[i][j + 3]) {
                        contador++;
                    }
                    //horizontal
                    //si tiene 3 espacios mas y esos contienen los mismos caracteres sumamos 1)
                    if (i + 3 < e && dnaMatriz[i][j] == dnaMatriz[i + 1][j] &&
                            dnaMatriz[i][j] == dnaMatriz[i + 2][j] &&
                            dnaMatriz[i][j] == dnaMatriz[i + 3][j]
                    ) {
                        contador++;
                    }

                    //diagonal principal
                    if (i + 3 < e && j + 3 < e && dnaMatriz[i][j] == dnaMatriz[i + 1][j + 1] &&
                            dnaMatriz[i][j] == dnaMatriz[i + 2][j + 2] &&
                            dnaMatriz[i][j] == dnaMatriz[i + 3][j + 3]
                    ) {
                        contador++;
                    }
                    //diagonal secundaria
                    if (i + 3 < e && j - 3 >= 0 && dnaMatriz[i][j] == dnaMatriz[i + 1][j - 1] &&
                            dnaMatriz[i][j] == dnaMatriz[i + 2][j - 2] &&
                            dnaMatriz[i][j] == dnaMatriz[i + 3][j - 3]
                    ) {
                        contador++;
                    }
                }

            }
            mostrar(dnaMatriz);
        }catch(Exception a){
            System.out.println("ingreso invalido en las letras");
            contador=0;
            return false;
        }
            if (contador>1){
                return  true;
                }else return false;
    }

    public static void mostrar(char matriz[][]){
        for(int i =0; i<6; i++){
            System.out.println("");
            for (int j=0;j<6;j++){
                System.out.print("[ " + matriz[i][j] + " ]");
            }
        }
    }

    public static void corroborar(String[] dna) throws LetraInvalida {
        if (isMutant(dna)){
            System.out.println("es mutante");
        }else {
            System.out.println("no es mutante");
        }
    }

}
