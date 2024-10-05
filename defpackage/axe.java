package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axe implements avr {
    public int b;
    public boolean g;
    public axd h;
    public long i;
    public long j;
    private ByteBuffer m;
    private ShortBuffer n;
    private ByteBuffer o;
    private boolean p;
    public float c = 1.0f;
    public float d = 1.0f;
    private avp k = avp.a;
    private avp l = avp.a;
    public avp e = avp.a;
    public avp f = avp.a;

    public axe() {
        ByteBuffer byteBuffer = a;
        this.m = byteBuffer;
        this.n = byteBuffer.asShortBuffer();
        this.o = a;
        this.b = -1;
    }

    @Override // defpackage.avr
    public final avp a(avp avpVar) {
        if (avpVar.d == 2) {
            int i = this.b;
            if (i == -1) {
                i = avpVar.b;
            }
            this.k = avpVar;
            avp avpVar2 = new avp(i, avpVar.c, 2);
            this.l = avpVar2;
            this.g = true;
            return avpVar2;
        }
        throw new avq(avpVar);
    }

    @Override // defpackage.avr
    public final ByteBuffer b() {
        int a;
        axd axdVar = this.h;
        if (axdVar != null && (a = axdVar.a()) > 0) {
            if (this.m.capacity() < a) {
                ByteBuffer order = ByteBuffer.allocateDirect(a).order(ByteOrder.nativeOrder());
                this.m = order;
                this.n = order.asShortBuffer();
            }
            ShortBuffer shortBuffer = this.n;
            int min = Math.min(shortBuffer.remaining() / axdVar.a, axdVar.i);
            shortBuffer.put(axdVar.h, 0, axdVar.a * min);
            int i = axdVar.i - min;
            axdVar.i = i;
            short[] sArr = axdVar.h;
            int i2 = axdVar.a;
            System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
            this.j += a;
            this.o = this.m;
        }
        ByteBuffer byteBuffer = this.o;
        this.o = a;
        return byteBuffer;
    }

    @Override // defpackage.avr
    public final void c() {
        if (g()) {
            this.e = this.k;
            this.f = this.l;
            if (this.g) {
                avp avpVar = this.e;
                this.h = new axd(avpVar.b, avpVar.c, this.c, this.d, this.f.b);
            } else {
                axd axdVar = this.h;
                if (axdVar != null) {
                    axdVar.g = 0;
                    axdVar.i = 0;
                    axdVar.j = 0;
                    axdVar.k = 0;
                    axdVar.l = 0;
                    axdVar.m = 0;
                    axdVar.n = 0;
                    axdVar.o = 0;
                    axdVar.p = 0;
                    axdVar.q = 0;
                }
            }
        }
        this.o = a;
        this.i = 0L;
        this.j = 0L;
        this.p = false;
    }

    @Override // defpackage.avr
    public final void d() {
        int i;
        axd axdVar = this.h;
        if (axdVar != null) {
            int i2 = axdVar.g;
            float f = axdVar.b;
            float f2 = axdVar.c;
            int i3 = axdVar.i + ((int) ((((i2 / (f / f2)) + axdVar.j) / (axdVar.d * f2)) + 0.5f));
            short[] sArr = axdVar.f;
            int i4 = axdVar.e;
            axdVar.f = axdVar.c(sArr, i2, i4 + i4 + i2);
            int i5 = 0;
            while (true) {
                int i6 = axdVar.e;
                i = i6 + i6;
                int i7 = axdVar.a;
                if (i5 >= i * i7) {
                    break;
                }
                axdVar.f[(i7 * i2) + i5] = 0;
                i5++;
            }
            axdVar.g += i;
            axdVar.b();
            if (axdVar.i > i3) {
                axdVar.i = i3;
            }
            axdVar.g = 0;
            axdVar.m = 0;
            axdVar.j = 0;
        }
        this.p = true;
    }

    @Override // defpackage.avr
    public final void e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            axd axdVar = this.h;
            pse.c(axdVar);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.i += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = axdVar.a;
            int i2 = remaining2 / i;
            int i3 = i * i2;
            axdVar.f = axdVar.c(axdVar.f, axdVar.g, i2);
            asShortBuffer.get(axdVar.f, axdVar.g * axdVar.a, (i3 + i3) / 2);
            axdVar.g += i2;
            axdVar.b();
        }
    }

    @Override // defpackage.avr
    public final void f() {
        this.c = 1.0f;
        this.d = 1.0f;
        this.k = avp.a;
        this.l = avp.a;
        this.e = avp.a;
        this.f = avp.a;
        ByteBuffer byteBuffer = a;
        this.m = byteBuffer;
        this.n = byteBuffer.asShortBuffer();
        this.o = a;
        this.b = -1;
        this.g = false;
        this.h = null;
        this.i = 0L;
        this.j = 0L;
        this.p = false;
    }

    @Override // defpackage.avr
    public final boolean g() {
        if (this.l.b != -1) {
            return Math.abs(this.c + (-1.0f)) >= 1.0E-4f || Math.abs(this.d + (-1.0f)) >= 1.0E-4f || this.l.b != this.k.b;
        }
        return false;
    }

    @Override // defpackage.avr
    public final boolean h() {
        axd axdVar;
        return this.p && ((axdVar = this.h) == null || axdVar.a() == 0);
    }

    public final void i(float f) {
        if (this.c != f) {
            this.c = f;
            this.g = true;
        }
    }
}
