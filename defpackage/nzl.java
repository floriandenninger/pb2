package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.FlexyBehavior;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nzl extends obb implements nzc, nyz {
    public static final /* synthetic */ int t = 0;
    private boolean G;
    private boolean H;
    private float I;
    private amvf K;
    private float L;
    private float M;
    private boolean N;
    private int O;
    public final Context a;
    public final nze b;
    public FlexyBehavior d;
    public Set f;
    public gnc g;
    public boolean h;
    public int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public int p;
    public int q;
    public float r;
    public boolean s;
    private final acpl v;
    private final aypn w;
    private final oeu x;
    private int P = 3;
    private final ayqw F = new ayqw();
    public final Rect e = new Rect();
    private final Rect y = new Rect();
    private final Rect z = new Rect();
    private final Rect A = new Rect();
    private final Rect B = new Rect();

    /* renamed from: J, reason: collision with root package name */
    private float f247J = 1.777f;
    public float i = 1.777f;
    private final TreeMap C = new TreeMap(bea.k);
    private final Set D = new HashSet();
    private final Set E = new HashSet();
    public final ValueAnimator c = ValueAnimator.ofInt(new int[0]);

    public nzl(Context context, acpl acplVar, nze nzeVar, aypn aypnVar, oeu oeuVar) {
        this.a = context;
        this.v = acplVar;
        this.b = nzeVar;
        this.w = aypnVar;
        this.x = oeuVar;
        this.O = 1;
        this.O = 1;
        this.I = nzeVar.a;
    }

    private final void M(float f) {
        this.h |= !evr.bx(f, this.M);
        this.M = f;
    }

    private final void N() {
        C();
        D(this.p, this.o);
    }

    private final boolean O() {
        nzo w = w();
        return w != null && w.a() == 5 && yjk.Y(this.a);
    }

    private final boolean P() {
        Map.Entry firstEntry = this.C.firstEntry();
        return firstEntry != null && ((Integer) firstEntry.getKey()).intValue() == 1;
    }

    private final boolean Q(int i, int i2) {
        if (P() || O()) {
            return true;
        }
        float f = this.b.e;
        return f > 0.0f && ((float) i2) < ((float) i) * (1.0f - f);
    }

    private static final int R(int i, float f) {
        return Math.round(i / f);
    }

    private final void S() {
        this.h |= P();
        F(this.i, true, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(float f) {
        B(f, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(float f, boolean z) {
        if (f == 0.0f || evr.bx(f, this.f247J)) {
            return;
        }
        this.h |= !evr.bx(this.f247J, f);
        this.f247J = f;
        C();
        D(this.l, this.k);
        F(z ? this.M : this.L, true, false);
    }

    public final void C() {
        float f;
        nzo w = w();
        float f2 = 2.4f;
        if (w != null) {
            f = ((Float) w.b(this.f247J).g()).floatValue();
        } else {
            f = this.G ? 2.4f : this.f247J;
        }
        this.L = f;
        if (w != null) {
            f2 = ((Float) w.b(this.f247J).h()).floatValue();
        } else if (!this.G) {
            f2 = this.I;
        }
        M(f2);
        float f3 = this.L;
        if (f3 > this.M) {
            M(f3);
        }
    }

    public final void D(int i, int i2) {
        float f = this.M;
        if (f == 0.0f) {
            f = this.f247J;
        }
        float f2 = this.L;
        if (f2 == 0.0f) {
            f2 = this.f247J;
        }
        if (f < f2) {
            afsi.b(2, 25, String.format("Flexy invalid boundedMaxPlayerRatio=%s < boundedMinPlayerRatio=%s  maxPlayerRatio=%s minPlayerRatio=%s videoRatio=%s", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(this.M), Float.valueOf(this.L), Float.valueOf(this.f247J)));
            f2 = Math.max(f2, f);
        }
        int min = Math.min(Math.round(i2 * this.b.b), (i2 - this.b.c) - this.n);
        int min2 = Math.min(min, R(i, f));
        int min3 = Math.min(min, R(i, f2));
        if (min2 > min3) {
            afsi.b(2, 25, String.format("Flexy cannot have minBoundedPlayerHeight=%s > maxBoundedPlayerHeight=%s boundsWidth=%s maxPlayerHeight=%s boundedMaxPlayerRatio=%s boundedMinPlayerRatio=%s", Integer.valueOf(min2), Integer.valueOf(min3), Integer.valueOf(i), Integer.valueOf(min), Float.valueOf(f), Float.valueOf(f2)));
            min3 = min2;
        }
        amvf d = amvf.d(Integer.valueOf(min2), Integer.valueOf(min3));
        amvf amvfVar = this.K;
        if (amvfVar == null || !amvfVar.equals(d)) {
            this.h = true;
            this.K = d;
        }
    }

    public final void E(int i, int i2, int i3, float f) {
        if (i == this.z.height() && i2 == this.l && i3 == this.k && f == this.m && !this.h && !this.H) {
            return;
        }
        this.h = false;
        this.H = false;
        this.j = i;
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((nzb) it.next()).c(i);
        }
        this.k = i3;
        this.l = i2;
        this.i = i2 / i;
        this.m = f;
        this.z.set(0, 0, i2, i);
        int max = Math.max(i3 - i, 0);
        if (this.s) {
            max += this.e.top + this.e.bottom;
        }
        this.A.set(0, i, i2, max + i);
        int R = R(i2, this.f247J);
        if (Q(R, i)) {
            fav.B(this.f247J, this.z, this.y);
        } else {
            this.y.set(0, 0, i2, R);
            this.y.offset(0, -((int) ((this.y.height() - this.z.height()) / f)));
        }
        J();
    }

    public final void F(float f, boolean z, boolean z2) {
        Integer num;
        if (this.p == 0 || this.o == 0) {
            return;
        }
        float min = Math.min(Math.max(f, Math.max(this.f247J, this.L)), this.M);
        int R = R(this.p, min);
        if (!this.K.a(Integer.valueOf(R))) {
            if (((Integer) this.K.g()).intValue() > R) {
                num = (Integer) this.K.g();
            } else {
                num = (Integer) this.K.h();
            }
            R = num.intValue();
        }
        amvf amvfVar = this.K;
        int i = true != Q(R(this.p, this.f247J), R) ? 3 : 2;
        if (e()) {
            H(2, i, z2);
        } else if (R == ((Integer) amvfVar.h()).intValue()) {
            H(5, i, z2);
        } else if (R == ((Integer) amvfVar.g()).intValue()) {
            H(3, i, z2);
        } else {
            H(4, i, z2);
        }
        boolean z3 = evr.by(this.f247J, this.I) && evr.bx(min, this.I);
        if (this.N != z3) {
            this.N = z3;
            Iterator it = this.D.iterator();
            while (it.hasNext()) {
                ((nza) it.next()).g(z3);
            }
        }
        nzo w = w();
        int i2 = (w == null || w.a() != 5 || ((Float) w.b(this.f247J).h()).floatValue() >= this.f247J) ? 3 : 2;
        this.c.cancel();
        if (!z || O()) {
            E(R, this.p, this.o, i2);
            return;
        }
        this.q = R;
        this.r = i2;
        this.c.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G(float f, boolean z, boolean z2) {
        if (this.C.containsKey(4)) {
            return;
        }
        F(f, z, z2);
    }

    public final void H(int i, int i2, boolean z) {
        if (i == this.O && i2 == this.P) {
            return;
        }
        this.O = i;
        this.P = i2;
        aone createBuilder = aqwu.a.createBuilder();
        int i3 = this.O;
        createBuilder.copyOnWrite();
        aqwu aqwuVar = (aqwu) createBuilder.instance;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        aqwuVar.c = i4;
        aqwuVar.b |= 1;
        int i5 = this.P;
        createBuilder.copyOnWrite();
        aqwu aqwuVar2 = (aqwu) createBuilder.instance;
        int i6 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        aqwuVar2.e = i6;
        aqwuVar2.b |= 4;
        createBuilder.copyOnWrite();
        aqwu aqwuVar3 = (aqwu) createBuilder.instance;
        aqwuVar3.b |= 2;
        aqwuVar3.d = z;
        aqwu aqwuVar4 = (aqwu) createBuilder.build();
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).cy(aqwuVar4);
        this.v.c((arpp) a.build());
    }

    @Override // defpackage.nyz
    public final int a() {
        return ((Integer) this.K.h()).intValue();
    }

    @Override // defpackage.nyz
    public final int b() {
        return ((Integer) this.K.g()).intValue();
    }

    @Override // defpackage.nyz
    public final int c() {
        return this.z.height();
    }

    @Override // defpackage.nyz
    public final void d(int i) {
        if (a() < i || b() > i) {
            return;
        }
        G(this.l / i, false, true);
    }

    @Override // defpackage.nyz
    public final boolean e() {
        return evr.bx(this.L, this.M);
    }

    @Override // defpackage.nzc
    public final nzo f(int i) {
        nzo nzoVar = (nzo) this.C.remove(Integer.valueOf(i));
        if (nzoVar == null) {
            return null;
        }
        N();
        S();
        return nzoVar;
    }

    @Override // defpackage.nzc
    public final void g(int i, boolean z) {
        G(i != 0 ? this.M : this.L, true, z);
    }

    @Override // defpackage.nzc
    public final void h(nzo nzoVar) {
        nzoVar.getClass();
        this.C.put(Integer.valueOf(nzoVar.a()), nzoVar);
        if (this.f.contains(Integer.valueOf(nzoVar.a()))) {
            return;
        }
        this.H = true;
        N();
        S();
    }

    @Override // defpackage.nzc
    public final void i(nza nzaVar) {
        Set set = this.D;
        nzaVar.getClass();
        set.add(nzaVar);
    }

    @Override // defpackage.nzc
    public final void j(nzb nzbVar) {
        Set set = this.E;
        nzbVar.getClass();
        set.add(nzbVar);
    }

    @Override // defpackage.nzc
    public final void k(nza nzaVar) {
        this.D.remove(nzaVar);
    }

    @Override // defpackage.obp
    public final float l() {
        return 1.0f;
    }

    @Override // defpackage.obp
    public final float m() {
        return 0.0f;
    }

    @Override // defpackage.obp
    public final float n() {
        return 0.0f;
    }

    @Override // defpackage.obp
    public final float o() {
        return 1.0f;
    }

    @Override // defpackage.obp
    public final float p() {
        return 1.0f;
    }

    @Override // defpackage.obp
    public final float q() {
        return 0.0f;
    }

    @Override // defpackage.obp
    public final Rect r() {
        return this.A;
    }

    @Override // defpackage.obp
    public final Rect s() {
        return u;
    }

    @Override // defpackage.obp
    public final Rect t() {
        return this.z;
    }

    @Override // defpackage.obp
    public final Rect u() {
        return this.B;
    }

    @Override // defpackage.obp
    public final Rect v() {
        return this.y;
    }

    final nzo w() {
        for (Map.Entry entry : this.C.entrySet()) {
            if (!this.f.contains(entry.getKey())) {
                return (nzo) entry.getValue();
            }
        }
        return null;
    }

    @Override // defpackage.obp
    public final void x() {
        final int i = 1;
        final int i2 = 0;
        this.F.g(this.w.X(new ayrs(this) { // from class: nzk
            public final /* synthetic */ nzl a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    nzl nzlVar = this.a;
                    boolean z = ((Integer) obj).intValue() == 3;
                    if (nzlVar.s == z) {
                        return;
                    }
                    nzlVar.s = z;
                    nzlVar.h = true;
                    nzlVar.F(nzlVar.i, false, false);
                    return;
                }
                this.a.e.set(((zck) obj).a.a);
            }
        }), this.x.a.ax(new ayrs(this) { // from class: nzk
            public final /* synthetic */ nzl a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    nzl nzlVar = this.a;
                    boolean z = ((Integer) obj).intValue() == 3;
                    if (nzlVar.s == z) {
                        return;
                    }
                    nzlVar.s = z;
                    nzlVar.h = true;
                    nzlVar.F(nzlVar.i, false, false);
                    return;
                }
                this.a.e.set(((zck) obj).a.a);
            }
        }));
    }

    @Override // defpackage.obp
    public final void y() {
        this.F.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    @Override // defpackage.obp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(int r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.l
            r1 = 1
            r2 = 0
            if (r10 != r0) goto Lc
            int r3 = r9.k
            if (r11 != r3) goto Lc
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            int r4 = r9.p
            if (r0 != r4) goto L19
            int r0 = r9.k
            int r4 = r9.o
            if (r0 != r4) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r3 == 0) goto L20
            if (r0 != 0) goto L1f
            goto L20
        L1f:
            return
        L20:
            boolean r0 = r9.G
            nze r3 = r9.b
            float r3 = r3.d
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L41
            gnc r3 = r9.g
            if (r3 == 0) goto L41
            android.view.View r3 = r3.a
            ko r3 = defpackage.jw.s(r3)
            if (r3 == 0) goto L41
            r5 = 8
            boolean r3 = r3.y(r5)
            if (r3 == 0) goto L41
            r3 = 1
            goto L42
        L41:
            r3 = 0
        L42:
            r9.G = r3
            float r5 = r9.I
            if (r10 == 0) goto L5f
            if (r11 == 0) goto L5f
            nze r6 = r9.b
            float r7 = r6.d
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L53
            goto L5f
        L53:
            float r4 = r6.a
            float r6 = (float) r10
            float r8 = (float) r11
            float r8 = r8 * r7
            float r6 = r6 / r8
            float r4 = java.lang.Math.max(r4, r6)
            goto L63
        L5f:
            nze r4 = r9.b
            float r4 = r4.a
        L63:
            r9.I = r4
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L6b
            if (r0 == r3) goto L6e
        L6b:
            r9.C()
        L6e:
            r9.D(r10, r11)
            int r4 = r9.j
            if (r4 != 0) goto L7f
            float r4 = (float) r10
            float r5 = r9.i
            float r4 = r4 / r5
            int r4 = java.lang.Math.round(r4)
            r9.j = r4
        L7f:
            r9.p = r10
            r9.o = r11
            if (r0 == r3) goto L88
            float r10 = r9.i
            goto L8a
        L88:
            float r10 = r9.L
        L8a:
            android.animation.ValueAnimator r11 = r9.c
            boolean r11 = r11.isRunning()
            if (r11 != 0) goto L96
            if (r0 == r3) goto L95
            goto L96
        L95:
            r1 = 0
        L96:
            r9.F(r10, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzl.z(int, int):void");
    }
}
