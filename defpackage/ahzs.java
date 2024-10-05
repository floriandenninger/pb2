package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahzs extends aaps implements aioa {
    private final axpg c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahzs(axpg axpgVar, axpg axpgVar2, int i, byte[] bArr) {
        super(axpgVar);
        this.d = i;
        this.c = axpgVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahzs(axpg axpgVar, axpg axpgVar2, int i) {
        super(axpgVar);
        this.d = i;
        this.c = axpgVar2;
    }

    @Override // defpackage.aaps
    public final /* synthetic */ boolean d(Object obj) {
        if (this.d != 0) {
            return ((inl) this.c.get()).b((apxf) obj) != null;
        }
        atxo b = ((aiaq) this.c.get()).b((apxf) obj);
        return (b == null || b.c) ? false : true;
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        if (this.d == 0) {
            return new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 33554432L)).h(ahbw.e(1)).Y(new ayrs() { // from class: ahzr
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    ahzs ahzsVar = ahzs.this;
                    if (((ahef) obj).c() == aign.NEW) {
                        ahzsVar.c();
                    }
                }
            }, ahwx.l)};
        }
        final byte[] bArr = null;
        return new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 33554432L)).h(ahbw.e(1)).Y(new ayrs(bArr) { // from class: ink
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ahzs ahzsVar = ahzs.this;
                if (((ahef) obj).c() == aign.NEW) {
                    ahzsVar.c();
                }
            }
        }, izw.b)};
    }
}
