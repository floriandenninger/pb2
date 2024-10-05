package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.metadataeditor.geo.EditLocation;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afog extends LinearLayout implements axql {
    private axqg a;
    private boolean b;

    afog(Context context) {
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
        ((afof) lM()).c((EditLocation) this);
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    public afog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    afog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g();
    }

    afog(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        g();
    }
}
