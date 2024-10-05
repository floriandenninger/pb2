package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TimelineSeekBar;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class hji extends FrameLayout implements axql {
    private axqg a;
    private boolean b;

    hji(Context context) {
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
        ((hjw) lM()).c((TimelineSeekBar) this);
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    hji(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public hji(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    hji(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b();
    }
}
