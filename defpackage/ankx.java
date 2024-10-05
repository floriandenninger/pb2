package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ankx extends anju {
    public ankx() {
        super(annb.class, new ankv(anjh.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ anjr i(int i, int i2) {
        aone createBuilder = annc.a.createBuilder();
        createBuilder.copyOnWrite();
        ((annc) createBuilder.instance).c = i;
        aone createBuilder2 = annd.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((annd) createBuilder2.instance).b = 16;
        annd anndVar = (annd) createBuilder2.build();
        createBuilder.copyOnWrite();
        annc anncVar = (annc) createBuilder.instance;
        anndVar.getClass();
        anncVar.b = anndVar;
        return new anjr((annc) createBuilder.build(), i2);
    }

    @Override // defpackage.anju
    public final anjs a() {
        return new ankw(annc.class);
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (annb) aonm.parseFrom(annb.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        annb annbVar = (annb) aooyVar;
        anrp.d(annbVar.b);
        anrp.a(annbVar.d.d());
        annd anndVar = annbVar.c;
        if (anndVar == null) {
            anndVar = annd.a;
        }
        if (anndVar.b != 12) {
            annd anndVar2 = annbVar.c;
            if (anndVar2 == null) {
                anndVar2 = annd.a;
            }
            if (anndVar2.b != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    @Override // defpackage.anju
    public final int h() {
        return 3;
    }
}
