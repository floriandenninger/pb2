package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kbg implements kbj {
    private final jti a;
    private final fjs b;

    public kbg(jti jtiVar, fjs fjsVar) {
        this.a = jtiVar;
        this.b = fjsVar;
    }

    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        aqnf b;
        aqmz aqmzVar;
        if (!juaVar.b.h()) {
            b = aqnf.b(((aqng) juaVar.c.instance).c);
            if (b == null) {
                b = aqnf.FILTER_TYPE_UNSPECIFIED;
            }
        } else {
            aqnd aqndVar = (aqnd) juaVar.b.c();
            if (aqndVar.b == 2) {
                aqmzVar = (aqmz) aqndVar.c;
            } else {
                aqmzVar = aqmz.a;
            }
            b = aqnf.b(aqmzVar.d);
            if (b == null) {
                b = aqnf.FILTER_TYPE_UNSPECIFIED;
            }
        }
        aone createBuilder = askg.a.createBuilder();
        apib a = this.a.a(this.b, b);
        a.getClass();
        createBuilder.copyOnWrite();
        askg askgVar = (askg) createBuilder.instance;
        a.getClass();
        askgVar.ag = a;
        askgVar.f |= 512;
        return amru.r(new kbh((askg) createBuilder.build()));
    }
}
