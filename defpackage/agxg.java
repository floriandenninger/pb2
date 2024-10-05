package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agxg {
    protected final Context a;
    protected final AlertDialog.Builder b;
    protected final aahd c;
    protected final ajjs d;
    protected View e;
    protected ImageView f;
    protected ImageView g;
    protected ajkj h;
    protected ajkj i;
    protected TextView j;
    protected TextView k;
    protected AlertDialog l;
    protected TextView m;
    protected TextView n;
    protected apmg o;
    protected apmg p;
    protected acra q;

    /* JADX INFO: Access modifiers changed from: protected */
    public agxg(Context context, AlertDialog.Builder builder, aahd aahdVar, ajjs ajjsVar) {
        this.a = context;
        this.b = builder;
        this.c = aahdVar;
        this.d = ajjsVar;
    }

    public static void b(aahd aahdVar, avul avulVar) {
        if (avulVar.j.size() != 0) {
            for (apxf apxfVar : avulVar.j) {
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", avulVar);
                aahdVar.c(apxfVar, hashMap);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(apmg apmgVar) {
        acra acraVar;
        if (apmgVar == null) {
            return;
        }
        if ((apmgVar.b & 16384) != 0) {
            apxf apxfVar = apmgVar.o;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            if (!apxfVar.pY(atmb.b) && (acraVar = this.q) != null) {
                apxfVar = acraVar.h(apxfVar);
            }
            if (apxfVar != null) {
                this.c.c(apxfVar, null);
            }
        }
        if ((apmgVar.b & 8192) != 0) {
            aahd aahdVar = this.c;
            apxf apxfVar2 = apmgVar.n;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahdVar.c(apxfVar2, acrc.i(apmgVar, !((apmgVar.b & 16384) != 0)));
        }
    }

    public final void c(apmg apmgVar, TextView textView, View.OnClickListener onClickListener) {
        aqyg aqygVar;
        if (apmgVar == null) {
            whu.I(textView, false);
            return;
        }
        if ((apmgVar.b & 256) != 0) {
            aqygVar = apmgVar.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        CharSequence b = ajcq.b(aqygVar);
        whu.G(textView, b);
        aott aottVar = apmgVar.s;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        if ((aottVar.b & 1) != 0) {
            aott aottVar2 = apmgVar.s;
            if (aottVar2 == null) {
                aottVar2 = aott.a;
            }
            aots aotsVar = aottVar2.c;
            if (aotsVar == null) {
                aotsVar = aots.a;
            }
            b = aotsVar.c;
        }
        textView.setContentDescription(b);
        textView.setOnClickListener(onClickListener);
        acra acraVar = this.q;
        if (acraVar != null) {
            acraVar.u(new acqx(apmgVar.t), null);
        }
    }
}
