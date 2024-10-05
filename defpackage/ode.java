package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ode implements ypd {
    final /* synthetic */ odg a;

    public ode(odg odgVar) {
        this.a = odgVar;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahee.class};
        }
        if (i == 0) {
            this.a.j = ((ahee) obj).a;
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
