package defpackage;

import android.opengl.EGL14;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abrm {
    public boolean a;
    public abqu b;
    public Handler c;
    public Runnable d;
    public abrr e;
    private final Looper i;
    public final List f = new ArrayList();
    public abru h = null;
    public final Runnable g = new abrl(this);

    public abrm(Looper looper) {
        looper.getClass();
        this.i = looper;
    }

    public final void a(Throwable th) {
        zga.d("RenderScheduler error", th);
        synchronized (this) {
            Runnable runnable = this.d;
            if (runnable != null) {
                Handler handler = this.c;
                if (handler != null) {
                    handler.post(runnable);
                } else {
                    runnable.run();
                }
            }
        }
    }

    public final void b() {
        amkq.N(c());
        synchronized (this) {
            if (this.e == null) {
                return;
            }
            if (this.b == null) {
                return;
            }
            try {
                Iterator it = this.f.iterator();
                boolean z = true;
                while (it.hasNext()) {
                    z &= !((abrp) it.next()).e(z, this.e, this.b);
                }
                abru abruVar = this.h;
                if (abruVar != null) {
                    abruVar.a = EGL14.eglGetCurrentContext();
                }
            } catch (Exception e) {
                a(e);
            }
        }
    }

    public final boolean c() {
        return Looper.myLooper() == this.i;
    }
}
