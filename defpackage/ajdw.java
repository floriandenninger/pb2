package defpackage;

import android.content.Context;
import android.view.View;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentTree;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajdw implements ajom {
    public ajds a;
    private dkp b;
    private final Context c;
    private final ajhe d;
    private ayqw e;
    private boolean f;
    private final sqq g;

    public ajdw(Context context, sqq sqqVar, ajgq ajgqVar) {
        this.c = context;
        this.g = sqqVar;
        this.d = ajgqVar.a();
    }

    @Override // defpackage.ajom
    public final View a() {
        if (this.b == null) {
            this.b = new dkp(this.c);
        }
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        dkp dkpVar = this.b;
        if (dkpVar != null) {
            if (this.f) {
                dkpVar.E();
            }
            this.b.K();
            this.b.G(null);
            this.b.setTag(R.id.elements_navigation_args, null);
        }
        ayqw ayqwVar = this.e;
        if (ayqwVar != null) {
            ayqwVar.qc();
            this.e = null;
        }
    }

    @Override // defpackage.ajom
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, ajds ajdsVar) {
        e(ajokVar, ajdsVar, false);
    }

    public final void e(ajok ajokVar, ajds ajdsVar, boolean z) {
        acsd acsdVar;
        View a = a();
        ((ComponentHost) a).setTag(R.id.elements_navigation_args, ajokVar.e());
        Object c = ajokVar.c("PresenterPreparerContextDecoratorKey");
        if (c instanceof ajdu) {
            ((dkp) a).G(((ajdu) c).a());
            this.f = false;
            return;
        }
        dkp dkpVar = (dkp) a;
        dhe dheVar = dkpVar.t;
        final acra acraVar = ajokVar.a;
        final asht ashtVar = ajokVar.c;
        ajds ajdsVar2 = this.a;
        if (ajdsVar2 == null) {
            ajdsVar2 = ajdsVar;
        }
        sya a2 = syb.a(this.g.a);
        syo a3 = syp.a();
        a3.b(this.d.B);
        a2.f = a3.a();
        a2.b(z);
        if (this.d.l) {
            aqrf aqrfVar = ajdsVar instanceof ajds ? ajdsVar.a : null;
            acqy a4 = acraVar.a();
            if (a4 == null || !a4.a()) {
                acqx acqxVar = (aqrfVar == null || (aqrfVar.b & 8) == 0 || aqrfVar.e.d() <= 0) ? null : new acqx(aqrfVar.e);
                dheVar.a();
                acsdVar = new acsd(acraVar, null, acqxVar);
            } else {
                dheVar.a();
                acsdVar = new acsd(acraVar, aqrfVar, null);
            }
            a2.d = acsdVar;
        }
        sxb a5 = sxc.a();
        a5.p = a2.a();
        a5.a = a;
        a5.l = amru.r(ahbl.j(ajdsVar2, ashtVar));
        sxc a6 = a5.a();
        ayqw ayqwVar = this.e;
        if (ayqwVar != null) {
            ayqwVar.qc();
        }
        ayqw ayqwVar2 = new ayqw();
        this.e = ayqwVar2;
        dho c2 = ComponentTree.c(dheVar, this.g.b(dheVar, a6, ajdsVar, new sxk() { // from class: ajgf
            @Override // defpackage.sxk
            public final sxj a(sxs sxsVar) {
                return new ajgg(sxsVar, acra.this, ashtVar);
            }
        }, ayqwVar2));
        c2.d = z;
        dkpVar.G(c2.a());
        this.f = true;
    }
}
