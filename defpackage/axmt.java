package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axmt extends axml {
    private ByteBuffer a;
    private final String b;

    public axmt(String str) {
        this.b = str;
    }

    @Override // defpackage.axml
    public final String a() {
        return this.b;
    }

    @Override // defpackage.axml
    public final ByteBuffer b() {
        return this.a.duplicate();
    }

    @Override // defpackage.axml
    public final void c(ByteBuffer byteBuffer) {
        this.a = (ByteBuffer) byteBuffer.duplicate().rewind();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axmt axmtVar = (axmt) obj;
        ByteBuffer byteBuffer = this.a;
        return byteBuffer == null ? axmtVar.a == null : byteBuffer.equals(axmtVar.a);
    }

    public final int hashCode() {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public final String toString() {
        ByteBuffer duplicate = this.a.duplicate();
        duplicate.rewind();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        String a = ddy.a(bArr);
        StringBuilder sb = new StringBuilder(a.length() + 22);
        sb.append("UnknownEntry{content=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
