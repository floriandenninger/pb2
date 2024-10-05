package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajtf {
    public final TextView a;
    public final TextView b;
    public final View c;
    public final int d;
    public final int e;
    public final ColorStateList f;
    public final int g;
    public final ColorStateList h;
    public final int i;
    public final ColorStateList j;

    public ajtf() {
    }

    public ajtf(TextView textView, TextView textView2, View view, int i, int i2, ColorStateList colorStateList, int i3, ColorStateList colorStateList2, int i4, ColorStateList colorStateList3) {
        this.a = textView;
        this.b = textView2;
        this.c = view;
        this.d = i;
        this.e = i2;
        this.f = colorStateList;
        this.g = i3;
        this.h = colorStateList2;
        this.i = i4;
        this.j = colorStateList3;
    }

    public final ajte b() {
        return new ajte(this);
    }

    public final boolean equals(Object obj) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajtf) {
            ajtf ajtfVar = (ajtf) obj;
            TextView textView = this.a;
            if (textView != null ? textView.equals(ajtfVar.a) : ajtfVar.a == null) {
                TextView textView2 = this.b;
                if (textView2 != null ? textView2.equals(ajtfVar.b) : ajtfVar.b == null) {
                    View view = this.c;
                    if (view != null ? view.equals(ajtfVar.c) : ajtfVar.c == null) {
                        if (this.d == ajtfVar.d && this.e == ajtfVar.e && ((colorStateList = this.f) != null ? colorStateList.equals(ajtfVar.f) : ajtfVar.f == null) && this.g == ajtfVar.g && ((colorStateList2 = this.h) != null ? colorStateList2.equals(ajtfVar.h) : ajtfVar.h == null) && this.i == ajtfVar.i) {
                            ColorStateList colorStateList3 = this.j;
                            ColorStateList colorStateList4 = ajtfVar.j;
                            if (colorStateList3 != null ? colorStateList3.equals(colorStateList4) : colorStateList4 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int i = this.d;
        int i2 = this.e;
        String valueOf4 = String.valueOf(this.f);
        int i3 = this.g;
        String valueOf5 = String.valueOf(this.h);
        int i4 = this.i;
        String valueOf6 = String.valueOf(this.j);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 258 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("BasicColorPaletteDecorator{title=");
        sb.append(valueOf);
        sb.append(", body=");
        sb.append(valueOf2);
        sb.append(", background=");
        sb.append(valueOf3);
        sb.append(", fallbackBackgroundColor=");
        sb.append(i);
        sb.append(", fallbackTitleColor=");
        sb.append(i2);
        sb.append(", fallbackTitleColorList=");
        sb.append(valueOf4);
        sb.append(", fallbackBodyColor=");
        sb.append(i3);
        sb.append(", fallbackBodyColorList=");
        sb.append(valueOf5);
        sb.append(", fallbackLinkColor=");
        sb.append(i4);
        sb.append(", fallbackLinkColorList=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }

    public final void a(apkv apkvVar) {
        TextView textView = this.a;
        if (textView != null) {
            ColorStateList colorStateList = this.f;
            if (colorStateList == null) {
                int i = this.e;
                if (apkvVar == null || (apkvVar.b & 2) == 0) {
                    textView.setTextColor(i);
                } else {
                    textView.setTextColor(apkvVar.d);
                }
            } else if (apkvVar == null || (apkvVar.b & 2) == 0) {
                textView.setTextColor(colorStateList);
            } else {
                textView.setTextColor(apkvVar.d);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            ColorStateList colorStateList2 = this.h;
            if (colorStateList2 == null) {
                int i2 = this.g;
                if (apkvVar == null || (apkvVar.b & 4) == 0) {
                    textView2.setTextColor(i2);
                } else {
                    textView2.setTextColor(apkvVar.e);
                }
            } else if (apkvVar == null || (apkvVar.b & 4) == 0) {
                textView2.setTextColor(colorStateList2);
            } else {
                textView2.setTextColor(apkvVar.e);
            }
            ColorStateList colorStateList3 = this.j;
            if (colorStateList3 != null) {
                TextView textView3 = this.b;
                if (textView3 != null) {
                    if (apkvVar == null || (apkvVar.b & 8) == 0) {
                        textView3.setLinkTextColor(colorStateList3);
                    } else {
                        textView3.setLinkTextColor(apkvVar.f);
                    }
                }
            } else {
                TextView textView4 = this.b;
                int i3 = this.i;
                if (textView4 != null) {
                    if (apkvVar != null && (apkvVar.b & 8) != 0) {
                        i3 = apkvVar.f;
                    }
                    textView4.setLinkTextColor(i3);
                }
            }
        }
        View view = this.c;
        if (view != null) {
            int i4 = this.d;
            if (apkvVar != null && (apkvVar.b & 1) != 0) {
                i4 = apkvVar.c;
            }
            view.setBackgroundColor(i4);
        }
    }

    public final int hashCode() {
        TextView textView = this.a;
        int hashCode = ((textView == null ? 0 : textView.hashCode()) ^ 1000003) * 1000003;
        TextView textView2 = this.b;
        int hashCode2 = (hashCode ^ (textView2 == null ? 0 : textView2.hashCode())) * 1000003;
        View view = this.c;
        int hashCode3 = (((((hashCode2 ^ (view == null ? 0 : view.hashCode())) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003;
        ColorStateList colorStateList = this.f;
        int hashCode4 = (((hashCode3 ^ (colorStateList == null ? 0 : colorStateList.hashCode())) * 1000003) ^ this.g) * 1000003;
        ColorStateList colorStateList2 = this.h;
        int hashCode5 = (((hashCode4 ^ (colorStateList2 == null ? 0 : colorStateList2.hashCode())) * 1000003) ^ this.i) * 1000003;
        ColorStateList colorStateList3 = this.j;
        return hashCode5 ^ (colorStateList3 != null ? colorStateList3.hashCode() : 0);
    }
}
