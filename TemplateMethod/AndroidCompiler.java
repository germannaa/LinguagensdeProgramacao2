
package TemplateMethod;


public class AndroidCompiler extends Compiler{

    public AndroidCompiler() {
    super();
    }
    
    
    @Override
    public void SourceCode() {
        System.out.println("Getting java code...");
    }

    @Override
    public void CompileToObject() {
    System.out.println("Generate intermediary code...");
    }

    @Override
    public void execute() {
    System.out.println("Execute Android application...");
    }
    
}

