package defpackage;

import com.google.protos.youtube.api.innertube.LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acqa implements aaha {
    private static final amyi a = amyi.o();
    private final acpz b;

    public acqa(acpz acpzVar) {
        this.b = acpzVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand = (LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand) apxfVar.pX(LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.logFlowLoggingEventCommand);
        int i = logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.b;
        if ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0) {
            ((amyf) ((amyf) a.g()).i("com/google/android/libraries/youtube/logging/flow/LogFlowLoggingEventCommandResolver", "resolve", 34, "LogFlowLoggingEventCommandResolver.java")).q("Unable to log event, missing Flow Logging parameter");
            return;
        }
        int i2 = logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.c;
        int aU = aocz.aU(logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.d);
        if (aU == 0) {
            aU = 1;
        }
        acpx acpxVar = new acpx(i2, aU);
        if ((logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.b & 8) != 0) {
            aqwx aqwxVar = logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.f;
            if (aqwxVar == null) {
                aqwxVar = aqwx.a;
            }
            acpxVar.a = aqwxVar;
        }
        aqxl b = aqxl.b(logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.e);
        if (b == null) {
            b = aqxl.FLOW_TYPE_UNKNOWN;
        }
        aqxl aqxlVar = b;
        int i3 = logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.b;
        if ((i3 & 16) == 0) {
            this.b.b(acpxVar, aqxlVar);
            return;
        }
        String str = logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.g;
        if ((i3 & 32) == 0) {
            this.b.c(acpxVar, aqxlVar, str);
        } else {
            this.b.d(acpxVar, aqxlVar, str, logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.h);
        }
    }
}
