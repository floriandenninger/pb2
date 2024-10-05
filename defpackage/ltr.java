package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.youtube.app.ui.MainRtlAwareViewPager;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ltr extends RtlAwareViewPager implements axql {
    private axqg i;
    private boolean l;

    public ltr(Context context) {
        super(context);
        x();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.axql
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final axqg lL() {
        if (this.i == null) {
            this.i = new axqg(this, false);
        }
        return this.i;
    }

    protected final void x() {
        if (this.l) {
            return;
        }
        this.l = true;
        ((lup) lM()).i((MainRtlAwareViewPager) this);
    }

    public ltr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x();
    }
}
