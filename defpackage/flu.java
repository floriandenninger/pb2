package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class flu implements fgp, ahmf, ypd {
    public final fls[] a = new fls[2];
    public boolean b;
    private boolean c;
    private boolean d;

    public flu() {
        for (int i = 0; i < 2; i++) {
            this.a[i] = new fls();
        }
    }

    public final void b() {
        if (this.c) {
            this.a[0].a(true);
            this.a[1].a(false);
        } else {
            boolean z = !this.b && this.d;
            this.a[0].a(!z);
            this.a[1].a(z);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahee.class};
        }
        if (i == 0) {
            this.b = ((ahee) obj).a;
            b();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ahmf
    public final void nZ(boolean z) {
        this.d = z;
        b();
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        boolean z = true;
        if (!fhgVar.l() && !fhgVar.e()) {
            z = false;
        }
        this.c = z;
        b();
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }
}
