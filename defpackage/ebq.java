package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ebq extends ecl {
    private static volatile Long h;
    private static final Object i = new Object();

    public ebq(ebe ebeVar, aone aoneVar, int i2) {
        super(ebeVar, "BZSpo1ki7Qq4VpNbKNY5xp3ObP5b46iKtLhMqj95i84Sl1pKZG1hW1hXSXh30EEu", "LLuZlwuRYspGUGo7OZU51ciMYYFQ89K2r1TLDzvNq9k=", aoneVar, i2, 44);
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
            dvoVar.c |= 32;
            dvoVar.F = longValue;
        }
    }
}
