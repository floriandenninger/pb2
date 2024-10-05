package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhr {
    public final dhe a;
    public final dha b;
    public final int c;
    public final int d;
    public final boolean e;
    public volatile boolean g;
    public final int h;
    public final String i;
    final /* synthetic */ ComponentTree k;
    public final amsj l;
    private final boolean o;
    private volatile Object p;
    private volatile Object q;
    private final AtomicInteger m = new AtomicInteger(-1);
    public final AtomicInteger f = new AtomicInteger(0);
    public volatile boolean j = false;
    private final FutureTask n = new FutureTask(new dhq(this));

    public dhr(ComponentTree componentTree, dhe dheVar, dha dhaVar, int i, int i2, boolean z, amsj amsjVar, int i3, String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.k = componentTree;
        this.a = dheVar;
        this.b = dhaVar;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.l = amsjVar;
        this.o = c(i3);
        this.h = i3;
        this.i = str;
    }

    private static final boolean c(int i) {
        return i == 0 || i == 2 || i == 4 || i == 6;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0103 A[Catch: all -> 0x0080, TryCatch #1 {all -> 0x0080, blocks: (B:117:0x0071, B:103:0x00fb, B:105:0x0103, B:106:0x0105, B:107:0x0106, B:108:0x010f), top: B:39:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0106 A[Catch: all -> 0x0080, TryCatch #1 {all -> 0x0080, blocks: (B:117:0x0071, B:103:0x00fb, B:105:0x0103, B:106:0x0105, B:107:0x0106, B:108:0x010f), top: B:39:0x006f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.djx a(int r8) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhr.a(int):djx");
    }

    public final synchronized void b() {
        if (this.j) {
            return;
        }
        this.q = null;
        this.p = null;
        this.j = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dhr dhrVar = (dhr) obj;
        return this.c == dhrVar.c && this.d == dhrVar.d && this.a.equals(dhrVar.a) && this.b.k == dhrVar.b.k;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.k) * 31) + this.c) * 31) + this.d;
    }
}
