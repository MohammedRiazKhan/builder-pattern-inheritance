package net.autorisiert.builder.domain;

import net.autorisiert.builder.domain.Base;

/**
 *
 * @author Mike Boddin
 */
public class Sub extends Base{
    private final String subName;
    
    protected Sub(Builder builder){
        super(builder);
        this.subName = builder.subName;
    }

    @Override
    public String toString() {
        return "Sub{" + "subName=" + subName + '}' + super.toString();
    }
    
    public static class Builder extends Base.Builder{

        private String subName;
        
        public Builder() {
            super();
        }
        
        public Builder subName(String subName){
            this.subName = subName;
            return this;
        }
        
        @Override
        public Sub build(){
            return new Sub(this);
        }
        
    }
}
