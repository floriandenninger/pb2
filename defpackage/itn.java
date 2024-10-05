package defpackage;

import com.google.protos.youtube.api.innertube.UpdateFlowCommandOuterClass$UpdateFlowCommand;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class itn implements aaha {
    private final itm a;
    private final aahd b;

    public itn(itm itmVar, aahd aahdVar) {
        this.a = itmVar;
        this.b = aahdVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        UpdateFlowCommandOuterClass$UpdateFlowCommand updateFlowCommandOuterClass$UpdateFlowCommand = (UpdateFlowCommandOuterClass$UpdateFlowCommand) apxfVar.pX(UpdateFlowCommandOuterClass$UpdateFlowCommand.updateFlowCommand);
        itm itmVar = this.a;
        itl itlVar = (itl) itmVar.a.get(updateFlowCommandOuterClass$UpdateFlowCommand.c);
        if (itlVar == null) {
            return;
        }
        if (updateFlowCommandOuterClass$UpdateFlowCommand.d.size() > 0) {
            itl.b(itlVar.j, updateFlowCommandOuterClass$UpdateFlowCommand.d);
            itlVar.k.c(new Object());
        }
        if ((updateFlowCommandOuterClass$UpdateFlowCommand.b & 4) != 0) {
            apxf apxfVar2 = updateFlowCommandOuterClass$UpdateFlowCommand.f;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            itlVar.o = Optional.of(apxfVar2);
        }
        if ((updateFlowCommandOuterClass$UpdateFlowCommand.b & 2) != 0) {
            aahd aahdVar = this.b;
            apxf apxfVar3 = updateFlowCommandOuterClass$UpdateFlowCommand.e;
            if (apxfVar3 == null) {
                apxfVar3 = apxf.a;
            }
            aahdVar.a(apxfVar3);
        }
    }
}
