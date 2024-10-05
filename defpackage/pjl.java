package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pjl {
    public final bjc a;
    public pjq d;
    public pjk e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final pjs b = new pjs();
    public final pth c = new pth();
    private final pth j = new pth(1);
    private final pth k = new pth();

    public pjl(bjc bjcVar) {
        this.a = bjcVar;
    }

    public final int a(int i, int i2) {
        pth pthVar;
        pjr b = b();
        if (b == null) {
            return 0;
        }
        int i3 = b.d;
        if (i3 != 0) {
            pthVar = this.b.p;
        } else {
            byte[] bArr = b.e;
            pth pthVar2 = this.k;
            int length = bArr.length;
            pthVar2.E(bArr, length);
            pthVar = this.k;
            i3 = length;
        }
        boolean c = this.b.c(this.f);
        boolean z = c || i2 != 0;
        pth pthVar3 = this.j;
        pthVar3.a[0] = (byte) ((true != z ? 0 : 128) | i3);
        pthVar3.G(0);
        this.a.t(this.j, 1);
        this.a.t(pthVar, i3);
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
            this.a.t(pthVar4, 8);
            return i3 + 9;
        }
        pth pthVar5 = this.b.p;
        int m = pthVar5.m();
        pthVar5.H(-2);
        int i4 = (m * 6) + 2;
        if (i2 != 0) {
            this.c.C(i4);
            this.c.B(pthVar5.a, 0, i4);
            pthVar5.H(i4);
            pthVar5 = this.c;
            byte[] bArr3 = pthVar5.a;
            int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & PrivateKeyType.INVALID);
            bArr3[3] = (byte) (i5 & PrivateKeyType.INVALID);
        }
        this.a.t(pthVar5, i4);
        return i3 + 1 + i4;
    }

    public final pjr b() {
        pjs pjsVar = this.b;
        int i = pjsVar.a.a;
        pjr pjrVar = pjsVar.o;
        if (pjrVar == null) {
            pjrVar = this.d.a(i);
        }
        if (pjrVar == null || !pjrVar.a) {
            return null;
        }
        return pjrVar;
    }

    public final void c(pjq pjqVar, pjk pjkVar) {
        pse.c(pjqVar);
        this.d = pjqVar;
        pse.c(pjkVar);
        this.e = pjkVar;
        this.a.rp(pjqVar.f);
        d();
    }

    public final void d() {
        pjs pjsVar = this.b;
        pjsVar.d = 0;
        pjsVar.r = 0L;
        pjsVar.m = false;
        pjsVar.q = false;
        pjsVar.o = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
    }

    public final boolean e() {
        this.f++;
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
}
