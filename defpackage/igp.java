package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class igp {
    public final ci a;
    public final ifv b;
    public final Context c;
    public dn d;
    public View e;
    public TextView f;
    public final int g;
    public final int h;
    public int i;
    public CharSequence j;
    public CoordinatorLayout k;
    public igo l;

    public igp(Context context, ci ciVar) {
        this.a = ciVar;
        this.c = context;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ciVar.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        double d = displayMetrics.heightPixels;
        Double.isNaN(d);
        int i = (int) (d * 0.75d);
        this.g = i;
        this.h = displayMetrics.widthPixels;
        this.i = i;
        this.b = ifv.aH(i);
    }

    public final void a() {
        this.b.dismiss();
    }
}
