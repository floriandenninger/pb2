package defpackage;

import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajem extends vw {
    private final sqq d;
    private final List e;
    private final acra f;
    private final Object g;

    public ajem(sqq sqqVar, List list, acra acraVar, Object obj) {
        this.d = sqqVar;
        this.e = new ArrayList(list);
        this.f = acraVar;
        this.g = obj;
        mw();
    }

    @Override // defpackage.vw
    public final int b() {
        return this.e.size();
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        return new ajel(new dkp(viewGroup.getContext()));
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void o(wv wvVar, int i) {
        ajel ajelVar = (ajel) wvVar;
        int i2 = ajel.v;
        dkp dkpVar = ajelVar.t;
        dhe dheVar = dkpVar.t;
        sqq sqqVar = this.d;
        sxb a = sxc.a();
        a.a = ajelVar.t;
        a.f(false);
        a.l = amru.r(ahbl.i(this.g));
        sxc a2 = a.a();
        byte[] byteArray = ((awos) this.e.get(i)).toByteArray();
        acra acraVar = this.f;
        dho c = ComponentTree.c(dheVar, sqqVar.a(dheVar, a2, byteArray, acraVar != null ? ajgg.w(acraVar) : null, ajelVar.u));
        c.d = false;
        dkpVar.G(c.a());
        yny.B(ajelVar.t, -1, -2);
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void p(wv wvVar) {
        ajel ajelVar = (ajel) wvVar;
        int i = ajel.v;
        ajelVar.u.c();
        ajelVar.t.E();
        ajelVar.t.K();
        ajelVar.t.G(null);
    }
}
