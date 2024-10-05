package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gmo extends js {
    public final List a = new ArrayList();
    public int b;
    public int c;
    public gmq d;
    private final vw e;
    private final gmm f;
    private final boolean g;

    public gmo(vw vwVar, gmm gmmVar) {
        this.e = vwVar;
        this.f = gmmVar;
        this.g = vwVar.b;
        vwVar.u(this);
        s();
    }

    private final long u(int i) {
        return this.g ? this.e.mu(i) : this.f.b(i);
    }

    private final void v(int i) {
        this.a.remove(i);
    }

    private final void w(int i, int i2) {
        while (i < this.a.size()) {
            ((gmn) this.a.get(i)).b += i2;
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void x(int r7, int r8) {
        /*
            r6 = this;
            int r8 = r8 + r7
            int r8 = r8 + (-1)
            int r0 = r6.l(r8)
            java.util.List r1 = r6.a
            int r1 = r1.size()
            r2 = 1
            if (r0 != r1) goto L32
            java.util.List r1 = r6.a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1a
            r1 = r7
            goto L2b
        L1a:
            java.util.List r1 = r6.a
            int r3 = r0 + (-1)
            java.lang.Object r1 = r1.get(r3)
            gmn r1 = (defpackage.gmn) r1
            int r1 = r1.b
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r7, r1)
        L2b:
            boolean r1 = r6.y(r0, r1, r8)
            int r0 = r0 + (-1)
            goto L33
        L32:
            r1 = 0
        L33:
            if (r0 < 0) goto L9b
            java.util.List r3 = r6.a
            int r3 = r3.size()
            if (r0 >= r3) goto L9b
            java.util.List r3 = r6.a
            java.lang.Object r3 = r3.get(r0)
            gmn r3 = (defpackage.gmn) r3
        L45:
            int r4 = r3.b
            if (r4 < r7) goto L8c
            if (r4 > r8) goto L7f
            gmm r5 = r6.f
            int r4 = r5.a(r4)
            boolean r5 = defpackage.etx.k(r4)
            if (r5 == 0) goto L5c
            r6.v(r0)
        L5a:
            r1 = 1
            goto L63
        L5c:
            int r5 = r3.a
            if (r4 == r5) goto L63
            r3.a = r4
            goto L5a
        L63:
            if (r0 <= 0) goto L7f
            java.util.List r4 = r6.a
            int r5 = r0 + (-1)
            java.lang.Object r4 = r4.get(r5)
            gmn r4 = (defpackage.gmn) r4
            int r4 = r4.b
            int r4 = r4 + r2
            int r4 = java.lang.Math.max(r7, r4)
            int r5 = r3.b
            int r5 = r5 + (-1)
            boolean r4 = r6.y(r0, r4, r5)
            r1 = r1 | r4
        L7f:
            if (r0 <= 0) goto L8c
            int r0 = r0 + (-1)
            java.util.List r3 = r6.a
            java.lang.Object r3 = r3.get(r0)
            gmn r3 = (defpackage.gmn) r3
            goto L45
        L8c:
            int r2 = r3.b
            if (r7 >= r2) goto L9b
            int r2 = r2 + (-1)
            int r8 = java.lang.Math.min(r8, r2)
            boolean r7 = r6.y(r0, r7, r8)
            r1 = r1 | r7
        L9b:
            if (r1 == 0) goto La4
            gmq r7 = r6.d
            if (r7 == 0) goto La4
            r7.a()
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmo.x(int, int):void");
    }

    private final boolean y(int i, int i2, int i3) {
        boolean z = false;
        while (i3 >= i2) {
            int a = this.f.a(i3);
            if (!etx.k(a)) {
                this.a.add(i, new gmn(a, i3, u(i3)));
                z = true;
            }
            i3--;
        }
        return z;
    }

    @Override // defpackage.js
    public final void c() {
        r();
    }

    @Override // defpackage.js
    public final void d(int i, int i2) {
        x(i, i2);
    }

    @Override // defpackage.js
    public final void e(int i, int i2, Object obj) {
        x(i, i2);
    }

    @Override // defpackage.js
    public final void f(int i, int i2) {
        boolean z;
        gmq gmqVar;
        int l = l(i);
        if (l < this.a.size()) {
            w(l, i2);
            z = true;
        } else {
            z = false;
        }
        if (!(y(l, i, (i2 + i) - 1) || z) || (gmqVar = this.d) == null) {
            return;
        }
        gmqVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        w(r0, -r6);
        r5 = r4.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r5 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    @Override // defpackage.js
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.l(r5)
            java.util.List r1 = r4.a
            int r1 = r1.size()
        La:
            java.util.List r2 = r4.a
            int r2 = r2.size()
            if (r0 >= r2) goto L26
            java.util.List r2 = r4.a
            java.lang.Object r2 = r2.get(r0)
            gmn r2 = (defpackage.gmn) r2
            int r2 = r2.b
            if (r2 < r5) goto L26
            int r3 = r5 + r6
            if (r2 >= r3) goto L26
            r4.v(r0)
            goto La
        L26:
            if (r0 >= r1) goto L33
            int r5 = -r6
            r4.w(r0, r5)
            gmq r5 = r4.d
            if (r5 == 0) goto L33
            r5.a()
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmo.g(int, int):void");
    }

    public final int l(int i) {
        int binarySearch = Collections.binarySearch(this.a, new gmn(0, i, Long.MAX_VALUE));
        return binarySearch >= 0 ? binarySearch : -(binarySearch + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int m() {
        int i = this.b;
        if (i == -1) {
            return 0;
        }
        return ((gmn) this.a.get(i)).a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int n() {
        if (this.a.isEmpty()) {
            return -1;
        }
        return ((gmn) this.a.get(0)).b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int o() {
        int i = this.b;
        if (i == -1) {
            if (this.a.isEmpty()) {
                return 0;
            }
            return ((gmn) this.a.get(0)).a;
        }
        int i2 = i + 1;
        if (i2 < this.a.size()) {
            return ((gmn) this.a.get(i2)).a;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int p() {
        int i = this.b;
        if (i == -1) {
            return n();
        }
        int i2 = i + 1;
        if (i2 < this.a.size()) {
            return ((gmn) this.a.get(i2)).b;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long q() {
        int i = this.b;
        if (i == -1) {
            return Long.MAX_VALUE;
        }
        return ((gmn) this.a.get(i)).c;
    }

    public final void r() {
        this.a.clear();
        for (int i = 0; i < this.e.b(); i++) {
            int a = this.f.a(i);
            if (!etx.k(a)) {
                this.a.add(new gmn(a, i, u(i)));
            }
        }
        gmq gmqVar = this.d;
        if (gmqVar != null) {
            gmqVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s() {
        this.b = -1;
        this.c = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean t() {
        return !this.a.isEmpty();
    }
}
