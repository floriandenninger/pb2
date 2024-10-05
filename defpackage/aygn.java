package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aygn extends ayff {
    private static final aygl b = new aygj(1);
    private static final aygl c = new aygj(0);
    private static final aygl d = new aygj(2);
    private static final aygl e = new aygj(3);
    private static final aygm f = new aygk();
    public int a;
    private final Deque g;
    private Deque h;
    private boolean i;

    public aygn() {
        this.g = new ArrayDeque();
    }

    private final int m(aygm aygmVar, int i, Object obj, int i2) {
        a(i);
        if (!this.g.isEmpty()) {
            p();
        }
        while (i > 0 && !this.g.isEmpty()) {
            aymb aymbVar = (aymb) this.g.peek();
            int min = Math.min(i, aymbVar.f());
            i2 = aygmVar.a(aymbVar, min, obj, i2);
            i -= min;
            this.a -= min;
            p();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private final int n(aygl ayglVar, int i, Object obj, int i2) {
        try {
            return m(ayglVar, i, obj, i2);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    private final void o() {
        if (this.i) {
            this.h.add((aymb) this.g.remove());
            aymb aymbVar = (aymb) this.g.peek();
            if (aymbVar != null) {
                aymbVar.b();
                return;
            }
            return;
        }
        ((aymb) this.g.remove()).close();
    }

    private final void p() {
        if (((aymb) this.g.peek()).f() == 0) {
            o();
        }
    }

    @Override // defpackage.ayff, defpackage.aymb
    public final void c() {
        if (!this.i) {
            throw new InvalidMarkException();
        }
        aymb aymbVar = (aymb) this.g.peek();
        if (aymbVar != null) {
            int f2 = aymbVar.f();
            aymbVar.c();
            this.a += aymbVar.f() - f2;
        }
        while (true) {
            aymb aymbVar2 = (aymb) this.h.pollLast();
            if (aymbVar2 == null) {
                return;
            }
            aymbVar2.c();
            this.g.addFirst(aymbVar2);
            this.a += aymbVar2.f();
        }
    }

    @Override // defpackage.ayff, defpackage.aymb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (!this.g.isEmpty()) {
            ((aymb) this.g.remove()).close();
        }
        if (this.h != null) {
            while (!this.h.isEmpty()) {
                ((aymb) this.h.remove()).close();
            }
        }
    }

    @Override // defpackage.ayff, defpackage.aymb
    public final boolean d() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            if (!((aymb) it.next()).d()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aymb
    public final int e() {
        return n(b, 1, null, 0);
    }

    @Override // defpackage.aymb
    public final int f() {
        return this.a;
    }

    @Override // defpackage.aymb
    public final aymb g(int i) {
        aymb aymbVar;
        int i2;
        aymb aymbVar2;
        if (i <= 0) {
            return aymf.a;
        }
        a(i);
        this.a -= i;
        aymb aymbVar3 = null;
        aygn aygnVar = null;
        while (true) {
            aymb aymbVar4 = (aymb) this.g.peek();
            int f2 = aymbVar4.f();
            if (f2 > i) {
                aymbVar2 = aymbVar4.g(i);
                i2 = 0;
            } else {
                if (this.i) {
                    aymbVar = aymbVar4.g(f2);
                    o();
                } else {
                    aymbVar = (aymb) this.g.poll();
                }
                aymb aymbVar5 = aymbVar;
                i2 = i - f2;
                aymbVar2 = aymbVar5;
            }
            if (aymbVar3 == null) {
                aymbVar3 = aymbVar2;
            } else {
                if (aygnVar == null) {
                    aygnVar = new aygn(i2 != 0 ? Math.min(this.g.size() + 2, 16) : 2);
                    aygnVar.h(aymbVar3);
                    aymbVar3 = aygnVar;
                }
                aygnVar.h(aymbVar2);
            }
            if (i2 <= 0) {
                return aymbVar3;
            }
            i = i2;
        }
    }

    public final void h(aymb aymbVar) {
        boolean z = this.i && this.g.isEmpty();
        if (!(aymbVar instanceof aygn)) {
            this.g.add(aymbVar);
            this.a += aymbVar.f();
        } else {
            aygn aygnVar = (aygn) aymbVar;
            while (!aygnVar.g.isEmpty()) {
                this.g.add((aymb) aygnVar.g.remove());
            }
            this.a += aygnVar.a;
            aygnVar.a = 0;
            aygnVar.close();
        }
        if (z) {
            ((aymb) this.g.peek()).b();
        }
    }

    @Override // defpackage.aymb
    public final void i(ByteBuffer byteBuffer) {
        n(e, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // defpackage.aymb
    public final void j(OutputStream outputStream, int i) {
        m(f, i, outputStream, 0);
    }

    @Override // defpackage.aymb
    public final void k(byte[] bArr, int i, int i2) {
        n(d, i2, bArr, i);
    }

    @Override // defpackage.aymb
    public final void l(int i) {
        n(c, i, null, 0);
    }

    public aygn(int i) {
        this.g = new ArrayDeque(i);
    }

    @Override // defpackage.ayff, defpackage.aymb
    public final void b() {
        if (this.h == null) {
            this.h = new ArrayDeque(Math.min(this.g.size(), 16));
        }
        while (!this.h.isEmpty()) {
            ((aymb) this.h.remove()).close();
        }
        this.i = true;
        aymb aymbVar = (aymb) this.g.peek();
        if (aymbVar != null) {
            aymbVar.b();
        }
    }
}
