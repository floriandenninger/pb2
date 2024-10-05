package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ypk {
    protected long c = -1;

    public ypk() {
    }

    public ypk(long j) {
        i(j);
    }

    public long h() {
        long j = this.c;
        if (j != -1) {
            return j;
        }
        throw new RuntimeException("TimestampedEvent not yet posted");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(long j) {
        if (this.c != -1) {
            throw new RuntimeException("This instance is already timestamped");
        }
        amkq.N(j >= 0);
        this.c = j;
    }

    public boolean j() {
        return this.c != -1;
    }
}
