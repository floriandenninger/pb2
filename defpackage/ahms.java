package defpackage;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahms extends ahxn {
    private final ahiy a;

    public ahms(Context context, ahiy ahiyVar) {
        super(context);
        this.a = ahiyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas t = this.a.t();
        if (t != null) {
            super.dispatchDraw(t);
            this.a.x();
        }
    }
}
