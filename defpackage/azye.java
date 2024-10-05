package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azye {
    private static volatile Choreographer choreographer;

    static {
        Object l;
        Handler handler;
        try {
            Looper mainLooper = Looper.getMainLooper();
            mainLooper.getClass();
            if (Build.VERSION.SDK_INT < 28) {
                try {
                    handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, true);
                } catch (NoSuchMethodException unused) {
                    handler = new Handler(mainLooper);
                }
            } else {
                Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, mainLooper);
                if (invoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
                }
                handler = (Handler) invoke;
            }
            l = new azyc(handler, null);
        } catch (Throwable th) {
            l = aype.l(th);
        }
    }

    public static final azyd a(Handler handler) {
        return new azyc(handler, "main");
    }
}
