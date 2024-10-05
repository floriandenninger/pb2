package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bade {
    public final byte[] a;
    public int b;
    public int c;
    boolean d;
    final boolean e;
    public bade f;
    public bade g;

    public bade() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public bade(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = true;
        this.e = false;
    }

    public final bade a() {
        bade badeVar = this.f;
        bade badeVar2 = badeVar != this ? badeVar : null;
        bade badeVar3 = this.g;
        badeVar3.f = badeVar;
        this.f.g = badeVar3;
        this.f = null;
        this.g = null;
        return badeVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bade b() {
        this.d = true;
        return new bade(this.a, this.b, this.c);
    }

    public final void c(bade badeVar, int i) {
        if (!badeVar.e) {
            throw new IllegalArgumentException();
        }
        int i2 = badeVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (badeVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = badeVar.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = badeVar.a;
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            i2 = badeVar.c - badeVar.b;
            badeVar.c = i2;
            badeVar.b = 0;
        }
        System.arraycopy(this.a, this.b, badeVar.a, i2, i);
        badeVar.c += i;
        this.b += i;
    }

    public final void d(bade badeVar) {
        badeVar.g = this;
        badeVar.f = this.f;
        this.f.g = badeVar;
        this.f = badeVar;
    }
}
