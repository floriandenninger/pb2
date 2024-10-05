package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class fmg extends ahyf implements axql {
    private axqg a;
    private boolean b;

    public fmg(ahyk ahykVar, Context context, AttributeSet attributeSet) {
        super(ahykVar, context, attributeSet);
        if (this.b) {
            return;
        }
        this.b = true;
        ((fnb) lM()).h((fmt) this);
    }

    @Override // defpackage.axql
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final axqg lL() {
        if (this.a == null) {
            this.a = new axqg(this, false);
        }
        return this.a;
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }
}
