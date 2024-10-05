package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ort implements ypd {
    public final osq a;
    public final ypa b;
    public final ysy c;
    public final ainy d;
    public boolean e;
    public boolean f;
    public ayqx g;

    public ort(osq osqVar, ypa ypaVar, ysy ysyVar, ainy ainyVar) {
        this.a = osqVar;
        this.b = ypaVar;
        this.c = ysyVar;
        this.d = ainyVar;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{yro.class, ahej.class};
        }
        if (i == 0) {
            if (!((yro) obj).a()) {
                this.a.e();
                return null;
            }
            if (!this.d.d()) {
                return null;
            }
            this.a.d();
            return null;
        }
        if (i == 1) {
            if (((ahej) obj).a() != 2 || !this.c.o()) {
                this.a.e();
                return null;
            }
            this.a.d();
            this.f = false;
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
