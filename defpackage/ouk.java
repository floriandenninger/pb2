package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ouk implements azrw {
    private final azrw a;
    private final /* synthetic */ int b;

    private ouk(azrw azrwVar, int i, byte[] bArr) {
        this.b = i;
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public static azrw a(azrw azrwVar) {
        return new ouk(azrwVar, 0);
    }

    public static azrw b(azrw azrwVar) {
        return new ouk(azrwVar, 1, null);
    }

    private ouk(azrw azrwVar, int i) {
        this.b = i;
        azrwVar.getClass();
        this.a = azrwVar;
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        return this.b != 0 ? ammv.j(this.a.get()) : ammv.j(this.a.get());
    }
}
