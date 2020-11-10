package io.github.fullee.GoFdp.visitor.ops;

import io.github.fullee.GoFdp.visitor.obj.JavaScript;
import io.github.fullee.GoFdp.visitor.obj.Python;
import io.github.fullee.GoFdp.visitor.obj.Ruby;

public class PrintVisitor extends Visitor{

    public void visit(Ruby ruby) {
        System.out.println("ruby: print ''");
    }

    public void visit(JavaScript ruby) {
        System.out.println("js: console.log()");
    }

    public void visit(Python ruby) {
        System.out.println("py: print ''");
    }
}
