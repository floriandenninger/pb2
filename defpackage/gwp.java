package defpackage;

import com.google.protos.youtube.api.innertube.LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gwp implements aaha {
    private final acpl a;

    public gwp(acpl acplVar) {
        this.a = acplVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aqzz aqzzVar;
        apxfVar.getClass();
        LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand = (LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand) apxfVar.pX(LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.logAccountLinkingEventCommand);
        if ((logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.b & 1) != 0) {
            aqzzVar = logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.c;
            if (aqzzVar == null) {
                aqzzVar = aqzz.a;
            }
        } else {
            aqzzVar = null;
        }
        if (aqzzVar == null) {
            zga.b("Could not get event to log");
            return;
        }
        acpl acplVar = this.a;
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).cC(aqzzVar);
        acplVar.c((arpp) a.build());
    }
}
