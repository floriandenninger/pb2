package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class moi implements ajom {
    private final Context a;
    private final View b;
    private final ajop c;

    /* JADX WARN: Type inference failed for: r4v1, types: [ajop, java.lang.Object] */
    public moi(Context context, amnv amnvVar) {
        this.a = context;
        ?? r4 = amnvVar.get();
        this.c = r4;
        View inflate = View.inflate(context, R.layout.empty_footer, null);
        this.b = inflate;
        r4.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c.a();
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        if (yjk.aa(this.a)) {
            this.b.setMinimumHeight(this.a.getResources().getDimensionPixelSize(R.dimen.empty_footer_min_height_linear_grid_feed_tablet));
        }
        this.c.e(ajokVar);
    }
}
