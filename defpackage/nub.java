package defpackage;

import com.google.protos.youtube.api.innertube.ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint;
import j$.util.Objects;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nub implements gpf {
    public apxf a;
    public boolean b = false;

    public nub(aioc aiocVar) {
        aiocVar.ao().G().E(ayqr.a()).Y(new ayrs() { // from class: ntz
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                nub nubVar = nub.this;
                if (((ahdv) obj).c() == aigk.NEW) {
                    nubVar.a = null;
                    nubVar.b = false;
                }
            }
        }, nua.a);
    }

    public final void a() {
        this.b = true;
    }

    @Override // defpackage.gpf
    public final boolean g(apxf apxfVar, Map map) {
        if (!apxfVar.pY(ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.showEngagementPanelNavigationEndpoint)) {
            return false;
        }
        if (Objects.equals(this.a, apxfVar) || !this.b) {
            return true;
        }
        this.a = apxfVar;
        return false;
    }
}
