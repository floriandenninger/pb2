package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jsk implements ypd {
    static final long a = TimeUnit.HOURS.toMillis(4);
    private final ysy b;
    private final shf c;
    private final fka d;
    private final azrw e;
    private final azrw f;

    public jsk(ysy ysyVar, shf shfVar, fka fkaVar, azrw azrwVar, azrw azrwVar2) {
        this.b = ysyVar;
        this.c = shfVar;
        this.d = fkaVar;
        this.e = azrwVar;
        this.f = azrwVar2;
    }

    public final void b() {
        c(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(final int i) {
        if (this.b.o()) {
            long c = this.c.c();
            aoot aootVar = ((fke) this.d.b.c()).g;
            Integer valueOf = Integer.valueOf(i - 1);
            if (c - (aootVar.containsKey(valueOf) ? ((Long) aootVar.get(valueOf)).longValue() : 0L) < a) {
                return;
            }
            ((agro) this.f.get()).c(((agof) this.e.get()).d());
            fka fkaVar = this.d;
            final long c2 = this.c.c();
            ynm.m(fkaVar.b.b(new amml() { // from class: fjy
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    int i2 = i;
                    long j = c2;
                    aone builder = ((fke) obj).toBuilder();
                    builder.g(i2 - 1, j);
                    return (fke) builder.build();
                }
            }), gwr.s);
        }
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
            b();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
