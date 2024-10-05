package defpackage;

import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aopp extends aomf {
    public static final int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    public final int d;
    public final aomf e;
    public final aomf f;
    public final int g;
    private final int h;

    public aopp(aomf aomfVar, aomf aomfVar2) {
        this.e = aomfVar;
        this.f = aomfVar2;
        int d = aomfVar.d();
        this.h = d;
        this.d = d + aomfVar2.d();
        this.g = Math.max(aomfVar.f(), aomfVar2.f()) + 1;
    }

    public static int c(int i) {
        int[] iArr = a;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public static aomf g(aomf aomfVar, aomf aomfVar2) {
        int d = aomfVar.d();
        int d2 = aomfVar2.d();
        byte[] bArr = new byte[d + d2];
        aomfVar.G(bArr, 0, 0, d);
        aomfVar2.G(bArr, 0, d, d2);
        return aomf.B(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.aomf
    public final byte a(int i) {
        F(i, this.d);
        return b(i);
    }

    @Override // defpackage.aomf
    public final byte b(int i) {
        int i2 = this.h;
        return i < i2 ? this.e.b(i) : this.f.b(i - i2);
    }

    @Override // defpackage.aomf
    public final int d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aomf
    public final void e(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.h;
        if (i + i3 <= i4) {
            this.e.e(bArr, i, i2, i3);
        } else {
            if (i >= i4) {
                this.f.e(bArr, i - i4, i2, i3);
                return;
            }
            int i5 = i4 - i;
            this.e.e(bArr, i, i2, i5);
            this.f.e(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    @Override // defpackage.aomf
    public final boolean equals(Object obj) {
        boolean g;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aomf)) {
            return false;
        }
        aomf aomfVar = (aomf) obj;
        if (this.d != aomfVar.d()) {
            return false;
        }
        if (this.d == 0) {
            return true;
        }
        int i = this.c;
        int i2 = aomfVar.c;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        aopn aopnVar = new aopn(this);
        aomc next = aopnVar.next();
        aopn aopnVar2 = new aopn(aomfVar);
        aomc next2 = aopnVar2.next();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int d = next.d() - i3;
            int d2 = next2.d() - i4;
            int min = Math.min(d, d2);
            if (i3 == 0) {
                g = next.g(next2, i4, min);
            } else {
                g = next2.g(next, i3, min);
            }
            if (!g) {
                return false;
            }
            i5 += min;
            int i6 = this.d;
            if (i5 >= i6) {
                if (i5 == i6) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == d) {
                i3 = 0;
                next = aopnVar.next();
            } else {
                i3 += min;
                next = next;
            }
            if (min == d2) {
                next2 = aopnVar2.next();
                i4 = 0;
            } else {
                i4 += min;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aomf
    public final int f() {
        return this.g;
    }

    @Override // defpackage.aomf
    public final boolean h() {
        return this.d >= c(this.g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aomf
    public final int i(int i, int i2, int i3) {
        int i4 = this.h;
        if (i2 + i3 <= i4) {
            return this.e.i(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f.i(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f.i(this.e.i(i, i2, i5), 0, i3 - i5);
    }

    @Override // defpackage.aomf, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aomf
    public final int j(int i, int i2, int i3) {
        int i4 = this.h;
        if (i2 + i3 <= i4) {
            return this.e.j(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f.j(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f.j(this.e.j(i, i2, i5), 0, i3 - i5);
    }

    @Override // defpackage.aomf
    public final aomf k(int i, int i2) {
        int r = r(i, i2, this.d);
        if (r == 0) {
            return aomf.b;
        }
        if (r == this.d) {
            return this;
        }
        int i3 = this.h;
        if (i2 <= i3) {
            return this.e.k(i, i2);
        }
        if (i >= i3) {
            return this.f.k(i - i3, i2 - i3);
        }
        aomf aomfVar = this.e;
        return new aopp(aomfVar.k(i, aomfVar.d()), this.f.k(0, i2 - this.h));
    }

    @Override // defpackage.aomf
    public final aomk l() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        aopn aopnVar = new aopn(this);
        while (aopnVar.hasNext()) {
            arrayList.add(aopnVar.next().o());
        }
        int i = aomk.e;
        int i2 = 0;
        int i3 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i3 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i2 |= 1;
            } else {
                i2 = byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
            }
        }
        if (i2 == 2) {
            return new aomh(arrayList, i3);
        }
        return aomk.M(new aooc(arrayList));
    }

    @Override // defpackage.aomf
    public final InputStream m() {
        return new aopo(this);
    }

    @Override // defpackage.aomf
    protected final String n(Charset charset) {
        return new String(I(), charset);
    }

    @Override // defpackage.aomf
    public final ByteBuffer o() {
        throw null;
    }

    @Override // defpackage.aomf
    public final void p(aolx aolxVar) {
        this.e.p(aolxVar);
        this.f.p(aolxVar);
    }

    @Override // defpackage.aomf
    public final boolean q() {
        int j = this.e.j(0, 0, this.h);
        aomf aomfVar = this.f;
        return aomfVar.j(j, 0, aomfVar.d()) == 0;
    }

    @Override // defpackage.aomf
    /* renamed from: s */
    public final aomb iterator() {
        return new aopm(this);
    }

    Object writeReplace() {
        return aomf.B(I());
    }
}
