package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.apps.youtube.app.settings.presenter.TimeRangeView;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lqs {
    public int a;
    public final TextView b;
    public final Set c;
    private final TextView d;

    public lqs(final Context context, ViewStub viewStub, final auqh auqhVar) {
        final List o = mcy.o(auqhVar);
        View inflate = viewStub.inflate();
        this.b = (TextView) inflate.findViewById(R.id.detail_message);
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.c = new HashSet();
        if (o.isEmpty()) {
            return;
        }
        this.a = mcy.k(o);
        a(context, auqhVar);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: lqr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final lqs lqsVar = lqs.this;
                Context context2 = context;
                auqh auqhVar2 = auqhVar;
                List list = o;
                AlertDialog.Builder builder = new AlertDialog.Builder(context2);
                builder.setCustomTitle(mcy.l(context2, auqhVar2));
                final lqm lqmVar = new lqm(context2);
                lqmVar.c(mcy.p(context2, list));
                lqmVar.b(mcy.m(context2, list, lqsVar.a));
                builder.setPositiveButton(R.string.done, new DialogInterface.OnClickListener() { // from class: lqq
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        lqs lqsVar2 = lqs.this;
                        lqm lqmVar2 = lqmVar;
                        lqsVar2.b.setText((String) lqmVar2.b.get(lqmVar2.a.getValue()));
                        int a = lqmVar2.a();
                        lqsVar2.a = a;
                        for (lqp lqpVar : lqsVar2.c) {
                            TimeRangeView timeRangeView = lqpVar.a;
                            int i2 = lqpVar.b;
                            auqa auqaVar = timeRangeView.g;
                            auqaVar.getClass();
                            timeRangeView.g = mcy.s(auqaVar, 0, a);
                            timeRangeView.g = mcy.s(timeRangeView.g, 1, i2 + a);
                            timeRangeView.f = mcy.q(timeRangeView.g);
                            if (timeRangeView.f.size() == timeRangeView.d) {
                                timeRangeView.e = 1;
                                lqs lqsVar3 = timeRangeView.b;
                                if (lqsVar3 != null) {
                                    lqsVar3.a(timeRangeView.a, (auqh) timeRangeView.f.get(0));
                                }
                                lqs lqsVar4 = timeRangeView.c;
                                if (lqsVar4 != null) {
                                    lqsVar4.a(timeRangeView.a, (auqh) timeRangeView.f.get(1));
                                }
                            }
                        }
                        dialogInterface.dismiss();
                    }
                });
                builder.setNegativeButton(R.string.cancel, hgs.g);
                builder.setView(lqmVar);
                builder.create().show();
            }
        });
    }

    public final void a(Context context, auqh auqhVar) {
        List o = mcy.o(auqhVar);
        if (o.isEmpty()) {
            return;
        }
        this.a = mcy.k(o);
        TextView textView = this.d;
        textView.getClass();
        aqyg aqygVar = auqhVar.d;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
        String m = mcy.m(context, o, this.a);
        TextView textView2 = this.b;
        textView2.getClass();
        textView2.setText(m);
    }
}
