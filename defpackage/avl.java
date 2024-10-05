package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avl {
    public final long a;
    public final pou b;
    public final int c;
    public final long d;
    public final pou e;
    public final int f;
    public final long g;
    public final long h;
    public final ash i;
    public final ash j;

    public avl(long j, pou pouVar, int i, ash ashVar, long j2, pou pouVar2, int i2, ash ashVar2, long j3, long j4) {
        this.a = j;
        this.b = pouVar;
        this.c = i;
        this.i = ashVar;
        this.d = j2;
        this.e = pouVar2;
        this.f = i2;
        this.j = ashVar2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            avl avlVar = (avl) obj;
            if (this.a == avlVar.a && this.c == avlVar.c && this.d == avlVar.d && this.f == avlVar.f && this.g == avlVar.g && this.h == avlVar.h && amkq.b(this.b, avlVar.b) && amkq.b(this.i, avlVar.i) && amkq.b(this.e, avlVar.e) && amkq.b(this.j, avlVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.i, Long.valueOf(this.d), this.e, Integer.valueOf(this.f), this.j, Long.valueOf(this.g), Long.valueOf(this.h)});
    }
}
