package defpackage;

import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bals extends balm {
    private final int a;
    private final int c;
    private final int d;

    public bals(bajh bajhVar, bajj bajjVar) {
        this(bajhVar, bajjVar, 1);
    }

    @Override // defpackage.balm, defpackage.balk, defpackage.bajh
    public final int a(long j) {
        return this.b.a(j) + this.a;
    }

    @Override // defpackage.balm, defpackage.balk, defpackage.bajh
    public final int c() {
        return this.d;
    }

    @Override // defpackage.balm, defpackage.bajh
    public final int d() {
        return this.c;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long e(long j, int i) {
        long e = super.e(j, i);
        aynu.A(this, a(e), this.c, this.d);
        return e;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long f(long j) {
        return this.b.f(j);
    }

    @Override // defpackage.balm, defpackage.balk, defpackage.bajh
    public final long g(long j) {
        return this.b.g(j);
    }

    @Override // defpackage.balm, defpackage.balk, defpackage.bajh
    public final long h(long j, int i) {
        aynu.A(this, i, this.c, this.d);
        return super.h(j, i - this.a);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final bajp q() {
        return this.b.q();
    }

    @Override // defpackage.balk, defpackage.bajh
    public final boolean s(long j) {
        return this.b.s(j);
    }

    public bals(bajh bajhVar, bajj bajjVar, int i) {
        super(bajhVar, bajjVar);
        this.a = i;
        if (bajhVar.d() + i > Integer.MIN_VALUE) {
            this.c = bajhVar.d() + i;
        } else {
            this.c = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
        if (bajhVar.c() + i < Integer.MAX_VALUE) {
            this.d = bajhVar.c() + i;
        } else {
            this.d = Integer.MAX_VALUE;
        }
    }
}
