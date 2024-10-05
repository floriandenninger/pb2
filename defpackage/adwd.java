package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adwd implements axqr {
    private final azrw a;
    private final azrw b;
    private final /* synthetic */ int c;

    public adwd(azrw azrwVar, azrw azrwVar2, int i) {
        this.c = i;
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public adwd(azrw azrwVar, azrw azrwVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public static adwd a(azrw azrwVar, azrw azrwVar2) {
        return new adwd(azrwVar, azrwVar2, 0);
    }

    public static afhf c(aaoz aaozVar, afix afixVar) {
        return afiy.a(afixVar, aaozVar, advx.c, false, 2);
    }

    public static afhf d(afix afixVar, aaoz aaozVar) {
        return afiy.a(afixVar, aaozVar, advx.a, true, 2);
    }

    public static adwd e(azrw azrwVar, azrw azrwVar2) {
        return new adwd(azrwVar, azrwVar2, 1, null);
    }

    public final afhf b() {
        return this.c != 0 ? d((afix) this.b.get(), (aaoz) this.a.get()) : c((aaoz) this.a.get(), (afix) this.b.get());
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        return this.c != 0 ? b() : b();
    }
}
