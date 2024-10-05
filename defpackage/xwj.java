package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xwj implements ajom {
    public final aahd a;
    public auwg b;
    public auwh c;
    public vh d;
    public xqf e;
    public Map f;
    public acra g;
    public final ajun h;
    private final ajut i;
    private final View j;
    private final TextView k;
    private final TextView l;
    private final ImageView m;
    private final TextView n;

    public xwj(Context context, ajut ajutVar, aahd aahdVar, ajun ajunVar, byte[] bArr, byte[] bArr2) {
        context.getClass();
        ajutVar.getClass();
        this.i = ajutVar;
        aahdVar.getClass();
        this.a = aahdVar;
        ajunVar.getClass();
        this.h = ajunVar;
        View inflate = View.inflate(context, R.layout.sort_filter_sub_menu_item, null);
        this.j = inflate;
        this.k = (TextView) inflate.findViewById(R.id.text);
        this.l = (TextView) inflate.findViewById(R.id.subtitle);
        this.m = (ImageView) inflate.findViewById(R.id.icon);
        this.n = (TextView) inflate.findViewById(R.id.beta_label);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: xwi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                auwi auwiVar;
                apxf apxfVar;
                xqf xqfVar;
                auwi auwiVar2;
                xwj xwjVar = xwj.this;
                if (xwjVar.h.q(xwjVar.b)) {
                    return;
                }
                auwg auwgVar = xwjVar.b;
                if (auwgVar != null) {
                    if (auwgVar.c == 3) {
                        auwiVar = (auwi) auwgVar.d;
                    } else {
                        auwiVar = auwi.a;
                    }
                    if ((auwiVar.b & 1) != 0 && (xqfVar = xwjVar.e) != null) {
                        auwg auwgVar2 = xwjVar.b;
                        if (auwgVar2.c == 3) {
                            auwiVar2 = (auwi) auwgVar2.d;
                        } else {
                            auwiVar2 = auwi.a;
                        }
                        aulm aulmVar = auwiVar2.c;
                        if (aulmVar == null) {
                            aulmVar = aulm.a;
                        }
                        xqfVar.a(ahbj.o(aulmVar));
                    } else {
                        auwg auwgVar3 = xwjVar.b;
                        int i = auwgVar3.c;
                        if (i == 5) {
                            apxfVar = (apxf) auwgVar3.d;
                        } else if (i == 6) {
                            apxfVar = (apxf) auwgVar3.d;
                        } else {
                            apxfVar = apxf.a;
                        }
                        int i2 = xwjVar.b.c;
                        if (i2 == 5 || i2 == 6) {
                            xwjVar.a.c(apxfVar, xwjVar.f);
                        }
                    }
                    acra acraVar = xwjVar.g;
                    if (acraVar != null) {
                        auwg auwgVar4 = xwjVar.b;
                        if ((auwgVar4.b & 8192) != 0) {
                            acraVar.I(3, new acqx(auwgVar4.j), null);
                        }
                    }
                }
                auwh auwhVar = xwjVar.c;
                if (auwhVar != null) {
                    for (auwg auwgVar5 : auwhVar.c) {
                        if (xwjVar.h.q(auwgVar5)) {
                            xwjVar.h.p(auwgVar5, false);
                        }
                    }
                    xwjVar.h.p(xwjVar.b, true);
                }
                vh vhVar = xwjVar.d;
                if (vhVar != null) {
                    vhVar.k();
                }
            }
        });
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.j;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        auwg auwgVar = (auwg) obj;
        if (auwgVar == null) {
            return;
        }
        this.b = auwgVar;
        Object c = ajokVar.c("sortFilterMenu");
        this.d = c instanceof vh ? (vh) c : null;
        Object c2 = ajokVar.c("sortFilterMenuModel");
        this.c = c2 instanceof auwh ? (auwh) c2 : null;
        this.e = (xqf) ajokVar.c("sortFilterContinuationHandler");
        this.f = (Map) ajokVar.d("sortFilterEndpointArgsKey", null);
        if ((auwgVar.b & 8192) != 0) {
            acra acraVar = ajokVar.a;
            this.g = acraVar;
            acraVar.u(new acqx(auwgVar.j), null);
        }
        this.k.setText(this.b.e);
        whu.G(this.l, this.b.f);
        auwg auwgVar2 = this.b;
        if ((auwgVar2.b & 256) == 0) {
            this.m.setImageDrawable(null);
            this.m.setVisibility(8);
        } else {
            ImageView imageView = this.m;
            ajut ajutVar = this.i;
            arfs arfsVar = auwgVar2.h;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            imageView.setImageResource(ajutVar.a(b));
            this.m.setVisibility(0);
        }
        auwg auwgVar3 = this.b;
        if ((auwgVar3.b & 4096) == 0 || !auwgVar3.i) {
            this.n.setVisibility(8);
        } else {
            this.n.setVisibility(0);
        }
        if (this.h.q(this.b)) {
            View view = this.j;
            view.setBackgroundColor(wbs.Q(view.getContext(), R.attr.ytButtonChipBackgroundHover));
        }
    }
}
