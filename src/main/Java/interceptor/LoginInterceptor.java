package interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;



public class LoginInterceptor implements Interceptor {
    @Override
    public void intercept(Invocation inv) {
        inv.invoke();

    }
}
