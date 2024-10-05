package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
@axmb(b = {19})
/* loaded from: classes2.dex */
public final class axme extends axlx {
    byte[] a;

    @Override // defpackage.axlx
    public final void a(ByteBuffer byteBuffer) {
        if (c() > 0) {
            byte[] bArr = new byte[c()];
            this.a = bArr;
            byteBuffer.get(bArr);
        }
    }

    @Override // defpackage.axlx
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExtensionDescriptor{bytes=");
        byte[] bArr = this.a;
        sb.append(bArr == null ? "null" : ddy.a(bArr));
        sb.append('}');
        return sb.toString();
    }
}
