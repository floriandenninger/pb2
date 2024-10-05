package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class huj implements View.OnClickListener {
    public final /* synthetic */ hur a;
    private final /* synthetic */ int b;

    public /* synthetic */ huj(hur hurVar, int i) {
        this.b = i;
        this.a = hurVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            hur hurVar = this.a;
            hurVar.q.I(3, new acqx(acsb.c(136521)), null);
            hurVar.q.I(3, new acqx(acsb.c(36857)), null);
            hurVar.H = true;
            hurVar.j();
            hurVar.C.dismiss();
            hurVar.m();
            return;
        }
        if (i == 1) {
            hur hurVar2 = this.a;
            hurVar2.q.I(3, new acqx(acsb.c(85443)), null);
            hurVar2.C.dismiss();
            return;
        }
        if (i != 2) {
            int i2 = 0;
            if (i != 3) {
                hur hurVar3 = this.a;
                hurVar3.q.I(3, new acqx(acsb.c(85443)), null);
                hurVar3.B = false;
                hurVar3.C.dismiss();
                return;
            }
            hur hurVar4 = this.a;
            hurVar4.q.I(3, new acqx(acsb.c(36857)), null);
            ynm.n(hurVar4.m, hurVar4.I.b(new huh(hurVar4, i2), angq.a), hue.d, hue.g);
            hurVar4.C.dismiss();
            hurVar4.m();
            return;
        }
        hur hurVar5 = this.a;
        hurVar5.q.I(3, new acqx(acsb.c(84511)), null);
        aahd aahdVar = hurVar5.c;
        aong aongVar = (aong) apxf.a.createBuilder();
        aonk aonkVar = UrlEndpointOuterClass.urlEndpoint;
        aone createBuilder = avuo.a.createBuilder();
        String valueOf = String.valueOf(Locale.getDefault().getLanguage());
        String concat = valueOf.length() != 0 ? "https://support.google.com/youtube/answer/9528076?hl=".concat(valueOf) : new String("https://support.google.com/youtube/answer/9528076?hl=");
        createBuilder.copyOnWrite();
        avuo avuoVar = (avuo) createBuilder.instance;
        concat.getClass();
        avuoVar.b = 1 | avuoVar.b;
        avuoVar.c = concat;
        aongVar.e(aonkVar, (avuo) createBuilder.build());
        aahdVar.c((apxf) aongVar.build(), null);
    }
}
