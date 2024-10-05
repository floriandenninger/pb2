package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tsq {
    public final Executor a;
    final HashMap b = new HashMap();
    private final Context c;
    private final amnv d;
    private final vcw e;
    private final ttw f;
    private final ammv g;
    private final tko h;

    public tsq(Context context, amnv amnvVar, vcw vcwVar, ttw ttwVar, ammv ammvVar, Executor executor, tko tkoVar) {
        this.c = context;
        this.d = amnvVar;
        this.e = vcwVar;
        this.f = ttwVar;
        this.g = ammvVar;
        this.a = executor;
        this.h = tkoVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:3|(2:5|(3:7|8|9))|11|12|14|15|(5:17|(1:19)|20|(2:22|(1:24)(1:25))(1:27)|26)|28|(6:30|cc|35|(3:37|ed|42)|47|(2:49|(8:51|(1:100)(1:57)|(1:59)|60|(2:63|61)|64|65|(4:67|(1:69)|70|(12:81|(1:83)|84|(1:86)|87|(1:89)|90|(1:92)|93|(1:95)|96|97)(3:80|8|9))(2:98|99))(2:101|102))(2:103|104))(2:109|110)) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x021c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x021d, code lost:
    
        defpackage.tsx.d("%s: Not enough space to download file %s", "MddFileDownloader", r20);
        r0 = defpackage.anaf.N(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x004b, code lost:
    
        r7 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.anhy a(defpackage.tld r17, int r18, final android.net.Uri r19, java.lang.String r20, int r21, defpackage.tkx r22, final defpackage.tsp r23, int r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tsq.a(tld, int, android.net.Uri, java.lang.String, int, tkx, tsp, int, java.util.List):anhy");
    }

    public final void b(Uri uri) {
        anhy anhyVar = (anhy) this.b.get(uri);
        if (anhyVar != null) {
            int i = tsx.a;
            this.b.remove(uri);
            anhyVar.cancel(true);
            return;
        }
        tsx.g("%s: stopDownloading on non-existent download", "MddFileDownloader");
    }
}
