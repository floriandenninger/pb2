package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azog extends AtomicReferenceArray implements ayte {
    private static final Integer f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final int a;
    final AtomicLong b;
    long c;
    final AtomicLong d;
    final int e;

    public azog(int i) {
        super(aynu.n(i));
        this.a = length() - 1;
        this.b = new AtomicLong();
        this.d = new AtomicLong();
        this.e = Math.min(i / 4, f.intValue());
    }

    @Override // defpackage.aytf
    public final void d() {
        while (true) {
            if (sg() == null && j()) {
                return;
            }
        }
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return this.b.get() == this.d.get();
    }

    @Override // defpackage.aytf
    public final boolean k(Object obj) {
        if (obj != null) {
            int i = this.a;
            long j = this.b.get();
            int i2 = ((int) j) & i;
            if (j >= this.c) {
                long j2 = this.e + j;
                if (get(i & ((int) j2)) == null) {
                    this.c = j2;
                } else if (get(i2) != null) {
                    return false;
                }
            }
            lazySet(i2, obj);
            this.b.lazySet(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // defpackage.ayte, defpackage.aytf
    public final Object sg() {
        long j = this.d.get();
        int i = ((int) j) & this.a;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        this.d.lazySet(j + 1);
        lazySet(i, null);
        return obj;
    }
}
