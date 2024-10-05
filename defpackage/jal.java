package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jal {
    public aqwe a;

    public jal(aqwe aqweVar) {
        c(aqweVar);
    }

    public final avzv a() {
        aqwf aqwfVar = this.a.h;
        if (aqwfVar == null) {
            aqwfVar = aqwf.a;
        }
        avzv avzvVar = aqwfVar.e;
        return avzvVar == null ? avzv.a : avzvVar;
    }

    public final void b(avzv avzvVar) {
        aong aongVar = (aong) this.a.toBuilder();
        aqwf aqwfVar = this.a.h;
        if (aqwfVar == null) {
            aqwfVar = aqwf.a;
        }
        aone builder = aqwfVar.toBuilder();
        builder.copyOnWrite();
        aqwf aqwfVar2 = (aqwf) builder.instance;
        avzvVar.getClass();
        aqwfVar2.e = avzvVar;
        aqwfVar2.b |= 64;
        aongVar.copyOnWrite();
        aqwe aqweVar = (aqwe) aongVar.instance;
        aqwf aqwfVar3 = (aqwf) builder.build();
        aqwfVar3.getClass();
        aqweVar.h = aqwfVar3;
        aqweVar.b |= 128;
        this.a = (aqwe) aongVar.build();
    }

    public final void c(aqwe aqweVar) {
        this.a = aqweVar;
        aqwf aqwfVar = aqweVar.h;
        if (aqwfVar == null) {
            aqwfVar = aqwf.a;
        }
        amkq.N((aqwfVar.b & 64) != 0);
    }

    public final byte[] d() {
        return a().E.I();
    }

    public final int e() {
        avzw avzwVar = a().y;
        if (avzwVar == null) {
            avzwVar = avzw.a;
        }
        int W = awxr.W(avzwVar.b);
        if (W == 0) {
            return 1;
        }
        return W;
    }
}
