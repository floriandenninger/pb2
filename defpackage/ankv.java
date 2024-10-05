package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ankv extends anjt {
    public ankv(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        annb annbVar = (annb) obj;
        byte[] I = annbVar.d.I();
        annd anndVar = annbVar.c;
        if (anndVar == null) {
            anndVar = annd.a;
        }
        return new anqb(I, anndVar.b);
    }
}
