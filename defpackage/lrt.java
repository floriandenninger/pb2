package defpackage;

import android.text.Spanned;
import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lrt implements ypd {
    private final akbz a;
    private final gcp b;
    private final acqz c;
    private final aaea d;
    private final gcp e;

    public lrt(akbz akbzVar, gcp gcpVar, gcp gcpVar2, acqz acqzVar, aaea aaeaVar, byte[] bArr) {
        this.a = akbzVar;
        this.b = gcpVar;
        this.e = gcpVar2;
        this.c = acqzVar;
        this.d = aaeaVar;
    }

    private final void a(byte[] bArr, gcm gcmVar) {
        acra mM = this.c.mM();
        if (bArr.length > 0 && mM != null) {
            gcmVar.b = new lrs(mM, bArr, 0);
        }
        gcmVar.f(!evr.H(this.d));
        this.a.o(gcmVar.b());
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        aqyg aqygVar;
        aqyg aqygVar2;
        View.OnClickListener onClickListener;
        if (i == -1) {
            return new Class[]{aaci.class};
        }
        if (i == 0) {
            aaci aaciVar = (aaci) obj;
            ammv e = aaciVar.e();
            ammv f = aaciVar.f();
            if (e.h()) {
                a(((atnc) e.c()).e.I(), this.e.a((atnc) e.c(), aaciVar.g()));
                return null;
            }
            if (!f.h()) {
                return null;
            }
            byte[] I = ((atnz) f.c()).f.I();
            final gcp gcpVar = this.b;
            final atnz atnzVar = (atnz) f.c();
            Map g = aaciVar.g();
            gcm gcmVar = (gcm) gcpVar.a.m();
            if ((1 & atnzVar.b) != 0) {
                aqygVar = atnzVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            gcmVar.k(ajcq.b(aqygVar));
            if ((atnzVar.b & 2) != 0) {
                aqygVar2 = atnzVar.d;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            Spanned b = ajcq.b(aqygVar2);
            if ((atnzVar.b & 4) != 0) {
                final Map j = acrc.j(g);
                if (j.containsKey("com.google.android.libraries.youtube.innertube.endpoint.tag")) {
                    j.put("feedback_undo", j.get("com.google.android.libraries.youtube.innertube.endpoint.tag"));
                }
                j.put("com.google.android.libraries.youtube.innertube.endpoint.tag", atnzVar);
                onClickListener = new View.OnClickListener() { // from class: gco
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        gcp gcpVar2 = gcp.this;
                        atnz atnzVar2 = atnzVar;
                        Map map = j;
                        aahd aahdVar = gcpVar2.b;
                        apxf apxfVar = atnzVar2.e;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aahdVar.c(apxfVar, map);
                    }
                };
            } else {
                onClickListener = null;
            }
            gcmVar.m(b, onClickListener);
            a(I, gcmVar);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
