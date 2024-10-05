package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class fgs extends FrameLayout implements axql {
    private axqg a;
    private boolean b;

    public fgs(Context context) {
        super(context);
        b();
    }

    @Override // defpackage.axql
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final axqg lL() {
        if (this.a == null) {
            this.a = new axqg(this, false);
        }
        return this.a;
    }

    protected final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((fgy) lM()).l((SpecificNetworkErrorViewLoadingFrameLayout) this);
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    fgs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public fgs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    fgs(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b();
    }
}
