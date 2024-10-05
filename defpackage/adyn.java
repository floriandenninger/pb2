package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adyn implements bfe {
    private final adyl a;
    private final bfe b;
    private ath c;
    private final boolean d;

    public adyn(byte[] bArr, bfe bfeVar, byte[] bArr2, adyl adylVar, boolean z) {
        this.b = new bgl(bArr, bfeVar, bArr2);
        this.a = adylVar;
        this.d = z;
    }

    @Override // defpackage.bfe
    public final void a() {
        this.b.a();
    }

    @Override // defpackage.bfe
    public final void b(ath athVar) {
        this.b.b(athVar);
        this.c = athVar;
    }

    @Override // defpackage.bfe
    public final void c(byte[] bArr, int i, int i2) {
        this.b.c(bArr, i, i2);
        String str = this.c.i;
        if (str != null) {
            adyl adylVar = this.a;
            if (this.d) {
                adyl.j(adylVar.f, str);
            } else {
                adyl.j(adylVar.e, str);
            }
        }
    }
}
