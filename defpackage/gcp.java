package defpackage;

import android.text.Spanned;
import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gcp {
    public final akbz a;
    public final aahd b;

    public gcp(akbz akbzVar, aahd aahdVar) {
        this.a = akbzVar;
        this.b = aahdVar;
    }

    public final gcm a(final atnc atncVar, final Map map) {
        aqyg aqygVar;
        final apmg apmgVar;
        aqyg aqygVar2;
        gcm gcmVar = (gcm) this.a.m();
        View.OnClickListener onClickListener = null;
        if ((atncVar.b & 1) != 0) {
            aqygVar = atncVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        gcmVar.k(ajcq.b(aqygVar));
        apmh apmhVar = atncVar.d;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) != 0) {
            apmh apmhVar2 = atncVar.d;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmg apmgVar2 = apmhVar2.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            apmgVar = apmgVar2;
        } else {
            apmgVar = null;
        }
        if (apmgVar != null) {
            if ((apmgVar.b & 256) != 0) {
                aqygVar2 = apmgVar.i;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            Spanned b = ajcq.b(aqygVar2);
            int i = apmgVar.b;
            if ((i & 16384) != 0 || (i & 8192) != 0 || (i & 32768) != 0) {
                final byte[] bArr = null;
                onClickListener = new View.OnClickListener(map, atncVar, apmgVar, bArr) { // from class: gcn
                    public final /* synthetic */ Map a;
                    public final /* synthetic */ atnc b;
                    public final /* synthetic */ apmg c;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        gcp gcpVar = gcp.this;
                        Map map2 = this.a;
                        atnc atncVar2 = this.b;
                        apmg apmgVar3 = this.c;
                        Map j = acrc.j(map2);
                        j.put("com.google.android.libraries.youtube.innertube.endpoint.tag", atncVar2);
                        if ((apmgVar3.b & 8192) != 0) {
                            aahd aahdVar = gcpVar.b;
                            apxf apxfVar = apmgVar3.n;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            aahdVar.c(apxfVar, j);
                        }
                        if ((apmgVar3.b & 16384) != 0) {
                            aahd aahdVar2 = gcpVar.b;
                            apxf apxfVar2 = apmgVar3.o;
                            if (apxfVar2 == null) {
                                apxfVar2 = apxf.a;
                            }
                            aahdVar2.c(apxfVar2, j);
                        }
                        if ((apmgVar3.b & 32768) != 0) {
                            aahd aahdVar3 = gcpVar.b;
                            apxf apxfVar3 = apmgVar3.p;
                            if (apxfVar3 == null) {
                                apxfVar3 = apxf.a;
                            }
                            aahdVar3.c(apxfVar3, j);
                        }
                    }
                };
            }
            gcmVar.m(b, onClickListener);
        }
        return gcmVar;
    }
}
