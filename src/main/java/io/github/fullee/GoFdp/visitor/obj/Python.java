package io.github.fullee.GoFdp.visitor.obj;

import io.github.fullee.GoFdp.visitor.ops.Visitor;

public class Python extends Language {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
