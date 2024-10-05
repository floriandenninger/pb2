package defpackage;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rdw {
    private boolean A;
    private String B;
    private long C;
    private String D;
    private long E;
    private long F;
    public final rgt a;
    public Boolean b;
    public List c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public String j;
    public boolean k;
    private final String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private long q;
    private long r;
    private long s;
    private String t;
    private long u;
    private String v;
    private long w;
    private long x;
    private boolean y;
    private long z;

    public rdw(rgt rgtVar, String str) {
        qip.an(rgtVar);
        qip.ax(str);
        this.a = rgtVar;
        this.l = str;
        rgtVar.q();
    }

    public final void A(String str) {
        this.a.q();
        this.k |= !rkm.ap(this.v, str);
        this.v = str;
    }

    public final void B(String str) {
        this.a.q();
        this.k |= !rkm.ap(this.t, str);
        this.t = str;
    }

    public final void C(long j) {
        this.a.q();
        this.k |= this.u != j;
        this.u = j;
    }

    public final void D(long j) {
        this.a.q();
        this.k |= this.E != j;
        this.E = j;
    }

    public final void E(long j) {
        this.a.q();
        this.k |= this.x != j;
        this.x = j;
    }

    public final void F(long j) {
        this.a.q();
        this.k |= this.C != j;
        this.C = j;
    }

    public final void G(long j) {
        this.a.q();
        this.k |= this.F != j;
        this.F = j;
    }

    public final void H(String str) {
        this.a.q();
        this.k |= !rkm.ap(this.p, str);
        this.p = str;
    }

    public final void I(String str) {
        this.a.q();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.k |= true ^ rkm.ap(this.D, str);
        this.D = str;
    }

    public final void J(String str) {
        this.a.q();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.k |= true ^ rkm.ap(this.n, str);
        this.n = str;
    }

    public final void K(long j) {
        this.a.q();
        this.k |= this.w != j;
        this.w = j;
    }

    public final void L(String str) {
        this.a.q();
        this.k |= !rkm.ap(this.j, str);
        this.j = str;
    }

    public final void M(long j) {
        this.a.q();
        this.k |= this.s != j;
        this.s = j;
    }

    public final void N(long j) {
        qip.ao(j >= 0);
        this.a.q();
        this.k = (this.q != j) | this.k;
        this.q = j;
    }

    public final void O(long j) {
        this.a.q();
        this.k |= this.r != j;
        this.r = j;
    }

    public final void P(boolean z) {
        this.a.q();
        this.k |= this.y != z;
        this.y = z;
    }

    public final void Q(String str) {
        this.a.q();
        this.k |= !rkm.ap(this.o, str);
        this.o = str;
    }

    public final boolean R() {
        this.a.q();
        return this.A;
    }

    public final boolean S() {
        this.a.q();
        return this.y;
    }

    public final long a() {
        this.a.q();
        return this.z;
    }

    public final long b() {
        this.a.q();
        return this.u;
    }

    public final long c() {
        this.a.q();
        return this.E;
    }

    public final long d() {
        this.a.q();
        return this.x;
    }

    public final long e() {
        this.a.q();
        return this.C;
    }

    public final long f() {
        this.a.q();
        return this.F;
    }

    public final long g() {
        this.a.q();
        return this.w;
    }

    public final long h() {
        this.a.q();
        return this.s;
    }

    public final long i() {
        this.a.q();
        return this.q;
    }

    public final long j() {
        this.a.q();
        return this.r;
    }

    public final Boolean k() {
        this.a.q();
        return this.b;
    }

    public final String l() {
        this.a.q();
        return this.B;
    }

    public final String m() {
        this.a.q();
        return this.l;
    }

    public final String n() {
        this.a.q();
        return this.m;
    }

    public final String o() {
        this.a.q();
        return this.v;
    }

    public final String p() {
        this.a.q();
        return this.t;
    }

    public final String q() {
        this.a.q();
        return this.p;
    }

    public final String r() {
        this.a.q();
        return this.D;
    }

    public final String s() {
        this.a.q();
        return this.n;
    }

    public final String t() {
        this.a.q();
        return this.o;
    }

    public final List u() {
        this.a.q();
        return this.c;
    }

    public final void v() {
        this.a.q();
        long j = this.q + 1;
        if (j > 2147483647L) {
            this.a.aF().f.b("Bundle index overflow. appId", rfp.a(this.l));
            j = 0;
        }
        this.k = true;
        this.q = j;
    }

    public final void w(String str) {
        this.a.q();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.k |= true ^ rkm.ap(this.B, str);
        this.B = str;
    }

    public final void x(boolean z) {
        this.a.q();
        this.k |= this.A != z;
        this.A = z;
    }

    public final void y(long j) {
        this.a.q();
        this.k |= this.z != j;
        this.z = j;
    }

    public final void z(String str) {
        this.a.q();
        this.k |= !rkm.ap(this.m, str);
        this.m = str;
    }
}
