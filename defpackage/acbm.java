package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acbm {
    int a;
    int b;
    int c;
    int d;
    int e;
    boolean f;
    int g;
    long h;
    byte[] i;
    ByteBuffer j;
    ByteArrayInputStream k;
    DataInputStream l;

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        long j = this.h;
        boolean z = this.f;
        int i6 = this.g;
        byte[] bArr = this.i;
        int length = bArr == null ? 0 : bArr.length;
        StringBuilder sb = new StringBuilder(233);
        sb.append("[ chunkStreamId=");
        sb.append(i);
        sb.append(", length=");
        sb.append(i2);
        sb.append(", messageType=");
        sb.append(i3);
        sb.append(", messageStreamId=");
        sb.append(i4);
        sb.append(", timestampDelta=");
        sb.append(i5);
        sb.append(", timestamp=");
        sb.append(j);
        sb.append(", isAborting=");
        sb.append(z);
        sb.append(", mesgBytesPending=");
        sb.append(i6);
        sb.append(", dataSize=");
        sb.append(length);
        sb.append(" ]");
        return sb.toString();
    }
}
