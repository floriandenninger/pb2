package defpackage;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayeb {
    private static final int a;
    private static final int b;
    private static final Queue c;

    static {
        int max = Math.max(16384, 8192);
        a = max;
        int i = 131072 / max;
        b = i;
        c = new LinkedBlockingQueue(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(byte[] bArr) {
        if (bArr.length == a) {
            c.offer(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] b() {
        return c(a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] c(int i) {
        byte[] bArr;
        return (i != a || (bArr = (byte[]) c.poll()) == null) ? new byte[i] : bArr;
    }
}
