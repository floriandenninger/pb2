package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxz implements ajom {
    public awgk a;
    private final TextView b;

    public mxz(Context context, mxy mxyVar) {
        TextView textView = (TextView) View.inflate(context, R.layout.ypc_offers_coupon_item, null);
        this.b = textView;
        textView.setOnClickListener(new mxw(this, mxyVar));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a = null;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        awgt awgtVar = (awgt) obj;
        TextView textView = this.b;
        awgk awgkVar = null;
        if ((awgtVar.b & 8) != 0) {
            aqygVar = awgtVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        awgs awgsVar = awgtVar.f;
        if (awgsVar == null) {
            awgsVar = awgs.a;
        }
        if ((awgsVar.b & 1) != 0) {
            awgs awgsVar2 = awgtVar.f;
            if (awgsVar2 == null) {
                awgsVar2 = awgs.a;
            }
            awgkVar = awgsVar2.c;
            if (awgkVar == null) {
                awgkVar = awgk.a;
            }
        }
        this.a = awgkVar;
    }
}
