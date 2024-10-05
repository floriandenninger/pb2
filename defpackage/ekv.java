package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ekv implements wsx {
    private final wsw a;
    private final xgh b;
    public eku c;
    public ekt d;
    private final xev e;
    private final aqrf f;
    private final ekk g;

    public ekv(ekk ekkVar, wsw wswVar, xgh xghVar, xev xevVar, aqrf aqrfVar, eku ekuVar, ekt ektVar) {
        this.g = ekkVar;
        this.a = wswVar;
        this.b = xghVar;
        this.e = xevVar;
        this.f = aqrfVar;
        this.c = ekuVar;
        this.d = ektVar;
    }

    @Override // defpackage.wsx
    public final xev a() {
        throw null;
    }

    @Override // defpackage.wsx
    public void b() {
    }

    @Override // defpackage.wsx
    public void qt() {
    }

    @Override // defpackage.wsx
    public void qu() {
        ViewGroup a = this.c.a();
        if (a == null) {
            this.a.d(this.b, this.e, new wxd("No view available when trying to start rendering"));
            return;
        }
        ajok a2 = this.d.a();
        if (a2 == null) {
            this.a.d(this.b, this.e, new wxd("No presentContext available when trying to start rendering"));
            return;
        }
        a.addView(this.g.a());
        a.setVisibility(0);
        this.g.a().setVisibility(0);
        ekk ekkVar = this.g;
        ammv ammvVar = this.e.i;
        aqrf aqrfVar = this.f;
        if (ammvVar.h()) {
            aone createBuilder = asht.a.createBuilder();
            ashd ashdVar = (ashd) ammvVar.c();
            createBuilder.copyOnWrite();
            asht ashtVar = (asht) createBuilder.instance;
            ashtVar.t = ashdVar;
            ashtVar.c |= 1024;
            a2.c = (asht) createBuilder.build();
        }
        a2.a(ekkVar.a);
        ajdw ajdwVar = ekkVar.b;
        ajdwVar.oB(a2, ajds.a(aqrfVar));
        this.a.a(this.b, this.e);
    }

    @Override // defpackage.wsx
    public void qv(int i) {
        ViewGroup a;
        try {
            this.g.b.b(null);
            this.g.a().setVisibility(8);
            a = this.c.a();
        } catch (wxd e) {
            whu.l(this.b, e.getMessage());
        }
        if (a == null) {
            throw new wxd("No view available when trying to reset container");
        }
        a.removeAllViews();
        a.setVisibility(8);
        this.a.e(this.b, this.e, i);
    }
}
