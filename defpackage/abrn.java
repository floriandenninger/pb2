package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abrn {
    public final Handler a;
    public final abrm b;

    public abrn(byte[] bArr) {
        HandlerThread handlerThread = new HandlerThread("RenderThread", 0);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.a = handler;
        this.b = new abrm(handler.getLooper());
    }

    public final abqu a() {
        return this.b.b;
    }

    public final void b(abrp abrpVar) {
        abrpVar.getClass();
        e(new abrj(this, new abrg(abrpVar), 0));
    }

    public final void c(abrk abrkVar) {
        d(abrkVar, false);
    }

    public final void d(final abrk abrkVar, final boolean z) {
        e(new Runnable() { // from class: abrf
            @Override // java.lang.Runnable
            public final void run() {
                abrn abrnVar = abrn.this;
                boolean z2 = z;
                abrk abrkVar2 = abrkVar;
                abrm abrmVar = abrnVar.b;
                if (abrmVar.b == null) {
                    if (z2) {
                        abrmVar.b = new abqu(null, 1);
                    } else {
                        abrmVar.b = new abqu(null, 0);
                    }
                }
                if (abrkVar2 != null) {
                    abrkVar2.a();
                }
            }
        });
    }

    public final void e(Runnable runnable) {
        runnable.getClass();
        this.a.post(runnable);
    }

    public final void f() {
        k();
        e(new abri(this));
    }

    public final void g() {
        synchronized (this.b) {
            abrm abrmVar = this.b;
            if (abrmVar.a) {
                if (abrmVar.c()) {
                    this.b.b();
                } else {
                    e(this.b.g);
                }
            }
        }
    }

    public final void h(Runnable runnable, Handler handler) {
        synchronized (this.b) {
            abrm abrmVar = this.b;
            abrmVar.d = runnable;
            abrmVar.c = handler;
        }
    }

    public final void i(abrr abrrVar) {
        e(new abrj(this, new abrh(abrrVar), 1));
    }

    public final void j() {
        synchronized (this.b) {
            this.b.a = true;
        }
        g();
    }

    public final void k() {
        synchronized (this.b) {
            this.b.a = false;
        }
    }

    public final void l(abru abruVar) {
        synchronized (this.b) {
            this.b.h = abruVar;
        }
    }

    public abrn() {
        this(null);
    }
}
