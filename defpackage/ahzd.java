package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahzd implements ypd {
    final /* synthetic */ ahzg a;

    public ahzd(ahzg ahzgVar) {
        this.a = ahzgVar;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahee.class};
        }
        if (i == 0) {
            this.a.c.b(((ahee) obj).a);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
