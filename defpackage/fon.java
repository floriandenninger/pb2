package defpackage;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fon extends jt {
    private final EdgeEffect d;
    private final EdgeEffect e;

    public fon(EdgeEffect edgeEffect, EdgeEffect edgeEffect2) {
        this.d = edgeEffect;
        this.e = edgeEffect2;
    }

    @Override // defpackage.jt
    public final EdgeEffect c(RecyclerView recyclerView, int i) {
        if (Build.VERSION.SDK_INT > 30) {
            if (i == 1) {
                return new fol(recyclerView.getContext(), this.d);
            }
            if (i == 3) {
                return new fol(recyclerView.getContext(), this.e);
            }
        }
        return super.c(recyclerView, i);
    }
}
