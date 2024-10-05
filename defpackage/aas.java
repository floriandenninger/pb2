package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aas extends gm {
    public final Object a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool(4, new anxc(1, (byte[]) null));
    public volatile Handler c;

    public static Handler B(Looper looper) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, true);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
                return new Handler(looper);
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return Handler.createAsync(looper);
    }
}
