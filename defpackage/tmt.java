package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tmt implements tmp {
    public final tvx a;
    public final tmw b;
    private final Context c;
    private final vcw d;

    public tmt(Context context, tvx tvxVar, vcw vcwVar, tmw tmwVar) {
        this.c = context;
        this.a = tvxVar;
        this.d = vcwVar;
        this.b = tmwVar;
    }

    @Override // defpackage.tmp
    public final anhy a(final tmo tmoVar) {
        char c;
        File e;
        final String lastPathSegment = tmoVar.a.getLastPathSegment();
        lastPathSegment.getClass();
        try {
            Context context = this.c;
            Uri uri = tmoVar.a;
            String scheme = uri.getScheme();
            int hashCode = scheme.hashCode();
            if (hashCode != -861391249) {
                if (hashCode == 3143036 && scheme.equals("file")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (scheme.equals("android")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                e = uqq.e(uri, context);
            } else if (c == 1) {
                e = vls.l(uri);
            } else {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                sb.append("Couldn't convert URI to path: ");
                sb.append(valueOf);
                throw new vdo(sb.toString());
            }
            final File parentFile = e.getParentFile();
            parentFile.getClass();
            try {
                final vdz vdzVar = (vdz) this.d.c(tmoVar.a, new vec(1));
                return aci.c(new aeu() { // from class: tmr
                    @Override // defpackage.aeu
                    public final Object a(aes aesVar) {
                        final tmt tmtVar = tmt.this;
                        tmo tmoVar2 = tmoVar;
                        final File file = parentFile;
                        final String str = lastPathSegment;
                        tvq tvqVar = new tvq(tmtVar.a, tmoVar2.b, file, str, new ambf(aesVar), vdzVar, null);
                        tvqVar.l = tmtVar.b;
                        if (tmm.c == tmoVar2.c) {
                            tvqVar.e(tvp.WIFI_OR_CELLULAR);
                        } else {
                            tvqVar.e(tvp.WIFI_ONLY);
                        }
                        int i = tmoVar2.d;
                        if (i > 0) {
                            tvqVar.i = i;
                        }
                        amru amruVar = tmoVar2.e;
                        int i2 = ((amvj) amruVar).c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            Pair pair = (Pair) amruVar.get(i3);
                            tvqVar.e.p((String) pair.first, (String) pair.second);
                        }
                        aesVar.a(new Runnable() { // from class: tms
                            @Override // java.lang.Runnable
                            public final void run() {
                                tmt tmtVar2 = tmt.this;
                                tmtVar2.a.d(file, str);
                            }
                        }, angq.a);
                        tvqVar.d.k(tvqVar);
                        int i4 = tsx.a;
                        String valueOf2 = String.valueOf(tmoVar2.b);
                        return valueOf2.length() != 0 ? "Data download scheduled for file ".concat(valueOf2) : new String("Data download scheduled for file ");
                    }
                });
            } catch (IOException e2) {
                tsx.f(e2, "%s: Unable to create mobstore ResponseWriter for file %s", "OffroadFileDownloader", tmoVar.a);
                tkj a = tkl.a();
                a.a = tkk.UNABLE_TO_CREATE_MOBSTORE_RESPONSE_WRITER_ERROR;
                a.c = e2;
                return anaf.N(a.a());
            }
        } catch (IOException e3) {
            tsx.d("%s: The file uri is malformed, uri = %s", "OffroadFileDownloader", tmoVar.a);
            tkj a2 = tkl.a();
            a2.a = tkk.MALFORMED_FILE_URI_ERROR;
            a2.c = e3;
            return anaf.N(a2.a());
        }
    }
}
