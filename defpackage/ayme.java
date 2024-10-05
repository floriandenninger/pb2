package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayme extends ayff {
    final ByteBuffer a;

    public ayme(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    @Override // defpackage.ayff, defpackage.aymb
    public final void b() {
    }

    @Override // defpackage.ayff, defpackage.aymb
    public final void c() {
    }

    @Override // defpackage.ayff, defpackage.aymb
    public final boolean d() {
        return true;
    }

    @Override // defpackage.aymb
    public final int e() {
        a(1);
        return this.a.get() & 255;
    }

    @Override // defpackage.aymb
    public final int f() {
        return this.a.remaining();
    }

    @Override // defpackage.aymb
    public final /* bridge */ /* synthetic */ aymb g(int i) {
        a(i);
        ByteBuffer duplicate = this.a.duplicate();
        duplicate.limit(this.a.position() + i);
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + i);
        return new ayme(duplicate);
    }

    @Override // defpackage.aymb
    public final void i(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        a(remaining);
        int limit = this.a.limit();
        ByteBuffer byteBuffer2 = this.a;
        byteBuffer2.limit(byteBuffer2.position() + remaining);
        byteBuffer.put(this.a);
    }

    @Override // defpackage.aymb
    public final void j(OutputStream outputStream, int i) {
        a(i);
        if (this.a.hasArray()) {
            outputStream.write(this.a.array(), this.a.arrayOffset() + this.a.position(), i);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + i);
        } else {
            byte[] bArr = new byte[i];
            this.a.get(bArr);
            outputStream.write(bArr);
        }
    }

    @Override // defpackage.aymb
    public final void k(byte[] bArr, int i, int i2) {
        a(i2);
        this.a.get(bArr, i, i2);
    }

    @Override // defpackage.aymb
    public final void l(int i) {
        a(i);
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + i);
    }
}
