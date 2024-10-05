package defpackage;

import com.google.protos.youtube.api.innertube.ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahtb implements aaha {
    private final ahtp a;

    public ahtb(ahtp ahtpVar) {
        this.a = ahtpVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand = (ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand) apxfVar.pX(ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.changeKeyedMarkersVisibilityCommand);
        int i = changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.b;
        if ((i & 1) == 0 || (i & 2) == 0) {
            return;
        }
        this.a.g(changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.d, changeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.c);
    }
}
