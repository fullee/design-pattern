package io.github.fullee.GoFdp.visitor.ops;

import io.github.fullee.GoFdp.visitor.obj.JavaScript;
import io.github.fullee.GoFdp.visitor.obj.Python;
import io.github.fullee.GoFdp.visitor.obj.Ruby;

public class TimeVisitor extends Visitor {

    public void visit(Ruby ruby) {
        System.out.println("Time.new");
    }

    public void visit(JavaScript ruby) {
        System.out.println("new Date()");
    }

    public void visit(Python ruby) {
        System.out.println("time.time()");
    }
}
