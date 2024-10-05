package defpackage;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aolu implements aopl {
    private final byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;

    public aolu(ByteBuffer byteBuffer) {
        this.a = byteBuffer.array();
        this.b = byteBuffer.arrayOffset() + byteBuffer.position();
        this.c = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    private final byte V() {
        int i = this.b;
        if (i == this.c) {
            throw aoob.j();
        }
        byte[] bArr = this.a;
        this.b = i + 1;
        return bArr[i];
    }

    private final int W() {
        af(4);
        return X();
    }

    private final int X() {
        int i = this.b;
        byte[] bArr = this.a;
        this.b = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final int Y() {
        int i;
        int i2 = this.b;
        int i3 = this.c;
        if (i3 == i2) {
            throw aoob.j();
        }
        byte[] bArr = this.a;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            this.b = i4;
            return b;
        }
        if (i3 - i4 < 9) {
            return (int) ab();
        }
        int i5 = i4 + 1;
        int i6 = b ^ (bArr[i4] << 7);
        if (i6 < 0) {
            i = i6 ^ (-128);
        } else {
            int i7 = i5 + 1;
            int i8 = i6 ^ (bArr[i5] << 14);
            if (i8 >= 0) {
                i = i8 ^ 16256;
            } else {
                i5 = i7 + 1;
                int i9 = i8 ^ (bArr[i7] << 21);
                if (i9 < 0) {
                    i = i9 ^ (-2080896);
                } else {
                    i7 = i5 + 1;
                    byte b2 = bArr[i5];
                    i = (i9 ^ (b2 << 28)) ^ 266354560;
                    if (b2 < 0) {
                        i5 = i7 + 1;
                        if (bArr[i7] < 0) {
                            i7 = i5 + 1;
                            if (bArr[i5] < 0) {
                                i5 = i7 + 1;
                                if (bArr[i7] < 0) {
                                    i7 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i7 + 1;
                                        if (bArr[i7] < 0) {
                                            throw aoob.e();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i5 = i7;
        }
        this.b = i5;
        return i;
    }

    private final long Z() {
        af(8);
        return aa();
    }

    private final long aa() {
        int i = this.b;
        byte[] bArr = this.a;
        this.b = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    private final long ab() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((V() & 128) == 0) {
                return j;
            }
        }
        throw aoob.e();
    }

    private final Object ac(aoqn aoqnVar, Class cls, aomw aomwVar) {
        aoqn aoqnVar2 = aoqn.DOUBLE;
        switch (aoqnVar) {
            case DOUBLE:
                return Double.valueOf(a());
            case FLOAT:
                return Float.valueOf(b());
            case INT64:
                return Long.valueOf(l());
            case UINT64:
                return Long.valueOf(o());
            case INT32:
                return Integer.valueOf(g());
            case FIXED64:
                return Long.valueOf(k());
            case FIXED32:
                return Integer.valueOf(f());
            case BOOL:
                return Boolean.valueOf(T());
            case STRING:
                return x();
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return t(cls, aomwVar);
            case BYTES:
                return q();
            case UINT32:
                return Integer.valueOf(j());
            case ENUM:
                return Integer.valueOf(e());
            case SFIXED32:
                return Integer.valueOf(h());
            case SFIXED64:
                return Long.valueOf(m());
            case SINT32:
                return Integer.valueOf(i());
            case SINT64:
                return Long.valueOf(n());
        }
    }

    private final Object ad(aopq aopqVar, aomw aomwVar) {
        int i = this.e;
        this.e = aoqp.c(aoqp.a(this.d), 4);
        try {
            Object e = aopqVar.e();
            aopqVar.h(e, this, aomwVar);
            aopqVar.f(e);
            if (this.d == this.e) {
                return e;
            }
            throw aoob.g();
        } finally {
            this.e = i;
        }
    }

    private final Object ae(aopq aopqVar, aomw aomwVar) {
        int Y = Y();
        af(Y);
        int i = this.c;
        int i2 = this.b + Y;
        this.c = i2;
        try {
            Object e = aopqVar.e();
            aopqVar.h(e, this, aomwVar);
            aopqVar.f(e);
            if (this.b == i2) {
                return e;
            }
            throw aoob.g();
        } finally {
            this.c = i;
        }
    }

    private final void af(int i) {
        if (i < 0 || i > this.c - this.b) {
            throw aoob.j();
        }
    }

    private final void ag(int i) {
        if (this.b != i) {
            throw aoob.j();
        }
    }

    private final void ah(int i) {
        if (aoqp.b(this.d) != i) {
            throw aoob.a();
        }
    }

    private final void ai(int i) {
        af(i);
        this.b += i;
    }

    private final void aj(int i) {
        af(i);
        if ((i & 3) != 0) {
            throw aoob.g();
        }
    }

    private final void ak(int i) {
        af(i);
        if ((i & 7) != 0) {
            throw aoob.g();
        }
    }

    private final boolean al() {
        return this.b == this.c;
    }

    @Override // defpackage.aopl
    public final void A(List list) {
        int i;
        int i2;
        if (list instanceof aomr) {
            aomr aomrVar = (aomr) list;
            int b = aoqp.b(this.d);
            if (b != 1) {
                if (b == 2) {
                    int Y = Y();
                    ak(Y);
                    int i3 = this.b + Y;
                    while (this.b < i3) {
                        aomrVar.f(Double.longBitsToDouble(aa()));
                    }
                    return;
                }
                throw aoob.a();
            }
            do {
                aomrVar.f(a());
                if (al()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (Y() == this.d);
            this.b = i2;
            return;
        }
        int b2 = aoqp.b(this.d);
        if (b2 != 1) {
            if (b2 == 2) {
                int Y2 = Y();
                ak(Y2);
                int i4 = this.b + Y2;
                while (this.b < i4) {
                    list.add(Double.valueOf(Double.longBitsToDouble(aa())));
                }
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Double.valueOf(a()));
            if (al()) {
                return;
            } else {
                i = this.b;
            }
        } while (Y() == this.d);
        this.b = i;
    }

    @Override // defpackage.aopl
    public final void B(List list) {
        int i;
        int i2;
        if (list instanceof aonn) {
            aonn aonnVar = (aonn) list;
            int b = aoqp.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int Y = this.b + Y();
                    while (this.b < Y) {
                        aonnVar.g(Y());
                    }
                    return;
                }
                throw aoob.a();
            }
            do {
                aonnVar.g(e());
                if (al()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (Y() == this.d);
            this.b = i2;
            return;
        }
        int b2 = aoqp.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int Y2 = this.b + Y();
                while (this.b < Y2) {
                    list.add(Integer.valueOf(Y()));
                }
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Integer.valueOf(e()));
            if (al()) {
                return;
            } else {
                i = this.b;
            }
        } while (Y() == this.d);
        this.b = i;
    }

    @Override // defpackage.aopl
    public final void C(List list) {
        int i;
        int i2;
        if (!(list instanceof aonn)) {
            int b = aoqp.b(this.d);
            if (b != 2) {
                if (b != 5) {
                    throw aoob.a();
                }
                do {
                    list.add(Integer.valueOf(f()));
                    if (al()) {
                        return;
                    } else {
                        i = this.b;
                    }
                } while (Y() == this.d);
                this.b = i;
                return;
            }
            int Y = Y();
            aj(Y);
            int i3 = this.b + Y;
            while (this.b < i3) {
                list.add(Integer.valueOf(X()));
            }
            return;
        }
        aonn aonnVar = (aonn) list;
        int b2 = aoqp.b(this.d);
        if (b2 != 2) {
            if (b2 != 5) {
                throw aoob.a();
            }
            do {
                aonnVar.g(f());
                if (al()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (Y() == this.d);
            this.b = i2;
            return;
        }
        int Y2 = Y();
        aj(Y2);
        int i4 = this.b + Y2;
        while (this.b < i4) {
            aonnVar.g(X());
        }
    }

    @Override // defpackage.aopl
    public final void D(List list) {
        int i;
        int i2;
        if (list instanceof aoon) {
            aoon aoonVar = (aoon) list;
            int b = aoqp.b(this.d);
            if (b != 1) {
                if (b == 2) {
                    int Y = Y();
                    ak(Y);
                    int i3 = this.b + Y;
                    while (this.b < i3) {
                        aoonVar.f(aa());
                    }
                    return;
                }
                throw aoob.a();
            }
            do {
                aoonVar.f(k());
                if (al()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (Y() == this.d);
            this.b = i2;
            return;
        }
        int b2 = aoqp.b(this.d);
        if (b2 != 1) {
            if (b2 == 2) {
                int Y2 = Y();
                ak(Y2);
                int i4 = this.b + Y2;
                while (this.b < i4) {
                    list.add(Long.valueOf(aa()));
                }
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Long.valueOf(k()));
            if (al()) {
                return;
            } else {
                i = this.b;
            }
        } while (Y() == this.d);
        this.b = i;
    }

    @Override // defpackage.aopl
    public final void E(List list) {
        int i;
        int i2;
        if (!(list instanceof aonc)) {
            int b = aoqp.b(this.d);
            if (b != 2) {
                if (b != 5) {
                    throw aoob.a();
                }
                do {
                    list.add(Float.valueOf(b()));
                    if (al()) {
                        return;
                    } else {
                        i = this.b;
                    }
                } while (Y() == this.d);
                this.b = i;
                return;
            }
            int Y = Y();
            aj(Y);
            int i3 = this.b + Y;
            while (this.b < i3) {
                list.add(Float.valueOf(Float.intBitsToFloat(X())));
            }
            return;
        }
        aonc aoncVar = (aonc) list;
        int b2 = aoqp.b(this.d);
        if (b2 != 2) {
            if (b2 != 5) {
                throw aoob.a();
            }
            do {
                aoncVar.h(b());
                if (al()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (Y() == this.d);
            this.b = i2;
            return;
        }
        int Y2 = Y();
        aj(Y2);
        int i4 = this.b + Y2;
        while (this.b < i4) {
            aoncVar.h(Float.intBitsToFloat(X()));
        }
    }

    @Override // defpackage.aopl
    public final void F(List list, aopq aopqVar, aomw aomwVar) {
        int i;
        if (aoqp.b(this.d) != 3) {
            throw aoob.a();
        }
        int i2 = this.d;
        do {
            list.add(ad(aopqVar, aomwVar));
            if (al()) {
                return;
            } else {
                i = this.b;
            }
        } while (Y() == i2);
        this.b = i;
    }

    @Override // defpackage.aopl
    public final void G(List list) {
        int i;
        int i2;
        if (list instanceof aonn) {
            aonn aonnVar = (aonn) list;
            int b = aoqp.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int Y = this.b + Y();
                    while (this.b < Y) {
                        aonnVar.g(Y());
                    }
                    ag(Y);
                    return;
                }
                throw aoob.a();
            }
            do {
                aonnVar.g(g());
                if (al()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (Y() == this.d);
            this.b = i2;
            return;
        }
        int b2 = aoqp.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int Y2 = this.b + Y();
                while (this.b < Y2) {
                    list.add(Integer.valueOf(Y()));
                }
                ag(Y2);
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Integer.valueOf(g()));
            if (al()) {
                return;
            } else {
                i = this.b;
            }
        } while (Y() == this.d);
        this.b = i;
    }

    @Override // defpackage.aopl
    public final void H(List list) {
        int i;
        int i2;
        if (list instanceof aoon) {
            aoon aoonVar = (aoon) list;
            int b = aoqp.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int Y = this.b + Y();
                    while (this.b < Y) {
                        aoonVar.f(p());
                    }
                    ag(Y);
                    return;
                }
                throw aoob.a();
            }
            do {
                aoonVar.f(l());
                if (al()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (Y() == this.d);
            this.b = i2;
            return;
        }
        int b2 = aoqp.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int Y2 = this.b + Y();
                while (this.b < Y2) {
                    list.add(Long.valueOf(p()));
                }
                ag(Y2);
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Long.valueOf(l()));
            if (al()) {
                return;
            } else {
                i = this.b;
            }
        } while (Y() == this.d);
        this.b = i;
    }

    @Override // defpackage.aopl
    public final void I(Map map, aoor aoorVar, aomw aomwVar) {
        ah(2);
        int Y = Y();
        af(Y);
        int i = this.c;
        this.c = this.b + Y;
        try {
            Object obj = aoorVar.b;
            Object obj2 = aoorVar.d;
            while (true) {
                int c = c();
                if (c == Integer.MAX_VALUE) {
                    map.put(obj, obj2);
                    return;
                }
                if (c == 1) {
                    obj = ac(aoorVar.a, null, null);
                } else if (c == 2) {
                    obj2 = ac(aoorVar.c, aoorVar.d.getClass(), aomwVar);
                } else {
                    try {
                        if (!U()) {
                            throw new aoob("Unable to parse map entry.");
                            break;
                        }
                    } catch (aooa unused) {
                        if (!U()) {
                            throw new aoob("Unable to parse map entry.");
                        }
                    }
                }
            }
        } finally {
            this.c = i;
        }
    }

    @Override // defpackage.aopl
    public final void J(List list, aopq aopqVar, aomw aomwVar) {
        int i;
        if (aoqp.b(this.d) != 2) {
            throw aoob.a();
        }
        int i2 = this.d;
        do {
            list.add(ae(aopqVar, aomwVar));
            if (al()) {
                return;
            } else {
                i = this.b;
            }
        } while (Y() == i2);
        this.b = i;
    }

    @Override // defpackage.aopl
    public final void K(List list) {
        int i;
        int i2;
        if (!(list instanceof aonn)) {
            int b = aoqp.b(this.d);
            if (b != 2) {
                if (b != 5) {
                    throw aoob.a();
                }
                do {
                    list.add(Integer.valueOf(h()));
                    if (al()) {
                        return;
                    } else {
                        i = this.b;
                    }
                } while (Y() == this.d);
                this.b = i;
                return;
            }
            int Y = Y();
            aj(Y);
            int i3 = this.b + Y;
            while (this.b < i3) {
                list.add(Integer.valueOf(X()));
            }
            return;
        }
        aonn aonnVar = (aonn) list;
        int b2 = aoqp.b(this.d);
        if (b2 != 2) {
            if (b2 != 5) {
                throw aoob.a();
            }
            do {
                aonnVar.g(h());
                if (al()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (Y() == this.d);
            this.b = i2;
            return;
        }
        int Y2 = Y();
        aj(Y2);
        int i4 = this.b + Y2;
        while (this.b < i4) {
            aonnVar.g(X());
        }
    }

    @Override // defpackage.aopl
    public final void L(List list) {
        int i;
        int i2;
        if (list instanceof aoon) {
            aoon aoonVar = (aoon) list;
            int b = aoqp.b(this.d);
            if (b != 1) {
                if (b == 2) {
                    int Y = Y();
                    ak(Y);
                    int i3 = this.b + Y;
                    while (this.b < i3) {
                        aoonVar.f(aa());
                    }
                    return;
                }
                throw aoob.a();
            }
            do {
                aoonVar.f(m());
                if (al()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (Y() == this.d);
            this.b = i2;
            return;
        }
        int b2 = aoqp.b(this.d);
        if (b2 != 1) {
            if (b2 == 2) {
                int Y2 = Y();
                ak(Y2);
                int i4 = this.b + Y2;
                while (this.b < i4) {
                    list.add(Long.valueOf(aa()));
                }
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Long.valueOf(m()));
            if (al()) {
                return;
            } else {
                i = this.b;
            }
        } while (Y() == this.d);
        this.b = i;
    }

    @Override // defpackage.aopl
    public final void M(List list) {
        int i;
        int i2;
        if (list instanceof aonn) {
            aonn aonnVar = (aonn) list;
            int b = aoqp.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int Y = this.b + Y();
                    while (this.b < Y) {
                        aonnVar.g(aomk.J(Y()));
                    }
                    return;
                }
                throw aoob.a();
            }
            do {
                aonnVar.g(i());
                if (al()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (Y() == this.d);
            this.b = i2;
            return;
        }
        int b2 = aoqp.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int Y2 = this.b + Y();
                while (this.b < Y2) {
                    list.add(Integer.valueOf(aomk.J(Y())));
                }
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Integer.valueOf(i()));
            if (al()) {
                return;
            } else {
                i = this.b;
            }
        } while (Y() == this.d);
        this.b = i;
    }

    @Override // defpackage.aopl
    public final void N(List list) {
        int i;
        int i2;
        if (list instanceof aoon) {
            aoon aoonVar = (aoon) list;
            int b = aoqp.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int Y = this.b + Y();
                    while (this.b < Y) {
                        aoonVar.f(aomk.L(p()));
                    }
                    return;
                }
                throw aoob.a();
            }
            do {
                aoonVar.f(n());
                if (al()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (Y() == this.d);
            this.b = i2;
            return;
        }
        int b2 = aoqp.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int Y2 = this.b + Y();
                while (this.b < Y2) {
                    list.add(Long.valueOf(aomk.L(p())));
                }
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Long.valueOf(n()));
            if (al()) {
                return;
            } else {
                i = this.b;
            }
        } while (Y() == this.d);
        this.b = i;
    }

    @Override // defpackage.aopl
    public final void O(List list) {
        P(list, false);
    }

    public final void P(List list, boolean z) {
        int i;
        int i2;
        if (aoqp.b(this.d) != 2) {
            throw aoob.a();
        }
        if (!(list instanceof aooj) || z) {
            do {
                list.add(w(z));
                if (al()) {
                    return;
                } else {
                    i = this.b;
                }
            } while (Y() == this.d);
            this.b = i;
            return;
        }
        aooj aoojVar = (aooj) list;
        do {
            aoojVar.i(q());
            if (al()) {
                return;
            } else {
                i2 = this.b;
            }
        } while (Y() == this.d);
        this.b = i2;
    }

    @Override // defpackage.aopl
    public final void Q(List list) {
        P(list, true);
    }

    @Override // defpackage.aopl
    public final void R(List list) {
        int i;
        int i2;
        if (list instanceof aonn) {
            aonn aonnVar = (aonn) list;
            int b = aoqp.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int Y = this.b + Y();
                    while (this.b < Y) {
                        aonnVar.g(Y());
                    }
                    return;
                }
                throw aoob.a();
            }
            do {
                aonnVar.g(j());
                if (al()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (Y() == this.d);
            this.b = i2;
            return;
        }
        int b2 = aoqp.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int Y2 = this.b + Y();
                while (this.b < Y2) {
                    list.add(Integer.valueOf(Y()));
                }
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Integer.valueOf(j()));
            if (al()) {
                return;
            } else {
                i = this.b;
            }
        } while (Y() == this.d);
        this.b = i;
    }

    @Override // defpackage.aopl
    public final void S(List list) {
        int i;
        int i2;
        if (list instanceof aoon) {
            aoon aoonVar = (aoon) list;
            int b = aoqp.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int Y = this.b + Y();
                    while (this.b < Y) {
                        aoonVar.f(p());
                    }
                    ag(Y);
                    return;
                }
                throw aoob.a();
            }
            do {
                aoonVar.f(o());
                if (al()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (Y() == this.d);
            this.b = i2;
            return;
        }
        int b2 = aoqp.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int Y2 = this.b + Y();
                while (this.b < Y2) {
                    list.add(Long.valueOf(p()));
                }
                ag(Y2);
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Long.valueOf(o()));
            if (al()) {
                return;
            } else {
                i = this.b;
            }
        } while (Y() == this.d);
        this.b = i;
    }

    @Override // defpackage.aopl
    public final boolean T() {
        ah(0);
        return Y() != 0;
    }

    @Override // defpackage.aopl
    public final boolean U() {
        int i;
        if (al() || (i = this.d) == this.e) {
            return false;
        }
        int b = aoqp.b(i);
        if (b == 0) {
            int i2 = this.c;
            int i3 = this.b;
            if (i2 - i3 >= 10) {
                byte[] bArr = this.a;
                int i4 = 0;
                while (i4 < 10) {
                    int i5 = i3 + 1;
                    if (bArr[i3] >= 0) {
                        this.b = i5;
                        break;
                    }
                    i4++;
                    i3 = i5;
                }
            }
            for (int i6 = 0; i6 < 10; i6++) {
                if (V() >= 0) {
                    return true;
                }
            }
            throw aoob.e();
        }
        if (b == 1) {
            ai(8);
            return true;
        }
        if (b == 2) {
            ai(Y());
            return true;
        }
        if (b != 3) {
            if (b == 5) {
                ai(4);
                return true;
            }
            throw aoob.a();
        }
        int i7 = this.e;
        this.e = aoqp.c(aoqp.a(this.d), 4);
        while (c() != Integer.MAX_VALUE && U()) {
        }
        if (this.d != this.e) {
            throw aoob.g();
        }
        this.e = i7;
        return true;
    }

    @Override // defpackage.aopl
    public final double a() {
        ah(1);
        return Double.longBitsToDouble(Z());
    }

    @Override // defpackage.aopl
    public final float b() {
        ah(5);
        return Float.intBitsToFloat(W());
    }

    @Override // defpackage.aopl
    public final int c() {
        if (al()) {
            return Integer.MAX_VALUE;
        }
        int Y = Y();
        this.d = Y;
        if (Y == this.e) {
            return Integer.MAX_VALUE;
        }
        return aoqp.a(Y);
    }

    @Override // defpackage.aopl
    public final int d() {
        return this.d;
    }

    @Override // defpackage.aopl
    public final int e() {
        ah(0);
        return Y();
    }

    @Override // defpackage.aopl
    public final int f() {
        ah(5);
        return W();
    }

    @Override // defpackage.aopl
    public final int g() {
        ah(0);
        return Y();
    }

    @Override // defpackage.aopl
    public final int h() {
        ah(5);
        return W();
    }

    @Override // defpackage.aopl
    public final int i() {
        ah(0);
        return aomk.J(Y());
    }

    @Override // defpackage.aopl
    public final int j() {
        ah(0);
        return Y();
    }

    @Override // defpackage.aopl
    public final long k() {
        ah(1);
        return Z();
    }

    @Override // defpackage.aopl
    public final long l() {
        ah(0);
        return p();
    }

    @Override // defpackage.aopl
    public final long m() {
        ah(1);
        return Z();
    }

    @Override // defpackage.aopl
    public final long n() {
        ah(0);
        return aomk.L(p());
    }

    @Override // defpackage.aopl
    public final long o() {
        ah(0);
        return p();
    }

    public final long p() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.b;
        int i3 = this.c;
        if (i3 == i2) {
            throw aoob.j();
        }
        byte[] bArr = this.a;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            this.b = i4;
            return b;
        }
        if (i3 - i4 < 9) {
            return ab();
        }
        int i5 = i4 + 1;
        int i6 = b ^ (bArr[i4] << 7);
        if (i6 >= 0) {
            int i7 = i5 + 1;
            int i8 = i6 ^ (bArr[i5] << 14);
            if (i8 >= 0) {
                j = i8 ^ 16256;
            } else {
                i5 = i7 + 1;
                int i9 = i8 ^ (bArr[i7] << 21);
                if (i9 < 0) {
                    i = i9 ^ (-2080896);
                } else {
                    i7 = i5 + 1;
                    long j5 = (bArr[i5] << 28) ^ i9;
                    if (j5 < 0) {
                        int i10 = i7 + 1;
                        long j6 = j5 ^ (bArr[i7] << 35);
                        if (j6 < 0) {
                            j3 = -34093383808L;
                        } else {
                            i7 = i10 + 1;
                            j5 = j6 ^ (bArr[i10] << 42);
                            if (j5 >= 0) {
                                j4 = 4363953127296L;
                            } else {
                                i10 = i7 + 1;
                                j6 = j5 ^ (bArr[i7] << 49);
                                if (j6 < 0) {
                                    j3 = -558586000294016L;
                                } else {
                                    i7 = i10 + 1;
                                    j = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                    if (j < 0) {
                                        i10 = i7 + 1;
                                        if (bArr[i7] >= 0) {
                                            j2 = j;
                                            i5 = i10;
                                            this.b = i5;
                                            return j2;
                                        }
                                        throw aoob.e();
                                    }
                                }
                            }
                        }
                        j2 = j3 ^ j6;
                        i5 = i10;
                        this.b = i5;
                        return j2;
                    }
                    j4 = 266354560;
                    j = j5 ^ j4;
                }
            }
            i5 = i7;
            j2 = j;
            this.b = i5;
            return j2;
        }
        i = i6 ^ (-128);
        j2 = i;
        this.b = i5;
        return j2;
    }

    @Override // defpackage.aopl
    public final aomf q() {
        ah(2);
        int Y = Y();
        if (Y == 0) {
            return aomf.b;
        }
        af(Y);
        aomf C = aomf.C(this.a, this.b, Y);
        this.b += Y;
        return C;
    }

    @Override // defpackage.aopl
    public final Object r(Class cls, aomw aomwVar) {
        ah(3);
        return ad(aopi.a.a(cls), aomwVar);
    }

    @Override // defpackage.aopl
    public final Object s(aopq aopqVar, aomw aomwVar) {
        ah(3);
        return ad(aopqVar, aomwVar);
    }

    @Override // defpackage.aopl
    public final Object t(Class cls, aomw aomwVar) {
        ah(2);
        return ae(aopi.a.a(cls), aomwVar);
    }

    @Override // defpackage.aopl
    public final Object u(aopq aopqVar, aomw aomwVar) {
        ah(2);
        return ae(aopqVar, aomwVar);
    }

    @Override // defpackage.aopl
    public final String v() {
        return w(false);
    }

    public final String w(boolean z) {
        ah(2);
        int Y = Y();
        if (Y == 0) {
            return "";
        }
        af(Y);
        if (z) {
            byte[] bArr = this.a;
            int i = this.b;
            if (!aoqm.h(bArr, i, i + Y)) {
                throw aoob.d();
            }
        }
        String str = new String(this.a, this.b, Y, aonz.a);
        this.b += Y;
        return str;
    }

    @Override // defpackage.aopl
    public final String x() {
        return w(true);
    }

    @Override // defpackage.aopl
    public final void y(List list) {
        int i;
        int i2;
        if (list instanceof aolw) {
            aolw aolwVar = (aolw) list;
            int b = aoqp.b(this.d);
            if (b != 0) {
                if (b == 2) {
                    int Y = this.b + Y();
                    while (this.b < Y) {
                        aolwVar.f(Y() != 0);
                    }
                    ag(Y);
                    return;
                }
                throw aoob.a();
            }
            do {
                aolwVar.f(T());
                if (al()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (Y() == this.d);
            this.b = i2;
            return;
        }
        int b2 = aoqp.b(this.d);
        if (b2 != 0) {
            if (b2 == 2) {
                int Y2 = this.b + Y();
                while (this.b < Y2) {
                    list.add(Boolean.valueOf(Y() != 0));
                }
                ag(Y2);
                return;
            }
            throw aoob.a();
        }
        do {
            list.add(Boolean.valueOf(T()));
            if (al()) {
                return;
            } else {
                i = this.b;
            }
        } while (Y() == this.d);
        this.b = i;
    }

    @Override // defpackage.aopl
    public final void z(List list) {
        int i;
        if (aoqp.b(this.d) != 2) {
            throw aoob.a();
        }
        do {
            list.add(q());
            if (al()) {
                return;
            } else {
                i = this.b;
            }
        } while (Y() == this.d);
        this.b = i;
    }

    public aolu() {
    }
}
