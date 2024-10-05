package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jbm implements ajvb {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final ajos d = new ajnq();

    public jbm(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    private static void b(ajos ajosVar, Class cls, azrw azrwVar) {
        ajosVar.f(cls, new ajou(azrwVar));
    }

    @Override // defpackage.ajvb
    public final void a(Class cls) {
        if (aspz.class.isAssignableFrom(cls)) {
            b(this.d, aspz.class, this.a);
        }
        if (asow.class.isAssignableFrom(cls)) {
            b(this.d, asow.class, this.b);
        }
        if (asqv.class.isAssignableFrom(cls)) {
            b(this.d, asqv.class, this.c);
        }
    }

    @Override // defpackage.amnv
    public final /* synthetic */ Object get() {
        return this.d;
    }
}
