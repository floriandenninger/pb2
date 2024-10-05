package defpackage;

import com.google.protos.youtube.api.innertube.AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aawp implements aaha {
    private final Executor a;
    private final aaxn b;

    public aawp(Executor executor, aaxn aaxnVar, byte[] bArr, byte[] bArr2) {
        this.a = executor;
        this.b = aaxnVar;
    }

    public static /* synthetic */ void b(Throwable th) {
        zga.d("aawp", th);
        afsi.c(2, 5, "Error acknowledging channel TOU strike", th);
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (!apxfVar.pY(AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.acknowledgeChannelTouStrikeCommand)) {
            throw new aahm("Could not find AcknowledgeChannelTouStrikeCommand");
        }
        AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand acknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand = (AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand) apxfVar.pX(AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.acknowledgeChannelTouStrikeCommand);
        aaxn aaxnVar = this.b;
        aawq aawqVar = new aawq(aaxnVar.f, aaxnVar.a.c(), null, null, null);
        apst apstVar = acknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.b;
        if (apstVar == null) {
            apstVar = apst.a;
        }
        apstVar.getClass();
        aawqVar.a = apstVar;
        aawqVar.m(apxfVar.c.I());
        aaxn aaxnVar2 = this.b;
        ynm.j(aaxnVar2.b.b(aawqVar, this.a), angq.a, lra.u);
    }
}
