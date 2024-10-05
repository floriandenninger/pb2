package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class asw extends asp {
    public final ass a = new ass();
    public ByteBuffer b;
    public boolean c;
    public long d;
    public ByteBuffer e;
    private final int f;

    public asw(int i) {
        this.f = i;
    }

    public static asw a() {
        return new asw(0);
    }

    private final ByteBuffer e(int i) {
        int i2 = this.f;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.b;
        throw new asv(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    public final void b(int i) {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer == null) {
            this.b = e(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.b = byteBuffer;
            return;
        }
        ByteBuffer e = e(i2);
        e.order(byteBuffer.order());
        if (position > 0) {
            e.put(byteBuffer);
        }
        this.b = e;
    }

    public final void c() {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
        }
        ByteBuffer byteBuffer2 = this.e;
        if (byteBuffer2 != null) {
        }
    }

    @Override // defpackage.asp
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
        }
        ByteBuffer byteBuffer2 = this.e;
        if (byteBuffer2 != null) {
        }
        this.c = false;
    }

    public final boolean d() {
        return getFlag(1073741824);
    }
}
