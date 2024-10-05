package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class syv {
    public static final ByteBuffer a;
    public static final syv b;
    public final boolean c;
    private final ByteBuffer d;
    private volatile ByteBuffer e;

    static {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[0]);
        a = wrap;
        b = new syv(wrap);
    }

    private syv(ByteBuffer byteBuffer) {
        this(byteBuffer, false);
    }

    public static syv a(ByteBuffer byteBuffer) {
        return byteBuffer == null ? b : new syv(byteBuffer);
    }

    public static syv b(byte[] bArr) {
        return bArr == null ? b : new syv(ByteBuffer.wrap(bArr));
    }

    public static syv c(awoi awoiVar) {
        if (awoiVar == null) {
            return b;
        }
        aong aongVar = (aong) awog.a.createBuilder();
        aongVar.e(awoi.b, awoiVar);
        return new syv(ByteBuffer.wrap(((awog) aongVar.build()).toByteArray()), true);
    }

    public static syv d(awog awogVar) {
        return b(awogVar.toByteArray());
    }

    public final ByteBuffer e() {
        return this.d.duplicate();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof syv)) {
            return false;
        }
        syv syvVar = (syv) obj;
        return syvVar.c == this.c && this.d.equals(syvVar.d);
    }

    public final ByteBuffer f() {
        ByteBuffer duplicate;
        ByteBuffer slice;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            if (this.e == null) {
                ByteBuffer e = e();
                try {
                    aomk N = aomk.N(e);
                    if (N.E()) {
                        slice = a;
                    } else {
                        N.n();
                        N.k();
                        slice = e.slice();
                    }
                    this.e = slice;
                } catch (IOException e2) {
                    throw new syf("Error reading extension from model", e2);
                }
            }
            duplicate = this.e.duplicate();
        }
        return duplicate;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.c), this.d);
    }

    private syv(ByteBuffer byteBuffer, boolean z) {
        this.e = null;
        this.d = byteBuffer.duplicate();
        this.c = z;
    }
}
