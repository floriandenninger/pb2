package defpackage;

import com.google.protos.youtube.api.innertube.ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ezj implements aaha {
    private final nqy a;
    private final azrw b;
    private final aadw c;

    public ezj(nqy nqyVar, aadw aadwVar, azrw azrwVar) {
        this.a = nqyVar;
        this.c = aadwVar;
        this.b = azrwVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aqtn aqtnVar;
        ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand = (ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand) apxfVar.pX(ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.toggleEngagementPanelCommand);
        nqy nqyVar = this.a;
        if (toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.b == 2) {
            aqtnVar = (aqtn) toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.c;
        } else {
            aqtnVar = aqtn.a;
        }
        aqtm b = aqtm.b(aqtnVar.c);
        if (b == null) {
            b = aqtm.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
        }
        nqp a = nqyVar.a(b);
        String k = oba.k(toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand);
        if (ammx.e(k)) {
            return;
        }
        if (!a.v(k)) {
            oba.n(toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.d, (nnc) this.b.get());
            boolean z = false;
            if (evr.aG(this.c) && ((Boolean) yjj.t(map, "triggered_on_ui_ready", false)).booleanValue()) {
                z = true;
            }
            a.f(apxfVar, null, z, true);
            return;
        }
        a.o();
    }
}
