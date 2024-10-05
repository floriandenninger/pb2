package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lpc {
    public final aaea a;
    private final acpl b;
    private final ywr c;
    private final ayqi d;

    public lpc(acpl acplVar, aaea aaeaVar, aadw aadwVar, final eow eowVar, ywr ywrVar, ayqi ayqiVar) {
        this.b = acplVar;
        this.a = aaeaVar;
        this.c = ywrVar;
        this.d = ayqiVar;
        aypy aF = aaeaVar.a.Y(khe.t).Y(luw.b).aj(new ayrv() { // from class: lpa
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                eow eowVar2 = eow.this;
                if (((Boolean) obj).booleanValue()) {
                    return eowVar2.g();
                }
                return aypy.I();
            }
        }).Y(new ayrv() { // from class: lpb
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                lpc lpcVar = lpc.this;
                eok eokVar = (eok) obj;
                boolean z = eokVar.c;
                boolean z2 = eokVar.f;
                aone createBuilder = apfp.a.createBuilder();
                if (evr.K(lpcVar.a)) {
                    createBuilder.copyOnWrite();
                    apfp apfpVar = (apfp) createBuilder.instance;
                    apfpVar.b |= 131072;
                    apfpVar.c = z;
                    createBuilder.copyOnWrite();
                    apfp apfpVar2 = (apfp) createBuilder.instance;
                    apfpVar2.b |= 262144;
                    apfpVar2.d = z2;
                }
                return (apfp) createBuilder.build();
            }
        }).Y(khe.s).ah(amlr.a).B().aF();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aysw.b(timeUnit, "unit is null");
        azla azlaVar = new azla(aF, timeUnit);
        ayrv ayrvVar = aynu.l;
        final int i = 1;
        azlaVar.ax(new ayrs(this) { // from class: loz
            public final /* synthetic */ lpc a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    azrf azrfVar = (azrf) obj;
                    this.a.a((ammv) ((List) azrfVar.a).get(0), (ammv) ((List) azrfVar.a).get(1), azrfVar.b);
                } else {
                    azrf azrfVar2 = (azrf) obj;
                    this.a.a((ammv) ((List) azrfVar2.a).get(0), (ammv) ((List) azrfVar2.a).get(1), azrfVar2.b);
                }
            }
        });
        if (evr.aD(aadwVar)) {
            aypn ad = ywrVar.d().A(new khe(18)).n().A(khe.s).K(amlr.a).ad(2);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            aysw.b(timeUnit2, "unit is null");
            azbl azblVar = new azbl(ad, timeUnit2);
            ayrv ayrvVar2 = aynu.j;
            final int i2 = 0;
            azblVar.X(new ayrs(this) { // from class: loz
                public final /* synthetic */ lpc a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i2 == 0) {
                        azrf azrfVar = (azrf) obj;
                        this.a.a((ammv) ((List) azrfVar.a).get(0), (ammv) ((List) azrfVar.a).get(1), azrfVar.b);
                    } else {
                        azrf azrfVar2 = (azrf) obj;
                        this.a.a((ammv) ((List) azrfVar2.a).get(0), (ammv) ((List) azrfVar2.a).get(1), azrfVar2.b);
                    }
                }
            });
        }
    }

    public final void a(ammv ammvVar, ammv ammvVar2, long j) {
        if (ammvVar2.h()) {
            acpl acplVar = this.b;
            apfp apfpVar = (apfp) ammvVar2.c();
            int i = (int) j;
            aone createBuilder = apfq.a.createBuilder();
            createBuilder.copyOnWrite();
            apfq apfqVar = (apfq) createBuilder.instance;
            apfqVar.d = apfpVar;
            apfqVar.b |= 2;
            if (ammvVar.h()) {
                createBuilder.copyOnWrite();
                apfq apfqVar2 = (apfq) createBuilder.instance;
                apfqVar2.b |= 1;
                apfqVar2.c = i;
                apfp apfpVar2 = (apfp) ammvVar.c();
                createBuilder.copyOnWrite();
                apfq apfqVar3 = (apfq) createBuilder.instance;
                apfqVar3.e = apfpVar2;
                apfqVar3.b |= 4;
            }
            arpn a = arpp.a();
            a.copyOnWrite();
            ((arpp) a.instance).cc((apfq) createBuilder.build());
            acplVar.c((arpp) a.build());
        }
    }
}
