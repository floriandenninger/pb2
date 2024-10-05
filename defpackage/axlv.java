package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axlv extends axlu {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axlv axlvVar = (axlv) obj;
        ByteBuffer byteBuffer = this.b;
        return byteBuffer == null ? axlvVar.b == null : byteBuffer.equals(axlvVar.b);
    }

    public final int hashCode() {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public final axmc k() {
        return (axmc) this.a;
    }
}
