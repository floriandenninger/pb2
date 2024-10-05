package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvz extends ajpc {
    private final ajop a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final int e;
    private final int f;
    private final int g;

    public mvz(Context context, gma gmaVar) {
        this.a = gmaVar;
        View inflate = View.inflate(context, R.layout.stat_row_item, null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.title);
        this.d = (TextView) inflate.findViewById(R.id.contents);
        this.e = wbs.W(context, R.attr.ytTextPrimary).orElse(0);
        this.f = wbs.W(context, R.attr.ytTextSecondary).orElse(0);
        this.g = wbs.W(context, R.attr.ytTextDisabled).orElse(0);
        gmaVar.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.a).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        auxu auxuVar = (auxu) obj;
        TextView textView = this.c;
        aqyg aqygVar2 = null;
        if ((auxuVar.b & 1) != 0) {
            aqygVar = auxuVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.d;
        if ((auxuVar.b & 2) != 0 && (aqygVar2 = auxuVar.d) == null) {
            aqygVar2 = aqyg.a;
        }
        textView2.setText(ajcq.b(aqygVar2));
        if (!auxuVar.e) {
            this.c.setTextColor(this.e);
            this.d.setTextColor(this.f);
        } else {
            this.c.setTextColor(this.g);
            this.d.setTextColor(this.g);
        }
        this.a.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auxu) obj).f.I();
    }
}
