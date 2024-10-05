package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iqm implements aaha {
    private final ipw a;

    public iqm(ipw ipwVar) {
        this.a = ipwVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(atuw.b)) {
            this.a.a();
            return;
        }
        if (apxfVar.pY(atuy.b)) {
            ipw ipwVar = this.a;
            ipwVar.a();
            afpb afpbVar = (afpb) ipwVar.c.f("edit_thumbnails_fragment");
            if (afpbVar != null) {
                afpbVar.ae = true;
                return;
            }
            return;
        }
        if (apxfVar.pY(atux.b)) {
            this.a.a();
        }
    }
}
