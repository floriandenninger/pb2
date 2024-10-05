package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahmg implements ahmd, aioa, ypd {
    public final ahhc a;
    private final Set b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private final kkf g;

    public ahmg(kkf kkfVar, ahhc ahhcVar) {
        kkfVar.getClass();
        this.g = kkfVar;
        ahhcVar.getClass();
        this.a = ahhcVar;
        this.b = Collections.newSetFromMap(new WeakHashMap());
        kkfVar.a.a = this;
    }

    private final void d() {
        boolean z = false;
        if (this.c && this.d && !this.e) {
            z = true;
        }
        if (z) {
            this.g.a.b = this.f;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((ahmf) it.next()).nZ(z);
        }
    }

    public final void a(ahmf ahmfVar) {
        this.b.add(ahmfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ahcx ahcxVar) {
        this.c = ahcxVar.f();
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r4.m != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ahef r4) {
        /*
            r3 = this;
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r4.b()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1e
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r4.b()
            com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r0 = r0.c
            if (r0 == 0) goto L1e
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r4.b()
            com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r0 = r0.c
            boolean r0 = r0.H()
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r3.d = r0
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r4.b()
            if (r0 == 0) goto L45
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r4.b()
            com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r0 = r0.c()
            boolean r0 = r0.an()
            if (r0 != 0) goto L45
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r4.b()
            com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r0 = r0.c()
            boolean r0 = r0.aE()
            if (r0 == 0) goto L45
            r0 = 1
            goto L46
        L45:
            r0 = 0
        L46:
            r3.e = r0
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r4.b()
            if (r0 == 0) goto L68
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r4 = r4.b()
            com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r4 = r4.c()
            atyi r4 = r4.c
            int r0 = r4.c
            r0 = r0 & r1
            if (r0 == 0) goto L68
            awaz r4 = r4.v
            if (r4 != 0) goto L63
            awaz r4 = defpackage.awaz.a
        L63:
            boolean r4 = r4.m
            if (r4 == 0) goto L68
            goto L69
        L68:
            r1 = 0
        L69:
            r3.f = r1
            r3.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahmg.c(ahef):void");
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 0;
        return new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 64L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahme
            public final /* synthetic */ ahmg a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 != 0) {
                    this.a.b((ahcx) obj);
                } else {
                    this.a.c((ahef) obj);
                }
            }
        }, ahfo.d), aiocVar.t().b.h(ahbw.g(aiocVar.aC(), 64L)).h(ahbw.e(0)).Y(new ayrs(this) { // from class: ahme
            public final /* synthetic */ ahmg a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i != 0) {
                    this.a.b((ahcx) obj);
                } else {
                    this.a.c((ahef) obj);
                }
            }
        }, ahfo.d)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahcx.class, ahef.class};
        }
        if (i == 0) {
            b((ahcx) obj);
            return null;
        }
        if (i == 1) {
            c((ahef) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
