package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgw extends mhm implements ypd {
    private final gfz e;

    public mgw(ScrollSelectionController scrollSelectionController, gfz gfzVar, mgu mguVar, ypa ypaVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, zbw zbwVar, RecyclerView recyclerView, ajox ajoxVar, ajng ajngVar, fok fokVar) {
        super(scrollSelectionController, gfzVar, mguVar, ypaVar, inlinePlaybackLifecycleController, zbwVar, recyclerView, ajoxVar, ajngVar, fokVar);
        this.e = gfzVar;
    }

    @Override // defpackage.mhm, defpackage.gfr
    public final void b(boolean z) {
        super.b(z);
        this.e.n(false);
    }

    @Override // defpackage.mhm, defpackage.gmg
    public final int k() {
        return 0;
    }

    @Override // defpackage.mhm, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (cls != mgw.class) {
            return mcy.B(this, obj, i);
        }
        if (i == -1) {
            return new Class[]{izi.class};
        }
        if (i == 0) {
            n((izi) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
