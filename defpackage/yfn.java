package defpackage;

import com.google.protos.youtube.api.innertube.UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yfn implements yav {
    final /* synthetic */ yfo a;
    private final apxf b;

    public yfn(yfo yfoVar, apxf apxfVar) {
        this.a = yfoVar;
        this.b = apxfVar;
    }

    @Override // defpackage.yav
    public final void d() {
        UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint = (UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint) this.b.pX(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.unlimitedCreateFamilyEndpoint);
        if ((unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.b & 32) != 0) {
            aahd aahdVar = this.a.c;
            apxf apxfVar = unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
        }
    }

    @Override // defpackage.yav
    public final void e() {
        UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint = (UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint) this.b.pX(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.unlimitedCreateFamilyEndpoint);
        int i = unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.b;
        asjh asjhVar = null;
        if ((i & 16) != 0) {
            aahd aahdVar = this.a.c;
            apxf apxfVar = unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.e;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
            return;
        }
        if ((i & 4) != 0) {
            avnk avnkVar = unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.d;
            if (avnkVar == null) {
                avnkVar = avnk.a;
            }
            if (avnkVar.b == 86135402) {
                asjhVar = (asjh) avnkVar.c;
            } else {
                asjhVar = asjh.a;
            }
        }
        if (asjhVar != null) {
            this.a.b.e(asjhVar);
        }
    }

    @Override // defpackage.yax
    public final boolean g() {
        return true;
    }
}
