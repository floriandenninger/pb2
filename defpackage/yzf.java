package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yzf extends yze implements ypd {
    public static final String e = "yzf";
    private final ysy f;

    public yzf(ypa ypaVar, ysy ysyVar) {
        super(ypaVar);
        ysyVar.getClass();
        this.f = ysyVar;
        ypaVar.g(this);
    }

    @Override // defpackage.yns
    public final void b() {
    }

    @Override // defpackage.yns
    public final boolean c() {
        amkq.N(!this.b);
        return this.f.o();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{yro.class};
        }
        if (i == 0) {
            if (!((yro) obj).a()) {
                return null;
            }
            this.d.f(new yzd(e));
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
