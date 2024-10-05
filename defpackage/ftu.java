package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ftu implements ajom {
    public final aahd a;
    private final View b;
    private final View c;
    private final YouTubeTextView d;
    private final YouTubeTextView e;
    private final YouTubeTextView f;
    private final Button g;
    private final YouTubeTextView h;
    private final ImageView i;
    private final View j;
    private final YouTubeTextView k;
    private final YouTubeTextView l;
    private final View m;

    public ftu(Context context, aahd aahdVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.ticket_companion, (ViewGroup) null, false);
        this.b = inflate;
        this.c = inflate.findViewById(R.id.info_layout);
        this.g = (Button) inflate.findViewById(R.id.ticket_button);
        this.d = (YouTubeTextView) inflate.findViewById(R.id.title_view);
        this.e = (YouTubeTextView) inflate.findViewById(R.id.subtitle_view);
        this.f = (YouTubeTextView) inflate.findViewById(R.id.subtitle_view2);
        this.k = (YouTubeTextView) inflate.findViewById(R.id.calendar_month);
        this.l = (YouTubeTextView) inflate.findViewById(R.id.calendar_day);
        this.j = inflate.findViewById(R.id.calendar_view);
        this.h = (YouTubeTextView) inflate.findViewById(R.id.more_tickets_text);
        this.i = (ImageView) inflate.findViewById(R.id.sponsored_icon);
        this.m = inflate.findViewById(R.id.divider);
        this.a = aahdVar;
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
        final avgn avgnVar;
        final ftt fttVar = (ftt) obj;
        acra acraVar = ajokVar.a;
        avgo avgoVar = (avgo) fttVar.a.c.get(0);
        if (avgoVar.b == 136346452) {
            avgnVar = (avgn) avgoVar.c;
        } else {
            avgnVar = avgn.a;
        }
        whu.G(this.d, avgnVar.c);
        whu.G(this.e, avgnVar.e);
        this.c.setContentDescription(avgnVar.d);
        if (ajokVar.j("always_display_as_grid", false)) {
            this.j.setVisibility(8);
            this.f.setVisibility(0);
            this.f.setText(avgnVar.f);
        } else {
            this.j.setVisibility(0);
            this.f.setVisibility(8);
        }
        this.k.setText(avgnVar.j);
        this.l.setText(avgnVar.k);
        if (!avgnVar.g.isEmpty()) {
            this.g.setVisibility(0);
            this.g.setText(avgnVar.g);
            this.g.setContentDescription(avgnVar.h);
            this.g.setOnClickListener(new View.OnClickListener() { // from class: fts
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ftu ftuVar = ftu.this;
                    avgn avgnVar2 = avgnVar;
                    aahd aahdVar = ftuVar.a;
                    apxf apxfVar = avgnVar2.i;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, acrc.g(avgnVar2));
                }
            });
        } else {
            this.g.setVisibility(8);
        }
        if ((fttVar.a.b & 1024) == 0) {
            this.h.setClickable(false);
        } else {
            this.h.setOnClickListener(new View.OnClickListener() { // from class: ftr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ftu ftuVar = ftu.this;
                    ftt fttVar2 = fttVar;
                    ajok ajokVar2 = ajokVar;
                    Map i = acrc.i(fttVar2.a, false);
                    i.putAll(ajokVar2.e());
                    aahd aahdVar = ftuVar.a;
                    apxf apxfVar = fttVar2.a.g;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, i);
                }
            });
            this.h.setClickable(true);
        }
        avgp avgpVar = fttVar.a;
        String str = (avgpVar.b & 4) != 0 ? avgpVar.d : null;
        this.h.setText(str);
        if (str == null || str.length() <= 0) {
            this.h.setVisibility(8);
            this.m.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            this.m.setVisibility(0);
        }
        if ((fttVar.a.b & 512) == 0) {
            whu.I(this.i, false);
        } else {
            whu.I(this.i, true);
            this.i.setContentDescription(fttVar.a.e);
            this.i.setOnClickListener(new View.OnClickListener() { // from class: ftq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ftu ftuVar = ftu.this;
                    ftt fttVar2 = fttVar;
                    aahd aahdVar = ftuVar.a;
                    apxf apxfVar = fttVar2.a.f;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, null);
                }
            });
        }
        acraVar.u(new acqx(avgnVar.m), null);
        acraVar.u(new acqx(fttVar.a.h), null);
    }
}
