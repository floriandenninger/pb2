package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kbe implements kbj {
    private final jti a;
    private final aahv b;
    private final ammv c;

    public kbe(jti jtiVar, aahv aahvVar, ammv ammvVar) {
        this.a = jtiVar;
        this.b = aahvVar;
        this.c = ammvVar;
    }

    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        if (mcy.ag(this.c, this.b.c())) {
            aone createBuilder = askg.a.createBuilder();
            avnb avnbVar = (avnb) this.a.g(Void.class, avnb.class, null, amrz.k("is_travel_message", true));
            avnbVar.getClass();
            createBuilder.copyOnWrite();
            askg askgVar = (askg) createBuilder.instance;
            avnbVar.getClass();
            askgVar.ah = avnbVar;
            askgVar.f |= 4096;
            return amru.r(new kbh((askg) createBuilder.build()));
        }
        return amru.q();
    }
}
