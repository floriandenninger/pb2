package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kmv implements aioa, ypd {
    private CharSequence a;
    private final kmz b;

    public kmv(kmz kmzVar) {
        kmzVar.getClass();
        this.b = kmzVar;
    }

    private final void b(Spanned spanned) {
        if (TextUtils.equals(this.a, spanned)) {
            return;
        }
        this.b.e.c(spanned == null ? "" : spanned);
        this.a = spanned;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c(com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L26
            atzr r1 = r5.i
            if (r1 == 0) goto L26
            atzw r2 = r1.i
            if (r2 != 0) goto Ld
            atzw r2 = defpackage.atzw.a
        Ld:
            int r2 = r2.b
            r3 = 153515154(0x9267492, float:2.0036334E-33)
            if (r2 != r3) goto L26
            atzw r1 = r1.i
            if (r1 != 0) goto L1a
            atzw r1 = defpackage.atzw.a
        L1a:
            int r2 = r1.b
            if (r2 != r3) goto L23
            java.lang.Object r1 = r1.c
            aqrf r1 = (defpackage.aqrf) r1
            goto L27
        L23:
            aqrf r1 = defpackage.aqrf.a
            goto L27
        L26:
            r1 = r0
        L27:
            if (r1 != 0) goto L65
            if (r5 == 0) goto L4e
            atzr r5 = r5.i
            if (r5 == 0) goto L4e
            atzw r1 = r5.i
            if (r1 != 0) goto L35
            atzw r1 = defpackage.atzw.a
        L35:
            int r1 = r1.b
            r2 = 128392103(0x7a71ba7, float:2.514362E-34)
            if (r1 != r2) goto L4e
            atzw r5 = r5.i
            if (r5 != 0) goto L42
            atzw r5 = defpackage.atzw.a
        L42:
            int r1 = r5.b
            if (r1 != r2) goto L4b
            java.lang.Object r5 = r5.c
            atzv r5 = (defpackage.atzv) r5
            goto L4f
        L4b:
            atzv r5 = defpackage.atzv.a
            goto L4f
        L4e:
            r5 = r0
        L4f:
            if (r5 == 0) goto L61
            int r1 = r5.b
            r1 = r1 & 1
            if (r1 == 0) goto L5d
            aqyg r0 = r5.c
            if (r0 != 0) goto L5d
            aqyg r0 = defpackage.aqyg.a
        L5d:
            android.text.Spanned r0 = defpackage.ajcq.b(r0)
        L61:
            r4.b(r0)
            return
        L65:
            kmz r5 = r4.b
            azrh r5 = r5.e
            r5.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kmv.c(com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel):void");
    }

    public final void a(ahdv ahdvVar) {
        if (ahdvVar.c().b(aigk.VIDEO_WATCH_LOADED)) {
            c(ahdvVar.a());
            return;
        }
        Spanned spanned = null;
        if (ahdvVar.c().b(aigk.VIDEO_PLAYBACK_LOADED)) {
            PlayerResponseModel b = ahdvVar.b();
            if (b != null) {
                aong aongVar = (aong) aqyg.a.createBuilder();
                String x = b.x();
                aongVar.copyOnWrite();
                aqyg aqygVar = (aqyg) aongVar.instance;
                x.getClass();
                aqygVar.b |= 1;
                aqygVar.d = x;
                spanned = ajcq.b((aqyg) aongVar.build());
            }
            b(spanned);
            return;
        }
        c(null);
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.ao().G().E(ayqr.a()).Y(new ayrs() { // from class: kmu
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                kmv.this.a((ahdv) obj);
            }
        }, kfe.m)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahdv.class};
        }
        if (i == 0) {
            a((ahdv) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
