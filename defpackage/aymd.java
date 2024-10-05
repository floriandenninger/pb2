package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aymd extends ayff {
    int a;
    final int b;
    final byte[] c;
    int d = -1;

    public aymd(byte[] bArr, int i, int i2) {
        amkq.F(i >= 0, "offset must be >= 0");
        amkq.F(i2 >= 0, "length must be >= 0");
        int i3 = i2 + i;
        amkq.F(i3 <= 0, "offset + length exceeds array boundary");
        this.c = bArr;
        this.a = i;
        this.b = i3;
    }

    @Override // defpackage.ayff, defpackage.aymb
    public final void b() {
        this.d = this.a;
    }

    @Override // defpackage.ayff, defpackage.aymb
    public final void c() {
        int i = this.d;
        if (i == -1) {
            throw new InvalidMarkException();
        }
        this.a = i;
    }

    @Override // defpackage.ayff, defpackage.aymb
    public final boolean d() {
        return true;
    }

    @Override // defpackage.aymb
    public final int e() {
        a(1);
        byte[] bArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return bArr[i] & 255;
    }

    @Override // defpackage.aymb
    public final int f() {
        return this.b - this.a;
    }

    @Override // defpackage.aymb
    public final /* bridge */ /* synthetic */ aymb g(int i) {
        a(i);
        int i2 = this.a;
        this.a = i2 + i;
        return new aymd(this.c, i2, i);
    }

    @Override // defpackage.aymb
    public final void i(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        a(remaining);
        byteBuffer.put(this.c, this.a, remaining);
        this.a += remaining;
    }

    @Override // defpackage.aymb
    public final void j(OutputStream outputStream, int i) {
        a(i);
        outputStream.write(this.c, this.a, i);
        this.a += i;
    }

    @Override // defpackage.aymb
    public final void k(byte[] bArr, int i, int i2) {
        System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    @Override // defpackage.aymb
    public final void l(int i) {
        a(i);
        this.a += i;
    }
}
