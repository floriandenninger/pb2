package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ecf extends ecl {
    private final ebk h;
    private long i;

    public ecf(ebe ebeVar, aone aoneVar, int i, ebk ebkVar) {
        super(ebeVar, "BF4UgSmqTS0MLe4qitQi/hj1jIQ+0vLIJEn32u0TtZn0VL9j15ZHt04Do4ADy833", "Yw5N4XiXXiTiwJwrJ8hW/AfPIwRQ2KMfiYKb9xu8vYQ=", aoneVar, i, 53);
        this.h = ebkVar;
        if (ebkVar != null) {
            this.i = ebkVar.a();
        }
    }

    @Override // defpackage.ecl
    protected final void a() {
        if (this.h != null) {
            aone aoneVar = this.g;
            long longValue = ((Long) this.d.invoke(null, Long.valueOf(this.i))).longValue();
            aoneVar.copyOnWrite();
            dvo dvoVar = (dvo) aoneVar.instance;
            dvo dvoVar2 = dvo.a;
            dvoVar.c |= 16384;
            dvoVar.N = longValue;
        }
    }
}
