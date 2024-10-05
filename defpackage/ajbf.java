package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajbf {
    public final ajay a;
    public final Executor b;
    public final shf c;
    public final aaea d;
    public volatile ajbd f;
    public volatile ajau g;
    public boolean h;
    public final LinkedBlockingQueue i = new LinkedBlockingQueue();
    private final Runnable j = new Runnable() { // from class: ajaw
        @Override // java.lang.Runnable
        public final void run() {
            ajbf ajbfVar = ajbf.this;
            yjk.f();
            if (ajbfVar.f == null && ajbfVar.e) {
                ajbfVar.g = (ajau) ajbfVar.i.poll();
                ajau ajauVar = ajbfVar.g;
                if (ajauVar != null) {
                    ajbd ajbdVar = new ajbd(ajbfVar);
                    ajbfVar.f = ajbdVar;
                    if (!ajbfVar.h) {
                        ajbfVar.h = true;
                        ajbfVar.a.d();
                    }
                    ajauVar.b(ajbdVar);
                    return;
                }
                if (ajbfVar.h) {
                    ajbfVar.h = false;
                    if (aifk.g(ajbfVar.d)) {
                        return;
                    }
                    ajbfVar.a.a();
                }
            }
        }
    };
    public volatile boolean e = false;

    public ajbf(Executor executor, ajay ajayVar, shf shfVar, aaea aaeaVar) {
        this.a = new ajbc(this, ajayVar);
        this.b = executor;
        this.c = shfVar;
        this.d = aaeaVar;
    }

    public final void a(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public final void b() {
        a(this.j);
    }

    public final void c(ajau ajauVar) {
        this.i.add(ajauVar);
        b();
    }

    public final void d() {
        yjk.f();
        if (this.g != null) {
            this.g.a();
            this.g = null;
        }
        this.f = null;
        this.h = false;
        this.i.clear();
    }

    public final void e(boolean z) {
        this.e = z;
        b();
    }
}
