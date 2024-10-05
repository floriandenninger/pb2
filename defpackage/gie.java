package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment$SavedState;
import android.util.SparseArray;
import com.google.android.apps.youtube.app.common.ui.navigation.Pane;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Predicate;
import j$.util.function.Supplier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gie implements gje, bub {
    public final SparseArray a;
    public final axpg b;
    public final its c;
    private final dd d;
    private int e;
    private gjc f;
    private final aaea l;
    private final List m;
    private final axzg n;
    private final axzg o;
    private final aoae p;
    private final zik g = zik.a(geo.f);
    private final zik h = zik.a(geo.d);
    private final zik i = zik.a(geo.e);
    private final aoae q = aoae.U();
    private final zik j = zik.a(geo.c);
    private final azrs k = azrh.e().aT();

    public gie(ml mlVar, aoae aoaeVar, axpg axpgVar, aaea aaeaVar, its itsVar, axzg axzgVar, axzg axzgVar2, Optional optional, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        mlVar.getClass();
        this.d = mlVar.getSupportFragmentManager();
        aoaeVar.getClass();
        this.p = aoaeVar;
        this.b = axpgVar;
        this.l = aaeaVar;
        this.c = itsVar;
        this.n = axzgVar;
        this.o = axzgVar2;
        this.e = ((Integer) optional.filter(ghv.a).map(evy.p).orElse(0)).intValue();
        this.a = (SparseArray) optional.map(evy.q).orElseGet(ghx.a);
        this.m = (List) optional.map(evy.r).orElseGet(ghx.c);
    }

    private final Pane L() {
        final int i = this.e;
        Pane pane = (Pane) O(i).orElseGet(new Supplier() { // from class: ghw
            @Override // j$.util.function.Supplier
            public final Object get() {
                return new Pane(i);
            }
        });
        this.a.put(i, pane);
        return pane;
    }

    private final Optional M() {
        return O(this.e);
    }

    private final Optional N() {
        return M().map(evy.s);
    }

    private final Optional O(int i) {
        return Optional.ofNullable((Pane) this.a.get(i));
    }

    private final void P(PaneDescriptor paneDescriptor) {
        Optional.ofNullable(paneDescriptor).map(ght.f).ifPresent(new ghz(this, 0));
    }

    private final void Q() {
        this.m.clear();
        this.q.i(gfd.i);
    }

    private final void R() {
        Object obj;
        String str;
        PaneDescriptor d = d();
        if (d == null) {
            return;
        }
        gir f = f();
        Fragment$SavedState fragment$SavedState = null;
        if (f == null || !PaneDescriptor.m(PaneDescriptor.b(f), d, this.p)) {
            obj = null;
            str = null;
        } else {
            fragment$SavedState = this.d.c(f);
            str = f.F;
            obj = f.aT();
        }
        L().b.d(d, fragment$SavedState, obj, str);
    }

    private final boolean S(final Predicate predicate) {
        Optional map = Optional.ofNullable(f()).filter(new han(giy.class, 1)).map(new hau(giy.class, 1));
        predicate.getClass();
        return ((Boolean) map.map(new Function() { // from class: ghs
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(Predicate.this.test((giy) obj));
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean T(final defpackage.gix r17) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gie.T(gix):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean U(defpackage.gix r12) {
        /*
            r11 = this;
            com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r1 = r12.a
            r0 = 0
            if (r1 != 0) goto L6
            return r0
        L6:
            j$.util.Optional r2 = r11.N()
            com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r3 = r11.d()
            com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r4 = r11.e()
            boolean r12 = r11.V(r12)
            r7 = 1
            if (r12 != 0) goto L23
            if (r3 == 0) goto L23
            boolean r12 = r11.W(r3, r1)
            if (r12 != 0) goto L23
            r12 = 1
            goto L24
        L23:
            r12 = 0
        L24:
            if (r12 == 0) goto L2b
            r11.R()
        L29:
            r6 = 0
            goto L6f
        L2b:
            r11.P(r3)
            boolean r5 = r2.isPresent()
            if (r5 == 0) goto L29
            java.lang.Object r5 = r2.get()
            com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack r5 = (com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack) r5
            r6 = 0
        L3b:
            boolean r8 = r5.e()
            if (r8 != 0) goto L6f
            com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack$BackStackEntry r8 = r5.b()
            r8.getClass()
            int r9 = r5.a()
            if (r9 != r7) goto L59
            com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r9 = r8.a
            aoae r10 = r11.p
            boolean r9 = com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor.m(r9, r4, r10)
            if (r9 == 0) goto L59
            r6 = 1
        L59:
            com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r9 = r8.a
            boolean r9 = r11.W(r9, r1)
            if (r9 == 0) goto L6f
            r5.c()
            com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r8 = r8.a
            r11.P(r8)
            if (r6 == 0) goto L3b
            r11.C(r1)
            goto L3b
        L6f:
            if (r12 != 0) goto L94
            if (r6 != 0) goto L94
            ght r5 = defpackage.ght.a
            j$.util.Optional r2 = r2.map(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            java.lang.Object r2 = r2.orElse(r5)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L94
            if (r4 == 0) goto L91
            boolean r2 = r11.W(r4, r1)
            if (r2 == 0) goto L94
        L91:
            r11.C(r1)
        L94:
            gir r2 = r11.f()
            r11.s(r3, r2, r1)
            if (r7 == r12) goto L9f
            r5 = 0
            goto La5
        L9f:
            r2 = 2130772043(0x7f01004b, float:1.7147193E38)
            r5 = 2130772043(0x7f01004b, float:1.7147193E38)
        La5:
            if (r7 == r12) goto La9
            r6 = 0
            goto Laf
        La9:
            r12 = 2130772044(0x7f01004c, float:1.7147195E38)
            r6 = 2130772044(0x7f01004c, float:1.7147195E38)
        Laf:
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r11
            r0.y(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gie.U(gix):boolean");
    }

    @Deprecated
    private final boolean V(gix gixVar) {
        if (!gixVar.c) {
            return false;
        }
        N().ifPresent(gfd.g);
        C(gixVar.a);
        return true;
    }

    private final boolean W(final PaneDescriptor paneDescriptor, final PaneDescriptor paneDescriptor2) {
        return ((Boolean) Optional.ofNullable(this.f).map(new Function() { // from class: ghp
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((gjc) obj).j(PaneDescriptor.this, paneDescriptor2));
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue();
    }

    @Override // defpackage.gje
    public final void A(final ClassLoader classLoader) {
        final int i = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            Pane pane = (Pane) this.a.valueAt(i2);
            Iterator it = pane.b.a.iterator();
            while (it.hasNext()) {
                ((PaneBackStack.BackStackEntry) it.next()).a.h(classLoader);
            }
            final int i3 = 1;
            Optional.ofNullable(pane.c).ifPresent(new Consumer() { // from class: ghm
                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return i3 != 0 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
                }

                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    if (i3 == 0) {
                        ((PaneDescriptor) obj).h(classLoader);
                    } else {
                        ((PaneDescriptor) obj).h(classLoader);
                    }
                }
            });
            Optional.ofNullable(pane.d).ifPresent(new Consumer() { // from class: ghm
                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return i != 0 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
                }

                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    if (i == 0) {
                        ((PaneDescriptor) obj).h(classLoader);
                    } else {
                        ((PaneDescriptor) obj).h(classLoader);
                    }
                }
            });
        }
    }

    @Override // defpackage.gje
    public final void B(gjc gjcVar) {
        this.f = gjcVar;
    }

    public final void C(PaneDescriptor paneDescriptor) {
        (paneDescriptor != null ? Optional.of(L()) : M()).ifPresent(new gib(paneDescriptor, 1));
    }

    @Override // defpackage.gje
    public final void D(int i, int i2) {
        if (i >= 0) {
            int i3 = this.e;
            if (i != i3) {
                final PaneDescriptor d = d();
                if (d != null) {
                    R();
                }
                this.e = i;
                Optional N = N();
                if (((Boolean) N.map(ght.e).orElse(false)).booleanValue()) {
                    PaneBackStack.BackStackEntry c = ((PaneBackStack) N.get()).c();
                    c.getClass();
                    s(d, f(), c.a);
                    y(c.a, c.b, c.c, c.d, 0, 0);
                } else {
                    Optional.ofNullable(e()).ifPresent(new Consumer() { // from class: gia
                        @Override // j$.util.function.Consumer
                        public final void accept(Object obj) {
                            gie gieVar = gie.this;
                            PaneDescriptor paneDescriptor = (PaneDescriptor) obj;
                            gieVar.s(d, gieVar.f(), paneDescriptor);
                            gieVar.y(paneDescriptor, null, null, null, 0, 0);
                        }

                        @Override // j$.util.function.Consumer
                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer.CC.$default$andThen(this, consumer);
                        }
                    });
                }
                if (i2 != 1) {
                    this.m.remove(Integer.valueOf(this.e));
                    this.m.add(Integer.valueOf(i3));
                }
                this.j.b(gic.c(i3, i2));
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException("argument cannot be negative");
    }

    @Override // defpackage.giy
    public final boolean E() {
        final PaneDescriptor d = d();
        return ((Boolean) N().map(new Function() { // from class: gho
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                PaneDescriptor paneDescriptor = PaneDescriptor.this;
                PaneBackStack paneBackStack = (PaneBackStack) obj;
                boolean z = false;
                if (paneBackStack.e() || (paneBackStack.a() == 1 && amkq.b(Optional.ofNullable(paneBackStack.b()).map(ght.b).orElse(null), paneDescriptor))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).orElse(true)).booleanValue() && d != null && PaneDescriptor.m(d, e(), this.p) && ((Boolean) Optional.ofNullable(f()).filter(new han(giy.class, 1)).map(new hau(giy.class, 1)).map(ght.g).orElse(true)).booleanValue();
    }

    @Override // defpackage.giy
    public final boolean F() {
        giw b = gix.b();
        b.c(1);
        b.a = null;
        b.b(false);
        return T(b.a());
    }

    @Override // defpackage.giy
    public final boolean G() {
        giw b = gix.b();
        b.c(2);
        b.a = null;
        b.b(false);
        return T(b.a());
    }

    @Override // defpackage.giy
    public final boolean H(PaneDescriptor paneDescriptor) {
        giw b = gix.b();
        b.c(0);
        b.a = paneDescriptor;
        b.b(false);
        return T(b.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gje
    public final boolean I() {
        Boolean bool;
        gir f;
        if (F()) {
            return true;
        }
        amsx j = j();
        while (!this.m.isEmpty()) {
            Integer num = (Integer) this.m.remove(r2.size() - 1);
            num.getClass();
            int intValue = num.intValue();
            if (j.contains(Integer.valueOf(intValue))) {
                D(intValue, 1);
                return true;
            }
        }
        OptionalInt optionalInt = (OptionalInt) aypy.T(j).L(new ayrw() { // from class: ghy
            @Override // defpackage.ayrw
            public final boolean a(Object obj) {
                gie gieVar = gie.this;
                Optional i = gieVar.i(((Integer) obj).intValue());
                final its itsVar = gieVar.c;
                return ((Boolean) i.map(new Function() { // from class: ghr
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return Function.CC.$default$andThen(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj2) {
                        return Boolean.valueOf(its.this.i((PaneDescriptor) obj2));
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return Function.CC.$default$compose(this, function);
                    }
                }).orElse(false)).booleanValue();
            }
        }).Y(fiv.n).aC(OptionalInt.empty());
        if (!optionalInt.isPresent() || this.e == optionalInt.getAsInt()) {
            aqvj aqvjVar = this.n.b.b().C;
            if (aqvjVar == null) {
                aqvjVar = aqvj.a;
            }
            if (aqvjVar.a(45359221L)) {
                aoot aootVar = aqvjVar.b;
                if (!aootVar.containsKey(45359221L)) {
                    throw new IllegalArgumentException();
                }
                aqvk aqvkVar = (aqvk) aootVar.get(45359221L);
                bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
            } else {
                bool = false;
            }
            return bool.booleanValue() && (f = f()) != null && f.be();
        }
        D(optionalInt.getAsInt(), 1);
        return true;
    }

    @Override // defpackage.giy
    public final boolean J() {
        giw b = gix.b();
        b.c(4);
        b.a = null;
        b.b(false);
        return T(b.a());
    }

    @Override // defpackage.gje
    public final void K(onw onwVar) {
        this.h.c(onwVar);
    }

    @Override // defpackage.bub
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("activePaneKey", this.e);
        bundle.putIntegerArrayList("tabBackStack", new ArrayList<>(this.m));
        bundle.putSparseParcelableArray("panes", this.a);
        return bundle;
    }

    @Override // defpackage.gje
    public final int b() {
        return this.e;
    }

    @Override // defpackage.gje
    public final int c() {
        return ((Integer) Optional.ofNullable(this.f).map(new Function() { // from class: ghn
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((gjc) obj).h(gie.this.d()));
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).orElse(0)).intValue();
    }

    @Override // defpackage.gje
    public final PaneDescriptor d() {
        return (PaneDescriptor) M().map(evy.t).orElse(null);
    }

    public final PaneDescriptor e() {
        return (PaneDescriptor) M().map(evy.u).orElse(null);
    }

    @Override // defpackage.gje
    public final gir f() {
        ce e = this.d.e(R.id.pane_fragment_container);
        if (e instanceof gir) {
            return (gir) e;
        }
        return null;
    }

    @Override // defpackage.gje
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final amsx j() {
        amsv i = amsx.i();
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            i.c(Integer.valueOf(this.a.keyAt(i2)));
        }
        return i.g();
    }

    @Override // defpackage.gje
    public final aypy h() {
        return this.k;
    }

    @Override // defpackage.gje
    public final Optional i(int i) {
        return O(i).map(evy.u);
    }

    @Override // defpackage.gje
    public final void k(giz gizVar) {
        this.j.c(gizVar);
    }

    @Override // defpackage.gje
    public final void l(gjb gjbVar) {
        this.i.c(gjbVar);
    }

    @Override // defpackage.gje
    public final void m(gjd gjdVar) {
        this.g.c(gjdVar);
    }

    @Override // defpackage.gje
    public final void n() {
        this.a.clear();
        this.e = 0;
        Q();
    }

    @Override // defpackage.giy
    public final void o() {
        Optional.ofNullable(f()).ifPresent(gfd.h);
    }

    @Override // defpackage.gje
    public final void p() {
        Optional M = M();
        this.a.clear();
        M.ifPresent(new ghz(this, 1));
        Q();
    }

    @Override // defpackage.gje
    public final void q(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("argument cannot be negative");
        }
        if (this.a.get(i) == null) {
            return;
        }
        this.a.remove(i);
        Q();
    }

    @Override // defpackage.gje
    public final void r(PaneDescriptor paneDescriptor) {
        giw b = gix.b();
        b.c(3);
        b.a = paneDescriptor;
        b.b(false);
        T(b.a());
    }

    public final void s(PaneDescriptor paneDescriptor, gir girVar, PaneDescriptor paneDescriptor2) {
        PaneDescriptor b = girVar != null ? PaneDescriptor.b(girVar) : null;
        if (b != null && paneDescriptor == null) {
            paneDescriptor = b;
        } else if (!PaneDescriptor.m(b, paneDescriptor, this.p)) {
            girVar = null;
        }
        this.h.b(gid.d(paneDescriptor, girVar, paneDescriptor2));
    }

    @Override // defpackage.gje
    public final void t(gir girVar) {
        this.i.b(girVar);
        this.k.c(girVar);
    }

    @Override // defpackage.gje
    public final void u() {
        gir f;
        Fragment$SavedState fragment$SavedState;
        String str;
        PaneDescriptor d = d();
        if (d == null || (f = f()) == null) {
            return;
        }
        Object obj = null;
        if (PaneDescriptor.m(PaneDescriptor.b(f), d, this.p)) {
            fragment$SavedState = this.d.c(f);
            str = f.F;
            obj = f.aT();
        } else {
            fragment$SavedState = null;
            str = null;
        }
        y(d, fragment$SavedState, obj, str, 0, 0);
    }

    @Override // defpackage.gje
    public final void v() {
        PaneDescriptor d = d();
        if (d == null) {
            return;
        }
        s(d, f(), d);
        y(d, null, null, null, 0, 0);
    }

    @Override // defpackage.gje
    public final void w() {
        gir f = f();
        if (f == null) {
            return;
        }
        f.aX();
    }

    @Override // defpackage.gje
    public final void x(gjd gjdVar) {
        this.g.d(gjdVar);
    }

    public final void y(PaneDescriptor paneDescriptor, Fragment$SavedState fragment$SavedState, Object obj, String str, int i, int i2) {
        gir d = paneDescriptor.d();
        if (fragment$SavedState != null) {
            d.ah(fragment$SavedState);
        }
        if (obj != null) {
            d.aY(obj);
        }
        if (str == null) {
            str = "PaneFragment";
        }
        (paneDescriptor != null ? Optional.of(L()) : M()).ifPresent(new gib(paneDescriptor, 0));
        boolean z = (evr.F(this.l) || Build.DEVICE.equals("generic_x86")) ? false : true;
        dn k = this.d.k();
        if (true != z) {
            i = 0;
        }
        if (true != z) {
            i2 = 0;
        }
        k.z(i, i2);
        k.u(R.id.pane_fragment_container, d, str);
        if (((Boolean) this.o.v().aC(false)).booleanValue()) {
            k.e();
        } else {
            k.k();
        }
    }

    @Override // defpackage.gje
    public final void z() {
        gir f = f();
        if (f != null) {
            f.mT();
        }
    }
}
