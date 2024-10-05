package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gnx extends ygc {
    public final fxj a;
    public nnb b;
    public fgo c;
    public final fxh d;
    private final Activity h;
    private final gfz i;
    private Object j;
    private final gjr k;

    public gnx(Activity activity, axpg axpgVar, acqz acqzVar, fxj fxjVar, gfz gfzVar, gjr gjrVar, aadw aadwVar) {
        super(activity, axpgVar, acqzVar);
        this.h = activity;
        this.a = fxjVar;
        this.i = gfzVar;
        this.d = new fxh() { // from class: gnw
            @Override // defpackage.fxh
            public final void e(Configuration configuration) {
                gnx.this.c();
            }
        };
        this.k = gjrVar;
        asvu asvuVar = aadwVar.b().e;
        if ((asvuVar == null ? asvu.a : asvuVar).cd) {
            return;
        }
        axpgVar.get();
    }

    private final void f() {
        Object obj = this.j;
        if (obj == null) {
            return;
        }
        this.k.d(obj);
        this.j = null;
    }

    @Override // defpackage.ygc
    public final void a() {
        super.a();
        f();
        fav.u(this.h, true);
        fav.t(this.h, true);
        this.i.m(3);
    }

    @Override // defpackage.ygc
    public final void b(Object obj, Pair pair) {
        nnb nnbVar = this.b;
        if (nnbVar != null) {
            nnbVar.f();
        }
        if (pair != null && ((String) pair.first).equals("overlay_lock_orientation")) {
            if (!pair.second.equals(true)) {
                f();
            } else if (this.j == null) {
                this.j = this.k.c(1);
            }
        }
        this.i.g(3);
        super.b(obj, pair);
        fav.u(this.h, false);
        fav.t(this.h, false);
    }
}
