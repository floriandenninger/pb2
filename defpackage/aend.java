package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aend implements aemf {
    final /* synthetic */ aene a;

    public aend(aene aeneVar) {
        this.a = aeneVar;
    }

    @Override // defpackage.aemf
    public final void d(aemg aemgVar) {
        this.a.c = true;
        this.a.k = aemgVar.c();
        if (this.a.c) {
            long j = this.a.j;
            if (j != 0) {
                aemgVar.j(j);
            }
            aene aeneVar = this.a;
            aeneVar.D(aeneVar.m);
            if (this.a.g) {
                this.a.u();
            }
        }
    }

    @Override // defpackage.aemf
    public final void e(aemg aemgVar, int i, int i2) {
    }

    @Override // defpackage.aemf
    public final void s(int i) {
        int i2;
        if (i > 90 && ((i2 = this.a.l) == i || i2 == 100)) {
            i = 100;
        }
        this.a.l = i;
    }

    @Override // defpackage.aemf
    public final void t() {
        aene aeneVar = this.a;
        aeneVar.j = 0L;
        aeneVar.d = false;
        this.a.b.f();
    }

    @Override // defpackage.aemf
    public final boolean u(int i, int i2) {
        String str = true != this.a.c ? "prepare" : "playback";
        StringBuilder sb = new StringBuilder(str.length() + 63);
        sb.append("MediaPlayer error during ");
        sb.append(str);
        sb.append(" [what=");
        sb.append(i);
        sb.append(", extra=");
        sb.append(i2);
        sb.append("]");
        zga.l(sb.toString());
        boolean o = this.a.a.o();
        long g = this.a.g();
        aene aeneVar = this.a;
        afih O = aenc.O(i, i2, false, o, g, aeneVar.h, aeneVar.n);
        this.a.E(true);
        this.a.b.g(O);
        return true;
    }

    @Override // defpackage.aemf
    public final void v(int i, int i2) {
        String hexString = Integer.toHexString(i);
        String hexString2 = Integer.toHexString(i2);
        String.valueOf(hexString).length();
        String.valueOf(hexString2).length();
        if (i == 701) {
            String.valueOf(String.valueOf(this.a.h)).length();
            this.a.A(true);
        } else {
            if (i != 702) {
                return;
            }
            this.a.A(false);
        }
    }

    @Override // defpackage.aemf
    public final void w() {
        if (this.a.f) {
            this.a.f = false;
            if (this.a.e) {
                return;
            }
            if (this.a.d) {
                this.a.b.q();
                this.a.b.s(-1L);
            } else {
                this.a.b.m();
            }
        }
    }
}
