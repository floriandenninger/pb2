package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alhe {
    final /* synthetic */ FloatingActionButton a;

    public alhe(FloatingActionButton floatingActionButton) {
        this.a = floatingActionButton;
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            super/*alik*/.setBackgroundDrawable(drawable);
        }
    }

    public final boolean b() {
        return this.a.b;
    }
}
