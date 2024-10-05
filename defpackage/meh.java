package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class meh implements View.OnClickListener {
    final /* synthetic */ mei a;
    private final List b;
    private final Object c;

    public meh(mei meiVar, Object obj, apxf apxfVar) {
        this.a = meiVar;
        this.c = obj;
        if (apxfVar != null) {
            this.b = amru.r(apxfVar);
        } else {
            this.b = amru.q();
        }
    }

    public meh(mei meiVar, Object obj, List list) {
        this.a = meiVar;
        this.c = obj;
        this.b = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.c(this.c, this.b);
    }
}
