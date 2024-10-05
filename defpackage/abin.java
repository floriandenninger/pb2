package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abin implements afwx {
    final /* synthetic */ Map a;
    final /* synthetic */ abio b;

    public abin(abio abioVar, Map map) {
        this.b = abioVar;
        this.a = map;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.b.b.e(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        abgd abgdVar;
        aruc arucVar = (aruc) obj;
        if (arucVar.c.size() > 0) {
            Object obj2 = this.a.get("com.google.android.libraries.youtube.innertube.endpoint.tag");
            if (obj2 instanceof abij) {
                abgdVar = ((abij) obj2).d();
            } else {
                abgdVar = obj2 instanceof abgd ? (abgd) obj2 : null;
            }
            if (abgdVar == null) {
                String valueOf = String.valueOf(Arrays.toString(Thread.currentThread().getStackTrace()));
                afsi.b(2, 31, valueOf.length() != 0 ? "Moderate live chat command called with no context. \n".concat(valueOf) : new String("Moderate live chat command called with no context. \n"));
            } else {
                this.b.a.a(arucVar.c, abgdVar, true);
            }
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
