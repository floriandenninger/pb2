package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ruv extends rwe implements rwa {
    public final rwb A;
    public final dsm B;
    private rvd a;
    private boolean b;
    private Integer[] c;
    private rus d;
    public int e;
    public boolean f;
    public final Map g;
    public final Set h;
    public Set i;
    public ryu j;
    public final ScaleGestureDetector k;
    public final GestureDetector l;
    public final rwm m;
    public boolean n;
    public final List o;
    public final boolean p;
    public final rvi q;
    public final ruu r;
    public final Map s;
    public final List t;
    public List u;
    Map v;
    public boolean w;
    public rzk x;
    public boolean y;
    public final Map z;

    public ruv(Context context) {
        super(context);
        this.A = new rwb(this);
        int i = run.a;
        this.e = 300;
        this.f = true;
        this.g = rwh.v();
        this.h = rwh.r();
        this.i = rwh.r();
        this.n = false;
        this.o = rwh.x();
        this.b = false;
        this.B = new dsm((byte[]) null);
        this.p = true;
        this.q = new rvi(this);
        this.r = new ruu(this);
        this.s = rwh.t();
        this.t = rwh.x();
        this.u = Collections.emptyList();
        this.v = rwh.t();
        this.c = new Integer[0];
        this.w = false;
        this.z = rwh.t();
        int i2 = sav.b;
        this.x = new rzi();
        rwm rwmVar = new rwm(this);
        this.m = rwmVar;
        this.l = new GestureDetector(context, rwmVar);
        this.k = new ScaleGestureDetector(getContext(), rwmVar);
        setOnTouchListener(new rup(this));
        setChildrenDrawingOrderEnabled(true);
        rwq.b(context, 1.0f);
        rwq.c(context, 1.0f);
    }

    private final void a() {
        rvd rvdVar = this.a;
        if (rvdVar != null) {
            if (rvdVar.e.isEnabled()) {
                rvdVar.c();
            }
            rvdVar.e.removeAccessibilityStateChangeListener(rvdVar.f);
            this.a = null;
            super.setAccessibilityDelegate(null);
        }
    }

    public static final Map x(Map map) {
        LinkedHashMap v = rwh.v();
        for (Map.Entry entry : map.entrySet()) {
            v.put((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue()));
        }
        return Collections.unmodifiableMap(v);
    }

    public final void A(rwh rwhVar) {
        this.t.remove(rwhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof rwi) {
            if (view.getParent() == null) {
                super.addView(view, i, layoutParams);
                u((rwi) view, null);
                return;
            }
            return;
        }
        if (view instanceof rwo) {
            rwo rwoVar = (rwo) view;
            if (view != this.g.get(rwoVar.e())) {
                p(rwoVar.e(), rwoVar);
            }
            if (rwoVar.e() != null) {
                this.h.add(rwoVar.e());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(List list) {
        throw null;
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        if (i != this.c.length) {
            q();
        }
        return this.c[i2].intValue();
    }

    public final rwo h() {
        return i("__DEFAULT__");
    }

    public final rwo i(String str) {
        Map map = this.g;
        if (str == null) {
            str = "__DEFAULT__";
        }
        return (rwo) map.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ryu j() {
        return rzm.d();
    }

    public abstract sax k();

    public final List l() {
        return Collections.unmodifiableList(this.u);
    }

    public final void m(View view) {
        if (view.getParent() == this) {
            return;
        }
        super.addView(view, -1, view.getLayoutParams() == null ? generateDefaultLayoutParams() : view.getLayoutParams());
    }

    public final void n(sba sbaVar) {
        ArrayList z = rwh.z(4);
        z.add(sbaVar);
        w(z);
    }

    public final void o(rzj rzjVar) {
        this.o.remove(rzjVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        if (this.b) {
            return;
        }
        int i = rvh.a;
        rvd rvdVar = new rvd(this);
        this.a = rvdVar;
        super.setAccessibilityDelegate(rvdVar);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        this.w = true;
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        a();
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            ((rwh) it.next()).i();
        }
        super.onDetachedFromWindow();
    }

    public final void p(String str, rwo rwoVar) {
        if (rwoVar != null) {
            rwoVar.f(str);
        }
        if (this.g.containsKey(str) && this.g.get(str) != rwoVar && this.h.contains(str)) {
            removeView((View) this.g.get(str));
            this.h.remove(str);
        }
        if (rwoVar != null) {
            this.g.put(str, rwoVar);
        } else {
            this.g.remove(str);
        }
    }

    public final void q() {
        HashMap t = rwh.t();
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            t.put(getChildAt(i2), Integer.valueOf(i2));
        }
        ArrayList y = rwh.y(t.keySet());
        Collections.sort(y, new ruq(t));
        this.c = new Integer[t.size()];
        int size = y.size();
        int i3 = 0;
        while (i < size) {
            this.c[i3] = (Integer) t.get((View) y.get(i));
            i++;
            i3++;
        }
    }

    public final rus r() {
        if (this.d == null) {
            this.d = new rus(this);
        }
        return this.d;
    }

    public final Object s(sbg sbgVar) {
        return this.z.get(sbgVar);
    }

    @Override // android.view.View
    public final void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        a();
        this.b = true;
        super.setAccessibilityDelegate(accessibilityDelegate);
    }

    @Override // defpackage.rwa
    public void setAnimationPercent(float f) {
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof rwa) {
                ((rwa) childAt).setAnimationPercent(f);
            }
        }
        if (f >= 1.0f) {
            Iterator it = this.t.iterator();
            while (it.hasNext()) {
                ((rwh) it.next()).b();
            }
            for (String str : this.i) {
                removeView((View) this.g.get(str));
                this.h.remove(str);
            }
            this.i.clear();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(rwi rwiVar) {
        String valueOf = String.valueOf(UUID.randomUUID());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("AutoGenerated: ");
        sb.append(valueOf);
        u(rwiVar, sb.toString());
    }

    public final void u(rwi rwiVar, String str) {
        rwi rwiVar2;
        String str2;
        if (str != null && (rwiVar2 = (rwi) this.s.remove(str)) != null) {
            rwiVar2.c(this);
            Iterator it = this.s.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getValue() == rwiVar2) {
                    str2 = (String) entry.getKey();
                    break;
                }
            }
            if (str2 != null) {
                this.s.remove(str2);
            }
            rvd rvdVar = this.a;
            if (rvdVar != null && ((rwiVar2 instanceof rvp) || (rwiVar2 instanceof rvj))) {
                rvdVar.b();
            }
        }
        rwiVar.b(this);
        if (str != null) {
            this.s.put(str, rwiVar);
        }
    }

    public final void v(rzj rzjVar) {
        this.o.add(rzjVar);
    }

    public final void w(List list) {
        this.f = true;
        ArrayList z = rwh.z(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sba sbaVar = (sba) it.next();
            sba sbaVar2 = new sba(sbaVar.b, sbaVar.a);
            ajun ajunVar = sbaVar.c;
            ajun ajunVar2 = new ajun((char[]) null, (byte[]) null);
            ajunVar2.a.putAll(ajunVar.a);
            sbaVar2.c = ajunVar2;
            ajun ajunVar3 = sbaVar.d;
            ajun ajunVar4 = new ajun((short[]) null, (byte[]) null);
            ajunVar4.a.putAll(ajunVar3.a);
            sbaVar2.d = ajunVar4;
            z.add(sbaVar2);
        }
        Iterator it2 = this.t.iterator();
        while (it2.hasNext()) {
            ((rwh) it2.next()).j(z);
        }
        sav.a(this);
        g(z);
    }

    public final void y(rwh rwhVar) {
        this.m.b.add(rwhVar);
    }

    public final void z(rwh rwhVar) {
        this.t.add(rwhVar);
    }
}
