package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class whz implements ajom {
    final ajnz a;
    private final LinearLayout b;
    private final TextView c;
    private final TextView d;

    public whz(Context context) {
        this.a = new ajnz(context);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.google_account_header, (ViewGroup) null);
        this.b = linearLayout;
        this.c = (TextView) linearLayout.findViewById(R.id.name);
        this.d = (TextView) linearLayout.findViewById(R.id.email);
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
        aovm aovmVar = (aovm) obj;
        TextView textView = this.c;
        aqyg aqygVar = aovmVar.b;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.d;
        aqyg aqygVar2 = aovmVar.c;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        textView2.setText(ajcq.b(aqygVar2));
        aqrh aqrhVar = aovmVar.d;
        if (aqrhVar == null) {
            aqrhVar = aqrh.a;
        }
        this.a.d(new ajny(aqrhVar));
        View view = this.a.a;
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        this.b.addView(view);
    }
}
