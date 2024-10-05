package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bko implements bkm {
    private final pth a;
    private final int b;
    private final int c;
    private int d;
    private int e;

    public bko(bkj bkjVar) {
        pth pthVar = bkjVar.a;
        this.a = pthVar;
        pthVar.G(12);
        this.c = pthVar.l() & PrivateKeyType.INVALID;
        this.b = pthVar.l();
    }

    @Override // defpackage.bkm
    public final int a() {
        return -1;
    }

    @Override // defpackage.bkm
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bkm
    public final int c() {
        int i = this.c;
        if (i == 8) {
            return this.a.i();
        }
        if (i == 16) {
            return this.a.m();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int i3 = this.a.i();
        this.e = i3;
        return (i3 & 240) >> 4;
    }
}
