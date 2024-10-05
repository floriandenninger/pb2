package com.google.android.apps.youtube.app.common.ui.actionbar;

import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;

/* compiled from: PG */
/* renamed from: com.google.android.apps.youtube.app.common.ui.actionbar.$AutoValue_ActionBarColor_ColorConstantActionBarColor, reason: invalid class name */
/* loaded from: classes2.dex */
abstract class C$AutoValue_ActionBarColor_ColorConstantActionBarColor extends ActionBarColor.ColorConstantActionBarColor {
    public final int a;

    public C$AutoValue_ActionBarColor_ColorConstantActionBarColor(int i) {
        this.a = i;
    }

    @Override // com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor.ColorConstantActionBarColor
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ActionBarColor.ColorConstantActionBarColor) && this.a == ((ActionBarColor.ColorConstantActionBarColor) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(49);
        sb.append("ColorConstantActionBarColor{colorRes=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
