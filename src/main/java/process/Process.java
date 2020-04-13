package process;

import client.Context;

/**
 * 主処理のIF
 */
@FunctionalInterface
public interface Process {
	public void execute(Context context);
}
