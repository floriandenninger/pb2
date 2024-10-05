package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jw {
    public static final int[] a;
    private static Method b;
    private static Method c;
    private static boolean d;
    private static WeakHashMap e;
    private static Field f;
    private static boolean g;
    private static ThreadLocal h;

    static {
        new AtomicInteger(1);
        e = null;
        g = false;
        a = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        new jd();
    }

    public static void A(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            jo.b(view);
            return;
        }
        if (!d) {
            aB();
        }
        Method method = b;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused) {
            }
        } else {
            view.onStartTemporaryDetach();
        }
    }

    static void B(View view) {
        ic n = n(view);
        if (n == null) {
            n = new ic();
        }
        M(view, n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void C(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = false;
            if (v(view) != null && view.getVisibility() == 0) {
                z = true;
            }
            if (jj.a(view) != 0 || z) {
                int i2 = true != z ? 2048 : 32;
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(i2);
                jj.d(obtain, i);
                if (z) {
                    obtain.getText().add(v(view));
                    if (jg.a(view) == 0) {
                        jg.j(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        }
                        if (jg.a((View) parent) != 4) {
                            parent = parent.getParent();
                        } else {
                            jg.j(view, 2);
                            break;
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                jj.d(obtain2, 32);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(v(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    jj.b(view.getParent(), view, view, i);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static void D(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect az = az();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            az.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !az.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            aD(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                aD((View) parent2);
            }
        }
        if (z && az.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(az);
        }
    }

    public static void E(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect az = az();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            az.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !az.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            aD(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                aD((View) parent2);
            }
        }
        if (z && az.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(az);
        }
    }

    public static void F(View view, ks ksVar) {
        view.onInitializeAccessibilityNodeInfo(ksVar.b);
    }

    public static void G(View view) {
        jg.e(view);
    }

    public static void H(View view, Runnable runnable) {
        jg.f(view, runnable);
    }

    public static void I(View view, Runnable runnable, long j) {
        jg.g(view, runnable, j);
    }

    public static void J(View view, int i) {
        aC(i, view);
        C(view, 0);
    }

    public static void K(View view) {
        jk.c(view);
    }

    public static void L(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            jr.b(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void M(View view, ic icVar) {
        if (icVar == null && (aA(view) instanceof ib)) {
            icVar = new ic();
        }
        view.setAccessibilityDelegate(icVar == null ? null : icVar.a);
    }

    @Deprecated
    public static void N(View view, float f2) {
        view.setAlpha(f2);
    }

    public static void O(View view, Drawable drawable) {
        jg.h(view, drawable);
    }

    public static void P(View view, ColorStateList colorStateList) {
        jm.i(view, colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = true;
            if (jm.c(view) == null && jm.d(view) == null) {
                z = false;
            }
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            jg.h(view, background);
        }
    }

    public static void Q(View view, PorterDuff.Mode mode) {
        jm.j(view, mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = true;
            if (jm.c(view) == null && jm.d(view) == null) {
                z = false;
            }
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            jg.h(view, background);
        }
    }

    public static void R(View view, Rect rect) {
        ji.b(view, rect);
    }

    public static void S(View view, float f2) {
        jm.k(view, f2);
    }

    @Deprecated
    public static void T(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static void U(View view, boolean z) {
        jg.i(view, z);
    }

    public static void V(View view, int i) {
        jg.j(view, i);
    }

    public static void W(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            jp.b(view, i);
        }
    }

    public static void X(View view, iw iwVar) {
        jm.l(view, iwVar);
    }

    public static void Y(View view, int i, int i2, int i3, int i4) {
        jh.f(view, i, i2, i3, i4);
    }

    @Deprecated
    public static void Z(View view, float f2) {
        view.setScaleX(f2);
    }

    public static float a(View view) {
        return jm.a(view);
    }

    private static View.AccessibilityDelegate aA(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return jr.a(view);
        }
        if (g) {
            return null;
        }
        if (f == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                g = true;
                return null;
            }
        }
        Object obj = f.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    private static void aB() {
        try {
            b = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            c = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException e2) {
            Log.e("ViewCompat", "Couldn't find method", e2);
        }
        d = true;
    }

    private static void aC(int i, View view) {
        List x = x(view);
        for (int i2 = 0; i2 < x.size(); i2++) {
            if (((kr) x.get(i2)).a() == i) {
                x.remove(i2);
                return;
            }
        }
    }

    private static void aD(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void aa(View view, CharSequence charSequence) {
        je p = p();
        if (p.c()) {
            js.b(view, charSequence);
        } else {
            if (TextUtils.equals((CharSequence) p.b(view), charSequence)) {
                return;
            }
            B(view);
            view.setTag(p.a, charSequence);
            C(view, p.b);
        }
    }

    @Deprecated
    public static void ab(View view, float f2) {
        view.setTranslationX(f2);
    }

    public static void ac(View view) {
        jm.m(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean ad(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        jv a2 = jv.a(view);
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = a2.b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!jv.a.isEmpty()) {
                synchronized (jv.a) {
                    if (a2.b == null) {
                        a2.b = new WeakHashMap();
                    }
                    int size = jv.a.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view2 = (View) ((WeakReference) jv.a.get(size)).get();
                        if (view2 == null) {
                            jv.a.remove(size);
                        } else {
                            a2.b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                a2.b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View c2 = a2.c(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (c2 != null && !KeyEvent.isModifierKey(keyCode)) {
                a2.b().put(keyCode, new WeakReference(c2));
            }
        }
        return c2 != null;
    }

    public static boolean ae(View view, KeyEvent keyEvent) {
        int indexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        jv a2 = jv.a(view);
        WeakReference weakReference = a2.c;
        if (weakReference != null && weakReference.get() == keyEvent) {
            return false;
        }
        a2.c = new WeakReference(keyEvent);
        SparseArray b2 = a2.b();
        WeakReference weakReference2 = null;
        if (keyEvent.getAction() == 1 && (indexOfKey = b2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference2 = (WeakReference) b2.valueAt(indexOfKey);
            b2.removeAt(indexOfKey);
        }
        if (weakReference2 == null) {
            weakReference2 = (WeakReference) b2.get(keyEvent.getKeyCode());
        }
        if (weakReference2 == null) {
            return false;
        }
        View view2 = (View) weakReference2.get();
        if (view2 == null || !jj.e(view2)) {
            return true;
        }
        jv.d(view2);
        return true;
    }

    public static boolean af(View view) {
        return jg.k(view);
    }

    public static boolean ag(View view) {
        return jf.a(view);
    }

    public static boolean ah(View view) {
        return jg.l(view);
    }

    public static boolean ai(View view) {
        return jg.m(view);
    }

    public static boolean aj(View view) {
        return jj.e(view);
    }

    public static boolean ak(View view) {
        return ji.c(view);
    }

    public static boolean al(View view) {
        return jj.f(view);
    }

    public static boolean am(View view) {
        return jj.g(view);
    }

    public static boolean an(View view) {
        return jm.n(view);
    }

    public static boolean ao(View view) {
        return jh.g(view);
    }

    public static boolean ap(View view) {
        Boolean bool = (Boolean) new iz(Boolean.class).b(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean aq(View view, int i, Bundle bundle) {
        return jg.n(view, i, bundle);
    }

    public static String[] ar(View view) {
        return Build.VERSION.SDK_INT >= 31 ? jt.b(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void as(View view, ko koVar, Rect rect) {
        jm.e(view, koVar, rect);
    }

    public static void au(View view) {
        jj.c(view, 1);
    }

    public static void av(View view) {
        jh.e(view, 0);
    }

    public static void aw(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            jn.a(view, i, 3);
        }
    }

    @Deprecated
    public static boolean ax(View view) {
        return view.canScrollVertically(-1);
    }

    public static void ay(View view, kw kwVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            jo.c(view, (PointerIcon) kwVar.a);
        }
    }

    private static Rect az() {
        if (h == null) {
            h = new ThreadLocal();
        }
        Rect rect = (Rect) h.get();
        if (rect == null) {
            rect = new Rect();
            h.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static float b(View view) {
        return jm.b(view);
    }

    public static int c(View view) {
        return jg.a(view);
    }

    public static int d(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return jp.a(view);
        }
        return 0;
    }

    public static int e(View view) {
        return jh.a(view);
    }

    public static int f(View view) {
        return jg.b(view);
    }

    public static int g(View view) {
        return jg.c(view);
    }

    public static int h(View view) {
        return jh.b(view);
    }

    public static int i(View view) {
        return jh.c(view);
    }

    @Deprecated
    public static int j(View view) {
        return jg.d(view);
    }

    public static ColorStateList k(View view) {
        return jm.c(view);
    }

    public static PorterDuff.Mode l(View view) {
        return jm.d(view);
    }

    public static Rect m(View view) {
        return ji.a(view);
    }

    public static ic n(View view) {
        View.AccessibilityDelegate aA = aA(view);
        if (aA == null) {
            return null;
        }
        if (aA instanceof ib) {
            return ((ib) aA).a;
        }
        return new ic(aA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ik o(View view, ik ikVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return jt.a(view, ikVar);
        }
        if (((jn) view.getTag(R.id.tag_on_receive_content_listener)) == null) {
            return view.a(ikVar);
        }
        ik b2 = jn.b(view, ikVar);
        if (b2 == null) {
            return null;
        }
        return view.a(b2);
    }

    public static je p() {
        return new jb(CharSequence.class);
    }

    public static ka q(View view) {
        if (e == null) {
            e = new WeakHashMap();
        }
        ka kaVar = (ka) e.get(view);
        if (kaVar != null) {
            return kaVar;
        }
        ka kaVar2 = new ka(view);
        e.put(view, kaVar2);
        return kaVar2;
    }

    public static ko r(View view, ko koVar) {
        WindowInsets s = koVar.s();
        if (s != null) {
            WindowInsets a2 = jk.a(view, s);
            if (!a2.equals(s)) {
                return ko.r(a2, view);
            }
        }
        return koVar;
    }

    public static ko s(View view) {
        if (Build.VERSION.SDK_INT < 23) {
            return jm.f(view);
        }
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        ko q = ko.q(rootWindowInsets);
        q.v(q);
        q.t(view.getRootView());
        return q;
    }

    public static ko t(View view, ko koVar) {
        WindowInsets s = koVar.s();
        if (s != null) {
            WindowInsets b2 = jk.b(view, s);
            if (!b2.equals(s)) {
                return ko.r(b2, view);
            }
        }
        return koVar;
    }

    public static Display u(View view) {
        return jh.d(view);
    }

    public static CharSequence v(View view) {
        return (CharSequence) new ja(CharSequence.class).b(view);
    }

    public static String w(View view) {
        return jm.g(view);
    }

    public static List x(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void y(View view, kr krVar) {
        B(view);
        aC(krVar.a(), view);
        x(view).add(krVar);
        C(view, 0);
    }

    public static void z(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            jo.a(view);
            return;
        }
        if (!d) {
            aB();
        }
        Method method = c;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused) {
            }
        } else {
            view.onFinishTemporaryDetach();
        }
    }

    public static void at(View view, kr krVar, lf lfVar) {
        if (lfVar != null) {
            y(view, new kr(null, krVar.k, null, lfVar, krVar.l));
        } else {
            J(view, krVar.a());
        }
    }
}
