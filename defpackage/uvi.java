package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uvi {
    public static Context a = null;
    public static volatile boolean b = false;
    public static volatile Exception c = null;
    public static volatile boolean d = false;
    public static volatile Exception e;
    private static volatile uvi h;
    private static volatile uvi i;
    public final Context f;
    private final amnv k;
    private final amnv l;
    private final ammv m;
    private static final Object g = new Object();
    private static final amnv j = amkq.x(gzp.j);

    public uvi(Context context) {
        amnv amnvVar = j;
        amnv x = amkq.x(new nju(context, 7));
        ammv j2 = ammv.j(new uws(amnvVar));
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        amnvVar.getClass();
        x.getClass();
        this.f = applicationContext;
        this.k = amkq.x(amnvVar);
        this.l = amkq.x(x);
        this.m = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static uvi a(Context context) {
        uvh uvhVar;
        uvi uviVar = h;
        if (uviVar == null) {
            synchronized (g) {
                uviVar = h;
                if (uviVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    try {
                        uvhVar = (uvh) alta.t(applicationContext, uvh.class);
                    } catch (IllegalStateException unused) {
                        uvhVar = null;
                    }
                    if (uvhVar == null && (applicationContext instanceof uvh)) {
                        ((uvh) applicationContext).jV();
                    }
                    uviVar = new uvi(applicationContext);
                    h = uviVar;
                }
            }
        }
        return uviVar;
    }

    public static void d(Context context) {
        synchronized (g) {
            if (a == null) {
                a = context.getApplicationContext();
            }
        }
    }

    public final uxb b() {
        return (uxb) ((amna) this.m).a;
    }

    public final anic c() {
        return (anic) this.k.get();
    }

    public final uvy e() {
        return (uvy) this.l.get();
    }
}
