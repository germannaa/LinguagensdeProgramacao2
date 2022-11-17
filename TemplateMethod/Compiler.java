
package TemplateMethod;


public abstract class Compiler {

    public Compiler() {
        //Template Method
        this.SourceCode();
        this.CompileToObject();
        this.execute();
    }
    
    public abstract void SourceCode();
    public abstract void CompileToObject();
    public abstract void execute();
    
}
