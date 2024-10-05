package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axop extends aoam {
    public final int aI() {
        int b = b(10);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final ByteBuffer aJ() {
        return i(14);
    }

    public final ByteBuffer aK() {
        return i(10);
    }

    public final boolean aL() {
        int b = b(16);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public final aoam aM() {
        aoam aoamVar = new aoam();
        int b = b(12);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(b + this.a), this.b);
        return aoamVar;
    }

    public final aoam aN() {
        aoam aoamVar = new aoam();
        int b = b(8);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(b + this.a), this.b);
        return aoamVar;
    }
}
