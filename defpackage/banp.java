package defpackage;

import java.io.DataInput;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class banp {
    final bann a;
    final String b;
    final int c;

    public banp(bann bannVar, String str, int i) {
        this.a = bannVar;
        this.b = str;
        this.c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static banp c(DataInput dataInput) {
        return new banp(new bann((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) aynu.t(dataInput)), dataInput.readUTF(), (int) aynu.t(dataInput));
    }

    public final long a(long j, int i, int i2) {
        bann bannVar = this.a;
        char c = bannVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        bale baleVar = bale.n;
        long a = bannVar.a(baleVar, baleVar.h.e(baleVar.h.h(baleVar.l.h(j3, bannVar.b), 0), Math.min(bannVar.f, 86399999)));
        if (bannVar.d != 0) {
            a = bannVar.c(baleVar, a);
            if (a <= j3) {
                a = bannVar.c(baleVar, bannVar.a(baleVar, baleVar.l.h(baleVar.m.e(a, 1), bannVar.b)));
            }
        } else if (a <= j3) {
            a = bannVar.a(baleVar, baleVar.m.e(a, 1));
        }
        return a - j2;
    }

    public final long b(long j, int i, int i2) {
        bann bannVar = this.a;
        char c = bannVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        bale baleVar = bale.n;
        long b = bannVar.b(baleVar, baleVar.h.e(baleVar.h.h(baleVar.l.h(j3, bannVar.b), 0), bannVar.f));
        if (bannVar.d != 0) {
            b = bannVar.c(baleVar, b);
            if (b >= j3) {
                b = bannVar.c(baleVar, bannVar.b(baleVar, baleVar.l.h(baleVar.m.e(b, -1), bannVar.b)));
            }
        } else if (b >= j3) {
            b = bannVar.b(baleVar, baleVar.m.e(b, -1));
        }
        return b - j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof banp) {
            banp banpVar = (banp) obj;
            if (this.c == banpVar.c && this.b.equals(banpVar.b) && this.a.equals(banpVar.a)) {
                return true;
            }
        }
        return false;
    }
}
