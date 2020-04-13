package command;

import process.Process;

public interface Handler {

    public Process parse(String command) throws Exception;
}
