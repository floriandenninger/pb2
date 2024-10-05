package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, c = {xcw.class, xdq.class})
/* loaded from: classes4.dex */
public final class wsn implements wsx {
    private final wsw a;
    private final xgh b;
    private final xev c;
    private final List d;
    private final List e;
    private final wpl f;
    private final ejn g;

    public wsn(wsw wswVar, xgh xghVar, xev xevVar, ejn ejnVar, wpl wplVar) {
        this.a = wswVar;
        this.b = xghVar;
        this.c = xevVar;
        this.g = ejnVar;
        this.f = wplVar;
        this.d = (List) xevVar.e(xcw.class);
        this.e = (List) xevVar.e(xdq.class);
    }

    @Override // defpackage.wsx
    public final xev a() {
        throw null;
    }

    @Override // defpackage.wsx
    public final void b() {
    }

    @Override // defpackage.wsx
    public final void qt() {
    }

    @Override // defpackage.wsx
    public final void qu() {
        asht ashtVar;
        aqts aqtsVar;
        try {
            ejn ejnVar = this.g;
            List<aqto> list = this.d;
            ashd ashdVar = (ashd) this.c.i.f();
            if (ashdVar != null) {
                aone createBuilder = asht.a.createBuilder();
                createBuilder.copyOnWrite();
                asht ashtVar2 = (asht) createBuilder.instance;
                ashtVar2.t = ashdVar;
                ashtVar2.c |= 1024;
                ashtVar = (asht) createBuilder.build();
            } else {
                ashtVar = null;
            }
            for (aqto aqtoVar : list) {
                nqp a = ejnVar.a();
                if (aqtoVar.b == 138681066) {
                    aqtsVar = (aqts) aqtoVar.c;
                } else {
                    aqtsVar = aqts.b;
                }
                a.q(aqtsVar, ashtVar);
            }
            if (this.c.f(xeh.class) && this.c.f(xef.class)) {
                this.f.b((apxf) this.c.e(xeh.class), (Map) this.c.e(xef.class));
            }
            this.a.a(this.b, this.c);
        } catch (wnw e) {
            this.a.d(this.b, this.c, new wxd(e.getMessage()));
        }
    }

    @Override // defpackage.wsx
    public final void qv(int i) {
        try {
            ejn ejnVar = this.g;
            for (String str : this.e) {
                nqp a = ejnVar.a();
                str.getClass();
                a.m(new exk(str, 1));
            }
        } catch (wnw e) {
            whu.m(this.b, this.c, e.getMessage());
        }
        this.a.e(this.b, this.c, i);
    }
}
