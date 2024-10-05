package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abtr implements absi {
    public static final /* synthetic */ int c = 0;
    public final abzy a;
    public final Handler b;
    private final acaf d;
    private final Handler e;

    static {
        TimeUnit.SECONDS.toNanos(1L);
    }

    public abtr(int i, int i2, int i3, abzy abzyVar, acac acacVar, acaf acafVar, Handler handler) {
        new acaj(10);
        this.b = new Handler(Looper.getMainLooper());
        abzyVar.getClass();
        this.a = abzyVar;
        acacVar.getClass();
        acafVar.getClass();
        this.d = acafVar;
        handler.getClass();
        this.e = handler;
        amkq.E(i <= i2 && i2 <= i3);
        amkq.E(i2 > 0);
        if (abzyVar.b() != i2) {
            abzyVar.a(i2);
        }
    }

    @Override // defpackage.absi
    public final long a() {
        return this.d.d();
    }

    @Override // defpackage.absi
    public final void b(absy absyVar) {
    }

    @Override // defpackage.absi
    public final void c(final int i, final abvu abvuVar) {
        this.e.post(new Runnable() { // from class: abtq
            @Override // java.lang.Runnable
            public final void run() {
                abtr abtrVar = abtr.this;
                int i2 = i;
                abvu abvuVar2 = abvuVar;
                abtrVar.a.a(i2);
                abtrVar.b.post(new abud(abvuVar2, 1));
            }
        });
    }

    @Override // defpackage.absi
    public final void d(boolean z) {
    }

    @Override // defpackage.absi
    public final void e(int i) {
    }
}
