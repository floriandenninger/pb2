package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aemz implements aemf {
    final /* synthetic */ aena a;

    public aemz(aena aenaVar) {
        this.a = aenaVar;
    }

    private final void a(aemg aemgVar) {
        if (this.a.i()) {
            if (this.a.g != 0) {
                aemgVar.j(this.a.g);
            }
            aena aenaVar = this.a;
            aenaVar.f(aenaVar.f);
            this.a.d(false);
            if (this.a.h) {
                this.a.b();
            } else {
                this.a.p = false;
            }
        }
    }

    @Override // defpackage.aemf
    public final void d(aemg aemgVar) {
        this.a.m = true;
        aenc aencVar = this.a.a;
        int c = aemgVar.c();
        int i = aenc.n;
        aencVar.j = c;
        a(aemgVar);
    }

    @Override // defpackage.aemf
    public final void e(aemg aemgVar, final int i, final int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (this.a.b.getMainLooper().getThread() == Thread.currentThread()) {
            afky afkyVar = this.a.j;
            if (afkyVar != null) {
                afkyVar.v(i, i2);
            }
        } else {
            aenc aencVar = this.a.a;
            int i3 = aenc.n;
            aencVar.f.post(new Runnable() { // from class: aemy
                @Override // java.lang.Runnable
                public final void run() {
                    aemz aemzVar = aemz.this;
                    int i4 = i;
                    int i5 = i2;
                    afky afkyVar2 = aemzVar.a.j;
                    if (afkyVar2 != null) {
                        afkyVar2.v(i4, i5);
                    }
                }
            });
        }
        if (this.a.l) {
            return;
        }
        this.a.l = true;
        a(aemgVar);
    }

    @Override // defpackage.aemf
    public final void s(int i) {
        if (i > 90) {
            aenc aencVar = this.a.a;
            int i2 = aenc.n;
            int i3 = aencVar.k;
            if (i3 == i || i3 == 100) {
                i = 100;
            }
        }
        aenc aencVar2 = this.a.a;
        int i4 = aenc.n;
        aencVar2.k = i;
    }

    @Override // defpackage.aemf
    public final void t() {
        this.a.g = 0L;
        this.a.n = false;
        this.a.i.f();
        aenc aencVar = this.a.a;
        int i = aenc.n;
        aencVar.E(false);
    }

    @Override // defpackage.aemf
    public final boolean u(int i, int i2) {
        afky afkyVar;
        aena aenaVar = this.a;
        if (aenaVar.k == null) {
            return true;
        }
        boolean z = aenaVar.m;
        StringBuilder sb = new StringBuilder(76);
        sb.append("AndroidFwPlayer: error [prepared=");
        sb.append(z);
        sb.append(", what=");
        sb.append(i);
        sb.append(", extra=");
        sb.append(i2);
        sb.append("]");
        zga.b(sb.toString());
        long j = this.a.g;
        aenc aencVar = this.a.a;
        int i3 = aenc.n;
        boolean z2 = aencVar.m.get() < 3;
        boolean o = this.a.a.a.o();
        aena aenaVar2 = this.a;
        aemw aemwVar = aenaVar2.k;
        FormatStreamModel formatStreamModel = aemwVar.b;
        PlayerConfigModel playerConfigModel = aemwVar.e;
        afih O = aenc.O(i, i2, z2, o, j, formatStreamModel, aenaVar2.q);
        if (!O.n()) {
            this.a.p = true;
            this.a.a.m.incrementAndGet();
            if (i == 100 && (afkyVar = this.a.j) != null) {
                afkyVar.o();
            }
            this.a.i.g(O);
            aena aenaVar3 = this.a;
            aenc.L(aenaVar3.a, aenaVar3.k.b, aenaVar3.g);
        } else {
            this.a.p = false;
            this.a.a.f.post(new Runnable() { // from class: aemx
                @Override // java.lang.Runnable
                public final void run() {
                    aemz.this.a.a.F(true);
                }
            });
            this.a.i.g(O);
            this.a.a.g = false;
        }
        return true;
    }

    @Override // defpackage.aemf
    public final void v(int i, int i2) {
        String hexString = Integer.toHexString(i);
        String hexString2 = Integer.toHexString(i2);
        String.valueOf(hexString).length();
        String.valueOf(hexString2).length();
        if (i == 701) {
            this.a.d(true);
        } else {
            if (i != 702) {
                return;
            }
            this.a.d(false);
        }
    }

    @Override // defpackage.aemf
    public final void w() {
        aenc aencVar = this.a.a;
        int i = aenc.n;
        if (aencVar.h) {
            this.a.a.h = false;
            if (this.a.o) {
                return;
            }
            if (this.a.n) {
                this.a.i.q();
                this.a.i.s(-1L);
            } else {
                this.a.i.m();
            }
        }
    }
}
