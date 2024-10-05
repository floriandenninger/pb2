package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class oea {
    public abstract float a();

    public abstract Rect b();

    public abstract Rect c();

    public abstract View d();

    public final View e() {
        View d = d();
        d.getClass();
        return d;
    }

    public final void f() {
        if (g()) {
            e().setTranslationX(c().left);
            e().setTranslationY(c().top);
        }
    }

    public abstract boolean g();
}
