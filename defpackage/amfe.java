package defpackage;

import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amfe {
    public final alra a;
    private final azrw b;

    public amfe(azrw azrwVar, alra alraVar, byte[] bArr) {
        this.b = azrwVar;
        this.a = alraVar;
    }

    public final vgz a(final amfc amfcVar, vcw vcwVar) {
        amkq.O(true, "LamsConfig in ProtoDataStoreConfig must be used together with @LamsSync annotation");
        anib anibVar = amfcVar.g;
        if (anibVar == null) {
            anibVar = (anib) this.b.get();
        }
        anhy submit = anibVar.submit(amjk.g(new Callable() { // from class: amfd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                amfe amfeVar = amfe.this;
                amfc amfcVar2 = amfcVar;
                alra alraVar = amfeVar.a;
                amfa amfaVar = amfcVar2.c;
                String concat = String.valueOf(amfcVar2.a).concat(".pb");
                int i = amfaVar.a;
                String concat2 = ((amfaVar.b != 1 || Build.VERSION.SDK_INT < 24) ? "" : "directboot-").concat("files");
                String d = ammx.d(concat);
                if (d.startsWith("/")) {
                    d = d.substring(1);
                }
                Uri.Builder authority = new Uri.Builder().scheme("android").authority(alraVar.a.getPackageName());
                StringBuilder sb = new StringBuilder(String.valueOf(concat2).length() + 2 + String.valueOf(d).length());
                sb.append("/");
                sb.append(concat2);
                sb.append("/");
                sb.append(d);
                return authority.path(sb.toString()).build();
            }
        }));
        String str = amfcVar.a;
        aooy aooyVar = amfcVar.b;
        vep vepVar = amfcVar.e;
        vgz vgzVar = new vgz(new vgm(str, submit, vhg.a(aooyVar, aomw.b()), anibVar, vcwVar, vepVar, amhy.d()), anaf.O(""), amfcVar.f, true);
        if (!amfcVar.d.isEmpty()) {
            vgzVar.c(vfd.b(amfcVar.d, anibVar));
        }
        return vgzVar;
    }
}
