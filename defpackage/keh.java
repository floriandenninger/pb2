package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class keh implements abdr {
    private final keg a;

    public keh(keg kegVar) {
        this.a = kegVar;
    }

    @Override // defpackage.abdr
    public final void no(abdu abduVar) {
        awwk awwkVar = (awwk) this.a.a.c();
        int i = 4;
        if ((awwkVar.b & 4) == 0) {
            i = 2;
        } else if (true == awwkVar.e) {
            i = 3;
        }
        abduVar.F = i;
    }
}
