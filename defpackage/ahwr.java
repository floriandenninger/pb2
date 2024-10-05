package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahwr implements ypd {
    final /* synthetic */ ahwu a;

    public ahwr(ahwu ahwuVar) {
        this.a = ahwuVar;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aapl.class, aapm.class};
        }
        if (i == 0) {
            this.a.l = ((aapl) obj).a();
            return null;
        }
        if (i == 1) {
            this.a.m = ((aapm) obj).a();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
