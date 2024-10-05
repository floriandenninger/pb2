package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hfj extends zoa {
    public hfj(Context context, znh znhVar, View view, acra acraVar, asht ashtVar) {
        super(context, znhVar, view, acraVar, ashtVar);
    }

    @Override // defpackage.zoa
    protected final Drawable a() {
        return ((EditorButtonView) this.a).b.getDrawable();
    }

    @Override // defpackage.zoa
    protected final View b() {
        return ((EditorButtonView) this.a).b;
    }

    @Override // defpackage.zoa
    protected final acsc c() {
        return acsb.c(96641);
    }

    @Override // defpackage.zoa
    protected final void d() {
    }
}
