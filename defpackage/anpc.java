package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anpc extends anju {
    public anpc() {
        super(annp.class, new anpb(ankf.class));
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ aooy b(aomf aomfVar) {
        return (annp) aonm.parseFrom(annp.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anju
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPublicKey";
    }

    @Override // defpackage.anju
    public final /* bridge */ /* synthetic */ void f(aooy aooyVar) {
        annp annpVar = (annp) aooyVar;
        anrp.d(annpVar.b);
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
        return 5;
    }
}
