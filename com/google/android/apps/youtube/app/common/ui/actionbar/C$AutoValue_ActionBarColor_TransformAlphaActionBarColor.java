package com.google.android.apps.youtube.app.common.ui.actionbar;

import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;

/* compiled from: PG */
/* renamed from: com.google.android.apps.youtube.app.common.ui.actionbar.$AutoValue_ActionBarColor_TransformAlphaActionBarColor, reason: invalid class name */
/* loaded from: classes2.dex */
abstract class C$AutoValue_ActionBarColor_TransformAlphaActionBarColor extends ActionBarColor.TransformAlphaActionBarColor {
    public final ActionBarColor a;
    public final int b;

    public C$AutoValue_ActionBarColor_TransformAlphaActionBarColor(ActionBarColor actionBarColor, int i) {
        if (actionBarColor == null) {
            throw new NullPointerException("Null color");
        }
        this.a = actionBarColor;
        this.b = i;
    }

    @Override // com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor.TransformAlphaActionBarColor
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor.TransformAlphaActionBarColor
    public final ActionBarColor b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ActionBarColor.TransformAlphaActionBarColor) {
            ActionBarColor.TransformAlphaActionBarColor transformAlphaActionBarColor = (ActionBarColor.TransformAlphaActionBarColor) obj;
            if (this.a.equals(transformAlphaActionBarColor.b()) && this.b == transformAlphaActionBarColor.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
        sb.append("TransformAlphaActionBarColor{color=");
        sb.append(valueOf);
        sb.append(", alpha=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
