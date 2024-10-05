package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class whj implements ajom {
    private final acra a;
    private final View b;
    private final TextView c;

    public whj(Context context, int i, acra acraVar) {
        this.a = acraVar;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        this.b = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        this.c = textView;
        wbs.Y(context, R.attr.ytTextAppearanceBody2b).ifPresent(new whr(textView, 1));
        Optional U = wbs.U(context, R.attr.ytTextSecondary);
        textView.getClass();
        U.ifPresent(new whh(textView, 0));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aovb aovbVar = (aovb) obj;
        this.a.u(new acqx(aovbVar.d), null);
        aqyg aqygVar = aovbVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        Spanned b = ajcq.b(aqygVar);
        this.c.setText(b);
        this.b.setContentDescription(b);
    }
}
