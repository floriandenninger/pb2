package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aefz extends afja {
    public static final aefy b = new aefx();
    private static final AtomicInteger c = new AtomicInteger();
    private final aenf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aefz(atr atrVar, aenf aenfVar) {
        super(atrVar);
        afki.a(atrVar);
        afki.a(aenfVar);
        this.d = aenfVar;
    }

    @Override // defpackage.afja, defpackage.atr, defpackage.ate
    public final long h(ath athVar) {
        zhy b2 = zhy.b(athVar.a);
        AtomicInteger atomicInteger = c;
        b2.g("rn", String.valueOf(atomicInteger.incrementAndGet()));
        if (athVar.c == 2 && "/initplayback".equals(athVar.a.getPath())) {
            b2.g("srn", String.valueOf(atomicInteger.incrementAndGet()));
        }
        aenk j = this.d.j();
        if (j != aenk.a) {
            long j2 = j.b;
            int i = j.c;
            StringBuilder sb = new StringBuilder(32);
            sb.append(j2 / 8);
            sb.append(":");
            sb.append(i);
            b2.h("bwe", sb.toString());
            b2.h("nt", Integer.toString(j.d.B));
        }
        return super.h(athVar.d(b2.a()));
    }
}
