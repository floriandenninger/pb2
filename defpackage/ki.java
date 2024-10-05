package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class ki extends kn {
    private static boolean c = false;
    private static Method f;
    private static Class g;
    private static Field h;
    private static Field i;
    final WindowInsets a;
    fn b;
    private fn j;
    private ko k;

    public ki(ko koVar, WindowInsets windowInsets) {
        super(koVar);
        this.j = null;
        this.a = windowInsets;
    }

    private static void t() {
        try {
            f = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            g = cls;
            h = cls.getDeclaredField("mVisibleInsets");
            i = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            h.setAccessible(true);
            i.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        c = true;
    }

    private static final fn u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!c) {
            t();
        }
        Method method = f;
        if (method != null && g != null && h != null) {
            try {
                Object invoke = method.invoke(view, new Object[0]);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) h.get(i.get(invoke));
                if (rect != null) {
                    return fn.c(rect);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @Override // defpackage.kn
    public final fn a() {
        if (this.j == null) {
            this.j = fn.d(this.a.getSystemWindowInsetLeft(), this.a.getSystemWindowInsetTop(), this.a.getSystemWindowInsetRight(), this.a.getSystemWindowInsetBottom());
        }
        return this.j;
    }

    @Override // defpackage.kn
    public ko b(int i2, int i3, int i4, int i5) {
        ke keVar = new ke(ko.q(this.a));
        keVar.c(ko.j(a(), i2, i3, i4, i5));
        keVar.b(ko.j(j(), i2, i3, i4, i5));
        return keVar.a();
    }

    @Override // defpackage.kn
    public void c(View view) {
        fn u = u(view);
        if (u == null) {
            u = fn.a;
        }
        this.b = u;
    }

    @Override // defpackage.kn
    public final void d(ko koVar) {
        this.k = koVar;
    }

    @Override // defpackage.kn
    public final boolean e() {
        return this.a.isRound();
    }

    @Override // defpackage.kn
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.b, ((ki) obj).b);
        }
        return false;
    }

    @Override // defpackage.kn
    public boolean g() {
        for (int i2 = 1; i2 <= 256; i2 += i2) {
            if ((i2 & 8) != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 4) {
                        return false;
                    }
                    if (i2 != 8 && i2 != 128) {
                    }
                }
                if (f(i2).equals(fn.a)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.kn
    public final void h() {
    }

    @Override // defpackage.kn
    public fn i() {
        fn fnVar = fn.a;
        for (int i2 = 1; i2 <= 256; i2 += i2) {
            if ((i2 & 7) != 0) {
                fnVar = fn.b(fnVar, f(i2));
            }
        }
        return fnVar;
    }

    protected final fn f(int i2) {
        fn fnVar;
        int i3;
        il o;
        if (i2 == 1) {
            return fn.d(0, a().c, 0, 0);
        }
        if (i2 == 2) {
            fn a = a();
            ko koVar = this.k;
            fn i4 = koVar != null ? koVar.i() : null;
            int i5 = a.e;
            if (i4 != null) {
                i5 = Math.min(i5, i4.e);
            }
            return fn.d(a.b, 0, a.d, i5);
        }
        if (i2 == 8) {
            fn a2 = a();
            ko koVar2 = this.k;
            if (koVar2 != null) {
                fnVar = koVar2.i();
            } else {
                fnVar = fn.a;
            }
            int i6 = a2.e;
            if (i6 > fnVar.e) {
                return fn.d(0, 0, 0, i6);
            }
            fn fnVar2 = this.b;
            return (fnVar2 == null || fnVar2.equals(fn.a) || (i3 = this.b.e) <= fnVar.e) ? fn.a : fn.d(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return r();
        }
        if (i2 == 32) {
            return q();
        }
        if (i2 == 64) {
            return s();
        }
        if (i2 != 128) {
            return fn.a;
        }
        ko koVar3 = this.k;
        if (koVar3 != null) {
            o = koVar3.k();
        } else {
            o = o();
        }
        if (o != null) {
            return fn.d(Build.VERSION.SDK_INT >= 28 ? ((DisplayCutout) o.a).getSafeInsetLeft() : 0, Build.VERSION.SDK_INT >= 28 ? ((DisplayCutout) o.a).getSafeInsetTop() : 0, o.b(), o.a());
        }
        return fn.a;
    }
}
