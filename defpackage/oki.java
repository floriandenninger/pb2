package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oki implements ypd {
    private final acqz a;

    public oki(acqz acqzVar) {
        this.a = acqzVar;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{xan.class};
        }
        if (i == 0) {
            acqx acqxVar = new acqx(((xan) obj).a.a.e.I());
            acra mM = this.a.mM();
            if (mM == null) {
                return null;
            }
            mM.D(acqxVar);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
