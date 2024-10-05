package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lea extends ajpc {
    public final aahd a;
    public aqsp b;
    public acrd c;
    private final ajuw d;
    private final ajut e;
    private final View f;
    private final ImageView g;
    private final TextView h;
    private final TextView i;
    private final View j;

    public lea(Context context, aahd aahdVar, ajuw ajuwVar, ajut ajutVar) {
        aahdVar.getClass();
        this.a = aahdVar;
        this.d = ajuwVar;
        ajutVar.getClass();
        this.e = ajutVar;
        View inflate = View.inflate(context, R.layout.multi_action_emergency_support, null);
        this.f = inflate;
        this.g = (ImageView) inflate.findViewById(R.id.icon);
        this.h = (TextView) inflate.findViewById(R.id.action);
        this.i = (TextView) inflate.findViewById(R.id.details);
        this.j = inflate.findViewById(R.id.contextual_menu_anchor);
        inflate.setOnClickListener(new ldz(this));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqsp aqspVar = (aqsp) obj;
        this.b = aqspVar;
        this.c = ajokVar;
        if (aqspVar != null) {
            this.f.setVisibility(0);
            atdc atdcVar = null;
            ajokVar.a.u(new acqx(aqspVar.h), null);
            if ((aqspVar.b & 4) == 0) {
                this.g.setVisibility(8);
            } else {
                ajut ajutVar = this.e;
                arfs arfsVar = aqspVar.e;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                arfr b = arfr.b(arfsVar.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                this.g.setImageResource(ajutVar.a(b));
                this.g.setVisibility(0);
            }
            TextView textView = this.h;
            if ((aqspVar.b & 1) != 0) {
                aqygVar = aqspVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView.setText(ajcq.b(aqygVar));
            TextView textView2 = this.i;
            if ((aqspVar.b & 2) != 0) {
                aqygVar2 = aqspVar.d;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            textView2.setText(ajcq.b(aqygVar2));
            ajuw ajuwVar = this.d;
            View view = this.f;
            View view2 = this.j;
            atdf atdfVar = aqspVar.g;
            if (atdfVar == null) {
                atdfVar = atdf.a;
            }
            if ((atdfVar.b & 1) != 0) {
                atdf atdfVar2 = aqspVar.g;
                if (atdfVar2 == null) {
                    atdfVar2 = atdf.a;
                }
                atdc atdcVar2 = atdfVar2.c;
                if (atdcVar2 == null) {
                    atdcVar2 = atdc.a;
                }
                atdcVar = atdcVar2;
            }
            ajuwVar.e(view, view2, atdcVar, aqspVar, ajokVar.a);
            return;
        }
        this.f.setVisibility(8);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqsp) obj).h.I();
    }
}
