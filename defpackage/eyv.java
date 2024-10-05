package defpackage;

import com.google.protos.youtube.api.innertube.ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint;
import com.google.protos.youtube.api.innertube.ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint;
import j$.util.Objects;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eyv implements aaha {
    private final nqp a;

    public eyv(nqp nqpVar) {
        this.a = nqpVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aqtn aqtnVar;
        String str;
        ammv i;
        aqtn aqtnVar2;
        ammv i2;
        ammv j;
        if (this.a.x()) {
            nqp nqpVar = this.a;
            String str2 = null;
            if (apxfVar.pY(ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.resizeEngagementPanelToFullBleedEndpoint)) {
                ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint = (ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint) apxfVar.pX(ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.resizeEngagementPanelToFullBleedEndpoint);
                if (resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.b == 2) {
                    aqtnVar = (aqtn) resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.c;
                } else {
                    aqtnVar = aqtn.a;
                }
                if ((aqtnVar.b & 2) == 0) {
                    str = resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.b == 1 ? (String) resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.c : null;
                } else {
                    str = (resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.b == 2 ? (aqtn) resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.c : aqtn.a).d;
                }
                i = ammv.i(str);
            } else {
                i = amlr.a;
            }
            if (!i.h() || !Objects.equals(nqpVar.i(), i.c())) {
                if (apxfVar.pY(ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.resizeEngagementPanelToMaximizedEndpoint)) {
                    ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint = (ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint) apxfVar.pX(ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.resizeEngagementPanelToMaximizedEndpoint);
                    if (resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.b == 2) {
                        aqtnVar2 = (aqtn) resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.c;
                    } else {
                        aqtnVar2 = aqtn.a;
                    }
                    if ((aqtnVar2.b & 2) != 0) {
                        str2 = (resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.b == 2 ? (aqtn) resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.c : aqtn.a).d;
                    } else if (resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.b == 1) {
                        str2 = (String) resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.c;
                    }
                    i2 = ammv.i(str2);
                } else {
                    i2 = amlr.a;
                }
                j = (i2.h() && Objects.equals(nqpVar.i(), i2.c())) ? ammv.j(nxh.EXPANDED) : amlr.a;
            } else {
                j = ammv.j(nxh.FULL_BLEED);
            }
            if (j.h()) {
                this.a.h().e.a((nxh) j.c());
            }
        }
    }
}
