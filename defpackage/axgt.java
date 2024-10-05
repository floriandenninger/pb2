package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axgt implements Runnable {
    final /* synthetic */ float a;
    final /* synthetic */ axha b;

    public axgt(axha axhaVar, float f) {
        this.b = axhaVar;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.b.g.getLayoutParams();
        Context context = this.b.a;
        float f = this.a;
        if (Build.VERSION.SDK_INT >= 23) {
            int dimension = (int) (((int) context.getResources().getDimension(R.dimen.alignment_marker_height)) * f);
            if (layoutParams.getRule(15) == -1) {
                layoutParams.width = dimension;
            } else {
                layoutParams.height = dimension;
            }
        }
        this.b.g.setLayoutParams(layoutParams);
    }
}
