package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.InlinePlaybackRendererOuterClass;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nhd implements ajom, ggr, gmf {
    public final aahd a;
    private final ajom b;
    private final nbp c;
    private Object d;
    private gol e;

    public nhd(akht akhtVar, aahd aahdVar, tdv tdvVar, euv euvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = akhtVar.f(true);
        aahdVar.getClass();
        this.a = aahdVar;
        this.c = new nbp(aahdVar, tdvVar, euvVar, a());
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((mpq) this.b).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b.b(ajosVar);
        this.c.c();
        this.e = null;
        this.d = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ggr, ajom] */
    @Override // defpackage.ggr
    public final View g() {
        return this.b.g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ggr, ajom] */
    @Override // defpackage.ggr
    public final void i(boolean z) {
        this.b.i(z);
    }

    @Override // defpackage.ggr
    public final /* synthetic */ mhp j() {
        return null;
    }

    @Override // defpackage.gmf
    public final boolean oA(gmf gmfVar) {
        return (gmfVar instanceof nhd) && ((nhd) gmfVar).d == this.d;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aoxy aoxyVar;
        arhz arhzVar;
        final auib auibVar;
        auhx auhxVar = (auhx) obj;
        this.d = auhxVar;
        nbp nbpVar = this.c;
        acra acraVar = ajokVar.a;
        String str = auhxVar.g;
        aony aonyVar = auhxVar.d;
        TextView textView = null;
        if ((auhxVar.b & 2) != 0) {
            aoxy aoxyVar2 = auhxVar.e;
            if (aoxyVar2 == null) {
                aoxyVar2 = aoxy.a;
            }
            aoxyVar = aoxyVar2;
        } else {
            aoxyVar = null;
        }
        nbpVar.d(acraVar, auhxVar, str, aonyVar, aoxyVar, auhxVar.f.I());
        aulq aulqVar = auhxVar.c;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer)) {
            aulq aulqVar2 = auhxVar.c;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            arhzVar = (arhz) aulqVar2.pX(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer);
        } else {
            arhzVar = null;
        }
        gol bp = evr.bp(auhxVar);
        this.e = bp;
        this.b.oB(ajokVar, bp);
        arhx arhxVar = arhzVar.g;
        if (arhxVar == null) {
            arhxVar = arhx.a;
        }
        arhw arhwVar = arhxVar.c;
        if (arhwVar == null) {
            arhwVar = arhw.a;
        }
        arhu arhuVar = arhwVar.o;
        if (arhuVar == null) {
            arhuVar = arhu.a;
        }
        if ((arhuVar.b & 1) != 0) {
            arhu arhuVar2 = arhwVar.o;
            if (arhuVar2 == null) {
                arhuVar2 = arhu.a;
            }
            auibVar = arhuVar2.c;
            if (auibVar == null) {
                auibVar = auib.a;
            }
        } else {
            auibVar = null;
        }
        View findViewById = a().findViewById(R.id.call_to_action);
        if (findViewById != null) {
            if (findViewById instanceof ViewStub) {
                textView = (TextView) ((ViewStub) findViewById).inflate();
            } else {
                textView = (TextView) findViewById;
            }
        }
        if (textView == null) {
            return;
        }
        if (auibVar != null) {
            int i = auibVar.b;
            if ((i & 1) != 0 && (i & 4) != 0) {
                aqyg aqygVar = auibVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                textView.setText(ajcq.b(aqygVar));
                final HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", auibVar);
                textView.setOnClickListener(new View.OnClickListener() { // from class: nhc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        nhd nhdVar = nhd.this;
                        auib auibVar2 = auibVar;
                        Map map = hashMap;
                        aahd aahdVar = nhdVar.a;
                        apxf apxfVar = auibVar2.d;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aahdVar.c(apxfVar, map);
                    }
                });
                textView.setVisibility(0);
                return;
            }
        }
        textView.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gmf, ajom] */
    @Override // defpackage.gmf
    public final ayph oz(int i) {
        return this.b.oz(i);
    }
}
