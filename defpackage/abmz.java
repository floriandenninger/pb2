package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abmz implements ajvb {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final ajos f = new ajnq();

    public abmz(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
    }

    private static void b(ajos ajosVar, Class cls, azrw azrwVar) {
        ajosVar.f(cls, new ajou(azrwVar));
    }

    @Override // defpackage.ajvb
    public final void a(Class cls) {
        if (asra.class.isAssignableFrom(cls)) {
            b(this.f, asqj.class, this.a);
            b(this.f, aspm.class, this.b);
            b(this.f, aspn.class, this.c);
            b(this.f, asqk.class, this.d);
            b(this.f, ajds.class, this.e);
        }
    }

    @Override // defpackage.amnv
    public final /* synthetic */ Object get() {
        return this.f;
    }
}
