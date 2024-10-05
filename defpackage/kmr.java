package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kmr implements View.OnClickListener {
    public final /* synthetic */ kmt a;
    private final /* synthetic */ int b;

    public /* synthetic */ kmr(kmt kmtVar, int i) {
        this.b = i;
        this.a = kmtVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            kmt kmtVar = this.a;
            kmtVar.g.getClass();
            if (kmtVar.h.a == ahvo.PLAYING) {
                kmtVar.g.e();
                return;
            }
            if (kmtVar.h.a == ahvo.PAUSED) {
                kmtVar.g.f();
                return;
            }
            if (kmtVar.h.a == ahvo.ENDED) {
                kmtVar.g.n();
                if (kmtVar.j) {
                    fof fofVar = (fof) ((aili) kmtVar.b.get()).a.c();
                    int i = 1;
                    int i2 = (fofVar.b & 16) != 0 ? fofVar.h : 1;
                    if (i2 > 0) {
                        akbz akbzVar = (akbz) kmtVar.c.get();
                        gcm d = gcq.d();
                        d.f(true);
                        d.k(kmtVar.e);
                        d.m(kmtVar.f, new kmr(kmtVar, i));
                        akbzVar.o(d.b());
                        ynm.m(((aili) kmtVar.b.get()).a.b(new fnz(i2 - 1, 1)), egw.m);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ((nng) this.a.d.get()).h(amsx.r(0));
    }
}
