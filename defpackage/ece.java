package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ece extends ecl {
    public ece(ebe ebeVar, aone aoneVar, int i) {
        super(ebeVar, "DVrAFpWxz2kcLonXDVqzAxxY5qZgb6+MyY8HJZUy9HF2czdhCSx5Lbv7dDVJMgy/", "AdToINYaWmfqYE6WezllyxILgCbRf0l/sf/vZralbBA=", aoneVar, i, 51);
    }

    @Override // defpackage.ecl
    protected final void a() {
        synchronized (this.g) {
            eba ebaVar = new eba((String) this.d.invoke(null, new Object[0]));
            aone aoneVar = this.g;
            long longValue = ebaVar.a.longValue();
            aoneVar.copyOnWrite();
            dvo dvoVar = (dvo) aoneVar.instance;
            dvo dvoVar2 = dvo.a;
            dvoVar.c |= 4096;
            dvoVar.L = longValue;
            aone aoneVar2 = this.g;
            long longValue2 = ebaVar.b.longValue();
            aoneVar2.copyOnWrite();
            dvo dvoVar3 = (dvo) aoneVar2.instance;
            dvoVar3.c |= 8192;
            dvoVar3.M = longValue2;
        }
    }
}
