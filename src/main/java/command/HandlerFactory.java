package command;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import client.Context;
import command.handlers.NormalHandler;
import consts.Mode;

/**
 * ハンドラを生成するファクトリ
 */
public class HandlerFactory {

	private static final Map<Mode, Supplier<Handler>> handlerMap;

	static {
		handlerMap = new HashMap<>();

		handlerMap.put(Mode.INPUT, NormalHandler::new);
	}

	public static Supplier<Handler> newHandler(Context context) {
		return handlerMap.get(context.getMode());
	}
}
