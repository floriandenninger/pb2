package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lxy extends ajsu {
    private final ajpd a;

    public lxy(ajvb ajvbVar, ajfh ajfhVar, aqrf aqrfVar) {
        ajvbVar.a(aqrf.class);
        amru r = amru.r(aqrfVar);
        ajwt ajwtVar = new ajwt();
        ajwtVar.b(ajfhVar);
        ajpd ajpdVar = new ajpd();
        this.a = ajpdVar;
        ajpdVar.add(ajwtVar.a(r).get(0));
    }

    @Override // defpackage.ajvc
    public final ajng lC() {
        return this.a;
    }
}
