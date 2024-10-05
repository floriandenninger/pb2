package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchContainerLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class odm extends ViewGroup implements axql {
    private axqg a;
    private boolean b;

    odm(Context context) {
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
        ((ods) lM()).j((NextGenWatchContainerLayout) this);
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    odm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    odm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    public odm(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b();
    }
}
