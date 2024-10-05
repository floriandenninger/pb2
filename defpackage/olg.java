package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class olg implements ypd {
    final azrj a = azrj.W();
    public final ayph b;
    public final ypa c;

    public olg(final ypa ypaVar, adpl adplVar, oll ollVar, byte[] bArr) {
        this.c = ypaVar;
        azez azezVar = new azez(adplVar.a().ak(1L), new ayrv() { // from class: olf
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                olg olgVar = olg.this;
                if (((emk) obj).a()) {
                    return olgVar.a.x();
                }
                return ayph.f();
            }
        });
        ayrv ayrvVar = aynu.p;
        this.b = azezVar.F(300L, TimeUnit.SECONDS).g(ollVar.a(auxs.STARTUP_SIGNAL_BROWSE_FEED_LOADED)).C().n(new ayrm() { // from class: ole
            @Override // defpackage.ayrm
            public final void a() {
                ypaVar.m(olg.this);
            }
        });
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{fdk.class, fdl.class};
        }
        if (i == 0) {
            this.a.sh();
            return null;
        }
        if (i == 1) {
            this.a.sh();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
