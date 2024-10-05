package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afrg implements afri {
    private final afri a;
    private final afxh b;

    public afrg(shf shfVar, afri afriVar) {
        this.a = afriVar;
        this.b = new afxh(shfVar);
    }

    @Override // defpackage.afri
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        cnh cnhVar = (cnh) obj;
        return new afpz((byte[]) this.a.b(cnhVar), this.b.a((String) ach.k(cnhVar).g.get("cache-control")));
    }
}
