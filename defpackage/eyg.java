package defpackage;

import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.RefreshPanelEndpointOuterClass$RefreshPanelEndpoint;
import com.google.protos.youtube.api.innertube.SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eyg implements aaha {
    private final nqy a;
    private final /* synthetic */ int b;

    public eyg(nqy nqyVar, int i) {
        this.b = i;
        this.a = nqyVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        nqp a;
        int i = this.b;
        if (i == 0) {
            String str = ((RefreshPanelEndpointOuterClass$RefreshPanelEndpoint) apxfVar.pX(RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.refreshPanelEndpoint)).b;
            if (ammx.e(str)) {
                str = (String) yjj.u(map, "engagement_panel_id_key", String.class);
            }
            if (ammx.e(str)) {
                return;
            }
            nqg b = ((nqp) this.a.b().aB()).b(str);
            if (b instanceof nqf) {
                ((nqf) b).G();
                return;
            }
            return;
        }
        String str2 = null;
        if (i != 1) {
            SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand = (SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand) apxfVar.pX(SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.setEngagementPanelActivelyEngagingCommand);
            if (((setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.c == 3 ? (aqtn) setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.d : aqtn.a).b & 2) != 0) {
                str2 = (setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.c == 3 ? (aqtn) setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.d : aqtn.a).d;
            } else if (setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.c == 1) {
                str2 = (String) setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.d;
            }
            if (str2 == null || (setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.b & 4) == 0) {
                return;
            }
            nqy nqyVar = this.a;
            aqtm b2 = aqtm.b((setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.c == 3 ? (aqtn) setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.d : aqtn.a).c);
            if (b2 == null) {
                b2 = aqtm.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
            }
            nqyVar.a(b2).u(str2, setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.e);
            return;
        }
        HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) apxfVar.pX(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint);
        if (apxfVar.pY(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint)) {
            if (((hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c == 4 ? (aqtn) hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d : aqtn.a).b & 2) != 0) {
                str2 = (hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c == 4 ? (aqtn) hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d : aqtn.a).d;
            } else if (hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c == 1) {
                str2 = (String) hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d;
            }
        }
        if (ammx.e(str2)) {
            str2 = (String) yjj.u(map, "engagement_panel_id_key", String.class);
        }
        if (ammx.e(str2)) {
            return;
        }
        if (hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.g) {
            a = (nqp) this.a.b().aB();
        } else {
            nqy nqyVar2 = this.a;
            aqtm b3 = aqtm.b((hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c == 4 ? (aqtn) hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d : aqtn.a).c);
            if (b3 == null) {
                b3 = aqtm.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
            }
            a = nqyVar2.a(b3);
        }
        if (a.y(hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint)) {
            return;
        }
        str2.getClass();
        a.m(new exk(str2, 0));
    }
}
