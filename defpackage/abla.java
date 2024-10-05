package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class abla implements ajom {
    protected final View a;
    public final aahd b;
    public final acra c;
    private final TextView d = g();
    private final TextView e = f();
    private final ImageView f;
    private final ajkj g;

    public abla(Context context, ajjs ajjsVar, aahd aahdVar, acqz acqzVar) {
        this.b = aahdVar;
        this.c = acqzVar.mM();
        this.a = LayoutInflater.from(context).inflate(d(), (ViewGroup) null);
        ImageView e = e();
        this.f = e;
        this.g = new ajkj(ajjsVar, e);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.d.setText((CharSequence) null);
        this.e.setText((CharSequence) null);
        this.a.setOnClickListener(null);
        this.g.a();
    }

    protected abstract int d();

    protected abstract ImageView e();

    protected abstract TextView f();

    protected abstract TextView g();

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        final aspk aspkVar = (aspk) obj;
        TextView textView = this.d;
        aqyg aqygVar = aspkVar.d;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.e;
        aqyg aqygVar2 = aspkVar.e;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        if ((aspkVar.b & 128) != 0) {
            ajkj ajkjVar = this.g;
            avgg avggVar = aspkVar.f;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajkjVar.k(avggVar);
        }
        final acqx acqxVar = new acqx(acrb.LIVE_CHAT_DONATION_ANNOUNCEMENT_RENDERER);
        this.c.n(acqxVar);
        if ((aspkVar.b & 1024) == 0 || this.b == null) {
            return;
        }
        this.a.setOnClickListener(new View.OnClickListener() { // from class: abkz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                abla ablaVar = abla.this;
                aspk aspkVar2 = aspkVar;
                acqx acqxVar2 = acqxVar;
                aahd aahdVar = ablaVar.b;
                apxf apxfVar = aspkVar2.g;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, null);
                ablaVar.c.I(3, acqxVar2, null);
            }
        });
    }
}
