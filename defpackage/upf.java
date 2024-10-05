package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class upf {
    public final babf a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final baav f;
    public final String g;
    public final babg h;

    public upf(babf babfVar, Long l, Long l2, Long l3, Long l4, baav baavVar, String str, babg babgVar) {
        this.a = babfVar;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.f = baavVar;
        this.g = str;
        this.h = babgVar;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.g);
    }
}
