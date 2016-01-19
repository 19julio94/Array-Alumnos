package arrayalumnos;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class MetodoArrayAlumnos {

    private int numElementos = pedirNumElem();
    private String[] nomes = new String[numElementos];
    private int[] notas = new int[numElementos];

    public int pedirNumElem() {

        return Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero de elementos"));

    }

    public String pedirNome() {
        return JOptionPane.showInputDialog("Introduce o nome");

    }

    public int pedirNota() {
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce a nota"));

    }

    public void cargarArray() {

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = pedirNome();
            notas[i] = pedirNota();
        }

    }

    public void visualizarArray() {
        String resultados = "";
        for (int i = 0; i < nomes.length; i++) {
            resultados = resultados + "\nnome: " + nomes[i] + " notas: " + notas[i];

        }
        JOptionPane.showMessageDialog(null, resultados);
    }

    public void buscarNota() {

        String nomeBuscar = pedirNome();

        for (int i = 0; i < nomes.length; i++) {
            if (nomeBuscar.equalsIgnoreCase(nomes[i])) {
                JOptionPane.showMessageDialog(null, "notas:  " + notas[i]);

            }
        }

    }

    public void ordenarNotas() {
        int i, j, aux;
        String nomaux;
        for (i = 0; i < numElementos - 1; i++) {

            for (j = i+1; j < numElementos; j++) {

                if (notas[i] > notas[j]) {
                    
                    aux=notas[i];
                    notas[i]=notas[j];
                    notas[j]=aux;
                    
                    
                    nomaux=nomes[i];
                    nomes[i]=nomes[j];
                    nomes[j]=nomaux;
                }

            }

        }

    }

}
