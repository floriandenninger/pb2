package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class odn extends ViewGroup implements axql {
    private axqg a;
    private boolean b;

    odn(Context context) {
        super(context);
        g();
    }

    @Override // defpackage.axql
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final axqg lL() {
        if (this.a == null) {
            this.a = new axqg(this, false);
        }
        return this.a;
    }

    protected final void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((oem) lM()).k((NextGenWatchLayout) this);
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    odn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    public odn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g();
    }

    odn(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        g();
    }
}
