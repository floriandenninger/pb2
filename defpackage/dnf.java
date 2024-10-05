package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dnf {
    public static final dng a = new dne(5);
    public static final dng b = new dne(6);
    public static final dng c = new dne(4);
    public static final dng d = new dne(0);
    public static final dng e = new dne(1);
    public static final dng f = new dne(3);
    public static final dng g = new dne(2);

    public static float a(View view, boolean z) {
        float f2 = 0.0f;
        while (view != null) {
            if (view instanceof dkp) {
                return f2;
            }
            f2 += z ? view.getX() : view.getY();
            if (view.getParent() instanceof View) {
                view = (View) view.getParent();
            } else {
                String valueOf = String.valueOf(view.getParent());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("Expected parent to be View, was ");
                sb.append(valueOf);
                throw new RuntimeException(sb.toString());
            }
        }
        throw new RuntimeException("Got unexpected null parent");
    }

    public static View b(Object obj, dng dngVar) {
        if (!(obj instanceof View)) {
            String b2 = dngVar.b();
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(b2.length() + 46 + String.valueOf(valueOf).length());
            sb.append("Animating '");
            sb.append(b2);
            sb.append("' is only supported on Views (got ");
            sb.append(valueOf);
            sb.append(")");
            throw new RuntimeException(sb.toString());
        }
        return (View) obj;
    }

    public static View c(Drawable drawable) {
        Object callback;
        while (true) {
            callback = drawable.getCallback();
            if (!(callback instanceof Drawable)) {
                break;
            }
            drawable = (Drawable) callback;
        }
        if (callback instanceof View) {
            return (View) callback;
        }
        return null;
    }
}
