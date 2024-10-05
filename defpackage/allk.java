package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class allk {
    private static final int[] a = {R.attr.snackbarStyle};
    static final Handler b = new Handler(Looper.getMainLooper(), new allc());
    public static final String c = "allk";
    public final ViewGroup d;
    public final Context e;
    public final allj f;
    public final alll g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public List m;
    public BaseTransientBottomBar$Behavior n;
    private Rect q;
    private final AccessibilityManager r;
    private final Runnable p = new allh(this, 1);
    public final allg o = new allg(this);

    /* JADX INFO: Access modifiers changed from: protected */
    public allk(Context context, ViewGroup viewGroup, View view, alll alllVar) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (alllVar != null) {
            this.d = viewGroup;
            this.g = alllVar;
            this.e = context;
            alig.b(context);
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            allj alljVar = (allj) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
            this.f = alljVar;
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                float f = alljVar.b;
                if (f != 1.0f) {
                    snackbarContentLayout.b.setTextColor(akwg.s(alkd.j(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.b.getCurrentTextColor(), f));
                }
            }
            alljVar.addView(view);
            ViewGroup.LayoutParams layoutParams = alljVar.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.q = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            jw.au(alljVar);
            jw.V(alljVar, 1);
            jw.T(alljVar, true);
            jw.X(alljVar, new alld(this));
            jw.M(alljVar, new alle(this));
            this.r = (AccessibilityManager) context.getSystemService("accessibility");
            return;
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
    }

    public int a() {
        return this.h;
    }

    public final int b() {
        int height = this.f.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final ValueAnimator c(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(aleq.a);
        ofFloat.addUpdateListener(new alkz(this, 1));
        return ofFloat;
    }

    public final void d() {
        e(3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(int i) {
        allq allqVar;
        allr a2 = allr.a();
        allg allgVar = this.o;
        synchronized (a2.a) {
            if (a2.g(allgVar)) {
                allqVar = a2.c;
            } else if (a2.h(allgVar)) {
                allqVar = a2.d;
            }
            a2.d(allqVar, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i) {
        allr a2 = allr.a();
        allg allgVar = this.o;
        synchronized (a2.a) {
            if (a2.g(allgVar)) {
                a2.c = null;
                if (a2.d != null) {
                    a2.c();
                }
            }
        }
        List list = this.m;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((alkd) this.m.get(size)).a(this, i);
                }
            }
        }
        ViewParent parent = this.f.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        allr a2 = allr.a();
        allg allgVar = this.o;
        synchronized (a2.a) {
            if (a2.g(allgVar)) {
                a2.b(a2.c);
            }
        }
        List list = this.m;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((alkd) this.m.get(size)).b(this);
            }
        }
    }

    public final void h() {
        allr a2 = allr.a();
        int a3 = a();
        allg allgVar = this.o;
        synchronized (a2.a) {
            if (a2.g(allgVar)) {
                allq allqVar = a2.c;
                allqVar.b = a3;
                a2.b.removeCallbacksAndMessages(allqVar);
                a2.b(a2.c);
                return;
            }
            if (a2.h(allgVar)) {
                a2.d.b = a3;
            } else {
                a2.d = new allq(a3, allgVar, null, null);
            }
            allq allqVar2 = a2.c;
            if (allqVar2 == null || !a2.d(allqVar2, 4)) {
                a2.c = null;
                a2.c();
            }
        }
    }

    public final void i() {
        if (k()) {
            this.f.post(new allh(this, 0));
            return;
        }
        if (this.f.getParent() != null) {
            this.f.setVisibility(0);
        }
        g();
    }

    public final void j() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.q) == null) {
            Log.w(c, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + this.i;
        marginLayoutParams.leftMargin = this.q.left + this.j;
        marginLayoutParams.rightMargin = this.q.right + this.k;
        this.f.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || this.l <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.f.getLayoutParams();
        if ((layoutParams2 instanceof ahh) && (((ahh) layoutParams2).a instanceof SwipeDismissBehavior)) {
            this.f.removeCallbacks(this.p);
            this.f.post(this.p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        AccessibilityManager accessibilityManager = this.r;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final void l() {
        this.f.a = 1;
    }
}
