package io.github.fullee.GoFdp.visitor.ops;

import io.github.fullee.GoFdp.visitor.obj.JavaScript;
import io.github.fullee.GoFdp.visitor.obj.Python;
import io.github.fullee.GoFdp.visitor.obj.Ruby;

public abstract class Visitor {

    public abstract void visit(Ruby ruby);
    public abstract void visit(JavaScript ruby);
    public abstract void visit(Python ruby);
}
