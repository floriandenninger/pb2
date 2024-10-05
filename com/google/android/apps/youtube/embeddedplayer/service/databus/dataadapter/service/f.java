package com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service;

import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.model.AutoValue_PlaybackEventData;
import com.google.android.apps.youtube.embeddedplayer.service.model.PlaybackEventData;
import com.google.android.apps.youtube.embeddedplayer.service.model.g;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import defpackage.ahef;
import defpackage.ahej;
import defpackage.aryr;
import defpackage.aryv;
import defpackage.ypd;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f implements ypd {
    public long a;
    public ahef b;
    public ahej c = new ahej(4);
    public int d = 1;
    private final com.google.android.apps.youtube.embeddedplayer.service.databus.service.a e;
    private PlaybackEventData f;

    public f(com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar) {
        this.e = aVar;
    }

    private static Optional d(ahef ahefVar) {
        if (ahefVar == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(ahefVar.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (r1 != 3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            ahef r0 = r6.b
            if (r0 != 0) goto L5
            return
        L5:
            aign r0 = r0.c()
            aign r1 = defpackage.aign.PLAYBACK_PENDING
            r2 = 0
            r3 = 1
            r4 = 2
            r5 = 3
            if (r0 != r1) goto L2b
            int r0 = r6.d
            int r1 = r0 + (-1)
            if (r0 == 0) goto L2a
            if (r1 == 0) goto L24
            if (r1 == r3) goto L66
            if (r1 == r4) goto L20
            if (r1 == r5) goto L66
            goto L27
        L20:
            r6.b(r5)
            goto L27
        L24:
            r6.b(r3)
        L27:
            r6.d = r4
            return
        L2a:
            throw r2
        L2b:
            ahef r0 = r6.b
            aign r1 = r0.c()
            boolean r1 = r1.d()
            if (r1 == 0) goto L62
            aign r0 = r0.c()
            boolean r0 = r0.h()
            if (r0 != 0) goto L62
            ahej r0 = r6.c
            int r0 = r0.a()
            if (r0 != r4) goto L62
            int r0 = r6.d
            int r1 = r0 + (-1)
            if (r0 == 0) goto L61
            if (r1 == 0) goto L58
            if (r1 == r3) goto L5b
            if (r1 == r4) goto L66
            if (r1 == r5) goto L5b
            goto L5e
        L58:
            r6.b(r3)
        L5b:
            r6.b(r4)
        L5e:
            r6.d = r5
            return
        L61:
            throw r2
        L62:
            int r0 = r6.d
            if (r0 == r5) goto L67
        L66:
            return
        L67:
            r6.b(r5)
            r0 = 4
            r6.d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.f.a():void");
    }

    public final void b(int i) {
        c(i, this.a);
    }

    public final void c(int i, long j) {
        Optional empty;
        Optional empty2;
        float f;
        ahef ahefVar = this.b;
        if (ahefVar == null) {
            return;
        }
        PlayerResponseModel b = ahefVar.b();
        String y = b != null ? b.y() : null;
        PlaybackEventData playbackEventData = this.f;
        if (playbackEventData != null && TextUtils.equals(((AutoValue_PlaybackEventData) playbackEventData).b, y) && ((AutoValue_PlaybackEventData) this.f).a == i) {
            return;
        }
        g g = PlaybackEventData.g();
        g.d(i);
        g.a = y;
        g.e(j);
        Optional d = d(this.b);
        if (d.isPresent()) {
            empty = Optional.ofNullable(((PlayerResponseModel) d.get()).c);
        } else {
            empty = Optional.empty();
        }
        g.c(empty.isPresent() ? ((VideoStreamingData) empty.get()).d : 0L);
        Optional d2 = d(this.b);
        if (d2.isPresent()) {
            empty2 = Optional.ofNullable(((PlayerResponseModel) d2.get()).a);
        } else {
            empty2 = Optional.empty();
        }
        if (empty2.isPresent()) {
            aryv aryvVar = ((aryr) empty2.get()).h;
            if (aryvVar == null) {
                aryvVar = aryv.a;
            }
            f = aryvVar.m;
        } else {
            f = -1.0f;
        }
        g.b(f);
        PlaybackEventData a = g.a();
        this.f = a;
        this.e.a(a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r8 != 3) goto L18;
     */
    @Override // defpackage.ypd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class[] kz(java.lang.Class r7, java.lang.Object r8, int r9) {
        /*
            r6 = this;
            r7 = -1
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r9 == r7) goto L8c
            if (r9 == 0) goto L84
            if (r9 == r2) goto L4f
            if (r9 != r1) goto L36
            ahej r8 = (defpackage.ahej) r8
            r6.c = r8
            int r7 = r8.a()
            r8 = 4
            if (r7 != r8) goto L32
            int r7 = r6.d
            int r8 = r7 + (-1)
            if (r7 == 0) goto L31
            if (r8 == 0) goto L32
            if (r8 == r2) goto L2a
            if (r8 == r1) goto L27
            if (r8 == r0) goto L2a
            goto L2e
        L27:
            r6.b(r0)
        L2a:
            r7 = 5
            r6.b(r7)
        L2e:
            r6.d = r2
            goto L32
        L31:
            throw r3
        L32:
            r6.a()
            goto L9b
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r0 = 32
            r8.<init>(r0)
            java.lang.String r0 = "unsupported op code: "
            r8.append(r0)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L4f:
            aheg r8 = (defpackage.aheg) r8
            long r0 = r8.e()
            r4 = 0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 < 0) goto L7f
            long r7 = r8.f()
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 <= 0) goto L64
            goto L7f
        L64:
            ahej r7 = r6.c
            int r7 = r7.a()
            r8 = 9
            if (r7 == r8) goto L78
            ahej r7 = r6.c
            int r7 = r7.a()
            r8 = 10
            if (r7 != r8) goto L7c
        L78:
            r7 = 6
            r6.c(r7, r0)
        L7c:
            r6.a = r0
            goto L9b
        L7f:
            r7 = -9223372036854775808
            r6.a = r7
            goto L9b
        L84:
            ahef r8 = (defpackage.ahef) r8
            r6.b = r8
            r6.a()
            goto L9b
        L8c:
            java.lang.Class[] r3 = new java.lang.Class[r0]
            r7 = 0
            java.lang.Class<ahef> r8 = defpackage.ahef.class
            r3[r7] = r8
            java.lang.Class<aheg> r7 = defpackage.aheg.class
            r3[r2] = r7
            java.lang.Class<ahej> r7 = defpackage.ahej.class
            r3[r1] = r7
        L9b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.databus.dataadapter.service.f.kz(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }
}
