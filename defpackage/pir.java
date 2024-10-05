package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pir implements pit {
    private boolean a;
    private long b;
    private List c = new ArrayList();
    private ByteBuffer d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;

    public pir() {
        e();
    }

    private final int l(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.c.size() + 1 && i4 < i2) {
            ByteBuffer byteBuffer = i3 == this.c.size() ? this.d : (ByteBuffer) this.c.get(i3);
            int min = Math.min(i2 - i4, byteBuffer.remaining());
            byteBuffer.get(bArr, i + i4, min);
            i4 += min;
            i3++;
        }
        return i4;
    }

    private final void m(int i) {
        this.b += i;
        if (this.c.isEmpty() || ((ByteBuffer) this.c.get(0)).hasRemaining()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ByteBuffer byteBuffer : this.c) {
            if (byteBuffer.remaining() > 0) {
                arrayList.add(byteBuffer);
            }
        }
        this.c = arrayList;
    }

    @Override // defpackage.pit
    public final long a() {
        return -1L;
    }

    @Override // defpackage.pit
    public final long b() {
        return this.b;
    }

    public final void c() {
        if (this.a) {
            int position = this.d.position() - ((ByteBuffer) this.d.reset()).position();
            ByteBuffer wrap = ByteBuffer.wrap(new byte[position]);
            this.d.get(wrap.array(), 0, position);
            this.c.add(wrap);
        }
        this.e = true;
    }

    public final void d(ByteBuffer byteBuffer, long j) {
        pse.g(this.e);
        if (this.b == -1) {
            this.b = j;
        }
        this.d = byteBuffer;
        this.e = false;
    }

    public final void e() {
        this.e = true;
        this.c.clear();
        this.d = ByteBuffer.wrap(new byte[0]);
        this.b = -1L;
        this.f = false;
    }

    @Override // defpackage.pit
    public final void f() {
        if (this.a) {
            this.a = false;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
            }
        }
    }

    @Override // defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        f();
        int l = l(bArr, i, i2);
        m(l);
        return l;
    }

    public final boolean h() {
        return (this.f || !this.a) && this.d.remaining() == 0;
    }

    @Override // defpackage.pit
    public final boolean i(byte[] bArr, int i, int i2) {
        f();
        if (this.f) {
            i = this.g;
            i2 = this.h;
        }
        int l = l(bArr, i, i2);
        if (l != i2) {
            this.f = true;
            this.g = i + l;
            this.h = i2 - l;
        } else {
            this.f = false;
        }
        m(l);
        return !this.f;
    }

    @Override // defpackage.pit
    public final boolean j(int i) {
        f();
        if (this.f) {
            i = this.h;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.c.size() + 1 && i3 < i) {
            ByteBuffer byteBuffer = i2 == this.c.size() ? this.d : (ByteBuffer) this.c.get(i2);
            int min = Math.min(i - i3, byteBuffer.remaining());
            i3 += min;
            i2++;
        }
        if (i3 != i) {
            this.f = true;
            this.h = i - i3;
        } else {
            this.f = false;
        }
        m(i3);
        return !this.f;
    }

    @Override // defpackage.pit
    public final boolean k(byte[] bArr, int i) {
        int i2;
        int i3;
        if (!this.a) {
            this.a = true;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
            }
        }
        if (this.f) {
            i3 = this.g;
            i2 = this.h;
        } else {
            i2 = i;
            i3 = 0;
        }
        int l = l(bArr, i3, i2);
        if (l == i2) {
            this.f = false;
            return true;
        }
        this.f = true;
        this.g = i3 + l;
        this.h = i2 - l;
        return false;
    }
}
