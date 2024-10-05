package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczz {
    private final akpe a;

    static {
        zga.a("HandoffRequester");
    }

    public aczz(akpe akpeVar, byte[] bArr, byte[] bArr2) {
        this.a = akpeVar;
    }

    public final anhy a(ardq ardqVar) {
        aone createBuilder = arsv.a.createBuilder();
        createBuilder.copyOnWrite();
        arsv arsvVar = (arsv) createBuilder.instance;
        ardqVar.getClass();
        arsvVar.d = ardqVar;
        arsvVar.b |= 2;
        akpe akpeVar = this.a;
        return akpeVar.c.b(new aazs(akpeVar.f, akpeVar.a.c(), createBuilder, null, null, null), akpeVar.b);
    }
}
