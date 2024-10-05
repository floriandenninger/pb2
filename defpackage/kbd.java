package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kbd implements kbj {
    private final jti a;
    private final shf b;
    private final aahv c;
    private final ammv d;

    public kbd(jti jtiVar, shf shfVar, aahv aahvVar, ammv ammvVar) {
        this.a = jtiVar;
        this.b = shfVar;
        this.c = aahvVar;
        this.d = ammvVar;
    }

    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        long W = mcy.W(this.d, this.b, this.c.c());
        if (W < 2147483647L) {
            aone createBuilder = askg.a.createBuilder();
            avnb avnbVar = (avnb) this.a.g(Void.class, avnb.class, null, amrz.l("is_texit_message", true, "unplayable_in_secs", Integer.valueOf((int) W)));
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
