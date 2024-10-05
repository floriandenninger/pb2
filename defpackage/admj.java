package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class admj implements ypd {
    final /* synthetic */ admk a;

    public admj(admk admkVar) {
        this.a = admkVar;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{yro.class};
        }
        if (i == 0) {
            yro yroVar = (yro) obj;
            if (this.a.h != 1 || !yroVar.a()) {
                return null;
            }
            admk admkVar = this.a;
            if (admkVar.g && !admkVar.c.r()) {
                return null;
            }
            zga.h(admk.a, "network connectivity restored: continuing with recovery");
            this.a.e.removeMessages(1);
            this.a.e.sendEmptyMessage(1);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
