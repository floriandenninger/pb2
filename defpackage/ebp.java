package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ebp extends ecl {
    public ebp(ebe ebeVar, aone aoneVar, int i) {
        super(ebeVar, "BEk7ZnZgUEtCcnEVmnqrsudDaU91B7wv3jOIcYFOdixfCZNd4CeUtXw9CNec1bEk", "yo4aeX8SQAYiyb+wCfW6Y7Ut6lHDx7k9wp/IaZ/McDY=", aoneVar, i, 5);
    }

    @Override // defpackage.ecl
    protected final void a() {
        aone aoneVar = this.g;
        aoneVar.copyOnWrite();
        dvo dvoVar = (dvo) aoneVar.instance;
        dvo dvoVar2 = dvo.a;
        dvoVar.b |= 16;
        dvoVar.h = -1L;
        aone aoneVar2 = this.g;
        aoneVar2.copyOnWrite();
        dvo dvoVar3 = (dvo) aoneVar2.instance;
        dvoVar3.b |= 32;
        dvoVar3.i = -1L;
        int[] iArr = (int[]) this.d.invoke(null, this.a.a);
        synchronized (this.g) {
            aone aoneVar3 = this.g;
            long j = iArr[0];
            aoneVar3.copyOnWrite();
            dvo dvoVar4 = (dvo) aoneVar3.instance;
            dvoVar4.b |= 16;
            dvoVar4.h = j;
            aone aoneVar4 = this.g;
            long j2 = iArr[1];
            aoneVar4.copyOnWrite();
            dvo dvoVar5 = (dvo) aoneVar4.instance;
            dvoVar5.b |= 32;
            dvoVar5.i = j2;
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                aone aoneVar5 = this.g;
                long j3 = i;
                aoneVar5.copyOnWrite();
                dvo dvoVar6 = (dvo) aoneVar5.instance;
                dvoVar6.c |= 2097152;
                dvoVar6.S = j3;
            }
        }
    }
}
