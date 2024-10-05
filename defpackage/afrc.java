package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afrc extends afra {
    private final afra a;
    private final afxh b;

    public afrc(shf shfVar, afra afraVar) {
        this.a = afraVar;
        this.b = new afxh(shfVar);
    }

    @Override // defpackage.afra
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final afpz b(ysq ysqVar) {
        h(ysqVar);
        return new afpz((byte[]) this.a.f(ysqVar.d), this.b.a(ysqVar.c.a("cache-control")));
    }
}
