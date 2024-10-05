package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axki {
    public final Handler a;
    public final Runnable b;
    public long c;

    public axki(Handler handler, Runnable runnable) {
        handler.getClass();
        runnable.getClass();
        this.a = handler;
        this.b = new axkh(this, runnable, handler);
    }

    public final void a(final long j) {
        this.a.post(new Runnable() { // from class: axkg
            @Override // java.lang.Runnable
            public final void run() {
                axki axkiVar = axki.this;
                long j2 = j;
                axkiVar.c = j2;
                axkiVar.a.postDelayed(axkiVar.b, j2);
            }
        });
    }

    public final void b() {
        this.a.removeCallbacks(this.b);
        this.a.post(new Runnable() { // from class: axkf
            @Override // java.lang.Runnable
            public final void run() {
                axki axkiVar = axki.this;
                axkiVar.a.removeCallbacks(axkiVar.b);
            }
        });
    }
}
