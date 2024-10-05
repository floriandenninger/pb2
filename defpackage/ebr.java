package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ebr extends ecl {
    private final long h;

    public ebr(ebe ebeVar, aone aoneVar, long j, int i) {
        super(ebeVar, "bwYfemyqKvs+5mX5RaQoUxmdyIG97sQWktW0fw649v7l/u+oM9fVxJ1I47AdFZo9", "ue4Q/YADEXoviiBHZurTF9IPPlfQKRVJdzRZ56oggWM=", aoneVar, i, 25);
        this.h = j;
    }

    @Override // defpackage.ecl
    protected final void a() {
        long longValue = ((Long) this.d.invoke(null, new Object[0])).longValue();
        synchronized (this.g) {
            aone aoneVar = this.g;
            aoneVar.copyOnWrite();
            dvo dvoVar = (dvo) aoneVar.instance;
            dvo dvoVar2 = dvo.a;
            dvoVar.d |= 8192;
            dvoVar.ae = longValue;
            long j = this.h;
            if (j != 0) {
                aone aoneVar2 = this.g;
                long j2 = longValue - j;
                aoneVar2.copyOnWrite();
                dvo dvoVar3 = (dvo) aoneVar2.instance;
                dvoVar3.b |= 65536;
                dvoVar3.o = j2;
                aone aoneVar3 = this.g;
                long j3 = this.h;
                aoneVar3.copyOnWrite();
                dvo dvoVar4 = (dvo) aoneVar3.instance;
                dvoVar4.b |= 2097152;
                dvoVar4.r = j3;
            }
        }
    }
}
