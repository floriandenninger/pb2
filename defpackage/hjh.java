package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class hjh extends ViewGroup implements axql {
    private axqg a;
    private boolean b;

    hjh(Context context) {
        super(context);
        b();
    }

    @Override // defpackage.axql
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final axqg lL() {
        if (this.a == null) {
            this.a = new axqg(this, true);
        }
        return this.a;
    }

    protected final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((hjr) lM()).b((TextTrackView) this);
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    public hjh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    hjh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    hjh(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b();
    }
}
