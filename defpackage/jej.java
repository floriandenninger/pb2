package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class jej extends FrameLayout implements axql {
    private axqg a;
    private boolean b;

    jej(Context context) {
        super(context);
        nj();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.axql
    /* renamed from: ni, reason: merged with bridge method [inline-methods] */
    public final axqg lL() {
        if (this.a == null) {
            this.a = new axqg(this, false);
        }
        return this.a;
    }

    protected final void nj() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((jfx) lM()).o();
    }

    jej(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        nj();
    }

    public jej(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        nj();
    }

    jej(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        nj();
    }
}
