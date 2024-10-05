package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahjm extends TextView {
    private final ahiy a;

    public ahjm(Context context, ahiy ahiyVar) {
        super(context);
        this.a = ahiyVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas t = this.a.t();
        if (t != null) {
            super.onDraw(t);
            this.a.x();
        }
    }
}
