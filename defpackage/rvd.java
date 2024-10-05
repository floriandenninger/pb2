package defpackage;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rvd extends View.AccessibilityDelegate {
    public final ruv b;
    public final AccessibilityManager e;
    public final AccessibilityManager.AccessibilityStateChangeListener f;
    public final float g;
    public rvc h;
    public final Set i;
    public String j;
    public int k;
    public final Rect l;
    public final Rect m;
    private final View.OnHoverListener o;
    private boolean p;
    private boolean q;
    private final rwh r;
    private final rwh s;
    public final Runnable a = new ruw(this);
    private List n = rwh.x();
    public List c = rwh.x();
    public final long d = 5000;

    public rvd(ruv ruvVar) {
        rvb rvbVar = new rvb(this);
        this.f = rvbVar;
        this.s = new ruy(this);
        this.r = new rva(this);
        this.o = new ruz(this);
        this.h = rvc.NONE;
        this.i = EnumSet.of(rvc.NONE);
        this.j = "";
        this.k = -1;
        this.l = new Rect();
        this.m = new Rect();
        this.b = ruvVar;
        this.g = rwq.b(ruvVar.getContext(), 1.0f);
        AccessibilityManager accessibilityManager = (AccessibilityManager) ruvVar.getContext().getSystemService("accessibility");
        this.e = accessibilityManager;
        accessibilityManager.addAccessibilityStateChangeListener(rvbVar);
        if (accessibilityManager.isEnabled()) {
            d();
        }
    }

    public static final int f(int i, int i2) {
        return (i << 24) | i2;
    }

    public final void a(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(i);
        obtain.setEnabled(true);
        obtain.setClassName(this.b.getClass().getName());
        obtain.setPackageName(this.b.getContext().getPackageName());
        obtain.setSource(this.b, i2);
        this.b.getParent().requestSendAccessibilityEvent(this.b, obtain);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        ruv ruvVar = this.b;
        HashSet o = rwh.o();
        if (ruvVar.p) {
            o.add(ruvVar.q);
            o.add(ruvVar.r);
        }
        for (int i = 0; i < ruvVar.getChildCount(); i++) {
            View childAt = ruvVar.getChildAt(i);
            if (childAt instanceof rvj) {
                o.add((rvj) childAt);
            } else if (childAt.getContentDescription() != null && !childAt.getContentDescription().equals("")) {
                o.add(new rvq(childAt));
            }
        }
        for (rwi rwiVar : ruvVar.s.values()) {
            if (rwiVar instanceof rvj) {
                o.add((rvj) rwiVar);
            }
        }
        ArrayList y = rwh.y(o);
        this.n = y;
        Collections.sort(y, uo.b);
        ruv ruvVar2 = this.b;
        LinkedHashSet r = rwh.r();
        for (int childCount = ruvVar2.getChildCount() - 1; childCount >= 0; childCount--) {
            KeyEvent.Callback childAt2 = ruvVar2.getChildAt(childCount);
            if (childAt2 instanceof rvp) {
                r.add((rvp) childAt2);
            }
        }
        for (rwi rwiVar2 : ruvVar2.s.values()) {
            if (rwiVar2 instanceof rvp) {
                r.add((rvp) rwiVar2);
            }
        }
        this.c = rwh.y(r);
        this.i.clear();
        if (!this.n.isEmpty()) {
            this.i.add(rvc.DESCRIBE);
        }
        Iterator it = this.c.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((rvp) it.next()).a().size();
        }
        if (i2 > 0) {
            this.i.add(rvc.EXPLORE);
        }
        if (this.i.isEmpty()) {
            this.i.add(rvc.NONE);
        }
        if (!this.i.contains(this.h)) {
            rvc rvcVar = (rvc) this.i.iterator().next();
            if (this.h == rvc.EXPLORE) {
                this.k = -1;
            } else if (rvcVar == rvc.EXPLORE) {
                this.k = -2;
            }
            this.h = rvcVar;
        }
        if (this.b.getContentDescription() != null) {
            this.j = this.b.getContentDescription().toString();
        } else if (this.i.contains(rvc.DESCRIBE)) {
            this.j = rvh.a(this.n);
            if (this.i.contains(rvc.EXPLORE)) {
                String str = this.j;
                String string = this.b.getContext().getString(R.string.aplosExploreModeAvailableAnnouncement);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(string).length());
                sb.append(str);
                sb.append(" ");
                sb.append(string);
                this.j = sb.toString();
            }
        } else {
            this.j = "";
        }
        sav.b(this.b);
        System.currentTimeMillis();
        this.l.set(0, 0, this.b.getWidth(), this.b.getHeight());
        int[] iArr = new int[2];
        this.b.getLocationInWindow(iArr);
        this.m.set(this.l);
        this.m.offset(iArr[0], iArr[1]);
        rvh.b(this.b);
    }

    public final void c() {
        this.b.setFocusable(this.p);
        this.b.setFocusableInTouchMode(this.q);
        this.b.A(this.s);
        ruv ruvVar = this.b;
        ruvVar.m.b.remove(this.r);
        this.b.setOnHoverListener(null);
    }

    public final void d() {
        this.p = this.b.isFocusable();
        this.q = this.b.isFocusableInTouchMode();
        this.b.setFocusable(true);
        this.b.setFocusableInTouchMode(true);
        this.b.z(this.s);
        this.b.y(this.r);
        this.b.setOnHoverListener(this.o);
    }

    public final void e(rvc rvcVar) {
        if (this.h == rvcVar) {
            return;
        }
        this.h = rvcVar;
        rvh.b(this.b);
        rvc rvcVar2 = rvc.DESCRIBE;
        int ordinal = rvcVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                this.k = -2;
                a(32768, -2);
                return;
            } else if (ordinal != 2) {
                return;
            }
        }
        this.k = -1;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        return new rux(this);
    }
}
