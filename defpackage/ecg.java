package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ecg extends ecl {
    private static volatile Long h;
    private static final Object i = new Object();

    public ecg(ebe ebeVar, aone aoneVar, int i2) {
        super(ebeVar, "kgLg33QaU762V6pmSw9NTYQDT3UN+SfZqKWL+LtHgczBAmljOlYdBxhmK655CLWm", "WLzuG2U+Kkbg0oKQlrLQGRQCiSGGQTHe1FZJKw3vRH0=", aoneVar, i2, 33);
    }

    @Override // defpackage.ecl
    protected final void a() {
        if (h == null) {
            synchronized (i) {
                if (h == null) {
                    h = (Long) this.d.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            aone aoneVar = this.g;
            long longValue = h.longValue();
            aoneVar.copyOnWrite();
            dvo dvoVar = (dvo) aoneVar.instance;
            dvo dvoVar2 = dvo.a;
            dvoVar.b |= 134217728;
            dvoVar.w = longValue;
        }
    }
}
