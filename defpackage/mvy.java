package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvy extends gae {
    public TextView a;
    public float b;
    private final Context c;
    private final aahd g;
    private final ajut h;
    private TextView i;

    public mvy(View view, Context context, aahd aahdVar, ajut ajutVar) {
        super(view);
        this.c = context;
        this.g = aahdVar;
        this.h = ajutVar;
    }

    public final void a(apke apkeVar) {
        f(apkeVar, null);
    }

    public final void f(apke apkeVar, acra acraVar) {
        aqyg aqygVar;
        View view = this.f;
        if (apkeVar == null) {
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (acraVar != null) {
            aqyg aqygVar2 = apkeVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            adyu.cd(aqygVar2, acraVar);
        }
        View c = c();
        this.i = (TextView) c.findViewById(R.id.collection_badge_icon);
        this.a = (TextView) c.findViewById(R.id.collection_badge_label);
        this.i.setIncludeFontPadding(false);
        this.a.setIncludeFontPadding(false);
        float f = this.b;
        if (f > 0.0f) {
            this.i.setTextSize(0, f);
            this.a.setTextSize(0, this.b);
        }
        c.setVisibility(0);
        whu.G(this.i, apkeVar.c);
        TextView textView = this.a;
        Context context = textView.getContext();
        if ((apkeVar.b & 2) != 0) {
            aqygVar = apkeVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, aahk.b(context, aqygVar, this.g, false));
        if ((apkeVar.b & 32) == 0) {
            this.a.setCompoundDrawables(null, null, null, null);
            return;
        }
        Resources resources = this.c.getResources();
        ajut ajutVar = this.h;
        arfs arfsVar = apkeVar.e;
        if (arfsVar == null) {
            arfsVar = arfs.a;
        }
        arfr b = arfr.b(arfsVar.c);
        if (b == null) {
            b = arfr.UNKNOWN;
        }
        Drawable drawable = resources.getDrawable(ajutVar.a(b));
        aqyg aqygVar3 = apkeVar.d;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        if (aqygVar3.c.size() > 0) {
            aqyg aqygVar4 = apkeVar.d;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
            if ((((aqyi) aqygVar4.c.get(0)).b & 512) != 0) {
                drawable.setTint(wbs.W(this.c, R.attr.ytCallToAction).orElse(0));
            }
        }
        int lineHeight = this.a.getLineHeight();
        drawable.setBounds(0, 0, lineHeight, lineHeight);
        this.a.setCompoundDrawables(drawable, null, null, null);
    }

    public final boolean g() {
        TextView textView;
        TextView textView2;
        View view = this.f;
        return view != null && view.getVisibility() == 0 && (textView = this.a) != null && textView.getVisibility() == 0 && ((textView2 = this.i) == null || textView2.getVisibility() == 8);
    }

    public mvy(ViewStub viewStub, Context context, aahd aahdVar, ajut ajutVar) {
        super(viewStub);
        this.c = context;
        aahdVar.getClass();
        this.g = aahdVar;
        this.h = ajutVar;
    }
}
