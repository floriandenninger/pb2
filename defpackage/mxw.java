package defpackage;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mxw implements View.OnClickListener {
    final /* synthetic */ mxy a;
    final /* synthetic */ mxz b;

    public mxw(mxz mxzVar, mxy mxyVar) {
        this.b = mxzVar;
        this.a = mxyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        awgk awgkVar = this.b.a;
        if (awgkVar == null) {
            return;
        }
        ixu ixuVar = (ixu) this.a;
        if (ixuVar.ap == null) {
            View inflate = View.inflate(ixuVar.ae, R.layout.ypc_offers_coupon_entry_dialog, null);
            ixuVar.aq = (TextView) inflate.findViewById(R.id.prompt);
            ixuVar.ar = (EditText) inflate.findViewById(R.id.coupon_entry);
            AlertDialog.Builder builder = new AlertDialog.Builder(ixuVar.ae);
            aqyg aqygVar = awgkVar.b;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            ixuVar.ap = builder.setTitle(ajcq.b(aqygVar)).setView(inflate).setPositiveButton(R.string.done, new ixn(ixuVar, 1)).create();
            ixuVar.ap.getWindow().setSoftInputMode(5);
        }
        TextView textView = ixuVar.aq;
        aqyg aqygVar2 = awgkVar.c;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar2));
        EditText editText = ixuVar.ar;
        aqyg aqygVar3 = awgkVar.d;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        editText.setHint(ajcq.b(aqygVar3));
        ixuVar.ap.show();
    }
}
