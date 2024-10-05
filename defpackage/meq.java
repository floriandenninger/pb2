package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.RippleDrawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CompanionSponsoredButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class meq implements mes {
    public final aahd a;
    public final wzq b;
    public xbw c;
    public aqbn d;
    private final ajjz e;
    private final acra f;
    private final Context g;
    private final mev h;
    private final ajco i;
    private View j;
    private View k;
    private ImageView l;
    private TextView m;
    private View n;
    private View o;

    public meq(ajjz ajjzVar, aahd aahdVar, acra acraVar, wzq wzqVar, Context context) {
        ajjzVar.getClass();
        this.e = ajjzVar;
        aahdVar.getClass();
        this.a = aahdVar;
        acraVar.getClass();
        this.f = acraVar;
        wzqVar.getClass();
        this.b = wzqVar;
        this.g = context;
        new zau(context);
        this.h = new mev(ajjzVar, wzqVar, aahdVar, acraVar);
        ajcn a = ajco.a();
        a.a = context;
        a.c = new ajrv(aahdVar);
        this.i = a.a();
    }

    @Override // defpackage.mes
    public final /* bridge */ /* synthetic */ void a(View view, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqbn aqbnVar = (aqbn) obj;
        if (aqbnVar == null) {
            return;
        }
        View z = whu.z(view, R.id.compact_companion_extension_stub, R.id.compact_companion_extension);
        this.j = z;
        this.m = (TextView) z.findViewById(R.id.tagline);
        this.l = (ImageView) this.j.findViewById(R.id.primary_icon);
        this.n = this.j.findViewById(R.id.horizontal_rule);
        this.o = this.j.findViewById(R.id.sub_details_button);
        this.k = this.j.findViewById(R.id.unclickable_space);
        this.j.setOnClickListener(new mep(this));
        this.k.setOnClickListener(ipu.g);
        aqdh aqdhVar = null;
        this.c = new xbw(this.j, null);
        this.d = aqbnVar;
        this.f.u(new acqx(this.d.h), null);
        aahd aahdVar = this.a;
        aqbn aqbnVar2 = this.d;
        whl.I(aahdVar, aqbnVar2.i, aqbnVar2);
        aone builder = this.d.toBuilder();
        builder.copyOnWrite();
        ((aqbn) builder.instance).i = aqbn.emptyProtobufList();
        aqbn aqbnVar3 = (aqbn) builder.build();
        this.d = aqbnVar3;
        ajjz ajjzVar = this.e;
        ImageView imageView = this.l;
        avgg avggVar = aqbnVar3.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        TextView textView = this.m;
        aqbn aqbnVar4 = this.d;
        if ((aqbnVar4.b & 2) != 0) {
            aqygVar = aqbnVar4.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.d(aqygVar, this.i));
        aqbn aqbnVar5 = this.d;
        int i = aqbnVar5.b;
        boolean z2 = true;
        boolean z3 = (i & 16) != 0;
        if ((i & 2) != 0) {
            aqygVar2 = aqbnVar5.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        if (aqygVar2 != null && aqygVar2.c.size() != 0) {
            for (aqyi aqyiVar : aqygVar2.c) {
                if (aqyiVar != null && (aqyiVar.b & 512) != 0) {
                    break;
                }
            }
        }
        z2 = false;
        this.m.setMovementMethod((!z2 || z3) ? null : LinkMovementMethod.getInstance());
        this.j.setClickable(z3);
        View view2 = this.j;
        view2.setBackground(zau.g(view2.getBackground(), this.d.e, PorterDuff.Mode.SRC));
        if (z3) {
            this.j.setBackground(new RippleDrawable(wbs.S(this.g, R.attr.colorControlHighlight), this.j.getBackground(), null));
        }
        View view3 = this.n;
        view3.setBackground(zau.g(view3.getBackground(), this.d.f, PorterDuff.Mode.SRC));
        this.k.setClickable(this.d.k);
        this.j.setVisibility(0);
        if ((aqbnVar.b & 128) != 0) {
            mev mevVar = this.h;
            View view4 = this.o;
            aulq aulqVar = aqbnVar.j;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar != null && aulqVar.pY(CompanionSponsoredButtonRendererOuterClass.sponsoredButtonRenderer)) {
                aqdhVar = (aqdh) aulqVar.pX(CompanionSponsoredButtonRendererOuterClass.sponsoredButtonRenderer);
            }
            mevVar.a(view4, aqdhVar);
        }
    }

    @Override // defpackage.mes
    public final void b() {
        this.b.b(this.d);
        View view = this.j;
        if (view != null) {
            view.setVisibility(8);
            this.c.c();
            this.k.setClickable(false);
        }
        this.h.b();
        this.j = null;
        this.d = null;
    }
}
