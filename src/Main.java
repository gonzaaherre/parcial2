import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws LetraInvalida {

        String[] dna = {
                "ATGCGA",
                "CAGTGC",
                "TTATGT",
                "AGAAGG",
                "CCCCTA",
                "TCACTG"
        };

        String[] dnaT = {
                "TAGCAG",
                "CGATCG",
                "TTTATG",
                "AGAGAG",
                "CCCCTA",
                "TCACTG"
        };

        String[] dnaTT = {
                "TAGCAG",
                "CGATGG",
                "TATGTG",
                "AGGGAG",
                "CCCCTA",
                "TCACTG"
        };
        String[] dnaNoMutante = {
                "ATGCGA",
                "CAGTGC",
                "TTATGT",
                "AGACGG",
                "GCGTCA",
                "TCACTG"
        };
        String[] dnaNOmutante = {
                "ATGCAA",
                "CAGTTC",
                "TTATGT",
                "AGAAGG",
                "GCGTCA",
                "TCACTG"
        };

        String[] dnaNOmut = {
                "TAGCAG",
                "CGATGG",
                "TATGTG",
                "AGGGAG",
                "CTCCTA",
                "TCACTG"
        };

        String[] dnaInvalidosChar = {
                "AHGCGA",
                "CCGTGC",
                "TTATGT",
                "AGAAGG",
                "CCTCTA",
                "TCACTG"
        };
        String[] dnaIn = {
                "ATGCGA",
                "CAGTGC",
                "TTATGT",
                "AGAÑGG",
                "CCCCTA",
                "TCACTG"
        };
        String[] dnaInv = {
                "ATGCGA",
                "CMGTGC",
                "TTATGT",
                "AGAAGG",
                "CCCCTA",
                "TCACTG"
        };
        String[] dnainval = {
                "ATGCGA",
                "CAGTGC",
                "TTATGT",
                "AGAAGG",
                "CCCCTA",
                "TCACSG"
        };






        new examinador();
        examinador.corroborar(dna);
        examinador.corroborar(dnaNoMutante);
        examinador.corroborar(dnaInvalidosChar);
        examinador.corroborar(dnaT);
        examinador.corroborar(dnaNOmut);
        examinador.corroborar(dnaIn);
        examinador.corroborar(dnaTT);
        examinador.corroborar(dnaNOmutante);
        examinador.corroborar(dnaInv);
        examinador.corroborar(dnainval);

    }


}