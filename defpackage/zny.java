package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.edit.camera.CameraView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class zny extends FrameLayout implements axql {
    private axqg a;
    private boolean b;

    zny(Context context) {
        super(context);
        T();
    }

    @Override // defpackage.axql
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final axqg lL() {
        if (this.a == null) {
            this.a = new axqg(this, false);
        }
        return this.a;
    }

    protected final void T() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((zni) lM()).a((CameraView) this);
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    public zny(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        T();
    }

    zny(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T();
    }

    zny(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        T();
    }
}
