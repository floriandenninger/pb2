package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anmo extends anju {
    public anmo() {
        super(annz.class, new anmm(anjy.class));
    }

    public static void i(anob anobVar) {
        if (anobVar.c < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int V = aobq.V(anobVar.b);
        if (V == 0) {
            V = 1;
        }
        int i = V - 2;
        if (i == 1) {
            if (anobVar.c > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i == 2) {
            if (anobVar.c > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i == 3) {
            if (anobVar.c > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 4) {
            if (anobVar.c > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i == 5) {
                if (anobVar.c > 28) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            }
            throw new GeneralSecurityException("unknown hash type");
        }
    }

    public static final void j(annz annzVar) {
        anrp.d(annzVar.b);
        if (annzVar.d.d() >= 16) {
            anob anobVar = annzVar.c;
            if (anobVar == null) {
                anobVar = anob.a;
            }
            i(anobVar);
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public static anjr k(int i, int i2, int i3, int i4) {
        aone createBuilder = anoa.a.createBuilder();
        aone createBuilder2 = anob.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((anob) createBuilder2.instance).b = aobq.U(i3);
        createBuilder2.copyOnWrite();
        ((anob) createBuilder2.instance).c = i2;
        anob anobVar = (anob) createBuilder2.build();
        createBuilder.copyOnWrite();
        anoa anoaVar = (anoa) createBuilder.instance;
        anobVar.getClass();
        anoaVar.b = anobVar;
        createBuilder.copyOnWrite();
        ((anoa) createBuilder.instance).c = i;
        return new anjr((anoa) createBuilder.build(), i4);
    }

    @Override // defpackage.anju
    public final anjs a() {
        return new anmn(anoa.class);
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (annz) aonm.parseFrom(annz.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        j((annz) aooyVar);
    }

    @Override // defpackage.anju
    public final int g() {
        return 2;
    }

    @Override // defpackage.anju
    public final int h() {
        return 3;
    }
}
