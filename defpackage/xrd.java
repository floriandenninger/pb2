package defpackage;

import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReplaceBackstagePostActionOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xrd implements aaha {
    public static final /* synthetic */ int a = 0;
    private final xro b;

    public xrd(xro xroVar) {
        this.b = xroVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        final auly aulyVar = apxfVar.pY(ReplaceBackstagePostActionOuterClass.replaceBackstagePostAction) ? (auly) apxfVar.pX(ReplaceBackstagePostActionOuterClass.replaceBackstagePostAction) : null;
        if (aulyVar == null) {
            zga.b("ReplaceBackstagePostActionResolver received an action other than ReplaceBackstagePostAction.");
            return;
        }
        if ((aulyVar.b & 1) != 0) {
            aulq aulqVar = aulyVar.d;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(ElementRendererOuterClass.elementRenderer)) {
                aulq aulqVar2 = aulyVar.d;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                ajds a2 = ajds.a((aqrf) aulqVar2.pX(ElementRendererOuterClass.elementRenderer));
                this.b.a.b(new aacm(a2, new ammy() { // from class: xrc
                    @Override // defpackage.ammy
                    public final boolean a(Object obj) {
                        auly aulyVar2 = auly.this;
                        int i = xrd.a;
                        if (obj instanceof ajds) {
                            return ((auef) ((ajds) obj).b().pX(auef.b)).c.equals(aulyVar2.c);
                        }
                        return false;
                    }
                }));
            }
        }
    }
}
