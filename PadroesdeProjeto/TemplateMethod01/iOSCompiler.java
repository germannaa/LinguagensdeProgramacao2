
package TemplateMethod01;


public class iOSCompiler extends Compiler{

    public iOSCompiler() {
        super();
    }

    @Override
    public void SourceCode() {
        System.out.println("Getting swift or objetive c code...");
    }

    @Override
    public void CompileToObject() {
    System.out.println("Generate intermediary code...");
    }

    @Override
    public void execute() {
    System.out.println("Execute iOS application...");
    }
    
}
