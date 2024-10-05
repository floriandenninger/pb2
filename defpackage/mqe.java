package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqe implements ajom {
    private final fte a;
    private final ajop b;
    private final ViewGroup c;
    private final TextView d;
    private final Space e;
    private final ViewGroup f;
    private ftd g;

    public mqe(Activity activity, fte fteVar, gma gmaVar) {
        this.a = fteVar;
        this.b = gmaVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(activity).inflate(R.layout.item_section_title_menu_header, (ViewGroup) null);
        this.c = viewGroup;
        this.d = (TextView) viewGroup.findViewById(R.id.title);
        this.e = (Space) viewGroup.findViewById(R.id.spacing);
        this.f = (ViewGroup) viewGroup.findViewById(R.id.sub_menu_container);
        gmaVar.c(viewGroup);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        whu.I(this.e, false);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        askh askhVar = (askh) obj;
        auwh auwhVar = null;
        if ((askhVar.b & 1) != 0) {
            aqygVar = askhVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(this.d, ajcq.b(aqygVar));
        jm.s(this.d, R.style.TextAppearance_YouTube_Subhead);
        whu.I(this.e, !TextUtils.isEmpty(r0));
        this.f.removeAllViews();
        if ((askhVar.b & 2) != 0) {
            aske askeVar = askhVar.d;
            if (askeVar == null) {
                askeVar = aske.a;
            }
            auwhVar = askeVar.c;
            if (auwhVar == null) {
                auwhVar = auwh.a;
            }
        }
        if (auwhVar != null) {
            if (this.g == null) {
                this.g = this.a.c(this.c);
            }
            this.g.oB(ajokVar, auwhVar);
            this.f.addView(this.g.c);
        }
        this.b.e(ajokVar);
    }
}
