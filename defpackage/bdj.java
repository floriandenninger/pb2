package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdj implements bdw {
    public long a;
    private final long c;
    private final long d;
    private final afah e;

    public bdj(afah afahVar, long j, long j2) {
        this.c = j;
        this.d = j2;
        this.a = j - 1;
        this.e = afahVar;
    }

    protected final void a() {
        long j = this.a;
        if (j < this.c || j > this.d) {
            throw new NoSuchElementException();
        }
    }

    @Override // defpackage.bdw
    public final boolean b() {
        long j = this.a + 1;
        this.a = j;
        return j <= this.d;
    }

    @Override // defpackage.bdw
    public final void c() {
        a();
        this.e.b(this.a);
    }

    @Override // defpackage.bdw
    public final void d() {
        a();
        this.e.d(this.a);
    }
}
