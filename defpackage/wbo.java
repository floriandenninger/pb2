package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wbo extends ajpc {
    public final wic a;
    public apxf b;
    private final View c;
    private final TextView d;

    public wbo(Context context, final aahd aahdVar, wic wicVar) {
        this.a = wicVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.fusion_account_channel_layout, (ViewGroup) null);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.channel);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: wbm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wbo wboVar = wbo.this;
                aahd aahdVar2 = aahdVar;
                if (aahdVar2 != null) {
                    aahdVar2.c(wboVar.b, null);
                    wboVar.a.j();
                }
            }
        });
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aouz aouzVar = (aouz) obj;
        TextView textView = this.d;
        if (textView != null) {
            if ((aouzVar.b & 1) != 0) {
                aqygVar = aouzVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView.setText(ajcq.b(aqygVar));
        }
        apxf apxfVar = aouzVar.d;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        this.b = apxfVar;
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aouz) obj).e.I();
    }
}
