package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class inm extends ajpc {
    private final View a;
    private final TextView b;
    private final TextView c;

    public inm(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.comment_zero_state, (ViewGroup) null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.comment_zero_state_primary_text);
        this.c = (TextView) inflate.findViewById(R.id.comment_zero_state_secondary_text);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqaf aqafVar = (aqaf) obj;
        TextView textView = this.b;
        aqyg aqygVar = aqafVar.b;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.c;
        aqyg aqygVar2 = aqafVar.c;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        textView2.setText(ajcq.b(aqygVar2));
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqaf) obj).d.I();
    }
}
