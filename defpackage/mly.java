package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes3.dex */
class mly extends mig {
    private final Interpolator a;

    public mly(Context context, LinearLayoutManager linearLayoutManager) {
        super(context, linearLayoutManager);
        this.a = jg.o(0.25f, 0.46f, 0.45f, 0.94f);
    }

    @Override // defpackage.wr
    protected final void c(View view, wp wpVar) {
        int h = h(view, -1);
        int i = i(view, -1);
        int j = j((int) Math.sqrt((h * h) + (i * i)));
        if (j > 0) {
            wpVar.b(-h, -i, j, this.a);
        }
    }
}
