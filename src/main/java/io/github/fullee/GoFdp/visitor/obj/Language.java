package io.github.fullee.GoFdp.visitor.obj;

import io.github.fullee.GoFdp.visitor.ops.Visitor;

public abstract class Language {

    public Language() {
    }

    public abstract void accept(Visitor visitor);
}
