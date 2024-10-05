package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ifm implements aaha {
    private final azrw a;
    private final gje b;
    private final ifc c;
    private final ffe d;

    public ifm(azrw azrwVar, gje gjeVar, ffe ffeVar, ifc ifcVar, byte[] bArr) {
        this.a = azrwVar;
        this.b = gjeVar;
        this.d = ffeVar;
        this.c = ifcVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aujl aujlVar = ((aadw) this.a.get()).b().E;
        if (aujlVar == null) {
            aujlVar = aujl.a;
        }
        if (!aujlVar.c) {
            this.d.kE(apxfVar, map);
            return;
        }
        gir f = this.b.f();
        if (f == null || f.mN().f("reel_watch_fragment_watch_while") == null) {
            this.d.kE(apxfVar, map);
        } else {
            this.c.kE(apxfVar, map);
        }
    }
}
