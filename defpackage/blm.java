package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class blm {
    public bjc c;
    public bik d;
    public bli e;
    public long f;
    public long g;
    public long h;
    public int i;
    public int j;
    public long l;
    public boolean m;
    public boolean n;
    public final blg b = new blg();
    public blk k = new blk();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract long a(pth pthVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(boolean z) {
        int i;
        if (z) {
            this.k = new blk();
            this.g = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.i = i;
        this.f = -1L;
        this.h = 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean c(pth pthVar, long j, blk blkVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final long d(long j) {
        return (j * 1000000) / this.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long e(long j) {
        return (this.j * j) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(long j) {
        this.h = j;
    }
}
