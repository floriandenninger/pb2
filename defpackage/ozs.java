package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer.MediaFormat;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ozs implements oyr, oyq, pga {
    private final afdw A;
    protected final pbx a;
    public final int b;
    public final ozr c;
    private final ozt d;
    private final ozn e = new ozn();
    private final LinkedList f;
    private final List g;
    private final int h;
    private final Handler i;
    private final int j;
    private int k;
    private long l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private pge q;
    private boolean r;
    private IOException s;
    private int t;
    private int u;
    private long v;
    private long w;
    private pbg x;
    private MediaFormat y;
    private ozv z;

    public ozs(ozt oztVar, afdw afdwVar, int i, Handler handler, ozr ozrVar, int i2, int i3) {
        this.d = oztVar;
        this.A = afdwVar;
        this.h = i;
        this.i = handler;
        this.c = ozrVar;
        this.b = i2;
        this.j = i3;
        LinkedList linkedList = new LinkedList();
        this.f = linkedList;
        this.g = Collections.unmodifiableList(linkedList);
        this.a = new pbx(afdwVar.f);
        this.k = 0;
        this.n = Long.MIN_VALUE;
    }

    private final void A() {
        if (this.c != null) {
            this.i.post(new ozo(this, 0));
        }
    }

    private final void B() {
        if (this.c != null) {
            this.i.post(new ozo(this, 1));
        }
    }

    private final long q() {
        if (y()) {
            return this.n;
        }
        if (this.r) {
            return -1L;
        }
        return ((ozz) this.f.getLast()).h;
    }

    private final void r() {
        this.e.b = null;
        s();
    }

    private final void s() {
        this.s = null;
        this.u = 0;
    }

    private final void t() {
        ozn oznVar = this.e;
        oznVar.c = false;
        oznVar.a = this.g.size();
        ozt oztVar = this.d;
        List list = this.g;
        long j = this.n;
        if (j == Long.MIN_VALUE) {
            j = this.l;
        }
        oztVar.f(list, j, this.e);
        this.r = this.e.c;
    }

    private final void u() {
        ozk ozkVar = this.e.b;
        if (ozkVar == null) {
            return;
        }
        this.w = SystemClock.elapsedRealtime();
        if (ozkVar instanceof ozz) {
            ozz ozzVar = (ozz) ozkVar;
            pbx pbxVar = this.a;
            ozzVar.k = pbxVar;
            ozzVar.l = pbxVar.a.b.a();
            this.f.add(ozzVar);
            if (y()) {
                this.n = Long.MIN_VALUE;
            }
            B();
        } else {
            B();
        }
        this.q.d(ozkVar, this);
    }

    private final void v(long j) {
        this.n = j;
        this.r = false;
        pge pgeVar = this.q;
        if (pgeVar.b) {
            pgeVar.a();
            return;
        }
        this.a.b();
        this.f.clear();
        r();
        w();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w() {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozs.w():void");
    }

    private final boolean x(int i) {
        long j;
        if (this.f.size() <= i) {
            return false;
        }
        long j2 = ((ozz) this.f.getLast()).h;
        ozz ozzVar = null;
        while (this.f.size() > i) {
            ozzVar = (ozz) this.f.removeLast();
            long j3 = ozzVar.g;
            this.r = false;
        }
        pbx pbxVar = this.a;
        int i2 = ozzVar.l;
        pck pckVar = pbxVar.a;
        pci pciVar = pckVar.b;
        int a = pciVar.a() - i2;
        opn.i(a >= 0 && a <= pciVar.d);
        if (a != 0) {
            pciVar.d -= a;
            int i3 = pciVar.g;
            int i4 = pciVar.a;
            int i5 = ((i3 + i4) - a) % i4;
            pciVar.g = i5;
            j = pciVar.b[i5];
        } else if (pciVar.e == 0 && pciVar.d == 0) {
            j = 0;
        } else {
            int i6 = pciVar.g;
            if (i6 == 0) {
                i6 = pciVar.a;
            }
            j = pciVar.c[r4] + pciVar.b[i6 - 1];
        }
        pckVar.g = j;
        int i7 = (int) (j - pckVar.f);
        int i8 = pckVar.a;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        int size = (pckVar.c.size() - i9) - 1;
        if (i10 == 0) {
            size++;
            i10 = 0;
        }
        for (int i11 = 0; i11 < size; i11++) {
            pckVar.i.e((anrc) pckVar.c.removeLast());
        }
        pckVar.j = (anrc) pckVar.c.peekLast();
        if (i10 == 0) {
            i10 = pckVar.a;
        }
        pckVar.h = i10;
        pbxVar.d = pbxVar.a.e(pbxVar.b) ? pbxVar.b.e : Long.MIN_VALUE;
        if (this.c != null) {
            this.i.post(new ozo(this, 3));
        }
        return true;
    }

    private final boolean y() {
        return this.n != Long.MIN_VALUE;
    }

    private final void z() {
        if (this.c != null) {
            this.i.post(new ozo(this, 2));
        }
    }

    @Override // defpackage.oyq
    public final int a() {
        int i = this.k;
        boolean z = true;
        if (i != 2 && i != 3) {
            z = false;
        }
        opn.k(z);
        return this.d.a();
    }

    public int b(int i, long j, oyn oynVar, oyp oypVar) {
        opn.k(this.k == 3);
        this.l = j;
        if (this.p || y()) {
            return -2;
        }
        boolean z = !this.a.e();
        ozz ozzVar = (ozz) this.f.getFirst();
        while (z && this.f.size() > 1 && ((ozz) this.f.get(1)).l <= this.a.a()) {
            this.f.removeFirst();
            ozzVar = (ozz) this.f.getFirst();
        }
        ozv ozvVar = ozzVar.c;
        if (!ozvVar.equals(this.z)) {
            int i2 = ozzVar.b;
            long j2 = ozzVar.g;
            if (this.c != null) {
                this.i.post(new ozq(this, ozvVar, i2, j2));
            }
        }
        this.z = ozvVar;
        if (z || ozzVar.j) {
            MediaFormat e = ozzVar.e();
            pbg h = ozzVar.h();
            if (!e.equals(this.y) || !pgz.p(this.x, h)) {
                oynVar.a = e;
                oynVar.b = h;
                this.y = e;
                this.x = h;
                return -4;
            }
            this.y = e;
            this.x = h;
        }
        if (!z) {
            return this.r ? -1 : -2;
        }
        if (!this.a.c(oypVar)) {
            return -2;
        }
        oypVar.d |= oypVar.e < this.m ? 134217728 : 0;
        return -3;
    }

    @Override // defpackage.oyq
    public final long c() {
        opn.k(this.k == 3);
        if (y()) {
            return this.n;
        }
        if (this.r) {
            return -3L;
        }
        long j = this.a.d;
        return j == Long.MIN_VALUE ? this.l : j;
    }

    @Override // defpackage.oyq
    public final long d(int i) {
        if (!this.p) {
            return Long.MIN_VALUE;
        }
        this.p = false;
        return this.m;
    }

    @Override // defpackage.oyq
    public final MediaFormat e(int i) {
        int i2 = this.k;
        boolean z = true;
        if (i2 != 2 && i2 != 3) {
            z = false;
        }
        opn.k(z);
        return this.d.b(i);
    }

    @Override // defpackage.oyr
    public final oyq f() {
        opn.k(this.k == 0);
        this.k = 1;
        return this;
    }

    @Override // defpackage.oyq
    public final void g(int i) {
        opn.k(this.k == 3);
        int i2 = this.t - 1;
        this.t = i2;
        opn.k(i2 == 0);
        this.k = 2;
        try {
            this.d.d(this.f);
            this.A.b(this);
            pge pgeVar = this.q;
            if (pgeVar.b) {
                pgeVar.a();
                return;
            }
            this.a.b();
            this.f.clear();
            r();
            this.A.a();
        } catch (Throwable th) {
            this.A.b(this);
            pge pgeVar2 = this.q;
            if (pgeVar2.b) {
                pgeVar2.a();
            } else {
                this.a.b();
                this.f.clear();
                r();
                this.A.a();
            }
            throw th;
        }
    }

    @Override // defpackage.oyq
    public final void h(int i, long j) {
        opn.k(this.k == 2);
        int i2 = this.t;
        this.t = i2 + 1;
        opn.k(i2 == 0);
        this.k = 3;
        this.d.e(i);
        afdw afdwVar = this.A;
        int i3 = this.h;
        afdwVar.a.add(this);
        afdwVar.b.put(this, new afdv(i3));
        afdwVar.c += i3;
        this.z = null;
        this.y = null;
        this.x = null;
        this.l = j;
        this.m = j;
        this.p = false;
        v(j);
    }

    @Override // defpackage.oyq
    public final void i() {
        IOException iOException = this.s;
        if (iOException == null || this.u <= this.j) {
            if (this.e.b == null) {
                this.d.g();
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override // defpackage.oyq
    public final void j() {
        opn.k(this.k != 3);
        pge pgeVar = this.q;
        if (pgeVar != null) {
            pgeVar.b();
            this.q = null;
        }
        this.k = 0;
    }

    public void k(long j) {
        opn.k(this.k == 3);
        long j2 = y() ? this.n : this.l;
        this.l = j;
        this.m = j;
        if (j2 == j) {
            return;
        }
        if (y() || !this.a.h(j)) {
            v(j);
        } else {
            boolean z = !this.a.e();
            while (z && this.f.size() > 1 && ((ozz) this.f.get(1)).l <= this.a.a()) {
                this.f.removeFirst();
            }
        }
        this.p = true;
    }

    @Override // defpackage.oyq
    public final boolean l(int i, long j) {
        opn.k(this.k == 3);
        this.l = j;
        this.d.c(j);
        w();
        return this.r || !this.a.e();
    }

    @Override // defpackage.oyq
    public final boolean m() {
        int i = this.k;
        opn.k(i == 1 || i == 2);
        if (this.k == 2) {
            return true;
        }
        if (!this.d.j()) {
            return false;
        }
        if (this.d.a() > 0) {
            String valueOf = String.valueOf(this.d.b(0).b);
            this.q = new pge(valueOf.length() != 0 ? "Loader:".concat(valueOf) : new String("Loader:"));
        }
        this.k = 2;
        return true;
    }

    @Override // defpackage.pga
    public final void n(pgc pgcVar) {
        SystemClock.elapsedRealtime();
        ozk ozkVar = this.e.b;
        this.d.h(ozkVar);
        if (ozkVar instanceof ozz) {
            ozz ozzVar = (ozz) ozkVar;
            ozkVar.a();
            int i = ozzVar.a;
            int i2 = ozzVar.b;
            ozv ozvVar = ozzVar.c;
            long j = ozzVar.g;
            long j2 = ozzVar.h;
            A();
        } else {
            ozkVar.a();
            int i3 = ozkVar.a;
            int i4 = ozkVar.b;
            ozv ozvVar2 = ozkVar.c;
            A();
        }
        r();
        w();
    }

    @Override // defpackage.pga
    public final void o(pgc pgcVar, IOException iOException) {
        this.s = iOException;
        this.u++;
        this.v = SystemClock.elapsedRealtime();
        if (this.c != null) {
            this.i.post(new ozp(this, iOException));
        }
        this.d.i(this.e.b, iOException);
        w();
    }

    @Override // defpackage.pga
    public final void p() {
        this.e.b.a();
        z();
        r();
        if (this.k == 3) {
            v(this.n);
            return;
        }
        this.a.b();
        this.f.clear();
        r();
        this.A.a();
    }
}
