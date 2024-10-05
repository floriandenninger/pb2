package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajzd implements ajvb {
    private final azrw a;
    private final azrw b;
    private final ajos c = new ajnq();
    private final /* synthetic */ int d;

    public ajzd(azrw azrwVar, azrw azrwVar2, int i, byte[] bArr) {
        this.d = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    private static void b(ajos ajosVar, Class cls, azrw azrwVar) {
        ajosVar.f(cls, new ajou(azrwVar));
    }

    @Override // defpackage.amnv
    public final /* synthetic */ Object get() {
        return this.d != 0 ? this.c : this.c;
    }

    public ajzd(azrw azrwVar, azrw azrwVar2, int i) {
        this.d = i;
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    @Override // defpackage.ajvb
    public final void a(Class cls) {
        if (this.d != 0) {
            if (asra.class.isAssignableFrom(cls)) {
                b(this.c, asps.class, this.b);
                b(this.c, ajds.class, this.a);
                return;
            }
            return;
        }
        if (ajyv.class.isAssignableFrom(cls)) {
            this.c.f(aqst.class, new ajou(this.a));
            this.c.f(aqsw.class, new ajou(this.b));
        }
    }
}
