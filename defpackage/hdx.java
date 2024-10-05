package defpackage;

import com.google.protos.youtube.api.innertube.ShortsCreationEndpointOuterClass$ShortsCreationEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hdx implements Runnable {
    public final /* synthetic */ hel a;
    private final /* synthetic */ int b;

    public /* synthetic */ hdx(hel helVar, int i) {
        this.b = i;
        this.a = helVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            hel helVar = this.a;
            hmg hmgVar = helVar.aj;
            hmgVar.f = helVar;
            hmgVar.i();
            return;
        }
        if (i == 1) {
            hel helVar2 = this.a;
            helVar2.aj.b();
            helVar2.aj.f = null;
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.a.aL();
                return;
            }
            hel helVar3 = this.a;
            amru amruVar = hmc.a;
            if (helVar3 != null) {
                helVar3.aR(false);
                return;
            }
            return;
        }
        hel helVar4 = this.a;
        if (helVar4.aX() && helVar4.aV.pY(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)) {
            ShortsCreationEndpointOuterClass$ShortsCreationEndpoint shortsCreationEndpointOuterClass$ShortsCreationEndpoint = (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint) helVar4.aV.pX(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint);
            if ((shortsCreationEndpointOuterClass$ShortsCreationEndpoint.b & 8) != 0) {
                aahd aahdVar = helVar4.ao;
                apxf apxfVar = shortsCreationEndpointOuterClass$ShortsCreationEndpoint.f;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.a(apxfVar);
            }
        }
    }
}
