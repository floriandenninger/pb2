package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hse {
    public final hsb a;
    public final Context b;
    public final float c;
    public final float d;
    public RecyclerView e;
    public ammv f;
    ammv g;
    ammv h;

    public hse(Context context, hsb hsbVar) {
        this.b = context;
        this.a = hsbVar;
        this.c = context.getResources().getDimension(R.dimen.reel_edit_carousel_thumbnail_cell_enlarge_width) / context.getResources().getDimension(R.dimen.reel_edit_carousel_thumbnail_cell_width);
        this.d = context.getResources().getDimension(R.dimen.reel_edit_carousel_thumbnail_cell_enlarge_height) / context.getResources().getDimension(R.dimen.reel_edit_carousel_thumbnail_cell_height);
    }

    public final void a(int i) {
        ((hsd) ((amna) this.f).a).a(i);
    }

    public final void b(int i) {
        ((hsd) ((amna) this.f).a).b(i);
    }

    public final void c() {
        this.a.mw();
    }

    public final void d(Object obj, hsh hshVar) {
        hsb hsbVar = this.a;
        hsf a = hsg.a();
        a.a = hshVar.c(obj);
        amrp f = amru.f();
        int a2 = hshVar.a(obj);
        for (int i = 0; i < a2; i++) {
            f.h(hshVar.b(obj, i));
        }
        a.b(f.g());
        hsbVar.d = a.a();
    }
}
