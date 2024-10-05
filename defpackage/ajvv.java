package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajvv implements View.OnClickListener, ajom {
    private final ajuv a;
    private final aahd b;
    private final ajuu c;
    private final View d;
    private final TextView e;
    private atda f;
    private final acra g;

    public ajvv(Context context, aahd aahdVar, ajuu ajuuVar, ajuv ajuvVar) {
        this.b = aahdVar;
        ajuuVar.getClass();
        this.c = ajuuVar;
        this.a = ajuvVar;
        this.g = (acra) yjj.u(ajuuVar.a(), "com.google.android.libraries.youtube.logging.interaction_logger", acra.class);
        View inflate = View.inflate(context, R.layout.contextual_menu_item_layout, null);
        this.d = inflate;
        inflate.setOnClickListener(this);
        TextView textView = (TextView) inflate.findViewById(R.id.text);
        this.e = textView;
        textView.setImportantForAccessibility(2);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        ColorStateList S;
        acra acraVar;
        atda atdaVar = (atda) obj;
        this.e.setText(adyu.m0do(atdaVar));
        if (adyu.dp(atdaVar) - 1 == 1) {
            S = wbs.S(this.e.getContext(), R.attr.ytTextDisabled);
        } else {
            S = wbs.S(this.e.getContext(), R.attr.ytTextPrimary);
        }
        this.e.setTextColor(S);
        CharSequence text = this.e.getText();
        atdb atdbVar = atdaVar.c;
        if (atdbVar == null) {
            atdbVar = atdb.a;
        }
        atcz atczVar = atdbVar.g;
        if (atczVar == null) {
            atczVar = atcz.a;
        }
        aots aotsVar = atczVar.b;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        if ((aotsVar.b & 2) == 0) {
            this.d.setContentDescription(text);
        } else {
            View view = this.d;
            atdb atdbVar2 = atdaVar.c;
            if (atdbVar2 == null) {
                atdbVar2 = atdb.a;
            }
            atcz atczVar2 = atdbVar2.g;
            if (atczVar2 == null) {
                atczVar2 = atcz.a;
            }
            aots aotsVar2 = atczVar2.b;
            if (aotsVar2 == null) {
                aotsVar2 = aots.a;
            }
            view.setContentDescription(aotsVar2.c);
        }
        this.f = atdaVar;
        aomf dj = adyu.dj(atdaVar);
        if (dj.H() || (acraVar = this.g) == null) {
            return;
        }
        acraVar.u(new acqx(dj), null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ajuv ajuvVar = this.a;
        if (ajuvVar != null) {
            ajuvVar.a();
        }
        if (adyu.dl(this.f) != null) {
            this.b.c(adyu.dl(this.f), this.c.a());
            aomf aomfVar = adyu.dl(this.f).c;
            if (this.g == null || aomfVar.H()) {
                return;
            }
            this.g.I(3, new acqx(aomfVar), null);
            return;
        }
        if (adyu.dk(this.f) != null) {
            this.b.c(adyu.dk(this.f), this.c.a());
        }
    }
}
