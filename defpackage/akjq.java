package defpackage;

import com.google.protos.youtube.api.innertube.SharingProviderDataCommandOuterClass$SharingProviderDataCommand;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akjq implements aaha {
    public static final String a = zga.a("SharingProviderDataCommandResolver");
    public final aahd b;
    public bv c;
    private final Executor d;
    private final aavj e;
    private final dd f;
    private final acqz g;
    private final azrw h;

    public akjq(aahd aahdVar, Executor executor, aavj aavjVar, dd ddVar, acqz acqzVar, azrw azrwVar) {
        aahdVar.getClass();
        this.b = aahdVar;
        executor.getClass();
        this.d = executor;
        aavjVar.getClass();
        this.e = aavjVar;
        ddVar.getClass();
        this.f = ddVar;
        acqzVar.getClass();
        this.g = acqzVar;
        azrwVar.getClass();
        this.h = azrwVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        final SharingProviderDataCommandOuterClass$SharingProviderDataCommand sharingProviderDataCommandOuterClass$SharingProviderDataCommand = (SharingProviderDataCommandOuterClass$SharingProviderDataCommand) apxfVar.pX(SharingProviderDataCommandOuterClass$SharingProviderDataCommand.sharingProviderDataCommand);
        final boolean z = sharingProviderDataCommandOuterClass$SharingProviderDataCommand.d;
        akji akjiVar = (akji) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", akji.class);
        if (akjiVar != null) {
            akjiVar.i();
        }
        if (z) {
            akjw akjwVar = new akjw();
            this.c = akjwVar;
            akjwVar.qh(this.f, "fullscreen_spinner_fragment");
        }
        this.g.mM().I(3, new acqx(apxfVar.c), null);
        aavj aavjVar = this.e;
        String str = sharingProviderDataCommandOuterClass$SharingProviderDataCommand.c;
        angq angqVar = angq.a;
        aavr aavrVar = new aavr(aavjVar.f, aavjVar.a.c(), null, null, null);
        aavrVar.a = str;
        ynm.k(aavjVar.c(arsi.a, aavjVar.b, aatt.r, aavd.h).b(aavrVar, angqVar), this.d, new ynk() { // from class: akjo
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                apxf apxfVar2;
                akjq akjqVar = akjq.this;
                SharingProviderDataCommandOuterClass$SharingProviderDataCommand sharingProviderDataCommandOuterClass$SharingProviderDataCommand2 = sharingProviderDataCommandOuterClass$SharingProviderDataCommand;
                boolean z2 = z;
                if ((sharingProviderDataCommandOuterClass$SharingProviderDataCommand2.b & 8) != 0) {
                    apxfVar2 = sharingProviderDataCommandOuterClass$SharingProviderDataCommand2.f;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                } else {
                    apxfVar2 = null;
                }
                zga.f(akjq.a, "Could not get story sharing metadata.", th);
                bv bvVar = akjqVar.c;
                if (bvVar != null && z2) {
                    bvVar.dismiss();
                }
                if (apxfVar2 != null) {
                    akjqVar.b.a(apxfVar2);
                }
            }
        }, new ynl() { // from class: akjp
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                akjq akjqVar = akjq.this;
                boolean z2 = z;
                arsi arsiVar = (arsi) obj;
                if ((arsiVar.b & 2) != 0) {
                    aahd aahdVar = akjqVar.b;
                    apxf apxfVar2 = arsiVar.d;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    aahdVar.a(apxfVar2);
                }
                bv bvVar = akjqVar.c;
                if (bvVar == null || !z2) {
                    return;
                }
                bvVar.dismiss();
            }
        });
        if ((sharingProviderDataCommandOuterClass$SharingProviderDataCommand.b & 4) != 0) {
            aahd aahdVar = this.b;
            apxf apxfVar2 = sharingProviderDataCommandOuterClass$SharingProviderDataCommand.e;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahdVar.a(apxfVar2);
        }
    }
}
