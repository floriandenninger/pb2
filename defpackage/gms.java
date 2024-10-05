package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gms implements Runnable {
    public final /* synthetic */ gna a;
    public final /* synthetic */ View b;
    private final /* synthetic */ int c;

    public /* synthetic */ gms(gna gnaVar, View view, int i) {
        this.c = i;
        this.a = gnaVar;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            gna gnaVar = this.a;
            View view = this.b;
            if (gnaVar.q == null || view != gnaVar.l) {
                gnaVar.b();
                int height = view.getHeight();
                gnaVar.q = new gmy(gnaVar, view, height);
                gnaVar.a.aB(gnaVar.q);
                gnaVar.a.v(gnaVar.f);
                gnaVar.n = (int) (height * gna.e(view, gnaVar.g));
                gnaVar.l = view;
                return;
            }
            gnaVar.a.N();
            return;
        }
        this.a.c.removeView(this.b);
    }
}
