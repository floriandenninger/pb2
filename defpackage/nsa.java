package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nsa {
    private final nwr a;

    public nsa(nqp nqpVar) {
        this.a = nqpVar.h().a;
    }

    public final zcg a(nqg nqgVar) {
        aqts l = nqgVar.l();
        if (l == null || (l.c & 64) == 0) {
            return this.a.b(nqgVar);
        }
        aqtp aqtpVar = l.i;
        if (aqtpVar == null) {
            aqtpVar = aqtp.a;
        }
        int bi = aocz.bi(aqtpVar.c);
        if (bi == 0) {
            bi = 1;
        }
        if (bi - 1 != 2) {
            return this.a.b(nqgVar);
        }
        return new nwq(this.a, true, nqgVar);
    }
}
