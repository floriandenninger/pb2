package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akly implements ajom {
    public final View a;
    private final TextView b;
    private final TextView c;
    private final TextView d;

    public akly(Context context) {
        View inflate = View.inflate(context, R.layout.share_start_time_with_context, null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.startAt);
        this.c = (TextView) inflate.findViewById(R.id.startTime);
        this.d = (TextView) inflate.findViewById(R.id.contextDescription);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    public final void d(avmo avmoVar) {
        int i = avmoVar.b;
        if ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0) {
            return;
        }
        TextView textView = this.b;
        aqyg aqygVar = avmoVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.c;
        aqyg aqygVar2 = avmoVar.d;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        textView2.setText(ajcq.b(aqygVar2));
        TextView textView3 = this.d;
        aqyg aqygVar3 = avmoVar.e;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        textView3.setText(ajcq.b(aqygVar3));
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        d((avmo) obj);
    }
}
