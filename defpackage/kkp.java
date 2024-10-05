package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.app.player.overlay.ControlsRelativeLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class kkp extends RelativeLayout implements axql {
    private axqg a;
    private boolean b;

    public kkp(Context context) {
        super(context);
        c();
    }

    @Override // defpackage.axql
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final axqg lL() {
        if (this.a == null) {
            this.a = new axqg(this, false);
        }
        return this.a;
    }

    protected final void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((kie) lM()).b((ControlsRelativeLayout) this);
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    public kkp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    kkp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    kkp(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c();
    }
}
