package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anks extends anjt {
    public anks(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        anmy anmyVar = (anmy) obj;
        byte[] I = anmyVar.d.I();
        anna annaVar = anmyVar.c;
        if (annaVar == null) {
            annaVar = anna.a;
        }
        return new anpy(I, annaVar.b);
    }
}
