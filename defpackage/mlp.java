package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.widget.ActiveItemIndicatorView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mlp implements mln {
    mln a;
    final /* synthetic */ mlu b;
    private final mlt c;
    private final mlr d;

    public mlp(mlu mluVar, View view) {
        this.b = mluVar;
        ActiveItemIndicatorView activeItemIndicatorView = (ActiveItemIndicatorView) view.findViewById(R.id.active_item_indicator);
        this.c = new mlt(mluVar.a, mluVar.g, (ViewGroup) view.findViewById(R.id.pagination_thumbnails), new mlo(this));
        this.d = new mlr(mluVar.a, activeItemIndicatorView);
    }

    @Override // defpackage.mln
    public final int a() {
        mln mlnVar = this.a;
        if (mlnVar != null) {
            return mlnVar.a();
        }
        return 0;
    }

    @Override // defpackage.mln
    public final void b(apoj apojVar) {
        apoj apojVar2 = this.b.o;
        if (apojVar2 != null && apojVar2.i.size() != 0 && yjk.aa(this.b.a)) {
            this.a = this.c;
            this.d.d(false);
            this.c.d(true);
        } else {
            mlr mlrVar = this.d;
            this.a = mlrVar;
            ActiveItemIndicatorView activeItemIndicatorView = mlrVar.a;
            mlu mluVar = this.b;
            mlu.n(activeItemIndicatorView, mluVar.c + (mlu.r(mluVar.o) ? this.b.b : 0));
            this.c.d(false);
            this.d.d(true);
        }
        this.a.b(apojVar);
    }

    @Override // defpackage.mln
    public final void c(int i) {
        mln mlnVar = this.a;
        if (mlnVar != null) {
            mlnVar.c(i);
        }
    }

    @Override // defpackage.mln
    public final void d(boolean z) {
        mln mlnVar = this.a;
        if (mlnVar != null) {
            mlnVar.d(false);
        }
    }
}
