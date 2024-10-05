package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class esl extends ajpc {
    private final View a;
    private final TextView b;
    private final ajoi c;

    public esl(Context context, aahd aahdVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.channel_list_add_channels, (ViewGroup) null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.add_text);
        this.c = new ajoi(aahdVar, inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.c();
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        apxf apxfVar;
        apqm apqmVar = (apqm) obj;
        ajoi ajoiVar = this.c;
        acra acraVar = ajokVar.a;
        aqyg aqygVar = null;
        if ((apqmVar.b & 2) != 0) {
            apxfVar = apqmVar.e;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        TextView textView = this.b;
        if ((apqmVar.b & 1) != 0 && (aqygVar = apqmVar.d) == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apqm) obj).f.I();
    }
}
