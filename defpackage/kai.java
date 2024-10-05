package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kai implements kbj {
    private final jti a;
    private final aaea b;
    private final ysy c;
    private final fjs d;

    public kai(jti jtiVar, aaea aaeaVar, ysy ysyVar, fjs fjsVar) {
        this.a = jtiVar;
        this.b = aaeaVar;
        this.c = ysyVar;
        this.d = fjsVar;
    }

    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        boolean a = yjk.a(this.b);
        if (!this.d.e() || !a || !this.c.p()) {
            return amru.q();
        }
        aone createBuilder = askg.a.createBuilder();
        aqcm aqcmVar = (aqcm) this.a.g(Void.class, aqcm.class, null, null);
        aqcmVar.getClass();
        createBuilder.copyOnWrite();
        askg askgVar = (askg) createBuilder.instance;
        aqcmVar.getClass();
        askgVar.ae = aqcmVar;
        askgVar.e |= 16;
        return amru.r(new kbh((askg) createBuilder.build()));
    }
}
