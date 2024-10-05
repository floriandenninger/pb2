package defpackage;

import android.util.DisplayMetrics;
import android.widget.RelativeLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nvs {
    public final int a;
    public final int b;
    public final int c;
    public final RelativeLayout d;

    public nvs(RelativeLayout relativeLayout) {
        this.d = relativeLayout;
        DisplayMetrics displayMetrics = relativeLayout.getContext().getResources().getDisplayMetrics();
        this.a = yjk.K(displayMetrics, 768);
        this.b = yjk.K(displayMetrics, 600);
        this.c = yjk.K(displayMetrics, 900);
    }
}
