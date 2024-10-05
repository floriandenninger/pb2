package defpackage;

import android.net.Uri;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajkj {
    private static final ajjw e = new ajjw() { // from class: ajkh
        @Override // defpackage.ajjw
        public final zaa a() {
            return null;
        }
    };
    public final ImageView a;
    public final ajki b;
    public zab c;
    public zaa d;
    private final zaf f;
    private final int g;
    private ajjw h;
    private avgg i;
    private Uri j;

    public ajkj(zaf zafVar, ImageView imageView) {
        this(zafVar, imageView, false);
    }

    public final void a() {
        b();
        this.a.setImageDrawable(null);
    }

    public final void b() {
        zag.a(this.a);
        this.b.b();
        this.d = null;
        this.i = null;
        this.j = null;
    }

    public final void c(Uri uri, zae zaeVar, zaa zaaVar) {
        zag.c(this.f, zaaVar, this.c, uri, this.a, zaeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.zae r8, defpackage.zaa r9, int r10) {
        /*
            r7 = this;
            avgg r0 = r7.i
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.ImageView r0 = r7.a
            int r0 = r0.getWidth()
            android.widget.ImageView r1 = r7.a
            int r1 = r1.getHeight()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L18
            if (r1 != 0) goto L22
            r1 = 0
        L18:
            avgg r4 = r7.i
            aony r4 = r4.c
            int r4 = r4.size()
            if (r4 != r3) goto L8c
        L22:
            avgg r4 = r7.i
            if (r0 < 0) goto L28
            r5 = 1
            goto L29
        L28:
            r5 = 0
        L29:
            defpackage.amkq.E(r5)
            if (r1 < 0) goto L2f
            r2 = 1
        L2f:
            defpackage.amkq.E(r2)
            boolean r2 = defpackage.ahbw.L(r4)
            r5 = 0
            if (r2 != 0) goto L3b
            r10 = r5
            goto L60
        L3b:
            java.util.ArrayList r2 = new java.util.ArrayList
            aony r6 = r4.c
            r2.<init>(r6)
            ahaa r6 = defpackage.ahaa.d
            java.util.Collections.sort(r2, r6)
            avgf r0 = defpackage.ahbw.H(r4, r0, r1)
            int r0 = r2.indexOf(r0)
            int r0 = r0 + r10
            int r10 = r2.size()
            int r10 = r10 + (-1)
            int r10 = java.lang.Math.min(r0, r10)
            java.lang.Object r10 = r2.get(r10)
            avgf r10 = (defpackage.avgf) r10
        L60:
            if (r10 == 0) goto L6e
            int r0 = r10.b
            r0 = r0 & r3
            if (r0 == 0) goto L6e
            java.lang.String r10 = r10.c
            android.net.Uri r10 = defpackage.wbs.aj(r10)
            goto L6f
        L6e:
            r10 = r5
        L6f:
            if (r10 == 0) goto L79
            android.net.Uri r0 = r7.j
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L86
        L79:
            r7.j = r10
            if (r10 == 0) goto L81
            r7.c(r10, r8, r9)
            goto L86
        L81:
            android.widget.ImageView r8 = r7.a
            r8.setImageDrawable(r5)
        L86:
            ajki r8 = r7.b
            r8.b()
            return
        L8c:
            ajki r9 = r7.b
            r9.a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajkj.d(zae, zaa, int):void");
    }

    public final void e(int i) {
        this.a.setBackgroundResource(i);
    }

    public final void f(zab zabVar) {
        zabVar.getClass();
        this.c = zabVar;
    }

    public final void g(int i) {
        b();
        this.a.setImageResource(i);
    }

    public final void h(ajjw ajjwVar) {
        if (ajjwVar == null) {
            ajjwVar = e;
        }
        this.h = ajjwVar;
    }

    public final void i(ImageView.ScaleType scaleType) {
        this.a.setScaleType(scaleType);
    }

    @Deprecated
    public final void j(aami aamiVar) {
        m(aamiVar != null ? aamiVar.e() : null, true, true, null);
    }

    public final void k(avgg avggVar) {
        m(avggVar, true, true, null);
    }

    public final void l(avgg avggVar, zae zaeVar) {
        m(avggVar, true, true, zaeVar);
    }

    public final void m(avgg avggVar, boolean z, boolean z2, zae zaeVar) {
        if (avggVar != this.i) {
            this.d = this.h.a();
            this.i = avggVar;
            this.j = null;
            if (z) {
                this.a.setImageDrawable(null);
            }
            this.b.b();
        }
        if (ahbw.L(avggVar)) {
            if (this.b.a || !this.a.isLayoutRequested() || !z2) {
                d(zaeVar, this.d, this.g);
            } else {
                this.b.a(zaeVar);
            }
        }
    }

    public final void n() {
        this.a.setBackground(null);
    }

    public final void o() {
        this.a.setVisibility(8);
    }

    public ajkj(zaf zafVar, ImageView imageView, boolean z) {
        this(zafVar, new zad(imageView.getContext()), imageView, z);
    }

    public ajkj(zaf zafVar, zab zabVar, ImageView imageView, boolean z) {
        this(zafVar, zabVar, e, imageView, z);
    }

    public ajkj(zaf zafVar, zab zabVar, ajjw ajjwVar, ImageView imageView, boolean z) {
        this(zafVar, zabVar, ajjwVar, imageView, z, null);
    }

    public ajkj(zaf zafVar, zab zabVar, ajjw ajjwVar, ImageView imageView, boolean z, aadw aadwVar) {
        zafVar.getClass();
        this.f = zafVar;
        imageView.getClass();
        this.a = imageView;
        int i = 0;
        if (aadwVar != null && aadwVar.b() != null && (aadwVar.b().b & 67108864) != 0) {
            avdj avdjVar = aadwVar.b().u;
            i = (avdjVar == null ? avdj.a : avdjVar).j;
            this.g = i;
        } else {
            this.g = 0;
        }
        this.b = new ajki(this, z, i);
        f(zabVar);
        h(ajjwVar);
    }
}
