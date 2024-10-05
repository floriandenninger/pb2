package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fwr extends ajpc {
    final LinearLayout a;
    private final Context b;
    private final ajop c;
    private final ypa d;
    private final View e;
    private final akht f;

    public fwr(Context context, gma gmaVar, akht akhtVar, ypa ypaVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = context;
        this.c = gmaVar;
        this.f = akhtVar;
        this.d = ypaVar;
        View inflate = View.inflate(context, R.layout.compact_multi_offer_view, null);
        this.e = inflate;
        this.a = (LinearLayout) inflate.findViewById(R.id.offer_rows);
        gmaVar.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.c).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        apmg apmgVar;
        aony aonyVar = ((aqcf) obj).b;
        this.a.removeAllViews();
        Iterator it = aonyVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            aqce aqceVar = (aqce) it.next();
            if (aqceVar.b.size() > 0) {
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.b).inflate(R.layout.compact_multi_offer_payment_row, (ViewGroup) this.a, false);
                for (aqcd aqcdVar : aqceVar.b) {
                    apmh apmhVar = aqcdVar.b;
                    if (apmhVar == null) {
                        apmhVar = apmh.a;
                    }
                    if ((apmhVar.b & 1) != 0) {
                        apmh apmhVar2 = aqcdVar.b;
                        if (apmhVar2 == null) {
                            apmhVar2 = apmh.a;
                        }
                        apmgVar = apmhVar2.c;
                        if (apmgVar == null) {
                            apmgVar = apmg.a;
                        }
                    } else {
                        apmgVar = null;
                    }
                    acra acraVar = ajokVar.a;
                    YouTubeTextView youTubeTextView = (YouTubeTextView) LayoutInflater.from(this.b).inflate(R.layout.compact_multi_offer_payment_cell, (ViewGroup) linearLayout, false);
                    gno h = this.f.h(youTubeTextView);
                    h.c = new fwq(this.d, acraVar);
                    h.b(apmgVar, acraVar);
                    linearLayout.addView(youTubeTextView);
                }
                this.a.addView(linearLayout);
            }
        }
        LinearLayout linearLayout2 = this.a;
        linearLayout2.setVisibility(linearLayout2.getChildCount() <= 0 ? 8 : 0);
        this.c.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqcf) obj).c.I();
    }
}
