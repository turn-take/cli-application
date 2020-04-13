package command;

import client.Context;

/**
 * コマンドを引き受けるクラス
 */
public class CommandTaker {

	private final Context context;
	
	public CommandTaker(Context context) {
		this.context = context;
	}
	
	public void accept(String command) {

		try {
			// コマンド解析後にプロセス実施
			HandlerFactory.newHandler(context).get().parse(command).execute(context);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
	}
}
