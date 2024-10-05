package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acgx extends wv {
    public final TextView t;
    public final TextView u;
    public aqzu v;

    public acgx(View view, final acgu acguVar) {
        super(view);
        this.t = (TextView) view.findViewById(R.id.game_title_text);
        this.u = (TextView) view.findViewById(R.id.game_title_year);
        view.setOnClickListener(new View.OnClickListener() { // from class: acgw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                acgx acgxVar = acgx.this;
                acgu acguVar2 = acguVar;
                ((acgs) acguVar2).a.a(acgxVar.v);
            }
        });
    }
}
