package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ecc extends ecl {
    private final boolean h;

    public ecc(ebe ebeVar, aone aoneVar, int i) {
        super(ebeVar, "QXlICfiT7SVSRUb0DD1a74y++UqnSLMKlPOXAn9FNLrl7qN9uprYrk5dswjj/dLi", "yqGfvaGOT1fOScq8M0g9vywM6jvcTWdjxf27npfqtn0=", aoneVar, i, 61);
        this.h = ebeVar.o.a;
    }

    @Override // defpackage.ecl
    protected final void a() {
        long longValue = ((Long) this.d.invoke(null, this.a.a, Boolean.valueOf(this.h))).longValue();
        synchronized (this.g) {
            aone aoneVar = this.g;
            aoneVar.copyOnWrite();
            dvo dvoVar = (dvo) aoneVar.instance;
            dvo dvoVar2 = dvo.a;
            dvoVar.c |= 8388608;
            dvoVar.U = longValue;
        }
    }
}
