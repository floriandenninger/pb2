package com.google.android.apps.youtube.app.common.ui.actionbar;

import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;

/* compiled from: PG */
/* renamed from: com.google.android.apps.youtube.app.common.ui.actionbar.$AutoValue_ActionBarColor_ColorIntActionBarColor, reason: invalid class name */
/* loaded from: classes2.dex */
abstract class C$AutoValue_ActionBarColor_ColorIntActionBarColor extends ActionBarColor.ColorIntActionBarColor {
    public final int a;

    public C$AutoValue_ActionBarColor_ColorIntActionBarColor(int i) {
        this.a = i;
    }

    @Override // com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor.ColorIntActionBarColor
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ActionBarColor.ColorIntActionBarColor) && this.a == ((ActionBarColor.ColorIntActionBarColor) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(44);
        sb.append("ColorIntActionBarColor{colorInt=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
