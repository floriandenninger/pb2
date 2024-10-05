package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eti extends ajpc {
    public final aahd a;
    final TextView b;
    ajyf c;
    final ViewGroup d;
    private final fte e;
    private final ajyg f;
    private final View g;
    private ftd h;

    public eti(Context context, aahd aahdVar, fte fteVar, ajyg ajygVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.channel_sub_menu, (ViewGroup) null);
        this.g = inflate;
        this.a = aahdVar;
        this.e = fteVar;
        this.f = ajygVar;
        this.d = (ViewGroup) inflate.findViewById(R.id.sort_videos_container);
        this.b = (TextView) inflate.findViewById(R.id.manage_videos_button);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.g;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ftd ftdVar = this.h;
        if (ftdVar != null) {
            ftdVar.b(ajosVar);
        }
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        auwh auwhVar;
        apsj apsjVar = (apsj) obj;
        this.d.removeAllViews();
        if ((apsjVar.b & 16) != 0) {
            apsk apskVar = apsjVar.d;
            if (apskVar == null) {
                apskVar = apsk.a;
            }
            if ((apskVar.b & 1) != 0) {
                apsk apskVar2 = apsjVar.d;
                if (apskVar2 == null) {
                    apskVar2 = apsk.a;
                }
                auwhVar = apskVar2.c;
                if (auwhVar == null) {
                    auwhVar = auwh.a;
                }
            } else {
                auwhVar = null;
            }
            this.d.setVisibility(8);
            if (auwhVar != null) {
                if (this.h == null) {
                    this.h = this.e.b((ViewGroup) this.g);
                }
                this.h.oB(ajokVar, auwhVar);
                this.d.addView(this.h.c, -2, -2);
                this.d.setVisibility(0);
            }
        }
        if ((apsjVar.b & 32) == 0) {
            whu.I(this.b, false);
            return;
        }
        whu.I(this.b, true);
        if (this.c == null) {
            this.c = this.f.a(this.b);
        }
        apmh apmhVar = apsjVar.e;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        final apmg apmgVar = apmhVar.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        this.c.b(apmgVar, ajokVar.a);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: eth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eti etiVar = eti.this;
                apmg apmgVar2 = apmgVar;
                aahd aahdVar = etiVar.a;
                apxf apxfVar = apmgVar2.p;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.a(apxfVar);
            }
        });
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return null;
    }
}
