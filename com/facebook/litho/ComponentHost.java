package com.facebook.litho;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.youtube.R;
import defpackage.aeh;
import defpackage.dgo;
import defpackage.dha;
import defpackage.dhc;
import defpackage.dhd;
import defpackage.dhe;
import defpackage.dhf;
import defpackage.dhg;
import defpackage.dhl;
import defpackage.dhm;
import defpackage.did;
import defpackage.dik;
import defpackage.diq;
import defpackage.dis;
import defpackage.djh;
import defpackage.dju;
import defpackage.dlx;
import defpackage.dly;
import defpackage.dlz;
import defpackage.dmt;
import defpackage.doa;
import defpackage.dul;
import defpackage.dum;
import defpackage.jw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ComponentHost extends dul implements djh {
    private dhc A;
    private boolean B;
    private diq C;
    public aeh a;
    public aeh b;
    public aeh c;
    public aeh d;
    public aeh e;
    public aeh f;
    public ArrayList g;
    public Object h;
    public SparseArray i;
    public boolean j;
    public dhd k;
    public dhl l;
    public dhf m;
    public dhm n;
    public dly o;
    public boolean p;
    public boolean q;
    private CharSequence r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private final dhg x;
    private int[] y;
    private boolean z;

    public ComponentHost(dhe dheVar) {
        super(dheVar.b);
        this.x = new dhg(this);
        this.y = new int[0];
        this.B = false;
        this.p = false;
        this.q = false;
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
        p(dgo.b(dheVar.b));
        this.a = new aeh();
        this.c = new aeh();
        this.e = new aeh();
        this.g = new ArrayList();
    }

    private final boolean z() {
        dum c = c();
        return c != null && dju.a(c).b.ae();
    }

    public final int a() {
        aeh aehVar = this.a;
        if (aehVar == null) {
            return 0;
        }
        return aehVar.c();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void addView(View view) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    protected final void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // defpackage.djh
    public final diq b() {
        return this.C;
    }

    public final dum c() {
        for (int i = 0; i < a(); i++) {
            dum d = d(i);
            if (d != null && dju.a(d).d()) {
                return d;
            }
        }
        return null;
    }

    public final dum d(int i) {
        return (dum) this.a.g(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return (this.A != null && z() && this.A.t(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        diq diqVar = this.C;
        if (diqVar != null) {
            diqVar.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        aeh aehVar = this.e;
        int c = aehVar == null ? 0 : aehVar.c();
        for (int i = 0; i < c; i++) {
            dum dumVar = (dum) this.e.g(i);
            dju a = dju.a(dumVar);
            did.I(this, (Drawable) dumVar.a, a.d, a.l);
        }
    }

    public final List e() {
        CharSequence charSequence;
        ArrayList arrayList = new ArrayList();
        aeh aehVar = this.e;
        int c = aehVar == null ? 0 : aehVar.c();
        for (int i = 0; i < c; i++) {
            dik dikVar = dju.a((dum) this.e.g(i)).l;
            if (dikVar != null && (charSequence = dikVar.a) != null) {
                arrayList.add(charSequence);
            }
        }
        CharSequence charSequence2 = this.r;
        if (charSequence2 != null) {
            arrayList.add(charSequence2);
        }
        return arrayList;
    }

    public final void g() {
        if (this.g == null) {
            this.g = new ArrayList();
        }
    }

    @Override // android.view.View
    public final CharSequence getContentDescription() {
        return this.r;
    }

    @Override // android.view.View
    public Object getTag() {
        Object obj = this.h;
        return obj != null ? obj : super.getTag();
    }

    public TextContent getTextContent() {
        List list;
        i();
        aeh aehVar = this.a;
        int c = aehVar.c();
        if (c == 1) {
            list = Collections.singletonList(((dum) aehVar.g(0)).a);
        } else {
            ArrayList arrayList = new ArrayList(c);
            for (int i = 0; i < c; i++) {
                arrayList.add(((dum) aehVar.g(i)).a);
            }
            list = arrayList;
        }
        return did.C(list);
    }

    public final void h() {
        if (this.e == null) {
            this.e = new aeh();
        }
    }

    public final void i() {
        if (this.a == null) {
            this.a = new aeh();
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.v) {
            this.s = true;
        } else {
            super.invalidate();
        }
    }

    public final void j() {
        if (this.c == null) {
            this.c = new aeh();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        aeh aehVar = this.e;
        int c = aehVar == null ? 0 : aehVar.c();
        for (int i = 0; i < c; i++) {
            ((Drawable) ((dum) this.e.g(i)).a).jumpToCurrentState();
        }
    }

    public final void k() {
        if (this.B) {
            if (this.v) {
                this.t = true;
            } else {
                if (this.A == null || !z()) {
                    return;
                }
                this.A.n();
            }
        }
    }

    public final void l(int i, dum dumVar) {
        Rect a;
        dmt dmtVar = dju.a(dumVar).a;
        if (dmtVar == null || (a = dmtVar.a()) == null || equals(dumVar.a)) {
            return;
        }
        if (this.o == null) {
            dly dlyVar = new dly(this);
            this.o = dlyVar;
            setTouchDelegate(dlyVar);
        }
        dly dlyVar2 = this.o;
        View view = (View) dumVar.a;
        aeh aehVar = dlyVar2.b;
        dlx dlxVar = (dlx) dlx.a.a();
        if (dlxVar == null) {
            dlxVar = new dlx();
        }
        dlxVar.b = view;
        dlxVar.d = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        dlxVar.e.set(a);
        dlxVar.f.set(a);
        Rect rect = dlxVar.f;
        int i2 = -dlxVar.d;
        rect.inset(i2, i2);
        aehVar.k(i, dlxVar);
    }

    public final void m(int i, dum dumVar) {
        int a;
        dmt dmtVar = dju.a(dumVar).a;
        if (dmtVar == null || this.o == null || dmtVar.a() == null || equals(dumVar.a)) {
            return;
        }
        dly dlyVar = this.o;
        aeh aehVar = dlyVar.c;
        if (aehVar == null || (a = aehVar.a(i)) < 0) {
            int a2 = dlyVar.b.a(i);
            dlx dlxVar = (dlx) dlyVar.b.g(a2);
            dlyVar.b.m(a2);
            dlxVar.a();
            return;
        }
        dlx dlxVar2 = (dlx) dlyVar.c.g(a);
        dlyVar.c.m(a);
        dlxVar2.a();
    }

    public final void n(int i, dum dumVar, Rect rect) {
        Object obj = dumVar.a;
        if (obj instanceof Drawable) {
            h();
            this.e.k(i, dumVar);
            Drawable drawable = (Drawable) dumVar.a;
            dju a = dju.a(dumVar);
            int i2 = a.d;
            dik dikVar = a.l;
            drawable.setVisible(getVisibility() == 0, false);
            drawable.setCallback(this);
            did.I(this, drawable, i2, dikVar);
            invalidate(rect);
        } else if (obj instanceof View) {
            j();
            this.c.k(i, dumVar);
            View view = (View) obj;
            view.setDuplicateParentStateEnabled(dju.e(dju.a(dumVar).d));
            this.j = true;
            if (!(view instanceof ComponentHost) || view.getParent() != this) {
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(generateDefaultLayoutParams());
                }
                if (this.z) {
                    super.addViewInLayout(view, -1, view.getLayoutParams(), true);
                } else {
                    super.addView(view, -1, view.getLayoutParams());
                }
            } else {
                jw.z(view);
                view.setVisibility(0);
            }
            l(i, dumVar);
        }
        i();
        this.a.k(i, dumVar);
        did.D(dumVar);
    }

    @Override // defpackage.dul
    public final void o(dum dumVar, int i, int i2) {
        dly dlyVar;
        dmt dmtVar = dju.a(dumVar).a;
        if (dmtVar != null && dmtVar.a() != null && (dlyVar = this.o) != null) {
            if (dlyVar.b.e(i2) != null) {
                if (dlyVar.c == null) {
                    aeh aehVar = (aeh) dly.a.a();
                    if (aehVar == null) {
                        aehVar = new aeh(4);
                    }
                    dlyVar.c = aehVar;
                }
                did.G(i2, dlyVar.b, dlyVar.c);
            }
            did.E(i, i2, dlyVar.b, dlyVar.c);
            aeh aehVar2 = dlyVar.c;
            if (aehVar2 != null && aehVar2.c() == 0) {
                dly.a.b(dlyVar.c);
                dlyVar.c = null;
            }
        }
        Object obj = dumVar.a;
        j();
        if (obj instanceof Drawable) {
            h();
            if (this.e.e(i2) != null) {
                if (this.f == null) {
                    this.f = new aeh(4);
                }
                did.G(i2, this.e, this.f);
            }
            did.E(i, i2, this.e, this.f);
            invalidate();
            q();
        } else if (obj instanceof View) {
            this.j = true;
            if (!this.w) {
                View view = (View) obj;
                view.cancelPendingInputEvents();
                jw.A(view);
            }
            if (this.c.e(i2) != null) {
                if (this.d == null) {
                    this.d = new aeh(4);
                }
                did.G(i2, this.c, this.d);
            }
            did.E(i, i2, this.c, this.d);
        }
        i();
        if (this.a.e(i2) != null) {
            if (this.b == null) {
                this.b = new aeh(4);
            }
            did.G(i2, this.a, this.b);
        }
        did.E(i, i2, this.a, this.b);
        q();
        if (this.w || !(obj instanceof View)) {
            return;
        }
        jw.z((View) obj);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.w = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.z = true;
        y(i, i2, i3, i4);
        this.z = false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            aeh aehVar = this.e;
            int c = aehVar == null ? 0 : aehVar.c();
            while (true) {
                c--;
                if (c < 0) {
                    break;
                }
                dum dumVar = (dum) this.e.g(c);
                if ((dumVar.a instanceof dlz) && (dju.a(dumVar).d & 2) != 2) {
                    dlz dlzVar = (dlz) dumVar.a;
                    if (dlzVar.d(motionEvent) && dlzVar.c(motionEvent, this)) {
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z) {
        if (z == this.B) {
            return;
        }
        if (z && this.A == null) {
            this.A = new dhc(this, null, isFocusable(), jw.c(this));
        }
        jw.M(this, z ? this.A : null);
        this.B = z;
        if (z) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof ComponentHost) {
                    ((ComponentHost) childAt).p(true);
                } else {
                    dik dikVar = (dik) childAt.getTag(R.id.component_node_info);
                    if (dikVar != null) {
                        jw.M(childAt, new dhc(childAt, dikVar, childAt.isFocusable(), jw.c(childAt)));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        CharSequence join;
        if (i != 512) {
            if (i == 256) {
                i = 256;
            }
            return super.performAccessibilityAction(i, bundle);
        }
        if (!TextUtils.isEmpty(this.r)) {
            join = this.r;
        } else if (!e().isEmpty()) {
            join = TextUtils.join(", ", e());
        } else {
            join = !getTextContent().getTextItems().isEmpty() ? TextUtils.join(", ", getTextContent().getTextItems()) : null;
        }
        if (join == null) {
            return false;
        }
        this.r = join;
        super.setContentDescription(join);
        return super.performAccessibilityAction(i, bundle);
    }

    public final void q() {
        aeh aehVar = this.b;
        if (aehVar != null && aehVar.c() == 0) {
            this.b = null;
        }
        aeh aehVar2 = this.d;
        if (aehVar2 == null || aehVar2.c() != 0) {
            return;
        }
        this.d = null;
    }

    @Override // defpackage.djh
    public final void r(diq diqVar) {
        this.C = diqVar;
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeAllViewsInLayout() {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    protected final void removeDetachedView(View view, boolean z) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    @Deprecated
    public final void removeView(View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeViewAt(int i) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeViewInLayout(View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeViews(int i, int i2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void removeViewsInLayout(int i, int i2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.w = z;
    }

    @Override // defpackage.dul, android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (i == 130) {
            if (rect == null && this.v) {
                this.u = true;
                return false;
            }
            i = 130;
        }
        return super.requestFocus(i, rect);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        for (ViewParent viewParent = this; viewParent instanceof ComponentHost; viewParent = viewParent.getParent()) {
            if (!((ComponentHost) viewParent).x()) {
                return;
            }
        }
        super.requestLayout();
    }

    public final void s(boolean z) {
        boolean z2 = doa.a;
        if (this.v == z) {
            return;
        }
        this.v = z;
        if (z) {
            return;
        }
        if (this.s) {
            invalidate();
            this.s = false;
        }
        if (this.t) {
            k();
            this.t = false;
        }
        if (this.u) {
            View rootView = getRootView();
            if (rootView != null) {
                rootView.requestFocus();
            }
            this.u = false;
        }
    }

    @Override // android.view.View
    public final void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        super.setAccessibilityDelegate(accessibilityDelegate);
        this.B = false;
    }

    @Override // android.view.ViewGroup
    public final void setClipChildren(boolean z) {
        if (this.p) {
            this.q = z;
        } else {
            super.setClipChildren(z);
        }
    }

    @Override // android.view.View
    public final void setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        if (!TextUtils.isEmpty(charSequence) && jw.c(this) == 0) {
            jw.V(this, 1);
        }
        k();
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (i != R.id.component_node_info || obj == null) {
            return;
        }
        p(dgo.b(getContext()));
        dhc dhcVar = this.A;
        if (dhcVar != null) {
            dhcVar.f = (dik) obj;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        aeh aehVar = this.e;
        int c = aehVar == null ? 0 : aehVar.c();
        for (int i2 = 0; i2 < c; i2++) {
            ((Drawable) ((dum) this.e.g(i2)).a).setVisible(i == 0, false);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.dul
    public final void t(int i, dum dumVar) {
        Object obj = dumVar.a;
        if (obj instanceof Drawable) {
            h();
            u(dumVar);
            did.F(i, this.e, this.f);
        } else if (obj instanceof View) {
            v((View) obj);
            j();
            did.F(i, this.c, this.d);
            this.j = true;
            m(i, dumVar);
        }
        i();
        did.F(i, this.a, this.b);
        q();
        did.D(dumVar);
    }

    public final void u(dum dumVar) {
        Drawable drawable = (Drawable) dumVar.a;
        drawable.setCallback(null);
        invalidate(drawable.getBounds());
        q();
    }

    public final void v(View view) {
        this.j = true;
        if (this.z) {
            super.removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public final boolean w() {
        ArrayList arrayList = this.g;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean x() {
        return !this.z;
    }

    public void y(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void addView(View view, int i) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        dhg dhgVar = this.x;
        dhgVar.a = canvas;
        dhgVar.b = 0;
        aeh aehVar = dhgVar.d.a;
        dhgVar.c = aehVar == null ? 0 : aehVar.c();
        super.dispatchDraw(canvas);
        if (this.x.b()) {
            this.x.a();
        }
        this.x.a = null;
        ArrayList arrayList = this.g;
        int size = arrayList == null ? 0 : arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((dum) this.g.get(i)).a;
            if (obj instanceof Drawable) {
                ((Drawable) obj).draw(canvas);
            }
        }
        if (doa.b) {
            if (did.g == null) {
                did.g = new Paint();
                did.g.setColor(1724029951);
            }
            if (did.h == null) {
                did.h = new Paint();
                did.h.setColor(1154744270);
            }
            if (did.k(this)) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), did.g);
            }
            for (int a = a() - 1; a >= 0; a--) {
                dum d = d(a);
                dha dhaVar = dju.a(d).b;
                if (dha.z(dhaVar) && !dha.v(dhaVar)) {
                    if (did.k((View) d.a)) {
                        canvas.drawRect(r1.getLeft(), r1.getTop(), r1.getRight(), r1.getBottom(), did.h);
                    }
                }
            }
            dly dlyVar = this.o;
            if (dlyVar != null) {
                Paint paint = did.h;
                int c = dlyVar.b.c();
                while (true) {
                    c--;
                    if (c < 0) {
                        break;
                    } else {
                        canvas.drawRect(((dlx) dlyVar.b.g(c)).e, paint);
                    }
                }
            }
        }
        if (doa.d) {
            Resources resources = getResources();
            if (did.i == null) {
                did.i = new Rect();
            }
            if (did.j == null) {
                did.j = new Paint();
                did.j.setStyle(Paint.Style.STROKE);
                did.j.setStrokeWidth(did.i(resources, 1));
            }
            if (did.k == null) {
                did.k = new Paint();
                did.k.setStyle(Paint.Style.FILL);
                did.k.setStrokeWidth(did.i(resources, 2));
            }
            for (int a2 = a() - 1; a2 >= 0; a2--) {
                dum d2 = d(a2);
                dha dhaVar2 = dju.a(d2).b;
                Object obj2 = d2.a;
                if (!(dhaVar2 instanceof dis)) {
                    if (obj2 instanceof View) {
                        View view = (View) obj2;
                        did.i.left = view.getLeft();
                        did.i.top = view.getTop();
                        did.i.right = view.getRight();
                        did.i.bottom = view.getBottom();
                    } else if (obj2 instanceof Drawable) {
                        did.i.set(((Drawable) obj2).getBounds());
                    }
                    did.j.setColor(true != dha.v(dhaVar2) ? -1711341568 : -1711341313);
                    Paint paint2 = did.j;
                    Rect rect = did.i;
                    int strokeWidth = ((int) paint2.getStrokeWidth()) / 2;
                    canvas.drawRect(rect.left + strokeWidth, rect.top + strokeWidth, rect.right - strokeWidth, rect.bottom - strokeWidth, paint2);
                    did.k.setColor(true != dha.v(dhaVar2) ? -16776961 : -16711681);
                    Paint paint3 = did.k;
                    Rect rect2 = did.i;
                    int strokeWidth2 = (int) did.k.getStrokeWidth();
                    int min = Math.min(Math.min(did.i.width(), did.i.height()) / 3, did.i(resources, 12));
                    did.j(canvas, paint3, rect2.left, rect2.top, strokeWidth2, strokeWidth2, min);
                    int i2 = -strokeWidth2;
                    did.j(canvas, paint3, rect2.left, rect2.bottom, strokeWidth2, i2, min);
                    did.j(canvas, paint3, rect2.right, rect2.top, i2, strokeWidth2, min);
                    did.j(canvas, paint3, rect2.right, rect2.bottom, i2, i2, min);
                }
            }
        }
    }

    public final List f() {
        aeh aehVar = this.e;
        int c = aehVar == null ? 0 : aehVar.c();
        ArrayList arrayList = null;
        for (int i = 0; i < c; i++) {
            dum dumVar = (dum) this.e.g(i);
            if ((dju.a(dumVar).d & 4) != 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((Drawable) dumVar.a);
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final Object getTag(int i) {
        Object obj;
        SparseArray sparseArray = this.i;
        return (sparseArray == null || (obj = sparseArray.get(i)) == null) ? super.getTag(i) : obj;
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (this.v) {
            this.s = true;
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        if (this.v) {
            this.s = true;
        } else {
            super.invalidate(rect);
        }
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        if (this.j) {
            int childCount = getChildCount();
            if (this.y.length < childCount) {
                this.y = new int[childCount + 5];
            }
            aeh aehVar = this.c;
            int c = aehVar == null ? 0 : aehVar.c();
            int i3 = 0;
            int i4 = 0;
            while (i3 < c) {
                this.y[i4] = indexOfChild((View) ((dum) this.c.g(i3)).a);
                i3++;
                i4++;
            }
            ArrayList arrayList = this.g;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = ((dum) this.g.get(i5)).a;
                if (obj instanceof View) {
                    this.y[i4] = indexOfChild((View) obj);
                    i4++;
                }
            }
            this.j = false;
        }
        if (this.x.b()) {
            this.x.a();
        }
        return this.y[i2];
    }
}
