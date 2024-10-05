package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bxt extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public bxt(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        bxu bxuVar = new bxu();
        bxuVar.e = (VectorDrawable) this.a.newDrawable();
        return bxuVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        bxu bxuVar = new bxu();
        bxuVar.e = (VectorDrawable) this.a.newDrawable(resources);
        return bxuVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        bxu bxuVar = new bxu();
        bxuVar.e = (VectorDrawable) this.a.newDrawable(resources, theme);
        return bxuVar;
    }
}
