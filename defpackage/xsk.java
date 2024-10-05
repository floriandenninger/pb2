package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xsk {
    public final Context a;
    public int b;
    public ViewGroup c;
    public final xsh d;
    public absg[] e;

    public xsk(Context context, xsh xshVar) {
        this.a = context;
        this.d = xshVar;
    }

    public final void a() {
        int i = 0;
        while (i < this.c.getChildCount()) {
            yny.z(this.c.getChildAt(i).findViewById(R.id.filter_text), yny.n(i == this.b ? -1 : -2), ViewGroup.LayoutParams.class);
            i++;
        }
    }
}
