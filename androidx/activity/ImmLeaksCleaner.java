package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import defpackage.aod;
import defpackage.aoi;
import defpackage.aok;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements aoi {
    private static int a;
    private static Field b;
    private static Field c;
    private static Field d;
    private Activity e;

    public ImmLeaksCleaner(Activity activity) {
        this.e = activity;
    }

    private static void b() {
        try {
            a = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            c = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            d = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            b = declaredField3;
            declaredField3.setAccessible(true);
            a = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // defpackage.aoi
    public final void a(aok aokVar, aod aodVar) {
        if (aodVar != aod.ON_DESTROY) {
            return;
        }
        if (a == 0) {
            b();
        }
        if (a == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.e.getSystemService("input_method");
            try {
                Object obj = b.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) c.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                d.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
