package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kam implements kbj {
    private final jti a;
    private final ammv b;
    private final /* synthetic */ int c;

    public kam(jti jtiVar, ammv ammvVar, int i) {
        this.c = i;
        this.a = jtiVar;
        this.b = ammvVar;
    }

    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        int i = this.c;
        if (i == 0) {
            if (!this.b.h()) {
                return amru.q();
            }
            aone createBuilder = askg.a.createBuilder();
            aqrf aqrfVar = (aqrf) this.a.g(asxd.class, aqrf.class, (asxd) this.b.c(), null);
            aqrfVar.getClass();
            createBuilder.copyOnWrite();
            askg askgVar = (askg) createBuilder.instance;
            aqrfVar.getClass();
            askgVar.av = aqrfVar;
            askgVar.h = 1048576 | askgVar.h;
            return amru.r(new kbh((askg) createBuilder.build()));
        }
        if (i == 1) {
            if (this.b.h()) {
                aone createBuilder2 = askg.a.createBuilder();
                aqrf b = this.a.b((awig) this.b.c());
                b.getClass();
                createBuilder2.copyOnWrite();
                askg askgVar2 = (askg) createBuilder2.instance;
                b.getClass();
                askgVar2.av = b;
                askgVar2.h = 1048576 | askgVar2.h;
                return amru.r(new kbm((askg) createBuilder2.build(), ((awig) this.b.c()).getAddedTimestampMillis().longValue()));
            }
            return amru.q();
        }
        if (i != 2) {
            if (this.b.h()) {
                aone createBuilder3 = askg.a.createBuilder();
                aqrf c = this.a.c((awil) this.b.c());
                c.getClass();
                createBuilder3.copyOnWrite();
                askg askgVar3 = (askg) createBuilder3.instance;
                c.getClass();
                askgVar3.av = c;
                askgVar3.h = 1048576 | askgVar3.h;
                return amru.r(new kbh((askg) createBuilder3.build()));
            }
            return amru.q();
        }
        if (this.b.h()) {
            aone createBuilder4 = askg.a.createBuilder();
            aqrf b2 = this.a.b((awig) this.b.c());
            b2.getClass();
            createBuilder4.copyOnWrite();
            askg askgVar4 = (askg) createBuilder4.instance;
            b2.getClass();
            askgVar4.av = b2;
            askgVar4.h = 1048576 | askgVar4.h;
            return amru.r(new kbh((askg) createBuilder4.build()));
        }
        return amru.q();
    }
}
