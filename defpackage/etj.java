package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class etj extends ajpc {
    private final ajop a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final gno e;
    private apss f;

    public etj(Context context, gma gmaVar, akht akhtVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = gmaVar;
        View inflate = View.inflate(context, R.layout.channel_tip_card_item, null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.tip_card_title);
        this.d = (TextView) inflate.findViewById(R.id.tip_card_message);
        this.e = akhtVar.h((TextView) inflate.findViewById(R.id.tip_button));
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
        aqyg aqygVar2;
        apss apssVar = (apss) obj;
        if (this.f == apssVar) {
            this.a.e(ajokVar);
            return;
        }
        this.f = apssVar;
        TextView textView = this.c;
        apmg apmgVar = null;
        if ((apssVar.b & 1) != 0) {
            aqygVar = apssVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.d;
        if ((apssVar.b & 2) != 0) {
            aqygVar2 = apssVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        if (this.c.getVisibility() != 8 && this.d.getVisibility() != 8) {
            gno gnoVar = this.e;
            apmh apmhVar = apssVar.e;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            if ((apmhVar.b & 1) != 0) {
                apmh apmhVar2 = apssVar.e;
                if (apmhVar2 == null) {
                    apmhVar2 = apmh.a;
                }
                apmgVar = apmhVar2.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
            }
            gnoVar.b(apmgVar, ajokVar.a);
        }
        this.a.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return null;
    }
}
