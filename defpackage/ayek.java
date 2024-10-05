package defpackage;

import android.os.Parcel;
import java.io.InputStream;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ayek {
    public final ayoa a;
    private final aydz b;
    private final int c;
    private boolean d;
    private InputStream e;
    private Queue f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k = 1;

    public ayek(aydz aydzVar, int i, ayoa ayoaVar) {
        this.b = aydzVar;
        this.c = i;
        this.a = ayoaVar;
    }

    protected abstract int a(Parcel parcel);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(InputStream inputStream) {
        d();
        Queue queue = this.f;
        if (queue != null) {
            queue.add(inputStream);
        } else {
            if (this.e == null) {
                this.e = inputStream;
                return;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            this.f = concurrentLinkedQueue;
            concurrentLinkedQueue.add(inputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        this.d = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        this.g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        return !this.b.n;
    }

    protected final boolean h() {
        Queue queue = this.f;
        return queue != null ? !queue.isEmpty() : this.e != null && this.i == 0;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String simpleName = getClass().getSimpleName();
        int i = this.k;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "SUFFIX_SENT" : "ALL_MESSAGES_SENT" : "PREFIX_SENT" : "INITIAL";
        int i2 = this.i;
        sb = new StringBuilder(String.valueOf(simpleName).length() + 20 + str.length());
        sb.append(simpleName);
        sb.append("[S=");
        sb.append(str);
        sb.append("/NDM=");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8 A[Catch: all -> 0x0117, IOException -> 0x0119, TryCatch #0 {IOException -> 0x0119, blocks: (B:14:0x003e, B:20:0x00eb, B:21:0x00f3, B:24:0x004c, B:25:0x0051, B:28:0x0068, B:30:0x006c, B:32:0x007d, B:34:0x0083, B:40:0x00a3, B:42:0x00a8, B:44:0x00b3, B:45:0x00bb, B:46:0x00cb, B:47:0x00dd, B:49:0x00e1, B:51:0x00e7, B:58:0x00d0, B:59:0x00d3, B:61:0x00d4, B:62:0x00d6, B:63:0x00d7, B:64:0x006f, B:66:0x0073, B:68:0x0054, B:70:0x0062, B:74:0x0116), top: B:13:0x003e, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayek.f():void");
    }

    private final void b(int i) {
        int i2 = this.k;
        int i3 = i - 1;
        if (i3 == 1) {
            amkq.N(i2 == 1);
        } else if (i3 == 2) {
            amkq.N(i2 == 2);
        } else if (i3 == 3) {
            amkq.N(i2 == 3);
        }
        this.k = i;
    }
}
