package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fac implements yta {
    private final acpl b;
    private final ysy c;

    public fac(acpl acplVar, ysy ysyVar) {
        this.b = acplVar;
        this.c = ysyVar;
    }

    @Override // defpackage.yta
    public final void a(cnq cnqVar) {
        if ((cnqVar instanceof cng) && this.c.o()) {
            auir a = auis.a();
            auit auitVar = auit.REACHABILITY_DETECTION_EVENT_TYPE_FAILED_REQUEST;
            a.copyOnWrite();
            ((auis) a.instance).f(auitVar);
            aqjw f = this.c.f();
            a.copyOnWrite();
            ((auis) a.instance).g(f);
            auiu auiuVar = auiu.REACHABILITY_DETECTION_STRATEGY_TYPE_UNKNOWN;
            a.copyOnWrite();
            ((auis) a.instance).h(auiuVar);
            auis auisVar = (auis) a.build();
            arpn a2 = arpp.a();
            a2.copyOnWrite();
            ((arpp) a2.instance).dB(auisVar);
            this.b.c((arpp) a2.build());
        }
    }

    @Override // defpackage.yta
    public final void b() {
        if (this.c.o()) {
            return;
        }
        auir a = auis.a();
        auit auitVar = auit.REACHABILITY_DETECTION_EVENT_TYPE_SUCCESSFUL_REQUEST;
        a.copyOnWrite();
        ((auis) a.instance).f(auitVar);
        aqjw f = this.c.f();
        a.copyOnWrite();
        ((auis) a.instance).g(f);
        auiu auiuVar = auiu.REACHABILITY_DETECTION_STRATEGY_TYPE_UNKNOWN;
        a.copyOnWrite();
        ((auis) a.instance).h(auiuVar);
        auis auisVar = (auis) a.build();
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).dB(auisVar);
        this.b.c((arpp) a2.build());
    }
}
