package defpackage;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hbd implements ypd {
    static final String a = aalt.f(auku.b.a(), "SHORTS_SEEDLESS_ENDPOINT");
    public static final /* synthetic */ int c = 0;
    public final axpg b;
    private final aahv d;
    private final afsy e;
    private final Executor f;
    private final azrw g;
    private final azrw h;

    public hbd(aahv aahvVar, afsy afsyVar, axpg axpgVar, Executor executor, azrw azrwVar, azrw azrwVar2) {
        this.d = aahvVar;
        this.e = afsyVar;
        this.b = axpgVar;
        this.f = executor;
        this.g = azrwVar;
        this.h = azrwVar2;
    }

    public final void a() {
        aujl aujlVar = ((aadw) this.h.get()).b().E;
        if (aujlVar == null) {
            aujlVar = aujl.a;
        }
        if (aujlVar.e) {
            ((ypa) this.g.get()).g(this);
            b();
        }
    }

    public final void b() {
        this.d.a(this.e.c()).h(a, true).ab(azre.b(this.f)).ay(new ayrs() { // from class: hbc
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                aukt auktVar;
                hbd hbdVar = hbd.this;
                aakz aakzVar = (aakz) obj;
                if (aakzVar != null) {
                    aakt aaktVar = aakzVar.c;
                    if (!(aaktVar instanceof aukt) || (auktVar = (aukt) aaktVar) == null || hbdVar.b.get() == null) {
                        return;
                    }
                    if (auktVar.f()) {
                        fhe.N(auktVar.getUpdatedEndpointProto(), (ajjz) hbdVar.b.get());
                        return;
                    }
                    if (auktVar.b()) {
                        try {
                            apxf apxfVar = (apxf) aonm.parseFrom(apxf.a, auktVar.getUpdatedEndpoint(), aomw.b());
                            if (apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                                fhe.N(apxfVar, (ajjz) hbdVar.b.get());
                            }
                        } catch (aoob e) {
                            zga.d("Error parsing bytes for updated ReelWatchEndpoint.", e);
                        }
                    }
                }
            }
        }, ggk.p);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class};
        }
        if (i == 0) {
            b();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
