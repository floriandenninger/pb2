package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfp extends axkq {
    byte[] a;

    public dfp(byte[] bArr) {
        super(bArr);
    }

    @Override // defpackage.axkq
    protected final long h() {
        return this.a.length;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.a = bArr;
        byteBuffer.get(bArr);
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a);
    }

    public final String toString() {
        String str = this.h;
        String str2 = new String(this.i);
        int length = this.a.length;
        StringBuilder sb = new StringBuilder(str.length() + 50 + str2.length());
        sb.append("UserBox[type=");
        sb.append(str);
        sb.append(";userType=");
        sb.append(str2);
        sb.append(";contentLength=");
        sb.append(length);
        sb.append("]");
        return sb.toString();
    }
}
