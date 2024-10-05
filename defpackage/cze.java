package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cze implements ctd, cta {
    protected final Drawable a;

    public cze(Drawable drawable) {
        did.ap(drawable);
        this.a = drawable;
    }

    @Override // defpackage.cta
    public void d() {
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof czl) {
            ((czl) drawable).a().prepareToDraw();
        }
    }

    @Override // defpackage.ctd
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Drawable c() {
        Drawable.ConstantState constantState = this.a.getConstantState();
        return constantState == null ? this.a : constantState.newDrawable();
    }
}
