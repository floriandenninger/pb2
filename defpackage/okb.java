package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class okb extends fks implements ypd {
    public final azrw a;
    public boolean b;
    private final ypa c;

    public okb(fln flnVar, ypa ypaVar, azrw azrwVar) {
        super(flnVar);
        this.c = ypaVar;
        this.a = azrwVar;
    }

    @Override // defpackage.flm
    public final void kG() {
        this.c.m(this);
    }

    @Override // defpackage.flm
    public final void kH() {
        this.c.g(this);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{yjj.class, yjk.class};
        }
        if (i == 0) {
            if (this.b) {
                ((ainy) this.a.get()).b();
            }
            this.b = false;
            return null;
        }
        if (i == 1) {
            boolean d = ((ainy) this.a.get()).d();
            this.b = d;
            if (!d) {
                return null;
            }
            ((ainy) this.a.get()).a();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
