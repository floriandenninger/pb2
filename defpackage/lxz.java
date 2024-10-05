package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lxz extends ajsu {
    private final ajpd a;

    public lxz(ajvb ajvbVar, Object obj) {
        ajvbVar.a(obj.getClass());
        ajpd ajpdVar = new ajpd();
        this.a = ajpdVar;
        ajpdVar.add(obj);
    }

    @Override // defpackage.ajvc
    public final ajng lC() {
        return this.a;
    }
}
