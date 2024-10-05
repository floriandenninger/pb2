package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahfh extends yns implements ypd {
    public final ypa d;
    private final int e;

    public ahfh(ypa ypaVar, int i) {
        this.d = ypaVar;
        this.e = i;
    }

    @Override // defpackage.yns
    public final void b() {
        this.d.m(this);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aheo.class};
        }
        if (i == 0) {
            aheo aheoVar = (aheo) obj;
            int i2 = this.e;
            if (i2 > 0) {
                if (aheoVar.a < i2) {
                    return null;
                }
                this.d.m(this);
                this.c = true;
                a();
                return null;
            }
            if (i2 >= 0 || aheoVar.b - aheoVar.a > (-i2)) {
                return null;
            }
            this.d.m(this);
            this.c = true;
            a();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
