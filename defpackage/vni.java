package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class vni extends ConstraintLayout implements axql, axqh {
    private axqg d;
    public boolean i;

    vni(Context context) {
        super(context);
        g();
    }

    @Override // defpackage.axql
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final axqg lL() {
        if (this.d == null) {
            this.d = new axqg(this, false);
        }
        return this.d;
    }

    protected final void g() {
        axqk a = lL().a();
        if (a instanceof axqk) {
            if ((!(a instanceof axqh) || ((axqh) a).h()) && !this.i) {
                this.i = true;
                ((vnh) lM()).f((FullscreenErrorView) this);
            }
        }
    }

    @Override // defpackage.axqh
    public final boolean h() {
        return this.i;
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    public vni(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    vni(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g();
    }
}
