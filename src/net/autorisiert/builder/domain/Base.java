package net.autorisiert.builder.domain;

/**
 *
 * @author Mike Boddin
 */
public class Base {
    private final String name;

    protected Base(Builder builder) {
        this.name = builder.name;
    }

    @Override
    public String toString() {
        return "Base{" + "name=" + name + '}';
    }
    
    public static class Builder{
        
        private String name;

        public Builder() {
        }
        
        public Builder name(String name){
            this.name = name;
            return this;
        }
        
        public Base build(){
            return new Base(this);
        }
    }
}
