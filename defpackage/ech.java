package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ech extends ecl {
    public ech(ebe ebeVar, aone aoneVar, int i) {
        super(ebeVar, "TDjQ/ClZ1A6U11LRle5Q8IpNZYzzk0FLHirJ3MQW6+Xmi/90o6gFxPcIONwzxlWm", "ZlhR2acRJ5DFhes+PG5pnG7AissVCA1YeE0si8KUOuk=", aoneVar, i, 48);
    }

    @Override // defpackage.ecl
    protected final void a() {
        aone aoneVar = this.g;
        aoneVar.copyOnWrite();
        dvo dvoVar = (dvo) aoneVar.instance;
        dvo dvoVar2 = dvo.a;
        dvoVar.f190J = 2;
        dvoVar.c |= 1024;
        boolean booleanValue = ((Boolean) this.d.invoke(null, this.a.a)).booleanValue();
        synchronized (this.g) {
            if (booleanValue) {
                aone aoneVar2 = this.g;
                aoneVar2.copyOnWrite();
                dvo dvoVar3 = (dvo) aoneVar2.instance;
                dvoVar3.f190J = 1;
                dvoVar3.c |= 1024;
            } else {
                aone aoneVar3 = this.g;
                aoneVar3.copyOnWrite();
                dvo dvoVar4 = (dvo) aoneVar3.instance;
                dvoVar4.f190J = 0;
                dvoVar4.c |= 1024;
            }
        }
    }
}
