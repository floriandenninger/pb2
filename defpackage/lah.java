package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lah implements abca {
    private final azrw a;
    private final azrw b;
    private final aaea c;

    public lah(azrw azrwVar, azrw azrwVar2, aaea aaeaVar) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = aaeaVar;
    }

    @Override // defpackage.abca
    public final void b(abbz abbzVar) {
        aswb aswbVar = this.c.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        if (aswbVar.N) {
            gfy gfyVar = (gfy) this.b.get();
            if (gfyVar != null) {
                abbzVar.t = gfyVar.f();
                return;
            }
            return;
        }
        lai laiVar = (lai) this.a.get();
        if (laiVar != null) {
            int a = laiVar.a();
            ysy ysyVar = (ysy) laiVar.a.get();
            boolean z = false;
            if (a != 2 ? !(a != 1 || !ysyVar.r()) : ysyVar.o()) {
                z = true;
            }
            abbzVar.t = z;
        }
    }
}
