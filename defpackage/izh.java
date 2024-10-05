package defpackage;

import com.google.protos.youtube.api.innertube.ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class izh implements aaha {
    private final ajmu a;
    private final ypa b;

    public izh(ajmu ajmuVar, ypa ypaVar) {
        ajmuVar.getClass();
        this.a = ajmuVar;
        ypaVar.getClass();
        this.b = ypaVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        Object s = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        aulz aulzVar = ((ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction) apxfVar.pX(ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction)).c;
        if (aulzVar == null) {
            aulzVar = aulz.a;
        }
        if (s != null) {
            this.b.d(izi.a(s, aulzVar));
        }
        if ((aulzVar.b & 16) != 0) {
            apql apqlVar = aulzVar.g;
            if (apqlVar == null) {
                apqlVar = apql.a;
            }
            ipn ipnVar = new ipn(apqlVar);
            this.a.c(ipnVar.b, ipnVar);
        }
    }
}
