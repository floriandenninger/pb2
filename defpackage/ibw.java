package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ibw implements icp {
    public final ica a;
    public final icq b;
    public final Executor c;
    public final ykl d = new jvq(1);
    public final iax e;
    public final acqz f;
    public final axze g;

    public ibw(ica icaVar, icq icqVar, Executor executor, axze axzeVar, iax iaxVar, acqz acqzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = icaVar;
        this.b = icqVar;
        this.c = executor;
        this.g = axzeVar;
        this.e = iaxVar;
        this.f = acqzVar;
    }

    public static final axdj c(axdk axdkVar, Uri uri) {
        axdw axdwVar;
        axdw axdwVar2;
        axdi i = axdkVar.i();
        if (i.c == 2) {
            axdwVar = (axdw) i.d;
        } else {
            axdwVar = axdw.a;
        }
        axdv axdvVar = axdwVar.d;
        if (axdvVar == null) {
            axdvVar = axdv.a;
        }
        aone builder = axdvVar.toBuilder();
        String uri2 = uri.toString();
        builder.copyOnWrite();
        axdv axdvVar2 = (axdv) builder.instance;
        uri2.getClass();
        axdvVar2.b |= 1;
        axdvVar2.c = uri2;
        axdv axdvVar3 = (axdv) builder.build();
        String str = (String) etx.F(uri).c();
        axdj axdjVar = (axdj) axdkVar.toBuilder();
        aone builder2 = axdkVar.i().toBuilder();
        axdi i2 = axdkVar.i();
        if (i2.c == 2) {
            axdwVar2 = (axdw) i2.d;
        } else {
            axdwVar2 = axdw.a;
        }
        aone builder3 = axdwVar2.toBuilder();
        builder3.copyOnWrite();
        axdw axdwVar3 = (axdw) builder3.instance;
        axdvVar3.getClass();
        axdwVar3.d = axdvVar3;
        axdwVar3.b |= 4;
        aone createBuilder = axbp.a.createBuilder();
        createBuilder.copyOnWrite();
        axbp axbpVar = (axbp) createBuilder.instance;
        axbpVar.b = 1;
        axbpVar.c = str;
        axbp axbpVar2 = (axbp) createBuilder.build();
        builder3.copyOnWrite();
        axdw axdwVar4 = (axdw) builder3.instance;
        axbpVar2.getClass();
        axdwVar4.c = axbpVar2;
        axdwVar4.b |= 2;
        builder2.copyOnWrite();
        axdi axdiVar = (axdi) builder2.instance;
        axdw axdwVar5 = (axdw) builder3.build();
        axdwVar5.getClass();
        axdiVar.d = axdwVar5;
        axdiVar.c = 2;
        axdjVar.copyOnWrite();
        ((axdk) axdjVar.instance).F((axdi) builder2.build());
        return axdjVar;
    }

    private static final ammv d(axdk axdkVar) {
        axdw axdwVar;
        axdi i = axdkVar.i();
        if (i.c == 2) {
            axdwVar = (axdw) i.d;
        } else {
            axdwVar = axdw.a;
        }
        if ((axdwVar.b & 4) == 0) {
            return amlr.a;
        }
        axdv axdvVar = axdwVar.d;
        if (axdvVar == null) {
            axdvVar = axdv.a;
        }
        aony aonyVar = axdvVar.d;
        return ammv.j(Uri.parse((String) aonyVar.get((aonyVar.indexOf(axdvVar.c) + 1) % aonyVar.size())));
    }

    @Override // defpackage.icp
    public final void a(final axcg axcgVar) {
        final ammv d = d(axcgVar.c());
        if (!d.h()) {
            afsi.b(2, 24, "VideoFX: Static Sticker added without valid uri");
            this.b.aT(axcgVar.toBuilder());
        } else {
            this.f.mM().I(3, new acqx(acsb.c(65452)), null);
            this.c.execute(new Runnable() { // from class: ibr
                @Override // java.lang.Runnable
                public final void run() {
                    ibw ibwVar = ibw.this;
                    ibwVar.a.a((Uri) d.c(), new ibu(ibwVar, axcgVar));
                }
            });
        }
    }

    @Override // defpackage.icp
    public final void my(final axdk axdkVar) {
        final ammv d = d(axdkVar);
        if (!d.h()) {
            afsi.b(2, 24, "VideoFX: Static Sticker added without valid uri");
            this.b.aI((axdj) axdkVar.toBuilder());
        } else {
            this.f.mM().I(3, new acqx(acsb.c(65452)), null);
            this.c.execute(new Runnable() { // from class: ibs
                @Override // java.lang.Runnable
                public final void run() {
                    ibw ibwVar = ibw.this;
                    ibwVar.a.a((Uri) d.c(), new ibv(ibwVar, axdkVar));
                }
            });
        }
    }
}
