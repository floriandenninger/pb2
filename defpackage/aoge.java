package defpackage;

import android.util.Log;
import java.lang.Thread;
import javax.microedition.khronos.egl.EGLContext;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoge implements aogh {
    public aogd a;
    public Throwable b = null;

    public aoge(EGLContext eGLContext) {
        aogd aogdVar = new aogd(eGLContext);
        this.a = aogdVar;
        aogdVar.setName("ExternalTextureConverter");
        final Object obj = new Object();
        this.a.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: aofz
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                aoge aogeVar = aoge.this;
                Object obj2 = obj;
                synchronized (obj2) {
                    aogeVar.b = th;
                    obj2.notify();
                }
            }
        });
        this.a.start();
        try {
            aogd aogdVar2 = this.a;
            synchronized (aogdVar2.h) {
                while (!aogdVar2.f) {
                    aogdVar2.h.wait();
                }
            }
            if (!aogdVar2.g) {
                synchronized (obj) {
                    while (this.b == null) {
                        obj.wait();
                    }
                }
            }
            this.a.setUncaughtExceptionHandler(null);
            if (this.b == null) {
                return;
            }
            this.a.i();
            throw new RuntimeException(this.b);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            String valueOf = String.valueOf(e.getMessage());
            Log.e("ExternalTextureConv", valueOf.length() != 0 ? "thread was unexpectedly interrupted: ".concat(valueOf) : new String("thread was unexpectedly interrupted: "));
            throw new RuntimeException(e);
        }
    }

    public final void a(int i) {
        this.a.c.j = i;
    }

    @Override // defpackage.aogh
    public final void c(aogg aoggVar) {
        aogd aogdVar = this.a;
        synchronized (aogdVar.b) {
            aogdVar.b.clear();
            aogdVar.b.add(aoggVar);
        }
    }
}
