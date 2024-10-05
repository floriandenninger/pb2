package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ktr implements aaha {
    private final aivb a;
    private final gjp b;

    public ktr(gjp gjpVar, aivb aivbVar) {
        this.b = gjpVar;
        this.a = aivbVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        gjp gjpVar = this.b;
        boolean d = this.a.d();
        boolean t = etx.t(this.b.a());
        int i = 0;
        if (t) {
            if (!d) {
                i = 5;
                gjpVar.d(i);
            }
            d = true;
        }
        if (!t && d) {
            i = 3;
        }
        gjpVar.d(i);
    }
}
