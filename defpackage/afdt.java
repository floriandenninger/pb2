package defpackage;

import android.os.Handler;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afdt {
    public final Handler d;
    public final afdx e;
    public long i;
    public int j;
    private final afdf k;
    private final afqu l;
    private final afhs n;
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public aeev f = aeev.NONE;
    public final Vector g = new Vector();
    public final Vector h = new Vector();
    private boolean m = true;

    public afdt(afdf afdfVar, Handler handler, afdx afdxVar, afqu afquVar, afhs afhsVar) {
        this.k = afdfVar;
        this.d = handler;
        this.e = afdxVar;
        this.l = afquVar;
        this.n = afhsVar;
    }

    public final void a() {
        afky T = this.e.T();
        if (T == null) {
            return;
        }
        long g = this.e.g() * 1000;
        while (g() && !this.e.aq() && ((Long) this.h.get(this.j)).longValue() < 1000000 + g) {
            T.r(false, (byte[]) this.g.get(this.j), ((Long) this.h.get(this.j)).longValue(), this.e.g() * 1000);
            this.j++;
        }
        if (g()) {
            this.d.postDelayed(new afds(this), 1000L);
        }
    }

    public final void b() {
        afky T = this.e.T();
        if (this.m && this.a && T != null) {
            this.k.g(aflb.GL_GVR, this.l);
            T.t(aflb.GL_GVR);
            this.b = true;
            this.m = false;
            this.e.ao();
        }
    }

    public final void c() {
        this.a = false;
        this.b = false;
        this.f = aeev.NONE;
        d();
        afky T = this.e.T();
        if (T != null) {
            T.r(true, new byte[0], 0L, 0L);
        }
        this.m = true;
    }

    public final void d() {
        this.g.clear();
        this.h.clear();
        this.j = 0;
        afic aficVar = afic.ABR;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.aeeu r13, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r14) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afdt.e(aeeu, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r8 != 19) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r7, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r8) {
        /*
            r6 = this;
            afdx r0 = r6.e
            afky r0 = r0.T()
            if (r0 != 0) goto L9
            return
        L9:
            r1 = 2
            r2 = 1
            r3 = 3
            if (r8 == 0) goto L22
            int r4 = r8.y
            int r8 = r8.z
            r5 = 17
            if (r4 == r5) goto L20
            if (r8 != r5) goto L19
            goto L20
        L19:
            r2 = 19
            if (r4 == r2) goto L23
            if (r8 != r2) goto L22
            goto L23
        L20:
            r1 = 1
            goto L23
        L22:
            r1 = 3
        L23:
            boolean r8 = r6.a
            r2 = 0
            if (r7 == 0) goto L33
            atyi r3 = r7.c
            aquz r3 = r3.e
            if (r3 != 0) goto L30
            aquz r3 = defpackage.aquz.b
        L30:
            float r3 = r3.aG
            goto L34
        L33:
            r3 = 0
        L34:
            if (r7 == 0) goto L40
            atyi r7 = r7.c
            aquz r7 = r7.e
            if (r7 != 0) goto L3e
            aquz r7 = defpackage.aquz.b
        L3e:
            float r2 = r7.aH
        L40:
            r0.y(r8, r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afdt.f(com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData):void");
    }

    public final boolean g() {
        return this.j < this.h.size();
    }
}
