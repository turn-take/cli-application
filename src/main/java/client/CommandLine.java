package client;

import java.util.Scanner;

import command.CommandTaker;

public class CommandLine {

	private final CommandTaker commandTaker;
	
	public CommandLine(CommandTaker commandTaker) {
		this.commandTaker = commandTaker;
	}
	
	/**
	 * コマンドラインをオープンし、文字列を受け付ける。
	 */
	public void open() {
    	System.out.print(">");
    	
        try(Scanner scan = new Scanner(System.in)){
        	while(scan.hasNext()) {
        		String command = scan.nextLine();
        		if(command.equals("quit")) break;

        		commandTaker.accept(command);
        		
        		System.out.print(">");
        	}
        }
	}
}
