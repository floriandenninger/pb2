package defpackage;

import com.google.protos.youtube.api.innertube.ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahtq implements aaha {
    private final ahtr a;

    public ahtq(ahtr ahtrVar) {
        this.a = ahtrVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand = (ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand) apxfVar.pX(ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand.changeMarkersVisibilityCommand);
        if ((changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand.b & 1) == 0 || changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand.d.size() == 0) {
            return;
        }
        Iterator it = changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand.d.iterator();
        while (it.hasNext()) {
            this.a.a(changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand.c, (String) it.next());
        }
    }
}
