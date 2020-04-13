package client;

import process.Process;
import consts.Mode;
import lombok.Getter;
import lombok.Setter;

public class Context {
	
	public Context(Mode mode) {
		this.mode = mode;
	}
	
	@Getter
	@Setter
	private Mode mode;
	
}
