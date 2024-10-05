package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ackh implements View.OnClickListener, ajom {
    private final ajuv a;
    private final aahd b;
    private final ajut c;
    private final ajuu d;
    private final View e;
    private final TextView f;
    private final ImageView g;
    private atda h;

    public ackh(Context context, aahd aahdVar, ajut ajutVar, ajuu ajuuVar, ajuv ajuvVar) {
        this.b = aahdVar;
        ajuuVar.getClass();
        this.d = ajuuVar;
        this.c = ajutVar;
        this.a = ajuvVar;
        View inflate = View.inflate(context, R.layout.lc_input_select_spinner_dropdown_item, null);
        this.e = inflate;
        whu.F(inflate, inflate.getBackground(), 0);
        this.f = (TextView) inflate.findViewById(R.id.title);
        this.g = (ImageView) inflate.findViewById(R.id.icon);
        inflate.setOnClickListener(this);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        int i;
        atda atdaVar = (atda) obj;
        this.f.setText(adyu.m0do(atdaVar));
        arfs dm = adyu.dm(atdaVar);
        if (dm != null) {
            ajut ajutVar = this.c;
            arfr b = arfr.b(dm.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            i = ajutVar.a(b);
        } else {
            i = 0;
        }
        if (i != 0) {
            this.g.setImageResource(i);
            this.g.setVisibility(0);
        } else {
            this.g.setImageResource(android.R.color.transparent);
            this.g.setVisibility(8);
        }
        this.h = atdaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ajuv ajuvVar = this.a;
        if (ajuvVar != null) {
            ajuvVar.a();
        }
        apxf dl = adyu.dl(this.h);
        if (dl != null) {
            this.b.c(dl, this.d.a());
            return;
        }
        apxf dk = adyu.dk(this.h);
        if (dk != null) {
            this.b.c(dk, this.d.a());
        }
    }
}
