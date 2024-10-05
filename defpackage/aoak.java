package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoak {
    protected int a;
    protected ByteBuffer b;

    public final void a(int i, ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
        } else {
            this.a = 0;
        }
    }

    public final float b() {
        return this.b.getFloat(this.a);
    }

    public final int c() {
        return this.b.getInt(this.a + 4);
    }

    public final float d() {
        return this.b.getFloat(this.a);
    }

    public final float e() {
        return this.b.getFloat(this.a + 4);
    }

    public final float f() {
        return this.b.getFloat(this.a + 4);
    }

    public final float g() {
        return this.b.getFloat(this.a);
    }
}
