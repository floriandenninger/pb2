package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anla extends anju {
    public anla() {
        super(anne.class, new anky(anjh.class));
    }

    public static anjr i(int i, int i2) {
        aone createBuilder = annf.a.createBuilder();
        createBuilder.copyOnWrite();
        ((annf) createBuilder.instance).b = i;
        return new anjr((annf) createBuilder.build(), i2);
    }

    @Override // defpackage.anju
    public final anjs a() {
        return new ankz(annf.class);
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (anne) aonm.parseFrom(anne.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        anne anneVar = (anne) aooyVar;
        anrp.d(anneVar.b);
        anrp.a(anneVar.c.d());
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
