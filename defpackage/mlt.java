package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mlt implements mln {
    public final mlo a;
    private final Context b;
    private final ajjz c;
    private final ViewGroup d;

    public mlt(Context context, ajjz ajjzVar, ViewGroup viewGroup, mlo mloVar) {
        this.b = context;
        this.c = ajjzVar;
        this.d = viewGroup;
        this.a = mloVar;
    }

    @Override // defpackage.mln
    public final int a() {
        return this.d.getMeasuredWidth();
    }

    @Override // defpackage.mln
    public final void b(apoj apojVar) {
        this.d.removeAllViews();
        if (apojVar.i.size() == 0) {
            return;
        }
        List list = (List) apojVar.pX(apoh.d);
        int i = 0;
        for (avgg avggVar : apojVar.i) {
            if (i >= list.size() || amkq.b(list.get(i), apok.a)) {
                View inflate = LayoutInflater.from(this.b).inflate(R.layout.carousel_pagination_thumbnail, this.d, false);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.thumbnail);
                this.c.h(imageView, avggVar);
                final int childCount = this.d.getChildCount();
                imageView.setOnClickListener(new View.OnClickListener() { // from class: mls
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        mlt mltVar = mlt.this;
                        int i2 = childCount;
                        mlp mlpVar = mltVar.a.a;
                        mlpVar.b.t.aa(i2);
                        mlu mluVar = mlpVar.b;
                        mluVar.m = i2;
                        mluVar.k();
                        mlpVar.b.q();
                    }
                });
                imageView.setContentDescription(gfw.m(avggVar));
                this.d.addView(inflate);
            }
            i++;
        }
    }

    @Override // defpackage.mln
    public final void c(int i) {
        int i2 = 0;
        while (i2 < this.d.getChildCount()) {
            View childAt = this.d.getChildAt(i2);
            childAt.setAlpha(i2 == i ? 1.0f : 0.5f);
            whu.I(childAt.findViewById(R.id.selected_position_indicator), i2 == i);
            i2++;
        }
    }

    @Override // defpackage.mln
    public final void d(boolean z) {
        whu.I(this.d, z);
    }
}
