package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ebw extends ecl {
    private final eao h;

    public ebw(ebe ebeVar, aone aoneVar, int i, eao eaoVar) {
        super(ebeVar, "E20AdmxNj0iK7Vx72nHXXjWnsmv4FUkyxC/Oztwx6eZIzlENIrQYdkN17JfC0Q1q", "rY9DNDEvlJE2YV76YVSJLP4cBUy/u1xcBXUcMxb1h8o=", aoneVar, i, 11);
        this.h = eaoVar;
    }

    @Override // defpackage.ecl
    protected final void a() {
        eao eaoVar = this.h;
        if (eaoVar != null) {
            aone aoneVar = this.g;
            long longValue = ((Long) this.d.invoke(null, eaoVar.a)).longValue();
            aoneVar.copyOnWrite();
            dvo dvoVar = (dvo) aoneVar.instance;
            dvo dvoVar2 = dvo.a;
            dvoVar.b |= 1024;
            dvoVar.j = longValue;
        }
    }
}
