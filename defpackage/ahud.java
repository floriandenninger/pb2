package defpackage;

import com.google.protos.youtube.api.innertube.UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahud implements aaha {
    private final ahub a;

    public ahud(ahub ahubVar) {
        this.a = ahubVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        ammv ammvVar;
        UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand = (UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand) apxfVar.pX(UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.updateTimedMarkersSyncObserverCommand);
        int i = updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.b;
        if ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0) {
            return;
        }
        if (updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.c) {
            if ((i & 8) != 0) {
                apxf apxfVar2 = updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.f;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                ammvVar = ammv.j(apxfVar2);
            } else {
                ammvVar = amlr.a;
            }
            this.a.i(updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.d, updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.e, ammvVar);
            return;
        }
        this.a.g(updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.d, updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.e);
    }
}
