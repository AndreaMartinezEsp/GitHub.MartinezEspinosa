
package com.mycompany.github.martinezespinosa;

/**
 *
 * @author h
 */
public class GitHubMartinezEspinosa {

    public static void main(String[] args) {
        Martinez m = new Martinez();
        System.out.println("Multiplica los números 1: "+m.multiplicaNum());
        m.mensajeImportante();
        
        System.out.println("   ");
        
        Espinosa e = new Espinosa();
        System.out.println("Multiplica los números 1: "+e.multinum());
        e.mensajeImportante();
    }
}
