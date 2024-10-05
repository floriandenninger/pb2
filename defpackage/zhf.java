package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zhf implements zhh {
    private final int a;
    private final /* synthetic */ int b;

    public zhf(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    public zhf(int i, int i2, byte[] bArr) {
        this.b = i2;
        this.a = i;
    }

    public zhf(int i, int i2, char[] cArr) {
        this.b = i2;
        this.a = i;
    }

    public zhf(int i, int i2, float[] fArr) {
        this.b = i2;
        this.a = i;
    }

    public zhf(int i, int i2, int[] iArr) {
        this.b = i2;
        this.a = i;
    }

    public zhf(int i, int i2, short[] sArr) {
        this.b = i2;
        this.a = i;
    }

    public zhf(int i, int i2, boolean[] zArr) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.zhh
    public final /* synthetic */ boolean a(ViewGroup.LayoutParams layoutParams) {
        switch (this.b) {
            case 0:
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                int i = layoutParams2.gravity;
                int i2 = this.a;
                if (i == i2) {
                    return false;
                }
                layoutParams2.gravity = i2;
                return true;
            case 1:
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams.bottomMargin == this.a) {
                    return false;
                }
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, this.a);
                return true;
            case 2:
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                int i3 = marginLayoutParams2.leftMargin;
                int i4 = this.a;
                if (i3 == i4) {
                    return false;
                }
                marginLayoutParams2.setMargins(i4, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                return true;
            case 3:
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
                int i5 = layoutParams3.gravity;
                int i6 = this.a;
                if (i5 == i6) {
                    return false;
                }
                layoutParams3.gravity = i6;
                return true;
            case 4:
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
                int marginEnd = marginLayoutParams3.getMarginEnd();
                int i7 = this.a;
                if (marginEnd == i7) {
                    return false;
                }
                marginLayoutParams3.setMarginEnd(i7);
                return true;
            case 5:
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams;
                int marginStart = marginLayoutParams4.getMarginStart();
                int i8 = this.a;
                if (marginStart == i8) {
                    return false;
                }
                marginLayoutParams4.setMarginStart(i8);
                return true;
            case 6:
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams5.rightMargin == this.a) {
                    return false;
                }
                marginLayoutParams5.setMargins(marginLayoutParams5.leftMargin, marginLayoutParams5.topMargin, this.a, marginLayoutParams5.bottomMargin);
                return true;
            default:
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams6.topMargin == this.a) {
                    return false;
                }
                marginLayoutParams6.setMargins(marginLayoutParams6.leftMargin, this.a, marginLayoutParams6.rightMargin, marginLayoutParams6.bottomMargin);
                return true;
        }
    }
}
