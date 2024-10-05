package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.common.rendering.SnappyRecyclerView;
import com.google.android.apps.youtube.app.ui.inline.SnappyLinearLayoutManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmb {
    public final Context a;
    public final SnappyLinearLayoutManager b;
    public final ajoy c;
    public final ajvb d;
    public final acqz e;
    public ajwa f;
    final mlx g;
    SnappyRecyclerView h;

    public mmb(Context context, ajjz ajjzVar, ajoy ajoyVar, ajvb ajvbVar, acqz acqzVar) {
        this.a = context;
        this.c = ajoyVar;
        this.d = ajvbVar;
        this.e = acqzVar;
        mlw mlwVar = new mlw(this, context);
        mlwVar.ab(0);
        this.b = mlwVar;
        this.g = new mlx(context, ajjzVar);
    }
}
