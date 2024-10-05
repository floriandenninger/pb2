package com.google.android.apps.youtube.app.common.ui.actionbar;

import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;

/* compiled from: PG */
/* renamed from: com.google.android.apps.youtube.app.common.ui.actionbar.$AutoValue_ActionBarColor_ThemedActionBarColor, reason: invalid class name */
/* loaded from: classes2.dex */
abstract class C$AutoValue_ActionBarColor_ThemedActionBarColor extends ActionBarColor.ThemedActionBarColor {
    public final int a;

    public C$AutoValue_ActionBarColor_ThemedActionBarColor(int i) {
        this.a = i;
    }

    @Override // com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor.ThemedActionBarColor
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ActionBarColor.ThemedActionBarColor) && this.a == ((ActionBarColor.ThemedActionBarColor) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(48);
        sb.append("ThemedActionBarColor{themeAttribute=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
