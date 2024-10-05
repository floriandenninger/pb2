package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zhj implements zhh {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public zhj(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // defpackage.zhh
    public final /* bridge */ /* synthetic */ boolean a(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.getMarginStart() == this.a && marginLayoutParams.getMarginEnd() == this.c && marginLayoutParams.topMargin == this.b && marginLayoutParams.bottomMargin == this.d) {
            return false;
        }
        marginLayoutParams.setMarginStart(this.a);
        marginLayoutParams.setMarginEnd(this.c);
        marginLayoutParams.topMargin = this.b;
        marginLayoutParams.bottomMargin = this.d;
        return true;
    }
}
