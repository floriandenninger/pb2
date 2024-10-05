package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aezg {
    private static final pot j = new pot();
    public final aezf a;
    public int b;
    public avl c;
    public boolean d;
    public boolean e;
    public volatile boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    private boolean k;

    public aezg(aezf aezfVar) {
        this.a = aezfVar;
    }

    private final void e(avl avlVar, boolean z, int i) {
        long d;
        aezf aezfVar;
        affc g = this.a.g();
        if (avlVar.b.z()) {
            d = -9223372036854775807L;
        } else {
            pou pouVar = avlVar.b;
            int i2 = avlVar.c;
            pot potVar = j;
            pouVar.y(i2, potVar);
            d = plh.d(potVar.q);
        }
        long t = aear.t(d, avlVar.g);
        boolean z2 = false;
        if (i == 2) {
            if (z) {
                this.a.b.d();
            } else {
                this.a.b.n();
            }
            long e = ((aeut) this.a.e).d.e();
            aeut aeutVar = (aeut) this.a.e;
            FormatStreamModel l = aeutVar.l();
            FormatStreamModel k = aeutVar.k();
            long j2 = l != null ? l.f : 0L;
            if (k != null) {
                j2 += k.f;
            }
            if (g.l(t, e, j2)) {
                aezf aezfVar2 = this.a;
                aezfVar2.e.X(aezfVar2);
            }
        } else if (i != 3) {
            if (i == 4) {
                aezf aezfVar3 = this.a;
                aezfVar3.e.Z(aezfVar3, false);
                this.a.b.f();
            }
        } else if (z) {
            if (g.m()) {
                aezf aezfVar4 = this.a;
                aezfVar4.e.X(aezfVar4);
            } else {
                aezf aezfVar5 = this.a;
                if (!aezfVar5.B || aezfVar5.D) {
                    aezfVar5.b.q();
                    z2 = true;
                } else {
                    aezfVar5.C = true;
                }
                if (this.i && t >= this.a.b().d && (aezfVar = this.a.z) != null) {
                    aezfVar.B = true;
                }
            }
            afhs afhsVar = this.a.L;
            if (afhsVar.V(afhsVar.p.a.a.Y(axzc.p).B())) {
                ((aeut) this.a.e).g.i(poi.a);
            }
        } else if (!this.i || t < this.a.b().d) {
            this.a.b.m();
            g.g();
        } else {
            this.a.b.f();
            aezf aezfVar6 = this.a;
            aezfVar6.e.Z(aezfVar6, true);
        }
        this.f = z2;
    }

    public final void a() {
        if (this.d || this.e || !this.g) {
            return;
        }
        this.g = false;
        e(this.c, this.k, this.b);
    }

    public final void b() {
        if (this.e) {
            this.e = false;
            a();
        }
    }

    public final void c(avl avlVar, boolean z, int i) {
        if (this.b == 2 && i != 2) {
            this.h = true;
        }
        if (i == 3 && this.a.L.ab() && this.d) {
            this.d = false;
            aezf aezfVar = this.a;
            aezfVar.b.u(aezfVar.f);
        }
        this.b = i;
        this.k = z;
        this.c = avlVar;
        boolean z2 = this.e;
        if (z2) {
            this.g = true;
        }
        if (this.d || z2) {
            return;
        }
        e(avlVar, z, i);
    }

    public final void d() {
        this.h = false;
        this.d = true;
    }
}
