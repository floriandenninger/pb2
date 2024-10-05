package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ebu extends ecl {
    private static volatile Long h;
    private static final Object i = new Object();

    public ebu(ebe ebeVar, aone aoneVar, int i2) {
        super(ebeVar, "A1tPgHG2ugzZJCs1M+dp+hmS1POsS+eh/W2v7YCpLDG/34A+E/oOE4ZeCFsAYJwW", "qStL+/rRmChGKiFwdmBpG5d//S+c8NqJKVwR4OiL/ms=", aoneVar, i2, 22);
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
            dvoVar.b |= 1048576;
            dvoVar.q = longValue;
        }
    }
}
