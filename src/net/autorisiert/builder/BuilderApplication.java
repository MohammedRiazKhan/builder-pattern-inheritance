package net.autorisiert.builder;

import net.autorisiert.builder.domain.Sub;
import net.autorisiert.builder.domain.Base;

/**
 *
 * @author Mike Boddin
 */
public class BuilderApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Base base = new Base.Builder().name("baseName").build();
        System.out.println(String.format("base: %s", base));
        
        Sub sub = (Sub) new Sub.Builder().subName("test").name("pTest").build();
        System.out.println(String.format("sub:  %s", sub));
    }
    
}
