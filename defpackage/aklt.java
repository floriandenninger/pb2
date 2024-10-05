package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aklt implements ajom {
    public final CompoundButton a;
    public final akij b;
    private final View c;
    private final TextView d;
    private final TextView e;

    public aklt(Context context, akij akijVar) {
        View inflate = View.inflate(context, R.layout.share_panel_title, null);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.a = (CompoundButton) inflate.findViewById(R.id.native_share_checkbox);
        this.e = (TextView) inflate.findViewById(R.id.native_share_checkbox_text);
        this.b = akijVar;
        akmk.h(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a.setOnCheckedChangeListener(null);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        apll apllVar;
        avml avmlVar = (avml) obj;
        TextView textView = this.d;
        aqyg aqygVar2 = null;
        if ((avmlVar.b & 1) != 0) {
            aqygVar = avmlVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        aplk aplkVar = avmlVar.d;
        if (aplkVar == null) {
            aplkVar = aplk.a;
        }
        if ((aplkVar.b & 2) != 0) {
            aplk aplkVar2 = avmlVar.d;
            if (aplkVar2 == null) {
                aplkVar2 = aplk.a;
            }
            apllVar = aplkVar2.c;
            if (apllVar == null) {
                apllVar = apll.a;
            }
        } else {
            apllVar = null;
        }
        if (apllVar != null) {
            this.a.setChecked(apllVar.d);
            this.a.setOnCheckedChangeListener(new aklq(this));
            TextView textView2 = this.e;
            if ((apllVar.b & 1) != 0 && (aqygVar2 = apllVar.c) == null) {
                aqygVar2 = aqyg.a;
            }
            textView2.setText(ajcq.b(aqygVar2));
            this.e.setOnClickListener(new aklr(this));
            this.a.setVisibility(0);
            this.e.setVisibility(0);
            return;
        }
        this.a.setVisibility(8);
        this.e.setVisibility(8);
    }
}
