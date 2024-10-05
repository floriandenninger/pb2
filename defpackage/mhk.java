package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mhk extends gfp implements ggf {
    public final InlinePlaybackLifecycleController d;
    public final ScrollSelectionController e;
    public final Handler f;
    public gfr g;
    private final gfz h;

    public mhk(gfz gfzVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, ScrollSelectionController scrollSelectionController, Handler handler) {
        this.h = gfzVar;
        this.d = inlinePlaybackLifecycleController;
        this.e = scrollSelectionController;
        this.f = handler;
    }

    @Override // defpackage.gfp
    protected final boolean i(gfq gfqVar, int i) {
        if (i != 2 || this.h.o()) {
            return true;
        }
        this.d.q();
        return true;
    }
}
