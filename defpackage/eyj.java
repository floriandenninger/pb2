package defpackage;

import com.google.protos.youtube.api.innertube.PlayerToastCommandOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eyj implements aaha {
    private final fne a;

    public eyj(fne fneVar) {
        this.a = fneVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        auam auamVar = (auam) apxfVar.pX(PlayerToastCommandOuterClass.playerToastCommand);
        fne fneVar = this.a;
        aqyg aqygVar = auamVar.b;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        fneVar.b(new fnd(ajcq.b(aqygVar), auamVar.c));
    }
}
