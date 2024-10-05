package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jzz implements kbj {
    private final jti a;
    private final ammv b;
    private final fiu c;

    public jzz(jti jtiVar, fiu fiuVar, ammv ammvVar) {
        this.a = jtiVar;
        this.c = fiuVar;
        this.b = ammvVar;
    }

    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        if (this.b.h()) {
            awil awilVar = (awil) this.b.c();
            if (!((Boolean) this.c.b().G(new fjx(aalt.g(awilVar.d()), 6)).X()).booleanValue()) {
                aone createBuilder = askg.a.createBuilder();
                aqrf c = this.a.c(awilVar);
                c.getClass();
                createBuilder.copyOnWrite();
                askg askgVar = (askg) createBuilder.instance;
                c.getClass();
                askgVar.av = c;
                askgVar.h |= 1048576;
                return amru.r(new kbm((askg) createBuilder.build(), ((awil) this.b.c()).getAddedTimestampMillis().longValue()));
            }
        }
        return amru.q();
    }
}
