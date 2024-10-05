package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.AudioTrackView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class hjg extends ViewGroup implements axql {
    private axqg a;
    private boolean b;

    hjg(Context context) {
        super(context);
        h();
    }

    @Override // defpackage.axql
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final axqg lL() {
        if (this.a == null) {
            this.a = new axqg(this, true);
        }
        return this.a;
    }

    protected final void h() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((hjc) lM()).a((AudioTrackView) this);
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    hjg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h();
    }

    public hjg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h();
    }

    hjg(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        h();
    }
}
