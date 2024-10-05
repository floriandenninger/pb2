package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pnz implements plg {
    public final Object a;
    public final int b;
    public final pnd c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    public pnz(Object obj, int i, pnd pndVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = pndVar;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            pnz pnzVar = (pnz) obj;
            if (this.b == pnzVar.b && this.e == pnzVar.e && this.f == pnzVar.f && this.g == pnzVar.g && this.h == pnzVar.h && this.i == pnzVar.i && amkq.b(this.a, pnzVar.a) && amkq.b(this.d, pnzVar.d) && amkq.b(this.c, pnzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Integer.valueOf(this.b), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i)});
    }
}
