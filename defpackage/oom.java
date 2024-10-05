package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oom implements Closeable, yfi, ypd {
    public final ml a;
    private final azrw b;
    private final aoae c;

    public oom(ml mlVar, aoae aoaeVar, azrw azrwVar, byte[] bArr, byte[] bArr2) {
        this.a = mlVar;
        this.c = aoaeVar;
        this.b = azrwVar;
    }

    public final void a() {
        this.c.o(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.p(this);
    }

    @Override // defpackage.yfi
    public final void g() {
    }

    @Override // defpackage.yfi
    public final void h() {
        ((afso) this.b.get()).a();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{yjq.class};
        }
        if (i == 0) {
            this.a.onBackPressed();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.yfi
    public final void mJ(asfw asfwVar) {
        ((afso) this.b.get()).a();
    }
}
