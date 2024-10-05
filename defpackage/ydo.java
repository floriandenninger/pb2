package defpackage;

import com.google.protos.youtube.api.innertube.PlayBillingCommandOuterClass$PlayBillingCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ydo implements aaha {
    private final ydq a;

    public ydo(ydq ydqVar) {
        this.a = ydqVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(PlayBillingCommandOuterClass$PlayBillingCommand.playBillingCommand)) {
            this.a.g((PlayBillingCommandOuterClass$PlayBillingCommand) apxfVar.pX(PlayBillingCommandOuterClass$PlayBillingCommand.playBillingCommand));
        }
    }
}
