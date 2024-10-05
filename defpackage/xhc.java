package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xhc implements aatr {
    private final azrw a;

    public xhc(azrw azrwVar) {
        azrwVar.getClass();
        this.a = azrwVar;
    }

    @Override // defpackage.aatr
    public final void a(aats aatsVar) {
        wzn wznVar = (wzn) this.a.get();
        aatsVar.A = aats.i(wznVar.a.b());
        aatsVar.w = wznVar.a();
        aatsVar.y = wznVar.b.a();
        aigv aigvVar = wznVar.i;
        aifw aifwVar = wznVar.f;
        synchronized (aigvVar) {
            aatsVar.z = aigvVar.a();
            aifwVar.d();
            aatsVar.x = aifwVar.d().d().i;
        }
        zbw zbwVar = wznVar.e;
        if (zbwVar != null) {
            aatsVar.v = zbwVar.a();
        }
    }
}
