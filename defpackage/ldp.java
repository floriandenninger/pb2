package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ldp extends ajpc {
    private final View a;
    private final TextView b;

    public ldp(Context context) {
        View inflate = View.inflate(context, R.layout.emergency_onebox, null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.title);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqsn aqsnVar = (aqsn) obj;
        TextView textView = this.b;
        if ((aqsnVar.b & 1) != 0) {
            aqygVar = aqsnVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqsn) obj).f.I();
    }
}
