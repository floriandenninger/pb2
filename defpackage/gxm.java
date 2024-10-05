package defpackage;

import com.google.protos.youtube.api.innertube.DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gxm implements aaha {
    private final aahd a;
    private final gxj b;

    public gxm(aahd aahdVar, gxj gxjVar) {
        aahdVar.getClass();
        this.a = aahdVar;
        this.b = gxjVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        apxfVar.getClass();
        if (!apxfVar.pY(DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand.deleteClipEngagementPanelCommand)) {
            throw new aahm();
        }
        this.b.l();
        DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand deleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand = (DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand) apxfVar.pX(DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand.deleteClipEngagementPanelCommand);
        if ((deleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand.b & 1) != 0) {
            aahd aahdVar = this.a;
            apxf apxfVar2 = deleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand.c;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahdVar.a(apxfVar2);
        }
    }
}
