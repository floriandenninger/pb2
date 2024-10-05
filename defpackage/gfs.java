package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerOverlayLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class gfs extends ViewGroup implements axql {
    private axqg a;
    private boolean b;

    public gfs(Context context) {
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
        ((ggi) lM()).g((InlinePlayerOverlayLayout) this);
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    public gfs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public gfs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    gfs(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b();
    }
}
