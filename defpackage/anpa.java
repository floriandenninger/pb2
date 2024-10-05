package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anpa extends ankd {
    public anpa() {
        super(anno.class, new anoy(anke.class));
    }

    public static anjr i(int i, int i2, int i3, int i4) {
        aone createBuilder = annn.a.createBuilder();
        createBuilder.copyOnWrite();
        ((annn) createBuilder.instance).b = aobq.U(i);
        createBuilder.copyOnWrite();
        ((annn) createBuilder.instance).c = aobq.W(i2);
        createBuilder.copyOnWrite();
        ((annn) createBuilder.instance).d = i3 - 2;
        annn annnVar = (annn) createBuilder.build();
        aone createBuilder2 = annm.a.createBuilder();
        createBuilder2.copyOnWrite();
        annm annmVar = (annm) createBuilder2.instance;
        annnVar.getClass();
        annmVar.b = annnVar;
        return new anjr((annm) createBuilder2.build(), i4);
    }

    @Override // defpackage.anju
    public final anjs a() {
        return new anoz(annm.class);
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (anno) aonm.parseFrom(anno.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        anno annoVar = (anno) aooyVar;
        anrp.d(annoVar.b);
        annp annpVar = annoVar.c;
        if (annpVar == null) {
            annpVar = annp.a;
        }
        annn annnVar = annpVar.c;
        if (annnVar == null) {
            annnVar = annn.a;
        }
        aocz.aA(annnVar);
    }

    @Override // defpackage.anju
    public final int g() {
        return 2;
    }

    @Override // defpackage.anju
    public final int h() {
        return 4;
    }
}
