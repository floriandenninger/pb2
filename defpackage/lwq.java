package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lwq implements View.OnClickListener {
    public final View a;
    public String b;
    public Uri c;
    public apxf d;
    private final Context e;
    private final aahd f;

    public lwq(Context context, View view, aahd aahdVar) {
        this.e = context;
        view.getClass();
        this.a = view;
        this.f = aahdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apxf apxfVar = this.d;
        if (apxfVar != null) {
            this.f.c(apxfVar, null);
        } else {
            wbs.aG(this.e, this.b, this.c);
        }
    }
}
