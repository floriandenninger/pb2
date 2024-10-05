package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class abmc extends ablz {
    private asrp j;

    public abmc(Context context, acqz acqzVar, aahd aahdVar) {
        super(context, acqzVar, aahdVar);
    }

    @Override // defpackage.ablz, defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ablz
    protected final /* synthetic */ int f(Object obj) {
        return ((asrp) obj).e;
    }

    @Override // defpackage.ablz
    protected final /* synthetic */ int g(Object obj) {
        return ((asrp) obj).g;
    }

    @Override // defpackage.ablz
    protected final /* synthetic */ int h(Object obj) {
        return ((asrp) obj).f;
    }

    @Override // defpackage.ablz
    protected final /* bridge */ /* synthetic */ long i(Object obj) {
        return ((asrp) obj).i * 1000;
    }

    @Override // defpackage.ablz
    protected final /* bridge */ /* synthetic */ long j(Object obj) {
        return ((asrp) obj).j * 1000;
    }

    @Override // defpackage.ablz
    protected final /* bridge */ /* synthetic */ Spanned k(Object obj) {
        aqyg aqygVar;
        asrp asrpVar = (asrp) obj;
        if ((asrpVar.b & 2) != 0) {
            aqygVar = asrpVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    @Override // defpackage.ablz
    protected final acqx l() {
        asrp asrpVar = this.j;
        if (asrpVar != null) {
            return new acqx(asrpVar.m);
        }
        return null;
    }

    @Override // defpackage.ablz
    protected final /* synthetic */ apxf m(Object obj) {
        apxf apxfVar = ((asrp) obj).k;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    @Override // defpackage.ablz
    protected final /* synthetic */ avgg n(Object obj) {
        avgg avggVar = ((asrp) obj).h;
        return avggVar == null ? avgg.a : avggVar;
    }

    @Override // defpackage.ablz
    protected final /* synthetic */ void o(Object obj) {
        this.j = (asrp) obj;
    }
}
