package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxi extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public bxi(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        bxj bxjVar = new bxj();
        bxjVar.e = this.a.newDrawable();
        bxjVar.e.setCallback(bxjVar.d);
        return bxjVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        bxj bxjVar = new bxj();
        bxjVar.e = this.a.newDrawable(resources);
        bxjVar.e.setCallback(bxjVar.d);
        return bxjVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        bxj bxjVar = new bxj();
        bxjVar.e = this.a.newDrawable(resources, theme);
        bxjVar.e.setCallback(bxjVar.d);
        return bxjVar;
    }
}
