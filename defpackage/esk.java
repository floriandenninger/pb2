package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class esk extends ajpc {
    public final aahd a;
    private final Context b;
    private final ajop c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final View h;
    private final View i;
    private final ViewGroup j;

    public esk(Context context, gma gmaVar, aahd aahdVar) {
        context.getClass();
        this.b = context;
        this.c = gmaVar;
        aahdVar.getClass();
        this.a = aahdVar;
        View inflate = View.inflate(context, R.layout.channel_about_metadata_item, null);
        this.d = (TextView) inflate.findViewById(R.id.description);
        this.e = (TextView) inflate.findViewById(R.id.joined_date);
        this.f = (TextView) inflate.findViewById(R.id.subscribers);
        this.g = (TextView) inflate.findViewById(R.id.views);
        this.h = inflate.findViewById(R.id.description_separator);
        this.i = inflate.findViewById(R.id.stats_separator);
        this.j = (ViewGroup) inflate.findViewById(R.id.links);
        gmaVar.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.c).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        apot apotVar = (apot) obj;
        TextView textView = this.d;
        aqyg aqygVar5 = null;
        if ((apotVar.b & 4) != 0) {
            aqygVar = apotVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.e;
        if ((apotVar.b & 1024) != 0) {
            aqygVar2 = apotVar.g;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        aony<apon> aonyVar = apotVar.d;
        this.j.removeAllViews();
        boolean z = false;
        if (aonyVar.isEmpty()) {
            this.j.setVisibility(8);
        } else {
            this.j.setVisibility(0);
            for (apon aponVar : aonyVar) {
                TextView textView3 = (TextView) View.inflate(this.b, R.layout.channel_link_item, null);
                if ((aponVar.b & 1) != 0) {
                    final apxf apxfVar = aponVar.c;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: esj
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            esk eskVar = esk.this;
                            eskVar.a.c(apxfVar, null);
                        }
                    });
                }
                if ((aponVar.b & 4) != 0) {
                    aqygVar3 = aponVar.d;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                } else {
                    aqygVar3 = null;
                }
                whu.G(textView3, ajcq.b(aqygVar3));
                this.j.addView(textView3, new ViewGroup.LayoutParams(-2, -2));
            }
        }
        whu.I(this.h, (this.d.getVisibility() == 8 && this.e.getVisibility() == 8 && this.j.getVisibility() == 8) ? false : true);
        TextView textView4 = this.f;
        if ((apotVar.b & 128) != 0) {
            aqygVar4 = apotVar.e;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
        } else {
            aqygVar4 = null;
        }
        whu.G(textView4, ajcq.b(aqygVar4));
        TextView textView5 = this.g;
        if ((apotVar.b & 256) != 0 && (aqygVar5 = apotVar.f) == null) {
            aqygVar5 = aqyg.a;
        }
        whu.G(textView5, ajcq.b(aqygVar5));
        if (this.f.getVisibility() != 8 && this.g.getVisibility() != 8) {
            z = true;
        }
        whu.I(this.i, z);
        this.c.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return null;
    }
}
