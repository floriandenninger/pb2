package defpackage;

import android.text.Spanned;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nah {
    public final nbp a;
    public final ViewStub b;
    public final nag c;
    public View d;
    public TextView e;
    public TextView f;
    public TextView g;
    public apxf h;
    public apxf i;

    public nah(nbp nbpVar, ViewStub viewStub, nag nagVar) {
        nbpVar.getClass();
        this.a = nbpVar;
        nagVar.getClass();
        this.c = nagVar;
        this.b = viewStub;
    }

    public static final Spanned a(apmg apmgVar) {
        aqyg aqygVar = null;
        if (apmgVar == null) {
            return null;
        }
        if ((apmgVar.b & 256) != 0 && (aqygVar = apmgVar.i) == null) {
            aqygVar = aqyg.a;
        }
        return ajcq.b(aqygVar);
    }
}
