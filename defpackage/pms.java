package defpackage;

import android.os.Bundle;
import androidx.media3.common.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pms implements plg {
    public static final pms a = new pmr().a();
    public static final plf b = new plf() { // from class: pmq
        @Override // defpackage.plf
        public final plg a(Bundle bundle) {
            throw null;
        }
    };
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    private int H;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final Metadata l;
    public final String m;
    public final String n;
    public final int o;
    public final List p;
    public final DrmInitData q;
    public final long r;
    public final int s;
    public final int t;
    public final float u;
    public final int v;
    public final float w;
    public final byte[] x;
    public final int y;
    public final asf z;

    public pms(pmr pmrVar) {
        this.c = pmrVar.a;
        this.d = pmrVar.b;
        this.e = pts.K(pmrVar.c);
        this.f = pmrVar.d;
        this.g = pmrVar.e;
        int i = pmrVar.f;
        this.h = i;
        int i2 = pmrVar.g;
        this.i = i2;
        this.j = i2 != -1 ? i2 : i;
        this.k = pmrVar.h;
        this.l = pmrVar.i;
        this.m = pmrVar.j;
        this.n = pmrVar.k;
        this.o = pmrVar.l;
        List list = pmrVar.m;
        this.p = list == null ? Collections.emptyList() : list;
        DrmInitData drmInitData = pmrVar.n;
        this.q = drmInitData;
        this.r = pmrVar.o;
        this.s = pmrVar.p;
        this.t = pmrVar.q;
        this.u = pmrVar.r;
        int i3 = pmrVar.s;
        int i4 = 0;
        this.v = i3 == -1 ? 0 : i3;
        float f = pmrVar.t;
        this.w = f == -1.0f ? 1.0f : f;
        this.x = pmrVar.u;
        this.y = pmrVar.v;
        this.z = pmrVar.w;
        this.A = pmrVar.x;
        this.B = pmrVar.y;
        this.C = pmrVar.z;
        int i5 = pmrVar.A;
        this.D = i5 == -1 ? 0 : i5;
        int i6 = pmrVar.B;
        this.E = i6 == -1 ? 0 : i6;
        this.F = pmrVar.C;
        int i7 = pmrVar.D;
        if (i7 != 0) {
            i4 = i7;
        } else if (drmInitData != null) {
            this.G = 1;
            return;
        }
        this.G = i4;
    }

    public final int a() {
        int i;
        int i2 = this.s;
        if (i2 == -1 || (i = this.t) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final pmr b() {
        return new pmr(this);
    }

    public final pms c(int i) {
        pmr b2 = b();
        b2.D = i;
        return b2.a();
    }

    @Deprecated
    public final pms d(int i, int i2) {
        pmr b2 = b();
        b2.A = i;
        b2.B = i2;
        return b2.a();
    }

    public final boolean e(pms pmsVar) {
        if (this.p.size() != pmsVar.p.size()) {
            return false;
        }
        for (int i = 0; i < this.p.size(); i++) {
            if (!Arrays.equals((byte[]) this.p.get(i), (byte[]) pmsVar.p.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            pms pmsVar = (pms) obj;
            int i2 = this.H;
            if ((i2 == 0 || (i = pmsVar.H) == 0 || i2 == i) && this.f == pmsVar.f && this.g == pmsVar.g && this.h == pmsVar.h && this.i == pmsVar.i && this.o == pmsVar.o && this.r == pmsVar.r && this.s == pmsVar.s && this.t == pmsVar.t && this.v == pmsVar.v && this.y == pmsVar.y && this.A == pmsVar.A && this.B == pmsVar.B && this.C == pmsVar.C && this.D == pmsVar.D && this.E == pmsVar.E && this.F == pmsVar.F && this.G == pmsVar.G && Float.compare(this.u, pmsVar.u) == 0 && Float.compare(this.w, pmsVar.w) == 0 && pts.R(this.c, pmsVar.c) && pts.R(this.d, pmsVar.d) && pts.R(this.k, pmsVar.k) && pts.R(this.m, pmsVar.m) && pts.R(this.n, pmsVar.n) && pts.R(this.e, pmsVar.e) && Arrays.equals(this.x, pmsVar.x) && pts.R(this.l, pmsVar.l) && pts.R(this.z, pmsVar.z) && pts.R(this.q, pmsVar.q) && e(pmsVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.d;
        String str3 = this.m;
        String str4 = this.n;
        String str5 = this.k;
        int i = this.j;
        String str6 = this.e;
        int i2 = this.s;
        int i3 = this.t;
        float f = this.u;
        int i4 = this.A;
        int i5 = this.B;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 104 + length2 + length3 + length4 + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public final int hashCode() {
        int i = this.H;
        if (i != 0) {
            return i;
        }
        String str = this.c;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        String str4 = this.k;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Metadata metadata = this.l;
        int hashCode5 = (hashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
        String str5 = this.m;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.n;
        int hashCode7 = ((((((((((((((((((((((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.o) * 31) + ((int) this.r)) * 31) + this.s) * 31) + this.t) * 31) + Float.floatToIntBits(this.u)) * 31) + this.v) * 31) + Float.floatToIntBits(this.w)) * 31) + this.y) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G;
        this.H = hashCode7;
        return hashCode7;
    }
}
