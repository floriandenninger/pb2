package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fqr implements swv {
    public final acqz a;
    public final Context b;

    public fqr(acqz acqzVar, Context context) {
        this.a = acqzVar;
        this.b = context;
    }

    @Override // defpackage.swv
    public final aomu a() {
        return awtv.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, final swu swuVar) {
        final awtv awtvVar = (awtv) obj;
        return ayph.j(new aypj() { // from class: fqq
            @Override // defpackage.aypj
            public final void a(ayue ayueVar) {
                fqr fqrVar = fqr.this;
                awtv awtvVar2 = awtvVar;
                swu swuVar2 = swuVar;
                asuh cf = adyu.cf(awtvVar2);
                if (cf != null && (cf.c & 1) != 0 && swuVar2.a != null) {
                    acra mM = fqrVar.a.mM();
                    acqx acqxVar = new acqx(cf.d);
                    View view = swuVar2.a;
                    int P = yjk.P(fqrVar.b.getResources().getDisplayMetrics(), view.getHeight());
                    int P2 = yjk.P(fqrVar.b.getResources().getDisplayMetrics(), view.getWidth());
                    aone createBuilder = asht.a.createBuilder();
                    aone createBuilder2 = aqah.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    aqah aqahVar = (aqah) createBuilder2.instance;
                    aqahVar.b |= 1;
                    aqahVar.c = P;
                    createBuilder2.copyOnWrite();
                    aqah aqahVar2 = (aqah) createBuilder2.instance;
                    aqahVar2.b |= 2;
                    aqahVar2.d = P2;
                    aqah aqahVar3 = (aqah) createBuilder2.build();
                    createBuilder.copyOnWrite();
                    asht ashtVar = (asht) createBuilder.instance;
                    aqahVar3.getClass();
                    ashtVar.D = aqahVar3;
                    ashtVar.c |= 4194304;
                    mM.w(acqxVar, (asht) createBuilder.build());
                }
                ayueVar.a();
            }
        });
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}
