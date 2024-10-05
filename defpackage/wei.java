package defpackage;

import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class wei implements aaha {
    private final azrw a;

    public wei(azrw azrwVar) {
        this.a = azrwVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        wev wevVar = (wev) this.a.get();
        InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = (InlineAuthCommandOuterClass$InlineAuthCommand) apxfVar.pX(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand);
        wej wejVar = (wej) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", wej.class);
        if (wejVar != null) {
            wevVar.a(wejVar);
        }
        wevVar.k(inlineAuthCommandOuterClass$InlineAuthCommand);
    }
}
