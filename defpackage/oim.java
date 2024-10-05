package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class oim implements ayrs {
    public final /* synthetic */ oip a;
    private final /* synthetic */ int b;

    public /* synthetic */ oim(oip oipVar, int i) {
        this.b = i;
        this.a = oipVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.b == 0) {
            oip oipVar = this.a;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            oio oioVar = (oio) oipVar.b.get(8);
            if (oioVar.a && oioVar.b.c == 2) {
                if (booleanValue) {
                    oipVar.i(oipVar.h, true, null);
                    return;
                } else {
                    oipVar.i(oipVar.h, false, null);
                    return;
                }
            }
            return;
        }
        oip oipVar2 = this.a;
        boolean z = ((nuu) obj) == nuu.PORTRAIT_WATCH_PANEL;
        oio oioVar2 = (oio) oipVar2.b.get(8);
        oioVar2.a = z;
        ayqx ayqxVar = oipVar2.g;
        if (ayqxVar != null && !ayqxVar.e()) {
            azqb.f((AtomicReference) oipVar2.g);
        }
        if (z) {
            if (oioVar2.b.e()) {
                oipVar2.h(8);
            } else {
                oipVar2.e(8);
            }
            oipVar2.j(oipVar2.e);
            return;
        }
        zch zchVar = oipVar2.f;
        if (zchVar != null) {
            oioVar2.b.j(zchVar);
        }
    }
}
