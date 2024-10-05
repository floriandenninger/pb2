package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahzf implements aioa, ypd {
    final /* synthetic */ ahzg a;

    public ahzf(ahzg ahzgVar) {
        this.a = ahzgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ahcx ahcxVar) {
        this.a.c.d(ahcxVar.c() == aigf.FULLSCREEN);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ahef ahefVar) {
        aign aignVar = aign.NEW;
        int ordinal = ahefVar.c().ordinal();
        if (ordinal == 0) {
            ahzg ahzgVar = this.a;
            ahzgVar.f = false;
            ahzgVar.g = false;
            ahzgVar.c.a(false);
            return;
        }
        if (ordinal != 8) {
            return;
        }
        ahzg ahzgVar2 = this.a;
        if (ahzgVar2.g) {
            return;
        }
        ahzgVar2.a(ahefVar.b().a);
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 0;
        return new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 8388608L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahze
            public final /* synthetic */ ahzf a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 != 0) {
                    this.a.a((ahcx) obj);
                } else {
                    this.a.b((ahef) obj);
                }
            }
        }, ahwx.i), aiocVar.t().b.h(ahbw.g(aiocVar.aC(), 8388608L)).h(ahbw.e(0)).Y(new ayrs(this) { // from class: ahze
            public final /* synthetic */ ahzf a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i != 0) {
                    this.a.a((ahcx) obj);
                } else {
                    this.a.b((ahef) obj);
                }
            }
        }, ahwx.i)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahcx.class, ahef.class};
        }
        if (i == 0) {
            a((ahcx) obj);
            return null;
        }
        if (i == 1) {
            b((ahef) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
