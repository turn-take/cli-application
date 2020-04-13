package process;

import client.Context;
import consts.Mode;

public class LoginProcess implements Process{
    @Override
    public void execute(Context context) {
        context.setMode(Mode.AUTH_LOGIN);
        System.out.println("Please enter your user name.");
    }
}
