package command.handlers;

import client.Context;
import command.Handler;
import consts.Mode;
import process.LoginProcess;
import process.Process;

public class NormalHandler implements Handler {

    @Override
    public Process parse(String command) throws Exception{

        switch(command) {
            case "login" :
                return new LoginProcess();
            default :
                throw new Exception("Invalid command.");
        }
    }
}
