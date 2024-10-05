package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class gju {
    public zcp a = whu.o();
    private final Activity b;
    private final gjr c;

    public gju(Activity activity, gjr gjrVar, nyk nykVar) {
        this.b = activity;
        this.c = gjrVar;
        nykVar.a.n().X(new ayrs() { // from class: gjt
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                gju.this.a = (zcp) obj;
            }
        });
    }

    public boolean f() {
        return this.a != null && this.c.e(etx.r(this.b), this.a);
    }
}
