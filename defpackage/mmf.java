package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmf implements ajom {
    public final aahd a;
    private final View b;
    private final TextView c;
    private final TextView d;

    public mmf(Context context, aahd aahdVar, akbd akbdVar) {
        this.a = aahdVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.comments_entry_point_user_edu, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.title);
        this.d = (TextView) inflate.findViewById(R.id.call_to_action);
        if (akbdVar.d()) {
            akbdVar.c(inflate, akbdVar.a(inflate, null));
        } else {
            whu.s(inflate, whu.x(context, 0));
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(final ajok ajokVar, Object obj) {
        Spanned spanned;
        Spanned spanned2;
        final aqaj aqajVar = (aqaj) obj;
        TextView textView = this.c;
        if ((aqajVar.b & 1) != 0) {
            aqyg aqygVar = aqajVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            spanned = ajcq.b(aqygVar);
        } else {
            spanned = null;
        }
        whu.G(textView, spanned);
        TextView textView2 = this.d;
        if ((aqajVar.b & 2) != 0) {
            aqyg aqygVar2 = aqajVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            spanned2 = ajcq.b(aqygVar2);
        } else {
            spanned2 = null;
        }
        whu.G(textView2, spanned2);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: mme
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mmf mmfVar = mmf.this;
                aqaj aqajVar2 = aqajVar;
                ajok ajokVar2 = ajokVar;
                if ((aqajVar2.b & 4) != 0) {
                    aahd aahdVar = mmfVar.a;
                    apxf apxfVar = aqajVar2.e;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, amrz.k("sectionListController", ajokVar2.c("sectionListController")));
                    ajokVar2.a.I(3, new acqx(aqajVar2.f), null);
                }
            }
        });
        ajokVar.a.u(new acqx(aqajVar.f), null);
    }
}
