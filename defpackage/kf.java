package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kf extends kh {
    private static Field a = null;
    private static boolean b = false;
    private static Constructor c = null;
    private static boolean d = false;
    private WindowInsets e;
    private fn f;

    public kf() {
        this.e = d();
    }

    private static WindowInsets d() {
        if (!b) {
            try {
                a = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            b = true;
        }
        Field field = a;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!d) {
            try {
                c = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            d = true;
        }
        Constructor constructor = c;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // defpackage.kh
    public final ko a() {
        ko q = ko.q(this.e);
        q.u(null);
        q.w(this.f);
        return q;
    }

    @Override // defpackage.kh
    public final void b(fn fnVar) {
        this.f = fnVar;
    }

    @Override // defpackage.kh
    public final void c(fn fnVar) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(fnVar.b, fnVar.c, fnVar.d, fnVar.e);
        }
    }

    public kf(ko koVar) {
        super(koVar);
        this.e = koVar.s();
    }
}
