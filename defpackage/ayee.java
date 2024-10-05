package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayee {
    final InputStream a = null;
    final byte[] b;
    final int c;
    final boolean d;

    public ayee(byte[] bArr, int i, boolean z) {
        this.b = bArr;
        this.c = i;
        this.d = z;
    }

    public final String toString() {
        int i = this.c;
        String str = true != this.d ? "]" : "(last)]";
        StringBuilder sb = new StringBuilder(str.length() + 34);
        sb.append("TransactionData[");
        sb.append(i);
        sb.append("b array");
        sb.append(str);
        return sb.toString();
    }
}
