package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aahr implements sxd {
    private final aahv a;
    private final azrw b;

    public aahr(azrw azrwVar, aahv aahvVar) {
        this.a = aahvVar;
        this.b = azrwVar;
    }

    public static final ayph f(boolean z, aalc aalcVar) {
        if (z) {
            return aalcVar.b();
        }
        return aalcVar.c();
    }

    private final aakv g() {
        return this.a.c();
    }

    @Override // defpackage.sxd
    public final aypy a(String str) {
        return g().i(str).Y(zcz.l);
    }

    @Override // defpackage.sxd
    public final /* synthetic */ void b(String str, byte[] bArr) {
        c(str, bArr, true);
    }

    @Override // defpackage.sxd
    public final void c(final String str, final byte[] bArr, final boolean z) {
        final aakv g = g();
        g.f(str).t(new ayrv() { // from class: aaho
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                aahr aahrVar = aahr.this;
                String str2 = str;
                boolean z2 = z;
                aakv aakvVar = g;
                byte[] bArr2 = bArr;
                aakt aaktVar = (aakt) obj;
                if (aaktVar instanceof aala) {
                    aalb aalbVar = (aalb) aaktVar.getType();
                    aaio c = ((aaih) aakvVar).c();
                    c.k(aalbVar.b(bArr2));
                    return aahr.f(z2, c).L();
                }
                return aahrVar.e(str2, bArr2, z2);
            }
        }, new ayrv() { // from class: aahp
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                return aahr.this.e(str, bArr, z);
            }
        }, new Callable() { // from class: aahq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aahr.this.e(str, bArr, z);
            }
        }).V(zxi.d, new zxi(3));
    }

    @Override // defpackage.sxd
    public final void d(String str) {
        aaio c = ((aaih) g()).c();
        c.g(str);
        c.b();
    }

    public final ayps e(String str, byte[] bArr, boolean z) {
        aaio c = ((aaih) g()).c();
        c.k(((aalu) this.b.get()).c(str, bArr));
        return f(z, c).L();
    }
}
