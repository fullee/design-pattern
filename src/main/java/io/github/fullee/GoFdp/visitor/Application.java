package io.github.fullee.GoFdp.visitor;

import io.github.fullee.GoFdp.visitor.obj.JavaScript;
import io.github.fullee.GoFdp.visitor.obj.Language;
import io.github.fullee.GoFdp.visitor.obj.Python;
import io.github.fullee.GoFdp.visitor.obj.Ruby;
import io.github.fullee.GoFdp.visitor.ops.PrintVisitor;
import io.github.fullee.GoFdp.visitor.ops.TimeVisitor;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Language> languages = generator();

        PrintVisitor printVisitor = new PrintVisitor();
        languages.forEach((x)->{
            x.accept(printVisitor);
        });

        TimeVisitor timeVisitor = new TimeVisitor();
        languages.forEach((x)->{
            x.accept(timeVisitor);
        });

    }

    public static List<Language> generator(){
        ArrayList<Language> languages = new ArrayList<Language>();
        languages.add(new JavaScript());
        languages.add(new Python());
        languages.add(new Ruby());
        return languages;
    }

}
