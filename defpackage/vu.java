package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vu {
    public final Context a;
    public final qq b;
    public final rc c;
    public vt d;

    public vu(Context context, View view) {
        this.a = context;
        qq qqVar = new qq(context);
        this.b = qqVar;
        qqVar.b = new vr(this);
        rc rcVar = new rc(context, qqVar, view, false, R.attr.popupMenuStyle);
        this.c = rcVar;
        rcVar.b = 0;
        rcVar.c = new vs();
    }

    public final void a() {
        this.c.f();
    }
}
