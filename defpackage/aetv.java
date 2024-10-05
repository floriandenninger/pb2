package defpackage;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aetv {
    Runnable a;
    public final int b;
    private final aetw c;
    private final Handler d;
    private final pkv e;
    private boolean f;

    public aetv(aetw aetwVar, Handler handler, pkv pkvVar) {
        this.c = aetwVar;
        this.d = handler;
        this.e = pkvVar;
        this.b = aetwVar.s.an();
        afic aficVar = afic.ABR;
    }

    private final void e() {
        Runnable runnable = this.a;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.a = null;
        }
    }

    public final void a() {
        if (this.f) {
            d(this.b);
        }
    }

    public final void b(int i) {
        pkv pkvVar = this.e;
        if (pkvVar != null) {
            pkvVar.g(i);
        }
    }

    public final void c(int i, final int i2) {
        if (i == 6) {
            if (this.b != 2) {
                afic aficVar = afic.ABR;
                e();
                b(i2);
                return;
            }
            i = 6;
        }
        if (this.b != i) {
            return;
        }
        this.f = false;
        if (this.a != null) {
            return;
        }
        this.a = new Runnable() { // from class: aetu
            @Override // java.lang.Runnable
            public final void run() {
                aetv aetvVar = aetv.this;
                int i3 = i2;
                afic aficVar2 = afic.ABR;
                aetvVar.b(i3);
            }
        };
        if (this.c.s.i() <= 0) {
            this.a.run();
        } else {
            this.d.postDelayed(this.a, this.c.s.i());
        }
    }

    public final void d(int i) {
        if (this.b != i) {
            return;
        }
        afic aficVar = afic.ABR;
        this.f = true;
        e();
        afki.a(this.e);
        pkv pkvVar = this.e;
        pkvVar.c.execute(new pkk(pkvVar, 1));
    }
}
