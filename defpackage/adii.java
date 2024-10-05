package defpackage;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adii implements aioa {
    final /* synthetic */ adij a;
    private final /* synthetic */ int b;

    public adii(adij adijVar, int i) {
        this.b = i;
        this.a = adijVar;
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 0;
        if (this.b == 0) {
            return new ayqx[]{aiocVar.ao().X(new ayrs(this) { // from class: adih
                public final /* synthetic */ adii a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i2 == 0) {
                        adii adiiVar = this.a;
                        ahdv ahdvVar = (ahdv) obj;
                        if (ahdvVar.a() != null) {
                            adiiVar.a.g = ahdvVar.a().b;
                        } else {
                            adiiVar.a.g = null;
                        }
                        if (ahdvVar.d() == null || !ahdvVar.d().pY(WatchEndpointOuterClass.watchEndpoint)) {
                            adiiVar.a.c = null;
                        } else {
                            adiiVar.a.c = (awdp) ahdvVar.d().pX(WatchEndpointOuterClass.watchEndpoint);
                        }
                        adiiVar.a.b = null;
                        return;
                    }
                    adij adijVar = this.a.a;
                    adijVar.g = null;
                    adijVar.b = null;
                }
            }), aiocVar.al().X(new ayrs(this) { // from class: adih
                public final /* synthetic */ adii a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i == 0) {
                        adii adiiVar = this.a;
                        ahdv ahdvVar = (ahdv) obj;
                        if (ahdvVar.a() != null) {
                            adiiVar.a.g = ahdvVar.a().b;
                        } else {
                            adiiVar.a.g = null;
                        }
                        if (ahdvVar.d() == null || !ahdvVar.d().pY(WatchEndpointOuterClass.watchEndpoint)) {
                            adiiVar.a.c = null;
                        } else {
                            adiiVar.a.c = (awdp) ahdvVar.d().pX(WatchEndpointOuterClass.watchEndpoint);
                        }
                        adiiVar.a.b = null;
                        return;
                    }
                    adij adijVar = this.a.a;
                    adijVar.g = null;
                    adijVar.b = null;
                }
            })};
        }
        final byte[] bArr = null;
        return new ayqx[]{aiocVar.G().d.X(new ayrs(bArr) { // from class: adig
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                adii adiiVar = adii.this;
                int i3 = adij.i;
                adiiVar.a.b = (aheg) obj;
            }
        })};
    }
}
