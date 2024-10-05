package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nzz implements aioa, ypd {
    final /* synthetic */ oad a;

    public nzz(oad oadVar) {
        this.a = oadVar;
    }

    public final void a(ahdv ahdvVar) {
        PlayerResponseModel b = ahdvVar.b();
        if (!ahdvVar.c().b(aigk.VIDEO_PLAYBACK_LOADED) || b == null) {
            return;
        }
        this.a.z = b.x();
        this.a.A = b.w();
        this.a.t.c(Boolean.valueOf(b.F()));
        this.a.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.ahef r9) {
        /*
            r8 = this;
            oad r0 = r8.a
            aign r1 = defpackage.aign.NEW
            aign r1 = r9.c()
            int r1 = r1.ordinal()
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L65
            r4 = 8
            if (r1 == r4) goto L15
            goto L67
        L15:
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r1 = r9.b()
            if (r1 == 0) goto L6c
            aryr r1 = r1.a
            if (r1 == 0) goto L6c
            int r4 = r1.b
            r5 = 134217728(0x8000000, float:3.85186E-34)
            r4 = r4 & r5
            if (r4 == 0) goto L6c
            boolean r4 = r0.y
            if (r4 != 0) goto L6c
            arye r1 = r1.B
            if (r1 != 0) goto L30
            arye r1 = defpackage.arye.a
        L30:
            int r4 = r1.b
            r5 = 130741768(0x7caf608, float:3.0538186E-34)
            if (r4 != r5) goto L3c
            java.lang.Object r1 = r1.c
            attc r1 = (defpackage.attc) r1
            goto L3e
        L3c:
            attc r1 = defpackage.attc.a
        L3e:
            r4 = 1
            r0.y = r4
            oac r0 = r0.h
            int r5 = r1.b
            r5 = r5 & r4
            if (r5 == 0) goto L4f
            aqyg r5 = r1.c
            if (r5 != 0) goto L50
            aqyg r5 = defpackage.aqyg.a
            goto L50
        L4f:
            r5 = r3
        L50:
            android.text.Spanned r5 = defpackage.ajcq.b(r5)
            long r6 = r1.d
            r0.c = r4
            android.widget.TextView r1 = r0.a
            r1.setText(r5)
            android.widget.TextView r1 = r0.a
            java.lang.Runnable r0 = r0.b
            r1.postDelayed(r0, r6)
            goto L6c
        L65:
            r0.y = r2
        L67:
            oac r0 = r0.h
            r0.a()
        L6c:
            aign r0 = r9.c()
            aign r1 = defpackage.aign.NEW
            if (r0 != r1) goto L8f
            oad r0 = r8.a
            r0.z = r3
            r0.A = r3
            r0.f(r3)
            oad r0 = r8.a
            oac r0 = r0.h
            r0.b(r3)
            oad r0 = r8.a
            azqw r0 = r0.v
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0.c(r1)
        L8f:
            oad r0 = r8.a
            azqw r0 = r0.u
            aign r9 = r9.c()
            r0.c(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzz.b(ahef):void");
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 0;
        return new ayqx[]{aiocVar.ao().G().E(ayqr.a()).Y(new ayrs(this) { // from class: nzy
            public final /* synthetic */ nzz a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i != 0) {
                    this.a.a((ahdv) obj);
                } else {
                    this.a.b((ahef) obj);
                }
            }
        }, nua.l), aiocVar.G().b.Y(new ayrs(this) { // from class: nzy
            public final /* synthetic */ nzz a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 != 0) {
                    this.a.a((ahdv) obj);
                } else {
                    this.a.b((ahef) obj);
                }
            }
        }, nua.l)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahdv.class, ahef.class};
        }
        if (i == 0) {
            a((ahdv) obj);
            return null;
        }
        if (i == 1) {
            b((ahef) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
