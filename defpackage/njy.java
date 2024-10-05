package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class njy extends FrameLayout implements axql {
    private axqg a;
    private boolean b;

    public njy(Context context) {
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
        ((nkk) lM()).m((SwipeToContainerFrameLayout) this);
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    public njy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public njy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    public njy(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b();
    }
}
