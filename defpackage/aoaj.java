package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoaj {
    ByteBuffer a;
    int b;
    int c;
    int[] d;
    int e;
    boolean f;
    boolean g;
    int h;
    int[] i;
    int j;
    int k;
    aoah l;
    final aoan m;

    public aoaj() {
        this(1024);
    }

    public static boolean r(aoam aoamVar, int i) {
        return aoamVar.b(i) != 0;
    }

    public final int a(byte[] bArr) {
        int length = bArr.length;
        q(1, length, 1);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - length;
        this.b = i;
        this.a.put(bArr);
        return d();
    }

    public final int b(CharSequence charSequence) {
        int a = this.m.a(charSequence);
        m(1, 0);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 1;
        this.b = i;
        byteBuffer.put(i, (byte) 0);
        q(1, a, 1);
        ByteBuffer byteBuffer2 = this.a;
        int i2 = this.b - a;
        this.b = i2;
        this.m.c(charSequence, this.a);
        return d();
    }

    public final int c() {
        int i;
        if (this.d == null || !this.f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        h(0);
        int e = e();
        int i2 = this.e;
        do {
            i2--;
            if (i2 < 0) {
                break;
            }
        } while (this.d[i2] == 0);
        for (int i3 = i2; i3 >= 0; i3--) {
            int i4 = this.d[i3];
            j((short) (i4 != 0 ? e - i4 : 0));
        }
        j((short) (e - this.h));
        int i5 = i2 + 3;
        j((short) (i5 + i5));
        int i6 = 0;
        loop2: while (true) {
            if (i6 >= this.j) {
                i = 0;
                break;
            }
            int capacity = this.a.capacity() - this.i[i6];
            int i7 = this.b;
            short s = this.a.getShort(capacity);
            if (s == this.a.getShort(i7)) {
                for (int i8 = 2; i8 < s; i8 += 2) {
                    if (this.a.getShort(capacity + i8) != this.a.getShort(i7 + i8)) {
                        break;
                    }
                }
                i = this.i[i6];
                break loop2;
            }
            i6++;
        }
        if (i != 0) {
            int capacity2 = this.a.capacity() - e;
            this.b = capacity2;
            this.a.putInt(capacity2, i - e);
        } else {
            int i9 = this.j;
            int[] iArr = this.i;
            if (i9 == iArr.length) {
                this.i = Arrays.copyOf(iArr, i9 + i9);
            }
            int[] iArr2 = this.i;
            int i10 = this.j;
            this.j = i10 + 1;
            iArr2[i10] = e();
            ByteBuffer byteBuffer = this.a;
            byteBuffer.putInt(byteBuffer.capacity() - e, e() - e);
        }
        this.f = false;
        return e;
    }

    public final int d() {
        if (!this.f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f = false;
        n(this.k);
        return e();
    }

    public final int e() {
        return this.a.capacity() - this.b;
    }

    public final ByteBuffer f() {
        if (this.g) {
            return this.a;
        }
        throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
    }

    public final void g(int i, boolean z, boolean z2) {
        if (z != z2) {
            m(1, 0);
            ByteBuffer byteBuffer = this.a;
            int i2 = this.b - 1;
            this.b = i2;
            byteBuffer.put(i2, z ? (byte) 1 : (byte) 0);
            o(i);
        }
    }

    public final void h(int i) {
        m(4, 0);
        n(i);
    }

    public final void i(int i) {
        m(4, 0);
        n((e() - i) + 4);
    }

    public final void j(short s) {
        m(2, 0);
        ByteBuffer byteBuffer = this.a;
        int i = this.b - 2;
        this.b = i;
        byteBuffer.putShort(i, s);
    }

    public final void k(int i) {
        m(this.c, 4);
        i(i);
        this.g = true;
    }

    public final void l() {
        if (this.f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public final void m(int i, int i2) {
        if (i > this.c) {
            this.c = i;
        }
        int capacity = ((((this.a.capacity() - this.b) + i2) ^ (-1)) + 1) & (i - 1);
        while (this.b < capacity + i + i2) {
            int capacity2 = this.a.capacity();
            ByteBuffer byteBuffer = this.a;
            aoah aoahVar = this.l;
            int capacity3 = byteBuffer.capacity();
            if (((-1073741824) & capacity3) == 0) {
                int i3 = capacity3 == 0 ? 1 : capacity3 + capacity3;
                ByteBuffer a = aoahVar.a(i3);
                a.put(byteBuffer);
                this.a = a;
                this.b += a.capacity() - capacity2;
            } else {
                throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
            }
        }
        for (int i4 = 0; i4 < capacity; i4++) {
            ByteBuffer byteBuffer2 = this.a;
            int i5 = this.b - 1;
            this.b = i5;
            byteBuffer2.put(i5, (byte) 0);
        }
    }

    public final void n(int i) {
        ByteBuffer byteBuffer = this.a;
        int i2 = this.b - 4;
        this.b = i2;
        byteBuffer.putInt(i2, i);
    }

    public final void o(int i) {
        this.d[i] = e();
    }

    public final void p(int i) {
        l();
        int[] iArr = this.d;
        if (iArr == null || iArr.length < i) {
            this.d = new int[i];
        }
        this.e = i;
        Arrays.fill(this.d, 0, i, 0);
        this.f = true;
        this.h = e();
    }

    public final void q(int i, int i2, int i3) {
        l();
        this.k = i2;
        int i4 = i * i2;
        m(4, i4);
        m(i3, i4);
        this.f = true;
    }

    public final void s(int i, float f) {
        if (f != 0.0d) {
            m(4, 0);
            ByteBuffer byteBuffer = this.a;
            int i2 = this.b - 4;
            this.b = i2;
            byteBuffer.putFloat(i2, f);
            o(i);
        }
    }

    public final void t(int i, int i2) {
        if (i2 != 0) {
            h(i2);
            o(i);
        }
    }

    public final void u(int i, int i2) {
        if (i2 != 0) {
            i(i2);
            o(i);
        }
    }

    public aoaj(int i) {
        aoai aoaiVar = aoai.a;
        aoan d = aoan.d();
        this.c = 1;
        this.d = null;
        this.e = 0;
        this.f = false;
        this.g = false;
        this.i = new int[16];
        this.j = 0;
        this.k = 0;
        i = i <= 0 ? 1 : i;
        this.l = aoaiVar;
        ByteBuffer a = aoaiVar.a(i);
        this.a = a;
        this.m = d;
        this.b = a.capacity();
    }
}
