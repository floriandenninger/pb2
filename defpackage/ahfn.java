package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahfn implements aioa, ypd {
    private atxd a = null;
    private aixm b = aixs.a;
    private final ajoy c;

    public ahfn(ajoy ajoyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = ajoyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ahef ahefVar) {
        atxd atxdVar;
        if (ahefVar.c().h()) {
            return;
        }
        if (ahefVar.b() == null || ahefVar.b().c() == null) {
            atxdVar = null;
        } else {
            atxdVar = ahefVar.b().c().c.h;
            if (atxdVar == null) {
                atxdVar = atxd.a;
            }
        }
        aixm d = ahefVar.d() != null ? ahefVar.d().d() : null;
        if (d == null) {
            d = aixs.a;
        }
        if (amkq.b(this.a, atxdVar) && amkq.b(this.b, d)) {
            return;
        }
        this.a = atxdVar;
        this.b.j(ahfl.class);
        this.b = d;
        atxd atxdVar2 = this.a;
        if (atxdVar2 != null) {
            if (atxdVar2.b == 0.0f) {
                return;
            }
            ainy ainyVar = (ainy) this.c.a.get();
            ainyVar.getClass();
            d.c(new ahfl(r6 * 1000.0f, ainyVar));
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 8L)).h(ahbw.e(1)).Y(new ayrs() { // from class: ahfm
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ahfn.this.a((ahef) obj);
            }
        }, ahfo.a)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahef.class};
        }
        if (i == 0) {
            a((ahef) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
