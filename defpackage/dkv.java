package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentTree;
import com.facebook.yoga.YogaDirection;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dkv implements dml {
    private static final Rect p = new Rect();
    private final dum C;
    private dmq D;
    private dmh E;
    public final Map a;
    public long[] b;
    public boolean d;
    public boolean e;
    public djx h;
    public int[] k;
    public dmx m;
    public esv n;
    public esv o;
    private boolean t;
    private final dhe u;
    private final dkp v;
    private int x;
    private int y;
    public final aee f = new aee();
    public final Rect g = new Rect();
    private final qvs H = new qvs(null);
    private final dku w = new dku();
    private int z = -1;
    public boolean i = false;
    private int A = -1;
    private int B = -1;
    public final HashSet j = new HashSet();
    public final Map l = new LinkedHashMap();
    private boolean F = false;
    private final Set G = new HashSet();
    private final yap I = new yap(null, null);
    private final aee q = new aee();
    private final Map r = new HashMap();
    private final aee s = new aee();
    public boolean c = true;

    public dkv(dkp dkpVar) {
        this.u = dkpVar.t;
        this.v = dkpVar;
        this.a = doa.e ? new HashMap() : null;
        dmt dmtVar = new dmt();
        dmtVar.d = YogaDirection.INHERIT;
        dum dumVar = new dum(dju.b(new dju(null, dmtVar, djl.a(), dkpVar.u, 0, 0, 0, 0L, 0, dkpVar.getContext().getResources().getConfiguration().orientation, null), null), dkpVar, dkpVar);
        dumVar.e = new dkh(dkpVar);
        this.C = dumVar;
        if (doa.o) {
            this.m = new dmx(dkpVar);
        }
    }

    private static void A(dum dumVar, boolean z) {
        if (dha.z(dju.a(dumVar).b)) {
            C((View) dumVar.a, z);
        }
    }

    private final void B(int i, dup dupVar, dju djuVar, djx djxVar) {
        Object a;
        amsj amsjVar;
        Map e;
        long nanoTime = System.nanoTime();
        long j = djuVar.h;
        ComponentHost componentHost = (ComponentHost) this.f.f(j);
        if (componentHost == null) {
            int a2 = djxVar.a(j);
            dup g = djxVar.g(a2);
            B(a2, g, (dju) g.a, djxVar);
            componentHost = (ComponentHost) this.f.f(j);
        }
        dha dhaVar = djuVar.b;
        Context context = this.u.b;
        dkt a3 = dhx.a(context, dhaVar);
        if (a3 == null) {
            a = dhaVar.J(context);
        } else {
            a = a3.a(context, dhaVar);
        }
        dhe u = u(dhaVar);
        dhaVar.O(u, a);
        if (dha.v(dhaVar)) {
            D(djuVar.j, (ComponentHost) a);
        }
        dum dumVar = new dum(dupVar, componentHost, a);
        dumVar.e = new dkh(a);
        this.q.k(this.b[i], dumVar);
        if (dhaVar.ab()) {
            this.s.k(this.b[i], dumVar);
        }
        Rect rect = p;
        djuVar.c(rect);
        componentHost.n(i, dumVar, rect);
        F(dumVar);
        i(dhaVar, a);
        dumVar.c = true;
        djuVar.c(rect);
        h(dumVar.a, rect.left, rect.top, rect.right, rect.bottom, true);
        dku dkuVar = this.w;
        if (dkuVar.n) {
            List list = dkuVar.f;
            double nanoTime2 = System.nanoTime() - nanoTime;
            Double.isNaN(nanoTime2);
            list.add(Double.valueOf(nanoTime2 / 1000000.0d));
            this.w.a.add(dhaVar.o());
            dku dkuVar2 = this.w;
            dkuVar2.j++;
            List list2 = dkuVar2.e;
            taz tazVar = u.l;
            dhe dheVar = dhaVar.q;
            String str = null;
            if (dheVar != null && (amsjVar = dheVar.m) != null && (e = tazVar.e(amsjVar)) != null) {
                StringBuilder sb = new StringBuilder(e.size() * 16);
                for (Map.Entry entry : e.entrySet()) {
                    sb.append((String) entry.getKey());
                    sb.append(':');
                    sb.append((String) entry.getValue());
                    sb.append(';');
                }
                str = sb.toString();
            }
            list2.add(str);
        }
    }

    private static void C(View view, boolean z) {
        if (view instanceof dkp) {
            dkp dkpVar = (dkp) view;
            if (dkpVar.L()) {
                if (!z) {
                    dkpVar.B(new Rect(0, 0, view.getWidth(), view.getHeight()), false);
                    return;
                } else {
                    dkpVar.A();
                    return;
                }
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                C(viewGroup.getChildAt(i), z);
            }
        }
    }

    private final void D(long j, ComponentHost componentHost) {
        componentHost.s(true);
        this.f.k(j, componentHost);
    }

    private final void E(ComponentHost componentHost) {
        ArrayList arrayList;
        if (componentHost.w()) {
            if (componentHost.w()) {
                arrayList = new ArrayList();
                int size = componentHost.g.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(dju.a((dum) componentHost.g.get(i)).g);
                }
            } else {
                arrayList = null;
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.D.f((dmi) arrayList.get(i2), null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void F(dum dumVar) {
        dju a = dju.a(dumVar);
        dha dhaVar = a.b;
        if (dha.z(dhaVar)) {
            View view = (View) dumVar.a;
            dik dikVar = a.l;
            int i = 2;
            if (dikVar != null) {
                diy diyVar = dikVar.h;
                if (diyVar != null) {
                    dhd c = c(view);
                    if (c == null) {
                        c = new dhd();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost = (ComponentHost) view;
                            componentHost.k = c;
                            componentHost.setOnClickListener(c);
                        } else {
                            view.setOnClickListener(c);
                            view.setTag(R.id.component_click_listener, c);
                        }
                    }
                    c.a = diyVar;
                    view.setClickable(true);
                }
                diy diyVar2 = dikVar.j;
                if (diyVar2 != null) {
                    dhl e = e(view);
                    if (e == null) {
                        e = new dhl();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost2 = (ComponentHost) view;
                            componentHost2.l = e;
                            componentHost2.setOnLongClickListener(e);
                        } else {
                            view.setOnLongClickListener(e);
                            view.setTag(R.id.component_long_click_listener, e);
                        }
                    }
                    e.a = diyVar2;
                    view.setLongClickable(true);
                }
                diy diyVar3 = dikVar.i;
                if (diyVar3 != null) {
                    dhf d = d(view);
                    if (d == null) {
                        d = new dhf();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost3 = (ComponentHost) view;
                            componentHost3.m = d;
                            componentHost3.setOnFocusChangeListener(d);
                        } else {
                            view.setOnFocusChangeListener(d);
                            view.setTag(R.id.component_focus_change_listener, d);
                        }
                    }
                    d.a = diyVar3;
                }
                diy diyVar4 = dikVar.k;
                if (diyVar4 != null) {
                    dhm f = f(view);
                    if (f == null) {
                        f = new dhm();
                        n(view, f);
                    }
                    f.a = diyVar4;
                }
                diy diyVar5 = dikVar.l;
                if (diyVar5 != null) {
                    if (view instanceof djh) {
                        djh djhVar = (djh) view;
                        diq b = djhVar.b();
                        if (b == null) {
                            b = new diq();
                            djhVar.r(b);
                        }
                        b.a = diyVar5;
                    } else {
                        dhm f2 = f(view);
                        if (f2 == null) {
                            f2 = new dhm();
                            n(view, f2);
                        }
                        f2.b = diyVar5;
                    }
                }
                boolean z = view instanceof ComponentHost;
                if (z || dikVar.z()) {
                    view.setTag(R.id.component_node_info, dikVar);
                }
                Object obj = dikVar.b;
                if (z) {
                    ((ComponentHost) view).h = obj;
                } else {
                    view.setTag(obj);
                }
                SparseArray sparseArray = dikVar.c;
                if (sparseArray != null) {
                    if (z) {
                        ((ComponentHost) view).i = sparseArray;
                    } else {
                        int size = sparseArray.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            view.setTag(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
                        }
                    }
                }
                if (dikVar.u() && (view instanceof ViewGroup)) {
                    ((ViewGroup) view).setClipChildren(dikVar.d);
                }
                CharSequence charSequence = dikVar.a;
                if (!TextUtils.isEmpty(charSequence)) {
                    view.setContentDescription(charSequence);
                }
                int i3 = dikVar.o;
                if (i3 == 1) {
                    view.setFocusable(true);
                } else if (i3 == 2) {
                    view.setFocusable(false);
                }
                int i4 = dikVar.p;
                if (i4 == 1) {
                    view.setClickable(true);
                } else if (i4 == 2) {
                    view.setClickable(false);
                }
                int i5 = dikVar.q;
                if (i5 == 1) {
                    view.setEnabled(true);
                } else if (i5 == 2) {
                    view.setEnabled(false);
                }
                int i6 = dikVar.r;
                if (i6 == 1) {
                    view.setSelected(true);
                } else if (i6 == 2) {
                    view.setSelected(false);
                }
                if (dikVar.y()) {
                    float f3 = dikVar.e;
                    view.setScaleX(f3);
                    view.setScaleY(f3);
                }
                if (dikVar.t()) {
                    view.setAlpha(dikVar.f);
                }
                if (dikVar.v()) {
                    view.setRotation(dikVar.g);
                }
                if (dikVar.w()) {
                    view.setRotationX(0.0f);
                }
                if (dikVar.x()) {
                    view.setRotationY(0.0f);
                }
            }
            int i7 = a.e;
            if (i7 != 0) {
                jw.V(view, i7);
            }
            dmt dmtVar = a.a;
            if (dmtVar != null) {
                int i8 = a.d;
                if (dha.v(dhaVar)) {
                    return;
                }
                Drawable drawable = dmtVar.a;
                if (drawable != null) {
                    view.setBackground(drawable);
                }
                if (dmtVar.b()) {
                    Rect rect = dmtVar.b;
                    int i9 = rect != null ? rect.left : 0;
                    Rect rect2 = dmtVar.b;
                    int i10 = rect2 != null ? rect2.top : 0;
                    Rect rect3 = dmtVar.b;
                    int i11 = rect3 != null ? rect3.right : 0;
                    Rect rect4 = dmtVar.b;
                    view.setPadding(i9, i10, i11, rect4 != null ? rect4.bottom : 0);
                }
                YogaDirection yogaDirection = YogaDirection.INHERIT;
                int ordinal = dmtVar.d.ordinal();
                if (ordinal == 1) {
                    i = 0;
                } else if (ordinal == 2) {
                    i = 1;
                }
                view.setLayoutDirection(i);
            }
        }
    }

    private final void G(boolean z) {
        int c = this.f.c();
        while (true) {
            c--;
            if (c < 0) {
                return;
            } else {
                ((ComponentHost) this.f.h(c)).s(z);
            }
        }
    }

    private final void H(dum dumVar) {
        dha dhaVar = dju.a(dumVar).b;
        Object obj = dumVar.a;
        dhe u = u(dhaVar);
        if (dumVar.c) {
            dhaVar.ar(obj);
            dumVar.c = false;
        }
        dhaVar.W(u, obj);
    }

    private final void I(dhe dheVar, dum dumVar) {
        int b;
        x(dju.a(dumVar).g);
        Object obj = dumVar.a;
        int i = -1;
        if (obj instanceof ComponentHost) {
            ComponentHost componentHost = (ComponentHost) obj;
            for (int a = componentHost.a() - 1; a >= 0; a--) {
                I(dheVar, componentHost.d(a));
            }
            if (componentHost.a() > 0) {
                throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
            }
        }
        ComponentHost componentHost2 = (ComponentHost) dumVar.b;
        componentHost2.i();
        aeh aehVar = componentHost2.a;
        int i2 = 0;
        if (aehVar.a) {
            aehVar.j();
        }
        while (true) {
            if (i2 >= aehVar.c) {
                break;
            }
            if (aehVar.b[i2] == dumVar) {
                i = i2;
                break;
            }
            i2++;
        }
        componentHost2.t(aehVar.b(i), dumVar);
        y(dumVar);
        H(dumVar);
        if (dju.a(dumVar).b.ab() && (b = this.s.b(dumVar)) > 0) {
            this.s.m(b);
        }
        w(dumVar);
        try {
            dkh.a(dumVar).b(dheVar.b, dumVar, "unmountDisappearingItemChild");
        } catch (dkg e) {
            String message = e.getMessage();
            String v = v(dumVar);
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 1 + String.valueOf(v).length());
            sb.append(message);
            sb.append(" ");
            sb.append(v);
            throw new RuntimeException(sb.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void J(dum dumVar, boolean z) {
        diq b;
        dhm f;
        dhf d;
        dhl e;
        dhd c;
        View view = (View) dumVar.a;
        dju a = dju.a(dumVar);
        dik dikVar = a.l;
        if (dikVar != null) {
            if (dikVar.h != null && (c = c(view)) != null) {
                c.a = null;
            }
            if (dikVar.j != null && (e = e(view)) != null) {
                e.a = null;
            }
            if (dikVar.i != null && (d = d(view)) != null) {
                d.a = null;
            }
            if (dikVar.k != null && (f = f(view)) != null) {
                f.a = null;
            }
            if (dikVar.l != null) {
                if ((view instanceof djh) && (b = ((djh) view).b()) != null) {
                    b.a = null;
                }
                dhm f2 = f(view);
                if (f2 != null) {
                    f2.b = null;
                }
            }
            boolean z2 = view instanceof ComponentHost;
            if (z2) {
                ((ComponentHost) view).h = null;
            } else {
                view.setTag(null);
            }
            SparseArray sparseArray = dikVar.c;
            if (z2) {
                ((ComponentHost) view).i = null;
            } else if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    view.setTag(sparseArray.keyAt(i), null);
                }
            }
            if (!dikVar.d && (view instanceof ViewGroup)) {
                ((ViewGroup) view).setClipChildren(true);
            }
            if (!TextUtils.isEmpty(dikVar.a)) {
                view.setContentDescription(null);
            }
            if (dikVar.y()) {
                if (view.getScaleX() != 1.0f) {
                    view.setScaleX(1.0f);
                }
                if (view.getScaleY() != 1.0f) {
                    view.setScaleY(1.0f);
                }
            }
            if (dikVar.t() && view.getAlpha() != 1.0f) {
                view.setAlpha(1.0f);
            }
            if (dikVar.v() && view.getRotation() != 0.0f) {
                view.setRotation(0.0f);
            }
            if (dikVar.w() && view.getRotationX() != 0.0f) {
                view.setRotationX(0.0f);
            }
            if (dikVar.x() && view.getRotationY() != 0.0f) {
                view.setRotationY(0.0f);
            }
        }
        view.setClickable(1 == (dkh.a(dumVar).a & 1));
        view.setLongClickable((dkh.a(dumVar).a & 2) == 2);
        view.setFocusable((dkh.a(dumVar).a & 4) == 4);
        view.setEnabled((dkh.a(dumVar).a & 8) == 8);
        view.setSelected((dkh.a(dumVar).a & 16) == 16);
        if (a.e != 0) {
            jw.V(view, 0);
        }
        boolean z3 = view instanceof ComponentHost;
        if (z3 || view.getTag(R.id.component_node_info) != null) {
            view.setTag(R.id.component_node_info, null);
            if (!z3) {
                jw.M(view, null);
            }
        }
        dmt dmtVar = a.a;
        if (dmtVar != null) {
            int i2 = a.d;
            if (z) {
                return;
            }
            if (dmtVar.b()) {
                try {
                    view.setPadding(0, 0, 0, 0);
                } catch (NullPointerException e2) {
                    throw new NullPointerException("Component: " + dju.a(dumVar).b.o() + ", view: " + view.getClass().getSimpleName() + ", message: " + e2.getMessage());
                }
            }
            if (dmtVar.a != null) {
                view.setBackground(null);
            }
            view.setLayoutDirection(2);
        }
    }

    private final boolean K() {
        return this.E != null;
    }

    private final boolean L(int i) {
        int[] iArr = this.k;
        return iArr != null && iArr[i] > 0;
    }

    private final boolean M(djx djxVar, int i) {
        djx djxVar2;
        dmi dmiVar;
        dmk dmkVar;
        return (!N(djxVar) || !K() || this.D == null || (djxVar2 = this.h) == null || (dmiVar = ((dju) djxVar2.g(i).a).g) == null || (dmkVar = (dmk) this.D.b.a(dmiVar)) == null || dmkVar.c != 2) ? false : true;
    }

    private final boolean N(djx djxVar) {
        return this.c && (this.z == djxVar.p || this.i);
    }

    private static final int O(djx djxVar, int i) {
        long j = ((dju) djxVar.g(i).a).j;
        int b = djxVar.b();
        for (int i2 = i + 1; i2 < b; i2++) {
            long j2 = ((dju) djxVar.g(i2).a).h;
            while (j2 != j) {
                if (j2 == 0) {
                    return i2 - 1;
                }
                j2 = ((dju) djxVar.g(djxVar.a(j2)).a).h;
            }
        }
        return djxVar.b() - 1;
    }

    private final void P(djx djxVar) {
        List list;
        int i;
        int i2;
        int height;
        int i3;
        long[] jArr = this.b;
        long j = 0;
        if (jArr == null) {
            list = Collections.emptyList();
        } else {
            if (jArr.length > 0 && M(djxVar, 0)) {
                String valueOf = String.valueOf(v(this.C));
                dhz.a(2, "MountState:DisappearAnimTargetingRoot", valueOf.length() != 0 ? "Disppear animations cannot target the root LithoView! ".concat(valueOf) : new String("Disppear animations cannot target the root LithoView! "));
            }
            list = null;
            int i4 = 1;
            while (i4 < this.b.length) {
                if (M(djxVar, i4)) {
                    int O = O(this.h, i4);
                    for (int i5 = i4; i5 <= O; i5++) {
                        if (g(i5) == null) {
                            dup g = this.h.g(i5);
                            B(i5, g, (dju) g.a, this.h);
                        }
                    }
                    dum g2 = g(i4);
                    ComponentHost componentHost = (ComponentHost) this.f.f(j);
                    dum g3 = g(i4);
                    ViewParent viewParent = g3.b;
                    if (viewParent != componentHost) {
                        Object obj = g3.a;
                        int i6 = 0;
                        int i7 = 0;
                        while (viewParent != componentHost) {
                            ComponentHost componentHost2 = (ComponentHost) viewParent;
                            i6 += componentHost2.getLeft();
                            i7 += componentHost2.getTop();
                            viewParent = (ComponentHost) componentHost2.getParent();
                        }
                        if (obj instanceof View) {
                            View view = (View) obj;
                            i = i6 + view.getLeft();
                            i2 = i7 + view.getTop();
                            i3 = i + view.getWidth();
                            height = i2 + view.getHeight();
                        } else {
                            Rect bounds = ((Drawable) obj).getBounds();
                            i = i6 + bounds.left;
                            int width = i + bounds.width();
                            i2 = i7 + bounds.top;
                            height = i2 + bounds.height();
                            i3 = width;
                        }
                        g3.b.t(i4, g3);
                        h(obj, i, i2, i3, height, false);
                        componentHost.n(i4, g3, p);
                        g3.b = componentHost;
                    }
                    if (i4 == 0) {
                        throw new RuntimeException("Cannot remove disappearing item mappings for root LithoView!");
                    }
                    this.A = i4;
                    this.B = O;
                    for (int i8 = i4; i8 <= O; i8++) {
                        dum g4 = g(i8);
                        this.q.l(this.b[i8]);
                        dju a = dju.a(g4);
                        if (a.b.ab()) {
                            this.s.l(this.b[i8]);
                        }
                        if (dha.v(a.b)) {
                            aee aeeVar = this.f;
                            aeeVar.m(aeeVar.b((ComponentHost) g4.a));
                        }
                    }
                    dmi dmiVar = dju.a(g2).g;
                    dlf dlfVar = (dlf) this.l.get(dmiVar);
                    if (dlfVar == null) {
                        dlfVar = new dlf();
                        this.l.put(dmiVar, dlfVar);
                    }
                    dlfVar.e(djy.a(this.b[i4]), g2);
                    dul dulVar = g2.b;
                    Object obj2 = g2.a;
                    if (obj2 instanceof Drawable) {
                        ComponentHost componentHost3 = (ComponentHost) dulVar;
                        componentHost3.h();
                        did.F(i4, componentHost3.e, componentHost3.f);
                    } else if (obj2 instanceof View) {
                        ComponentHost componentHost4 = (ComponentHost) dulVar;
                        componentHost4.j();
                        did.F(i4, componentHost4.c, componentHost4.d);
                        componentHost4.j = true;
                        componentHost4.m(i4, g2);
                    }
                    ComponentHost componentHost5 = (ComponentHost) dulVar;
                    componentHost5.i();
                    did.F(i4, componentHost5.a, componentHost5.b);
                    componentHost5.q();
                    componentHost5.g();
                    componentHost5.g.add(g2);
                    if (list == null) {
                        list = new ArrayList(2);
                    }
                    list.add(Integer.valueOf(i4));
                    list.add(Integer.valueOf(O));
                    i4 = O + 1;
                } else {
                    i4++;
                }
                j = 0;
            }
            if (list == null) {
                list = Collections.emptyList();
            }
        }
        qvs qvsVar = this.H;
        qvsVar.b = 0;
        qvsVar.a = 0;
        qvsVar.c = 0;
        if (this.b != null) {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                long[] jArr2 = this.b;
                if (i9 >= jArr2.length) {
                    break;
                }
                int a2 = djxVar.a(jArr2[i9]);
                Object obj3 = a2 < 0 ? null : djxVar.g(a2).a;
                int i11 = obj3 == null ? -1 : ((dju) obj3).i;
                dum g5 = g(i9);
                if (list.size() <= i10 || ((Integer) list.get(i10)).intValue() != i9) {
                    if (i11 == -1) {
                        p(i9, this.f);
                    } else {
                        long j2 = ((dju) obj3).h;
                        if (g5 != null) {
                            if (g5.b != this.f.f(j2)) {
                                p(i9, this.f);
                                this.H.c++;
                            } else if (i11 != i9) {
                                g5.b.o(g5, i9, i11);
                                this.H.a++;
                            } else {
                                this.H.b++;
                            }
                        }
                    }
                    this.H.c++;
                } else {
                    i9 = ((Integer) list.get(i10 + 1)).intValue();
                    i10 += 2;
                }
                i9++;
            }
        }
        if (this.f.f(0L) == null) {
            D(0L, this.v);
            this.q.k(0L, this.C);
        }
        int b = djxVar.b();
        long[] jArr3 = this.b;
        if (jArr3 == null || b != jArr3.length) {
            this.b = new long[b];
        }
        for (int i12 = 0; i12 < b; i12++) {
            this.b[i12] = ((dju) djxVar.g(i12).a).j;
        }
    }

    private final void Q(dlg dlgVar) {
        dku dkuVar = this.w;
        if (!dkuVar.n) {
            taz.b(dlgVar);
            return;
        }
        if (dkuVar.j == 0 || dkuVar.a.isEmpty()) {
            taz.b(dlgVar);
            return;
        }
        taz.d(dlgVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static View b(dmw dmwVar, dkp dkpVar) {
        dik dikVar;
        dha dhaVar = dmwVar.a;
        if (dha.z(dhaVar)) {
            return t(dhaVar, dkpVar);
        }
        dha dhaVar2 = dmwVar.b;
        if (dhaVar2 != null) {
            dgx dgxVar = dhaVar2.s;
            Object obj = (dgxVar == null || (dikVar = dgxVar.g) == null) ? null : dikVar.b;
            if (obj != null) {
                return esv.V(dkpVar, obj);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dhd c(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).k;
        }
        return (dhd) view.getTag(R.id.component_click_listener);
    }

    static dhf d(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).m;
        }
        return (dhf) view.getTag(R.id.component_focus_change_listener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dhl e(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).l;
        }
        return (dhl) view.getTag(R.id.component_long_click_listener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dhm f(View view) {
        if (view instanceof ComponentHost) {
            return ((ComponentHost) view).n;
        }
        return (dhm) view.getTag(R.id.component_touch_listener);
    }

    public static void h(Object obj, int i, int i2, int i3, int i4, boolean z) {
        if (obj instanceof View) {
            did.L((View) obj, i, i2, i3, i4, z);
            return;
        }
        if (obj instanceof Drawable) {
            ((Drawable) obj).setBounds(i, i2, i3, i4);
            return;
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("Unsupported mounted content ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    static void n(View view, dhm dhmVar) {
        if (view instanceof ComponentHost) {
            ComponentHost componentHost = (ComponentHost) view;
            componentHost.n = dhmVar;
            componentHost.setOnTouchListener(dhmVar);
        } else {
            view.setOnTouchListener(dhmVar);
            view.setTag(R.id.component_touch_listener, dhmVar);
        }
    }

    private static int s(Rect rect) {
        if (rect.isEmpty()) {
            return 0;
        }
        return rect.width() * rect.height();
    }

    private static View t(dha dhaVar, ComponentHost componentHost) {
        View t;
        int a = componentHost.a();
        for (int i = 0; i < a; i++) {
            dum d = componentHost.d(i);
            dha dhaVar2 = dju.a(d).b;
            if (dhaVar != dhaVar2) {
                if (dha.v(dhaVar2) && (t = t(dhaVar, (ComponentHost) d.a)) != null) {
                    return t;
                }
            } else {
                return (View) d.a;
            }
        }
        return null;
    }

    private final dhe u(dha dhaVar) {
        dhe dheVar = dhaVar.q;
        return dheVar == null ? this.u : dheVar;
    }

    private final String v(dum dumVar) {
        long j;
        int b = this.q.b(dumVar);
        int i = -1;
        if (b >= 0) {
            j = this.q.d(b);
            int i2 = 0;
            while (true) {
                long[] jArr = this.b;
                if (i2 >= jArr.length) {
                    break;
                }
                if (j == jArr[i2]) {
                    i = i2;
                    break;
                }
                i2++;
            }
        } else {
            j = -1;
        }
        ComponentTree componentTree = this.v.r;
        String o = componentTree == null ? "<null_component_tree>" : componentTree.b().o();
        int i3 = this.A;
        int i4 = this.B;
        Object obj = dumVar.a;
        String valueOf = String.valueOf(obj != null ? obj.getClass() : "<null_content>");
        dha dhaVar = dju.a(dumVar).b;
        String o2 = dju.a(dumVar).b.o();
        String valueOf2 = String.valueOf(dju.a(dumVar).g);
        dul dulVar = dumVar.b;
        String valueOf3 = String.valueOf(dulVar != null ? dulVar.getClass() : "<null_host>");
        int i5 = i;
        boolean z = this.f.f(0L) == dumVar.b;
        int length = String.valueOf(o).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 188 + length2 + String.valueOf(o2).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("rootComponent=");
        sb.append(o);
        sb.append(", index=");
        sb.append(i5);
        sb.append(", mapIndex=");
        sb.append(b);
        sb.append(", id=");
        sb.append(j);
        sb.append(", disappearRange=[");
        sb.append(i3);
        sb.append(",");
        sb.append(i4);
        sb.append("], contentType=");
        sb.append(valueOf);
        sb.append(", component=");
        sb.append(o2);
        sb.append(", transitionId=");
        sb.append(valueOf2);
        sb.append(", host=");
        sb.append(valueOf3);
        sb.append(", isRootHost=");
        sb.append(z);
        return sb.toString();
    }

    private final void w(dum dumVar) {
        if (this.q.b(dumVar) >= 0) {
            String valueOf = String.valueOf(v(dumVar));
            dhz.a(2, "MountState:DanglingContentDuringAnim", valueOf.length() != 0 ? "Got dangling mount content during animation: ".concat(valueOf) : new String("Got dangling mount content during animation: "));
        }
    }

    private final void x(dmi dmiVar) {
        dmq dmqVar = this.D;
        if (dmqVar == null || dmiVar == null) {
            return;
        }
        dmqVar.f(dmiVar, null);
    }

    private static void y(dum dumVar) {
        dha dhaVar = dju.a(dumVar).b;
        if (dha.z(dhaVar)) {
            J(dumVar, dha.v(dhaVar));
        }
    }

    private final void z() {
        if (this.D == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.j.size());
        int c = this.q.c();
        for (int i = 0; i < c; i++) {
            dum dumVar = (dum) this.q.h(i);
            dju a = dju.a(dumVar);
            if (a.g != null) {
                int a2 = djy.a(this.q.d(i));
                dlf dlfVar = (dlf) linkedHashMap.get(a.g);
                if (dlfVar == null) {
                    dlfVar = new dlf();
                    linkedHashMap.put(a.g, dlfVar);
                }
                dlfVar.f(a2, dumVar.a);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            this.D.f((dmi) entry.getKey(), (dlf) entry.getValue());
        }
        for (Map.Entry entry2 : this.l.entrySet()) {
            dlf dlfVar2 = (dlf) entry2.getValue();
            dlf dlfVar3 = new dlf();
            short s = dlfVar2.b;
            for (int i2 = 0; i2 < s; i2++) {
                dlfVar3.e(dlfVar2.a(i2), ((dum) dlfVar2.c(i2)).a);
            }
            this.D.f((dmi) entry2.getKey(), dlfVar3);
        }
    }

    public final int a() {
        long[] jArr = this.b;
        if (jArr == null) {
            return 0;
        }
        return jArr.length;
    }

    public final dum g(int i) {
        long[] jArr = this.b;
        if (jArr != null && i < jArr.length) {
            return (dum) this.q.f(jArr[i]);
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0037. Please report as an issue. */
    public final void i(dha dhaVar, Object obj) {
        dhe u = u(dhaVar);
        u.e = "bind";
        dhaVar.P(u, obj);
        u.f();
        yap yapVar = this.I;
        boolean i = yap.i(dhaVar);
        int length = dha.i.length;
        if (i) {
            HashSet hashSet = new HashSet();
            SparseArray g = dhaVar.g();
            for (int i2 = 0; i2 < g.size(); i2++) {
                int keyAt = g.keyAt(i2);
                dit ditVar = (dit) g.valueAt(i2);
                View view = (View) obj;
                switch (keyAt) {
                    case 1:
                        view.setAlpha(((Float) ditVar.a).floatValue());
                        break;
                    case 2:
                        view.setTranslationX(((Float) ditVar.a).floatValue());
                        break;
                    case 3:
                        view.setTranslationY(((Float) ditVar.a).floatValue());
                        break;
                    case 4:
                        view.setScaleX(((Float) ditVar.a).floatValue());
                        break;
                    case 5:
                        view.setScaleY(((Float) ditVar.a).floatValue());
                        break;
                    case 6:
                        view.setElevation(((Float) ditVar.a).floatValue());
                        break;
                    case 7:
                        view.setBackgroundColor(((Integer) ditVar.a).intValue());
                        break;
                    case 8:
                        view.setRotation(((Float) ditVar.a).floatValue());
                        break;
                }
                Set set = (Set) yapVar.a.get(ditVar);
                if (set == null) {
                    set = new HashSet();
                    yapVar.a.put(ditVar, set);
                    ditVar.b.add(yapVar);
                }
                set.add(dhaVar);
                hashSet.add(ditVar);
            }
            int length2 = dha.i.length;
            yapVar.b.put(dhaVar, hashSet);
            yapVar.c.put(dhaVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        dmx dmxVar = this.m;
        if (dmxVar != null) {
            if (dmxVar.a.z()) {
                return;
            }
            dmxVar.a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.r.keySet()) {
            dmv dmvVar = (dmv) this.r.get(str);
            if (dmvVar.d) {
                dmvVar.d = false;
            } else {
                arrayList.add(str);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList.get(i);
            dmv dmvVar2 = (dmv) this.r.get(str2);
            diy diyVar = dmvVar2.a;
            diy diyVar2 = dmvVar2.b;
            diy diyVar3 = dmvVar2.c;
            if (diyVar != null) {
                did.e(diyVar, this.v);
            }
            if (dmvVar2.c()) {
                dmvVar2.a(false);
                if (diyVar2 != null) {
                    did.f(diyVar2);
                }
            }
            if (diyVar3 != null) {
                did.g(diyVar3, 0, 0, 0.0f, 0.0f);
            }
            dmvVar2.e = false;
            this.r.remove(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(djx djxVar, ComponentTree componentTree) {
        if (this.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List list = djxVar.u;
        if (list != null) {
            arrayList.addAll(list);
        }
        componentTree.j(arrayList, djxVar.m);
        dmc dmcVar = new dmc();
        dmc dmcVar2 = new dmc();
        dmi dmiVar = djxVar.l;
        if (dmiVar != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dmh dmhVar = (dmh) arrayList.get(i);
                if (dmhVar != null) {
                    did.r(dmiVar, dmhVar, dnf.c, dmcVar);
                    did.r(dmiVar, dmhVar, dnf.d, dmcVar2);
                } else {
                    String str = djxVar.m;
                    String valueOf = String.valueOf(dmiVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 77 + String.valueOf(valueOf).length());
                    sb.append("NULL_TRANSITION when collecting root bounds anim. Root: ");
                    sb.append(str);
                    sb.append(", root TransitionId: ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        dmh dmhVar2 = null;
        if (true != dmcVar.a) {
            dmcVar = null;
        }
        if (true != dmcVar2.a) {
            dmcVar2 = null;
        }
        componentTree.q = dmcVar;
        componentTree.r = dmcVar2;
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == 1) {
                dmhVar2 = (dmh) arrayList.get(0);
            } else {
                dmhVar2 = new dmr(arrayList);
            }
        }
        this.E = dmhVar2;
        this.F = true;
    }

    public final void l(dlf dlfVar) {
        int b;
        x(dju.a((dum) dlfVar.d()).g);
        short s = dlfVar.b;
        for (int i = 0; i < s; i++) {
            dum dumVar = (dum) dlfVar.c(i);
            if (dlfVar.a(i) == 3) {
                ComponentHost componentHost = (ComponentHost) dumVar.a;
                int a = componentHost.a();
                while (true) {
                    a--;
                    if (a < 0) {
                        break;
                    } else {
                        I(this.u, componentHost.d(a));
                    }
                }
                if (componentHost.a() > 0) {
                    throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
                }
            }
            ComponentHost componentHost2 = (ComponentHost) dumVar.b;
            componentHost2.g();
            if (!componentHost2.g.remove(dumVar)) {
                String valueOf = String.valueOf(dju.a(dumVar).g);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("Tried to remove non-existent disappearing item, transitionId: ");
                sb.append(valueOf);
                throw new RuntimeException(sb.toString());
            }
            Object obj = dumVar.a;
            if (obj instanceof Drawable) {
                componentHost2.u(dumVar);
            } else if (obj instanceof View) {
                componentHost2.v((View) obj);
            }
            did.D(dumVar);
            y(dumVar);
            H(dumVar);
            if (dju.a(dumVar).b.ab() && (b = this.s.b(dumVar)) > 0) {
                this.s.m(b);
            }
            w(dumVar);
            try {
                dkh.a(dumVar).b(this.u.b, dumVar, "endUnmountDisappearingItem");
            } catch (dkg e) {
                String message = e.getMessage();
                String v = v(dumVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 1 + String.valueOf(v).length());
                sb2.append(message);
                sb2.append(" ");
                sb2.append(v);
                throw new RuntimeException(sb2.toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x05f8, code lost:
    
        if (((com.facebook.litho.ComponentHost) r15).a() > 0) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x06d4, code lost:
    
        if (r0.height() == (r13 ? ((android.graphics.drawable.Drawable) r14).getBounds().height() : ((android.view.View) r14).getHeight())) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x06de, code lost:
    
        if (r6 == false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x06e1, code lost:
    
        if (r2 != 1) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x06e5, code lost:
    
        if ((r3 instanceof defpackage.dis) == false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x06e9, code lost:
    
        if ((r5 instanceof defpackage.dis) == false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x06ef, code lost:
    
        if (r3.ah(r3, r5) == false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x06f2, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x06f5, code lost:
    
        if (r2 != 2) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x06fc, code lost:
    
        if (r3.Y() != false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x06ff, code lost:
    
        r0 = r3.ah(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x06db, code lost:
    
        if (r5.af() != false) goto L274;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0b60  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0ae5  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x02ca A[Catch: all -> 0x03b3, TryCatch #0 {, blocks: (B:419:0x0059, B:421:0x005f, B:424:0x00f4, B:434:0x0065, B:435:0x006f, B:437:0x0075, B:439:0x007f, B:440:0x0095, B:442:0x009b, B:444:0x00b4, B:446:0x00dd, B:448:0x00eb, B:449:0x00ff, B:451:0x0107, B:452:0x0111, B:454:0x0117, B:457:0x0127, B:462:0x012b, B:464:0x0131, B:466:0x013a, B:468:0x0140, B:469:0x0147, B:470:0x0155, B:472:0x015b, B:474:0x0164, B:476:0x0168, B:477:0x0170, B:479:0x0176, B:482:0x020f, B:484:0x0216, B:486:0x021a, B:487:0x021e, B:489:0x0224, B:492:0x0230, B:497:0x0234, B:499:0x0240, B:501:0x0244, B:502:0x0247, B:503:0x024e, B:504:0x025d, B:506:0x0263, B:509:0x0279, B:514:0x0284, B:515:0x0288, B:517:0x028e, B:519:0x029a, B:520:0x02a4, B:522:0x02aa, B:525:0x02bc, B:530:0x02c6, B:532:0x02ca, B:534:0x02dc, B:536:0x02e6, B:538:0x02fb, B:540:0x0305, B:542:0x030d, B:545:0x0310, B:548:0x0313, B:550:0x031e, B:551:0x0328, B:553:0x032e, B:556:0x0340, B:558:0x0344, B:559:0x034c, B:561:0x0357, B:566:0x036a, B:568:0x036e, B:572:0x0377, B:574:0x037a, B:578:0x0197, B:579:0x01a8, B:581:0x01ae, B:583:0x01ce, B:584:0x01da, B:591:0x01e6, B:592:0x01f2, B:594:0x01f8, B:597:0x0204), top: B:418:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:550:0x031e A[Catch: all -> 0x03b3, TryCatch #0 {, blocks: (B:419:0x0059, B:421:0x005f, B:424:0x00f4, B:434:0x0065, B:435:0x006f, B:437:0x0075, B:439:0x007f, B:440:0x0095, B:442:0x009b, B:444:0x00b4, B:446:0x00dd, B:448:0x00eb, B:449:0x00ff, B:451:0x0107, B:452:0x0111, B:454:0x0117, B:457:0x0127, B:462:0x012b, B:464:0x0131, B:466:0x013a, B:468:0x0140, B:469:0x0147, B:470:0x0155, B:472:0x015b, B:474:0x0164, B:476:0x0168, B:477:0x0170, B:479:0x0176, B:482:0x020f, B:484:0x0216, B:486:0x021a, B:487:0x021e, B:489:0x0224, B:492:0x0230, B:497:0x0234, B:499:0x0240, B:501:0x0244, B:502:0x0247, B:503:0x024e, B:504:0x025d, B:506:0x0263, B:509:0x0279, B:514:0x0284, B:515:0x0288, B:517:0x028e, B:519:0x029a, B:520:0x02a4, B:522:0x02aa, B:525:0x02bc, B:530:0x02c6, B:532:0x02ca, B:534:0x02dc, B:536:0x02e6, B:538:0x02fb, B:540:0x0305, B:542:0x030d, B:545:0x0310, B:548:0x0313, B:550:0x031e, B:551:0x0328, B:553:0x032e, B:556:0x0340, B:558:0x0344, B:559:0x034c, B:561:0x0357, B:566:0x036a, B:568:0x036e, B:572:0x0377, B:574:0x037a, B:578:0x0197, B:579:0x01a8, B:581:0x01ae, B:583:0x01ce, B:584:0x01da, B:591:0x01e6, B:592:0x01f2, B:594:0x01f8, B:597:0x0204), top: B:418:0x0059 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.djx r30, android.graphics.Rect r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 2925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkv.m(djx, android.graphics.Rect, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        long[] jArr = this.b;
        if (jArr == null) {
            return;
        }
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            dum g = g(i);
            if (g != null && g.c) {
                dha dhaVar = dju.a(g).b;
                Object obj = g.a;
                yap yapVar = this.I;
                if (!yap.i(dhaVar)) {
                    int length2 = dha.i.length;
                } else {
                    yapVar.c.remove(dhaVar);
                    Set<dit> set = (Set) yapVar.b.get(dhaVar);
                    if (set != null) {
                        for (dit ditVar : set) {
                            Set set2 = (Set) yapVar.a.get(ditVar);
                            set2.remove(dhaVar);
                            if (set2.isEmpty()) {
                                yapVar.a.remove(ditVar);
                                ditVar.b.remove(yapVar);
                            }
                        }
                    }
                }
                dhaVar.ar(obj);
                g.c = false;
            }
        }
        j();
        dmx dmxVar = this.m;
        if (dmxVar != null) {
            dmxVar.a();
        }
        this.e = false;
    }

    public final void p(int i, aee aeeVar) {
        dmk dmkVar;
        dlf dlfVar;
        dum g = g(i);
        long nanoTime = System.nanoTime();
        if (g == null) {
            return;
        }
        long j = this.b[i];
        if (j == 0) {
            J(g, true);
            return;
        }
        this.q.l(j);
        Object obj = g.a;
        if ((obj instanceof ComponentHost) && !(obj instanceof dkp)) {
            ComponentHost componentHost = (ComponentHost) obj;
            int a = componentHost.a();
            while (true) {
                a--;
                if (a < 0) {
                    break;
                }
                dum d = componentHost.d(a);
                aee aeeVar2 = this.q;
                long d2 = aeeVar2.d(aeeVar2.b(d));
                int length = this.b.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    } else if (this.b[length] == d2) {
                        p(length, aeeVar);
                        break;
                    }
                }
            }
            if (componentHost.a() > 0) {
                throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
            }
        }
        if (obj instanceof djj) {
            ArrayList arrayList = new ArrayList();
            ((djj) obj).a(arrayList);
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((dkp) arrayList.get(size)).K();
                }
            }
        }
        ((ComponentHost) g.b).t(i, g);
        y(g);
        dju a2 = dju.a(g);
        dha dhaVar = a2.b;
        if (dha.v(dhaVar)) {
            ComponentHost componentHost2 = (ComponentHost) obj;
            aeeVar.m(aeeVar.b(componentHost2));
            E(componentHost2);
        }
        H(g);
        boolean z = doa.a;
        if (dju.a(g).g != null) {
            int a3 = djy.a(j);
            dmi dmiVar = a2.g;
            dmq dmqVar = this.D;
            if (dmqVar != null && dmiVar != null && (dmkVar = (dmk) dmqVar.b.a(dmiVar)) != null && (dlfVar = dmkVar.b) != null && dlfVar.b(a3) != null) {
                dlf dlfVar2 = null;
                if (dlfVar.b > 1) {
                    dlf dlfVar3 = new dlf(dlfVar);
                    dlfVar3.f(a3, null);
                    dlfVar2 = dlfVar3;
                }
                dmqVar.g(dmiVar, dmkVar, dlfVar2);
            }
        }
        if (dhaVar.ab()) {
            this.s.l(this.b[i]);
        }
        try {
            dkh.a(g).b(this.u.b, g, "unmountItem");
            dku dkuVar = this.w;
            if (dkuVar.n) {
                List list = dkuVar.g;
                double nanoTime2 = System.nanoTime() - nanoTime;
                Double.isNaN(nanoTime2);
                list.add(Double.valueOf(nanoTime2 / 1000000.0d));
                this.w.b.add(dhaVar.o());
                this.w.k++;
            }
        } catch (dkg e) {
            String message = e.getMessage();
            String v = v(g);
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 1 + String.valueOf(v).length());
            sb.append(message);
            sb.append(" ");
            sb.append(v);
            throw new RuntimeException(sb.toString());
        }
    }

    public final void q(djx djxVar, int i, boolean z) {
        int O = O(djxVar, i);
        for (int i2 = i; i2 <= O; i2++) {
            if (z) {
                int[] iArr = this.k;
                iArr[i2] = iArr[i2] + 1;
            } else {
                int[] iArr2 = this.k;
                int i3 = iArr2[i2] - 1;
                iArr2[i2] = i3;
                if (i3 < 0) {
                    dhz.a(3, "MountState:InvalidAnimLockIndices", "Decremented animation lock count below 0!");
                    this.k[i2] = 0;
                }
            }
        }
        long j = ((dju) djxVar.g(i).a).h;
        while (j != 0) {
            int a = djxVar.a(j);
            if (z) {
                int[] iArr3 = this.k;
                iArr3[a] = iArr3[a] + 1;
            } else {
                int[] iArr4 = this.k;
                int i4 = iArr4[a] - 1;
                iArr4[a] = i4;
                if (i4 < 0) {
                    dhz.a(3, "MountState:InvalidAnimLockIndices", "Decremented animation lock count below 0!");
                    this.k[a] = 0;
                }
            }
            j = ((dju) djxVar.g(a).a).h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00fe, code lost:
    
        if (r10.equals(r11) != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050 A[Catch: all -> 0x01b6, TRY_ENTER, TryCatch #2 {all -> 0x01b6, blocks: (B:121:0x000a, B:3:0x000f, B:11:0x0017, B:13:0x001d, B:14:0x0020, B:21:0x0039, B:26:0x0050, B:28:0x0054), top: B:120:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054 A[Catch: all -> 0x01b6, TRY_LEAVE, TryCatch #2 {all -> 0x01b6, blocks: (B:121:0x000a, B:3:0x000f, B:11:0x0017, B:13:0x001d, B:14:0x0020, B:21:0x0039, B:26:0x0050, B:28:0x0054), top: B:120:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:33:0x0065, B:35:0x006f, B:37:0x0075, B:39:0x007b, B:41:0x0087, B:42:0x008e, B:44:0x0094, B:46:0x009b, B:47:0x009e, B:50:0x00b4, B:52:0x00c6, B:58:0x0121, B:60:0x0127, B:62:0x0130, B:64:0x0135, B:66:0x015a, B:68:0x015e, B:69:0x0165, B:71:0x0179, B:73:0x0187, B:76:0x00d6, B:79:0x0110, B:81:0x0116, B:83:0x011c, B:84:0x00e1, B:88:0x0100, B:90:0x0106, B:92:0x010c, B:93:0x00fa, B:98:0x00a5, B:115:0x019d, B:117:0x01a9), top: B:32:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121 A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:33:0x0065, B:35:0x006f, B:37:0x0075, B:39:0x007b, B:41:0x0087, B:42:0x008e, B:44:0x0094, B:46:0x009b, B:47:0x009e, B:50:0x00b4, B:52:0x00c6, B:58:0x0121, B:60:0x0127, B:62:0x0130, B:64:0x0135, B:66:0x015a, B:68:0x015e, B:69:0x0165, B:71:0x0179, B:73:0x0187, B:76:0x00d6, B:79:0x0110, B:81:0x0116, B:83:0x011c, B:84:0x00e1, B:88:0x0100, B:90:0x0106, B:92:0x010c, B:93:0x00fa, B:98:0x00a5, B:115:0x019d, B:117:0x01a9), top: B:32:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130 A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:33:0x0065, B:35:0x006f, B:37:0x0075, B:39:0x007b, B:41:0x0087, B:42:0x008e, B:44:0x0094, B:46:0x009b, B:47:0x009e, B:50:0x00b4, B:52:0x00c6, B:58:0x0121, B:60:0x0127, B:62:0x0130, B:64:0x0135, B:66:0x015a, B:68:0x015e, B:69:0x0165, B:71:0x0179, B:73:0x0187, B:76:0x00d6, B:79:0x0110, B:81:0x0116, B:83:0x011c, B:84:0x00e1, B:88:0x0100, B:90:0x0106, B:92:0x010c, B:93:0x00fa, B:98:0x00a5, B:115:0x019d, B:117:0x01a9), top: B:32:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135 A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:33:0x0065, B:35:0x006f, B:37:0x0075, B:39:0x007b, B:41:0x0087, B:42:0x008e, B:44:0x0094, B:46:0x009b, B:47:0x009e, B:50:0x00b4, B:52:0x00c6, B:58:0x0121, B:60:0x0127, B:62:0x0130, B:64:0x0135, B:66:0x015a, B:68:0x015e, B:69:0x0165, B:71:0x0179, B:73:0x0187, B:76:0x00d6, B:79:0x0110, B:81:0x0116, B:83:0x011c, B:84:0x00e1, B:88:0x0100, B:90:0x0106, B:92:0x010c, B:93:0x00fa, B:98:0x00a5, B:115:0x019d, B:117:0x01a9), top: B:32:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015a A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:33:0x0065, B:35:0x006f, B:37:0x0075, B:39:0x007b, B:41:0x0087, B:42:0x008e, B:44:0x0094, B:46:0x009b, B:47:0x009e, B:50:0x00b4, B:52:0x00c6, B:58:0x0121, B:60:0x0127, B:62:0x0130, B:64:0x0135, B:66:0x015a, B:68:0x015e, B:69:0x0165, B:71:0x0179, B:73:0x0187, B:76:0x00d6, B:79:0x0110, B:81:0x0116, B:83:0x011c, B:84:0x00e1, B:88:0x0100, B:90:0x0106, B:92:0x010c, B:93:0x00fa, B:98:0x00a5, B:115:0x019d, B:117:0x01a9), top: B:32:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(defpackage.djx r24, android.graphics.Rect r25, boolean r26, defpackage.dlg r27) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkv.r(djx, android.graphics.Rect, boolean, dlg):void");
    }
}
