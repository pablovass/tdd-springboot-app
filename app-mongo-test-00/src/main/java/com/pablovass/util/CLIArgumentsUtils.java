package com.pablovass.util;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {
    // solo nos va a mostrar el manual si la propiedad esta presente

    static  void showHelp(CLIArguments cliArguments){
        Consumer<CLIArguments>consumerHelper =cliArguments1 -> {
            if(cliArguments1.isHelp()){
                System.out.println("manual solisitado");
            }
        };
        consumerHelper.accept(cliArguments);
    }
    //Supplier se encarga de proveer datos de setear datos recive un T y dar un T
    static CLIArguments generateCLI(){
        Supplier<CLIArguments> generator=()-> new CLIArguments();
        return generator.get();
    }
}
