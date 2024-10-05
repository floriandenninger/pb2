package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ysg extends ysi {
    private final byte[] a;
    private final int d;
    private ByteBuffer e;

    public ysg(byte[] bArr, int i, String str) {
        super(i, str);
        this.a = bArr;
        this.d = i;
        this.e = null;
    }

    @Override // defpackage.ysi
    public final InputStream a() {
        return new yvz(this.a, this.d);
    }

    @Override // defpackage.ysi
    public final ByteBuffer b() {
        if (this.e == null) {
            this.e = ByteBuffer.wrap(this.a, 0, this.d);
        }
        return this.e.duplicate();
    }

    @Override // defpackage.ysi
    public final byte[] c() {
        int i = this.d;
        byte[] bArr = this.a;
        if (i == bArr.length) {
            return bArr;
        }
        return null;
    }
}
