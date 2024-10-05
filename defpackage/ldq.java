package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ldq implements ajom {
    private final View a;
    private final ajop b;
    private final TextView c;

    public ldq(Context context, gma gmaVar) {
        this.b = gmaVar;
        View inflate = View.inflate(context, R.layout.exploratory_results_header, null);
        this.a = inflate;
        this.c = (TextView) inflate.findViewById(R.id.title);
        gmaVar.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.b).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqvm aqvmVar = (aqvm) obj;
        TextView textView = this.c;
        if ((aqvmVar.b & 1) != 0) {
            aqygVar = aqvmVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        this.b.e(ajokVar);
    }
}
