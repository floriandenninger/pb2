package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.player.overlay.FullscreenEngagementPanelCoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class kkq extends CoordinatorLayout implements axql {
    private axqg i;
    private boolean j;

    kkq(Context context) {
        super(context);
        q();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.axql
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final axqg lL() {
        if (this.i == null) {
            this.i = new axqg(this, false);
        }
        return this.i;
    }

    protected final void q() {
        if (this.j) {
            return;
        }
        this.j = true;
        ((kjx) lM()).e((FullscreenEngagementPanelCoordinatorLayout) this);
    }

    kkq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q();
    }

    public kkq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q();
    }
}
