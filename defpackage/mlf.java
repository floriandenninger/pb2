package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mlf implements ajom {
    private final LinearLayout a;
    private final TextView b;
    private final Button c;

    public mlf(Context context) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.loading_frame_status_error_view, (ViewGroup) null);
        this.a = linearLayout;
        this.b = (TextView) linearLayout.findViewById(R.id.error_message_text);
        this.c = (Button) linearLayout.findViewById(R.id.error_retry_button);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        mle mleVar = (mle) obj;
        if (mleVar == null) {
            return;
        }
        whu.I(this.a, true);
        whu.G(this.b, mleVar.a);
        whu.I(this.c, true);
        this.c.setOnClickListener(new mld(mleVar));
    }
}
