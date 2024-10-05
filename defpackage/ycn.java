package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.TvfilmOffersRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ycn implements ajom {
    public final ViewGroup a;
    private final ybl b;
    private final yfl c;
    private final ajoy d;

    public ycn(Context context, yfl yflVar, ajoy ajoyVar, ViewGroup viewGroup, ybl yblVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = yflVar;
        this.d = ajoyVar;
        this.b = yblVar;
        this.a = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.tvfilm_offers_layout, viewGroup, false);
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
        avkt avktVar = (avkt) obj;
        this.a.removeAllViews();
        for (aulq aulqVar : avktVar.b) {
            if (aulqVar.pY(TvfilmOffersRendererOuterClass.offerGroupRenderer)) {
                yfl yflVar = this.c;
                ViewGroup viewGroup = this.a;
                Context context = (Context) yflVar.b.get();
                context.getClass();
                ajyg ajygVar = (ajyg) yflVar.a.get();
                ajygVar.getClass();
                viewGroup.getClass();
                ycd ycdVar = new ycd(context, ajygVar, viewGroup);
                ycdVar.oB(ajokVar, (avks) aulqVar.pX(TvfilmOffersRendererOuterClass.offerGroupRenderer));
                this.a.addView(ycdVar.a);
            }
        }
        aulq aulqVar2 = avktVar.c;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        if (aulqVar2.pY(TvfilmOffersRendererOuterClass.couponRenderer)) {
            ajoy ajoyVar = this.d;
            ybl yblVar = this.b;
            ViewGroup viewGroup2 = this.a;
            Context context2 = (Context) ajoyVar.a.get();
            context2.getClass();
            viewGroup2.getClass();
            ybm ybmVar = new ybm(context2, yblVar, viewGroup2);
            aulq aulqVar3 = avktVar.c;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            ybmVar.f((avkr) aulqVar3.pX(TvfilmOffersRendererOuterClass.couponRenderer));
            this.a.addView(ybmVar.b);
        }
        this.a.setOnTouchListener(new View.OnTouchListener() { // from class: ycm
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ycn.this.a.requestFocus();
                return false;
            }
        });
    }
}
