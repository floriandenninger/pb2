package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ge extends Drawable.ConstantState {
    int a;
    Drawable.ConstantState b;
    ColorStateList c;
    PorterDuff.Mode d;

    public ge(ge geVar) {
        this.c = null;
        this.d = gc.a;
        if (geVar != null) {
            this.a = geVar.a;
            this.b = geVar.b;
            this.c = geVar.c;
            this.d = geVar.d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i = this.a;
        Drawable.ConstantState constantState = this.b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new gd(this, resources);
    }
}
