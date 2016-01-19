
package arrayalumnos;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class ArrayAlumnos {

    
    public static void main(String[] args) {
       
        
        MetodoArrayAlumnos array1=new MetodoArrayAlumnos();
      
        array1.cargarArray();
        array1.visualizarArray();
        array1.buscarNota();
        array1.ordenarNotas();
        array1.visualizarArray();
       
//        int resposta=Integer.parseInt(JOptionPane.showInputDialog("Que desexa facer:\n 1-Ordenar\n 2-Buscar nota"));
//        
//        switch(resposta){
//        
//            case 1:array1.ordenarNotas();
//            
//            case 2:array1.buscarNota();
                   
                    
        
        }
        
        
        
    }
    

