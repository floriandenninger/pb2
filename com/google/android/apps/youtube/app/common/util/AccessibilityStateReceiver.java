package com.google.android.apps.youtube.app.common.util;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import defpackage.any;
import defpackage.aok;
import defpackage.zev;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccessibilityStateReceiver implements AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener, any {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    private final Context c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;

    public AccessibilityStateReceiver(Context context) {
        this.c = context;
    }

    public final void g() {
        if (this.d) {
            zev.h(this.c, this);
            this.d = false;
        }
    }

    public final void h() {
        if (this.e) {
            zev.a(this.c).removeTouchExplorationStateChangeListener(this);
            this.e = false;
        }
    }

    public final void i() {
        if (this.d) {
            return;
        }
        zev.g(this.c, this);
        this.d = true;
    }

    public final void j() {
        k(n());
    }

    public final void k(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((AccessibilityManager.AccessibilityStateChangeListener) it.next()).onAccessibilityStateChanged(z);
        }
    }

    public final void l() {
        m(o());
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    public final void m(boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((AccessibilityManager.TouchExplorationStateChangeListener) it.next()).onTouchExplorationStateChanged(z);
        }
    }

    public final boolean n() {
        return zev.e(this.c);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        g();
        this.f = n();
        h();
        this.g = o();
    }

    public final boolean o() {
        return zev.f(this.c);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        k(z);
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        m(z);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (!this.a.isEmpty()) {
            i();
            if (this.f != n()) {
                j();
            }
        }
        if (this.b.isEmpty()) {
            return;
        }
        if (!this.e) {
            zev.a(this.c).addTouchExplorationStateChangeListener(this);
            this.e = true;
        }
        if (this.g != n()) {
            l();
        }
    }
}
