package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eqf {
    public final Activity a;
    public final ajjz b;
    public final aahd c;
    public aprb d;
    public aptf e;
    public AlertDialog f;
    public View g;
    public ImageView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public TextView m;
    private final View n;
    private final View o;
    private final TextView p;
    private final TextView q;
    private final TextView r;

    public eqf(Activity activity, ajjz ajjzVar, aahd aahdVar, View view) {
        this.a = activity;
        this.b = ajjzVar;
        this.c = aahdVar;
        this.n = view;
        this.p = (TextView) view.findViewById(R.id.header);
        this.q = (TextView) view.findViewById(R.id.prices);
        this.r = (TextView) view.findViewById(R.id.additional_info);
        View findViewById = view.findViewById(R.id.additional_offers);
        this.o = findViewById;
        findViewById.setOnClickListener(new eqd(this));
    }

    public static aptf a(aprb aprbVar) {
        if (aprbVar == null) {
            return null;
        }
        aprd aprdVar = aprbVar.d;
        if (aprdVar == null) {
            aprdVar = aprd.a;
        }
        if ((aprdVar.b & 1) == 0) {
            return null;
        }
        aprd aprdVar2 = aprbVar.d;
        if (aprdVar2 == null) {
            aprdVar2 = aprd.a;
        }
        aptf aptfVar = aprdVar2.c;
        return aptfVar == null ? aptf.a : aptfVar;
    }

    public final void b(aprb aprbVar) {
        aqyg aqygVar;
        this.d = aprbVar;
        if (aprbVar == null) {
            this.n.setVisibility(8);
            return;
        }
        this.n.setVisibility(0);
        TextView textView = this.p;
        if (textView != null) {
            aqyg aqygVar2 = aprbVar.b;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            whu.G(textView, ajcq.b(aqygVar2));
        }
        aprd aprdVar = aprbVar.c;
        if (aprdVar == null) {
            aprdVar = aprd.a;
        }
        aptf aptfVar = aprdVar.c;
        if (aptfVar == null) {
            aptfVar = aptf.a;
        }
        TextView textView2 = this.q;
        aqyg aqygVar3 = null;
        if ((aptfVar.b & 16) != 0) {
            aqygVar = aptfVar.g;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView2.setText(ajcq.b(aqygVar));
        TextView textView3 = this.r;
        if ((aptfVar.b & 32) != 0 && (aqygVar3 = aptfVar.h) == null) {
            aqygVar3 = aqyg.a;
        }
        textView3.setText(ajcq.b(aqygVar3));
        this.o.setVisibility(a(aprbVar) != null ? 0 : 8);
    }
}
