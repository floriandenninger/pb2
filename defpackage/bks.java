package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bks {
    public final bjc a;
    public bla d;
    public bkq e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public final bkz b = new bkz();
    public final pth c = new pth();
    private final pth k = new pth(1);
    private final pth l = new pth();

    public bks(bjc bjcVar, bla blaVar, bkq bkqVar) {
        this.a = bjcVar;
        this.d = blaVar;
        this.e = bkqVar;
        c(blaVar, bkqVar);
    }

    public final int a(int i, int i2) {
        pth pthVar;
        pjr f = f();
        if (f == null) {
            return 0;
        }
        int i3 = f.d;
        if (i3 != 0) {
            pthVar = this.b.n;
        } else {
            byte[] bArr = (byte[]) pts.C(f.e);
            pth pthVar2 = this.l;
            int length = bArr.length;
            pthVar2.E(bArr, length);
            pthVar = this.l;
            i3 = length;
        }
        boolean c = this.b.c(this.f);
        boolean z = c || i2 != 0;
        pth pthVar3 = this.k;
        pthVar3.a[0] = (byte) ((true != z ? 0 : 128) | i3);
        pthVar3.G(0);
        this.a.u(this.k, 1, 1);
        this.a.u(pthVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!c) {
            this.c.C(8);
            pth pthVar4 = this.c;
            byte[] bArr2 = pthVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i2;
            bArr2[4] = (byte) ((i >> 24) & PrivateKeyType.INVALID);
            bArr2[5] = (byte) ((i >> 16) & PrivateKeyType.INVALID);
            bArr2[6] = (byte) ((i >> 8) & PrivateKeyType.INVALID);
            bArr2[7] = (byte) (i & PrivateKeyType.INVALID);
            this.a.u(pthVar4, 8, 1);
            return i3 + 9;
        }
        pth pthVar5 = this.b.n;
        int m = pthVar5.m();
        pthVar5.H(-2);
        int i4 = (m * 6) + 2;
        if (i2 != 0) {
            this.c.C(i4);
            byte[] bArr3 = this.c.a;
            pthVar5.B(bArr3, 0, i4);
            int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & PrivateKeyType.INVALID);
            bArr3[3] = (byte) (i5 & PrivateKeyType.INVALID);
            pthVar5 = this.c;
        }
        this.a.u(pthVar5, i4, 1);
        return i3 + 1 + i4;
    }

    public final long b() {
        return !this.j ? this.d.b[this.f] : this.b.f[this.h];
    }

    public final void c(bla blaVar, bkq bkqVar) {
        this.d = blaVar;
        this.e = bkqVar;
        this.a.rp(blaVar.h.f);
        d();
    }

    public final void d() {
        bkz bkzVar = this.b;
        bkzVar.d = 0;
        bkzVar.p = 0L;
        bkzVar.q = false;
        bkzVar.l = false;
        bkzVar.o = false;
        bkzVar.r = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.j = false;
    }

    public final boolean e() {
        this.f++;
        if (!this.j) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final pjr f() {
        if (!this.j) {
            return null;
        }
        bkz bkzVar = this.b;
        bkq bkqVar = bkzVar.a;
        int i = pts.a;
        int i2 = bkqVar.a;
        pjr pjrVar = bkzVar.r;
        if (pjrVar == null) {
            pjrVar = this.d.h.b(i2);
        }
        if (pjrVar == null || !pjrVar.a) {
            return null;
        }
        return pjrVar;
    }
}
