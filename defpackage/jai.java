package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jai {
    public final aqwe a;
    private jaj b;

    public jai(aqwe aqweVar) {
        this.a = aqweVar;
        aqwf aqwfVar = aqweVar.h;
        amkq.N(((aqwfVar == null ? aqwf.a : aqwfVar).b & 8) != 0);
    }

    public final jaj a() {
        if (this.b == null) {
            aqwf aqwfVar = this.a.h;
            if (aqwfVar == null) {
                aqwfVar = aqwf.a;
            }
            aubz aubzVar = aqwfVar.c;
            if (aubzVar == null) {
                aubzVar = aubz.a;
            }
            this.b = new jaj(aubzVar);
        }
        return this.b;
    }

    public final byte[] b() {
        return a().a.m.I();
    }
}
