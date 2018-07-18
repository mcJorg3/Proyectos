
package consola;

import java.util.Scanner;

public class JuegoGato {

    private String letra;
    private String pos[][] = new String[3][3];
    private int cont = 1;
    private boolean estatus;
    
    public void iniciarJuego() {
        int n;
        tablero();

        while (cont <=9) {
            System.out.print("Ingresa numero: ");

            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();

            elegirPosicion(n);
            turno();
            imprimirTablero();
            cont++;
           if(ganador()==true){
               cont=9;
           }
               if(cont==9){
                   System.out.println("Empate");
               }     
            
        }

    }

    private void imprimirTablero() {

        for (int c = 0; c < 3; c++) {
            for (int f = 0; f < 3; f++) {

                if (f % 3 == 0) {
                    System.out.println(" ----------- ");
                }
                System.out.print("| " + pos[c][f] + " ");
            }
            System.out.println("|");

        }
       System.out.println(" ----------- ");
       
    }

    private void tablero() {

        int x = 0;
        char tab[][] = new char[3][3];
        for (int c = 0; c < 3; c++) {
            for (int f = 0; f < 3; f++) {
                x++;
                tab[f][c] = (char) x;
                pos[f][c] = " ";
                if (f % 3 == 0) {

                    System.out.println(" ----------- ");
                }
                System.out.print("| " + x + " ");
            }
            System.out.println("|");
        }
        System.out.println(" ----------- ");

    }

    private void elegirPosicion(int posicion) {
        String s = turno();
        switch (posicion) {
            case 1:
                pos[0][0] = s;
                break;
            case 2:
                pos[0][1] = s;
                break;
            case 3:
                pos[0][2] = s;
                break;
            case 4:
                pos[1][0] = s;
                break;
            case 5:
                pos[1][1] = s;
                break;
            case 6:
                pos[1][2] = s;
                break;
            case 7:
                pos[2][0] = s;
                break;
            case 8:
                pos[2][1] = s;
                break;
            case 9:
                pos[2][2] = s;
                break;
            default:
                System.out.println("Por Favor, Ingrese Solo Un Digito Del 1 al 9.");
                break;
        }
    }

    private String turno() {
        if (cont % 2 == 0) {
            letra = "X";
        } else {
            letra = "O";
        }
        return letra;
    }

    private boolean ganador() {
      estatus=false;
        if (pos[0][0].equals(letra) && pos[0][1].equals(letra) && pos[0][2].equals(letra)) {
            estatus=true;
            System.out.println("El ganador es: " + letra);
        } else if (pos[1][0].equals(letra) && pos[1][1].equals(letra) && pos[1][2].equals(letra)) {
            estatus=true;
            System.out.println("El ganador es: " + letra);
        } else if (pos[2][0].equals(letra) && pos[2][1].equals(letra) && pos[2][2].equals(letra)) {
            estatus=true;
            System.out.println("El ganador es: " + letra);
        } else if (pos[0][0].equals(letra) && pos[1][0].equals(letra) && pos[2][0].equals(letra)) {
          estatus=true;
            System.out.println("El ganador es: " + letra);
        } else if (pos[0][1].equals(letra) && pos[1][1].equals(letra) && pos[2][1].equals(letra)) {
            estatus=true;
            System.out.println("El ganador es: " + letra);
        } else if (pos[0][2].equals(letra) && pos[1][2].equals(letra) && pos[2][2].equals(letra)) {
            estatus=true;
            System.out.println("El ganador es: " + letra);
        } else if (pos[0][0].equals(letra) && pos[1][1].equals(letra) && pos[2][2].equals(letra)) {
           estatus=true;
            System.out.println("El ganador es: " + letra);
        } else if (pos[0][2].equals(letra) && pos[1][1].equals(letra) && pos[2][0].equals(letra)) {
           estatus=true;
            System.out.println("El ganador es: " + letra);
        }
        
      return estatus;
    }

}
