package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fxq implements View.OnLayoutChangeListener {
    private final ProgressBar a;
    private final tjr b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public fxq(ProgressBar progressBar, tjr tjrVar, int i, int i2, int i3, int i4, int i5) {
        amkq.E(i2 >= i);
        amkq.E(i4 >= i3);
        this.a = progressBar;
        this.b = tjrVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int round;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.a.getLayoutParams();
        int i9 = this.g;
        int i10 = (i4 - i2) - i9;
        int i11 = this.d;
        int i12 = 0;
        if (i10 >= i11) {
            round = this.f;
        } else {
            int i13 = this.c;
            if (i10 <= i13) {
                round = this.e;
                i11 = i13;
            } else {
                i12 = i9 / 2;
                int i14 = this.f;
                round = Math.round((((i14 - r7) / (i11 - i13)) * (i10 - i13)) + this.e);
                i11 = -1;
            }
        }
        marginLayoutParams.height = i11;
        marginLayoutParams.bottomMargin = i12;
        marginLayoutParams.topMargin = i12;
        tjr tjrVar = this.b;
        if (round != tjrVar.g) {
            tjrVar.g = round;
            tjrVar.invalidateSelf();
        }
    }
}
