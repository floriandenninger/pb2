package defpackage;

import com.google.protos.youtube.api.innertube.InAppUpdateCommandOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fga implements aaha {
    private final azrw a;
    private final aadw b;

    public fga(azrw azrwVar, aadw aadwVar) {
        this.a = azrwVar;
        this.b = aadwVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        avdj avdjVar = this.b.b().u;
        if (avdjVar == null) {
            avdjVar = avdj.a;
        }
        if (avdjVar.k) {
            ((fgb) this.a.get()).j((argm) apxfVar.pX(InAppUpdateCommandOuterClass.inAppUpdateCommand));
        }
    }
}
