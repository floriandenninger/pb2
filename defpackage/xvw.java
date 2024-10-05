package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xvw extends ajpc {
    public final aahd a;
    public final xvv b;
    public final LinearLayout c;
    public ajok d;
    private final Animator e;
    private final View f;
    private final TextView g;
    private final int h;
    private final int i;
    private final int j;
    private final yaq k;

    /* JADX WARN: Type inference failed for: r3v1, types: [ajos, java.lang.Object] */
    public xvw(Context context, ajjz ajjzVar, aahd aahdVar, ajvb ajvbVar, yah yahVar, zil zilVar, yaq yaqVar, byte[] bArr) {
        context.getClass();
        ajjzVar.getClass();
        yahVar.getClass();
        this.a = aahdVar;
        yaqVar.getClass();
        this.k = yaqVar;
        this.b = new xvv(context, ajvbVar.get());
        int Q = wbs.Q(context, R.attr.cmtBgStyleDefault);
        this.i = Q;
        int Q2 = wbs.Q(context, zilVar.a);
        this.j = Q2;
        View inflate = View.inflate(context, R.layout.comment_replies, null);
        this.f = inflate;
        this.c = (LinearLayout) inflate.findViewById(R.id.comment_replies);
        this.g = (TextView) inflate.findViewById(R.id.detail_view_button);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.detail_view_button_margin_bottom);
        this.e = yah.a(inflate, Q, Q2);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        if (this.e.isRunning()) {
            this.e.end();
        }
        this.b.e(this.c);
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(final ajok ajokVar, Object obj) {
        aqyg aqygVar;
        apzn apznVar = (apzn) obj;
        this.d = ajokVar;
        apmh apmhVar = apznVar.g;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) == 0) {
            this.g.setVisibility(8);
        } else {
            apmh apmhVar2 = apznVar.g;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            final apmg apmgVar = apmhVar2.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            final acra acraVar = ajokVar.a;
            this.g.setVisibility(0);
            TextView textView = this.g;
            if ((apmgVar.b & 256) != 0) {
                aqygVar = apmgVar.i;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView.setText(ajcq.b(aqygVar));
            this.g.setOnClickListener(new View.OnClickListener() { // from class: xvu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xvw xvwVar = xvw.this;
                    ajok ajokVar2 = ajokVar;
                    acra acraVar2 = acraVar;
                    apmg apmgVar2 = apmgVar;
                    view.performHapticFeedback(1);
                    HashMap hashMap = new HashMap(ajokVar2.e());
                    hashMap.put("commentThreadMutator", ajokVar2.c("commentThreadMutator"));
                    hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", acraVar2);
                    aahd aahdVar = xvwVar.a;
                    apxf apxfVar = apmgVar2.o;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, hashMap);
                }
            });
            h();
        }
        for (apyx apyxVar : this.k.b(apznVar)) {
            g(apyxVar.b == 62285947 ? (apyv) apyxVar.c : null);
        }
        Boolean bool = (Boolean) this.k.b.get(apznVar);
        if (bool == null ? apznVar.h : bool.booleanValue()) {
            this.e.start();
            this.k.b.put(apznVar, false);
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apzn) obj).f.I();
    }

    public final int f(apyv apyvVar) {
        if (apyvVar == null) {
            return -1;
        }
        int childCount = this.c.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup viewGroup = (ViewGroup) this.c.getChildAt(i);
            amkq.N(viewGroup.getChildCount() == 1);
            ajom q = ahbw.q(viewGroup.getChildAt(0));
            if ((q instanceof xvt) && apyvVar.equals(((xvt) q).A)) {
                return i;
            }
        }
        return -1;
    }

    public final void g(apyv apyvVar) {
        this.c.addView(this.b.b(this.d, apyvVar, this.c.getChildCount()));
        h();
    }

    public final void h() {
        yny.z(this.g, yny.k(this.c.getChildCount() + (-1) > 0 ? this.h : 0), ViewGroup.MarginLayoutParams.class);
    }
}
