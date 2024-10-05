package defpackage;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anbk {
    public final String a;
    public final char[] b;
    final int c;
    final int d;
    final int e;
    final int f;
    public final byte[] g;
    private final boolean[] h;

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[LOOP:1: B:32:0x0097->B:34:0x009b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public anbk(java.lang.String r9, char[] r10) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anbk.<init>(java.lang.String, char[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final char a(int i) {
        return this.b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(char c) {
        if (c > 127) {
            String valueOf = String.valueOf(Integer.toHexString(c));
            throw new anbn(valueOf.length() != 0 ? "Unrecognized character: 0x".concat(valueOf) : new String("Unrecognized character: 0x"));
        }
        byte b = this.g[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            String valueOf2 = String.valueOf(Integer.toHexString(c));
            throw new anbn(valueOf2.length() != 0 ? "Unrecognized character: 0x".concat(valueOf2) : new String("Unrecognized character: 0x"));
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Unrecognized character: ");
        sb.append(c);
        throw new anbn(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(int i) {
        return this.h[i % this.e];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anbk) {
            return Arrays.equals(this.b, ((anbk) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return this.a;
    }
}
