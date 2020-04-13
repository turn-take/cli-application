package client;

import command.CommandTaker;
import command.Handler;
import command.HandlerFactory;
import consts.Mode;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Welcome to CLI-Application!");
		
		Context context = new Context(Mode.INPUT);
		CommandTaker commandTaker = new CommandTaker(context);
		
		CommandLine commandLine = new CommandLine(commandTaker);

		commandLine.open();
		
		System.out.println("See you again.");
		
	}
}
