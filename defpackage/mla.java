package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mla implements ajom {
    public apzg a;
    private final Activity b;
    private final ajut c;
    private final View d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final ftm h;

    public mla(Activity activity, final aahd aahdVar, ajut ajutVar, ftn ftnVar, fvf fvfVar, byte[] bArr) {
        this.b = activity;
        this.c = ajutVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.backstage_subscribe_bar, (ViewGroup) null);
        this.d = inflate;
        this.e = (TextView) inflate.findViewById(R.id.channel_title);
        this.f = (TextView) inflate.findViewById(R.id.channel_subscribers);
        TextView textView = (TextView) inflate.findViewById(R.id.subscribe_button);
        this.g = textView;
        this.h = ftnVar.a(textView, fvfVar.b(inflate.findViewById(R.id.subscription_notification_view)));
        inflate.setOnClickListener(new View.OnClickListener() { // from class: mkz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mla mlaVar = mla.this;
                aahd aahdVar2 = aahdVar;
                apzg apzgVar = mlaVar.a;
                if (apzgVar == null || (apzgVar.b & 2) == 0) {
                    return;
                }
                apxf apxfVar = apzgVar.d;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar2.c(apxfVar, null);
            }
        });
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.h.d();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        int i;
        aqyg aqygVar2;
        apzg apzgVar = (apzg) obj;
        this.a = apzgVar;
        aulq aulqVar = apzgVar.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        auzj auzjVar = (auzj) aulqVar.pX(SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
        acra acraVar = ajokVar.a;
        TextView textView = this.e;
        aqyg aqygVar3 = null;
        if ((apzgVar.b & 1) != 0) {
            aqygVar = apzgVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        if ((apzgVar.b & 8) != 0) {
            ajut ajutVar = this.c;
            arfs arfsVar = apzgVar.f;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            i = ajutVar.a(b);
        } else {
            i = 0;
        }
        if (i > 0) {
            Drawable drawable = this.b.getResources().getDrawable(i);
            drawable.mutate().setColorFilter(this.e.getCurrentTextColor(), PorterDuff.Mode.SRC_IN);
            drawable.setBounds(0, 0, 55, 55);
            this.e.setCompoundDrawablesRelative(null, null, drawable, null);
            this.e.setCompoundDrawablePadding(2);
        } else {
            this.e.setCompoundDrawablesRelative(null, null, null, null);
        }
        TextView textView2 = this.f;
        if ((auzjVar.b & 64) != 0) {
            aqygVar2 = auzjVar.k;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        textView2.setText(ajcq.b(aqygVar2));
        aone builder = auzjVar.toBuilder();
        Activity activity = this.b;
        apzg apzgVar2 = this.a;
        if ((apzgVar2.b & 1) != 0 && (aqygVar3 = apzgVar2.c) == null) {
            aqygVar3 = aqyg.a;
        }
        fkc.p(activity, builder, ajcq.b(aqygVar3));
        this.h.i((auzj) builder.build(), acraVar);
    }
}
