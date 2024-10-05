package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.video.media.VideoMetaData;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vux {
    private static final amsx a = amsx.t("vide", "soun", "hint");
    private static final amsx b;
    private static final amsx c;

    static {
        amsx u = amsx.u("mp41", "mp42", "3gp4", "qt  ");
        b = u;
        amsv i = amsx.i();
        i.j(u);
        i.c("isom");
        i.c("iso2");
        c = i.g();
    }

    public static VideoMetaData a(Context context, Uri uri) {
        vuv a2 = vuw.a();
        a2.c(true);
        return b(context, uri, a2.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0393, code lost:
    
        r5 = new long[r9];
        r4 = new int[r3.length];
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04c8, code lost:
    
        if (r4.length <= 0) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x04cd, code lost:
    
        if (r4[0] != 0) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04d7, code lost:
    
        throw new defpackage.vvc("First sync sample is not first frame");
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04df, code lost:
    
        throw new defpackage.vvc("VideoTrack has no sync samples");
     */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0572 A[Catch: all -> 0x0587, TryCatch #2 {all -> 0x0587, blocks: (B:292:0x053d, B:293:0x0540, B:248:0x04e2, B:356:0x056e, B:358:0x0572, B:360:0x0586, B:361:0x057a, B:363:0x057e, B:364:0x0585, B:339:0x0541, B:340:0x054a, B:342:0x054b, B:343:0x0554, B:371:0x0555, B:372:0x055e), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x057e A[Catch: all -> 0x0587, TryCatch #2 {all -> 0x0587, blocks: (B:292:0x053d, B:293:0x0540, B:248:0x04e2, B:356:0x056e, B:358:0x0572, B:360:0x0586, B:361:0x057a, B:363:0x057e, B:364:0x0585, B:339:0x0541, B:340:0x054a, B:342:0x054b, B:343:0x0554, B:371:0x0555, B:372:0x055e), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:365:? A[Catch: all -> 0x0587, SYNTHETIC, TRY_LEAVE, TryCatch #2 {all -> 0x0587, blocks: (B:292:0x053d, B:293:0x0540, B:248:0x04e2, B:356:0x056e, B:358:0x0572, B:360:0x0586, B:361:0x057a, B:363:0x057e, B:364:0x0585, B:339:0x0541, B:340:0x054a, B:342:0x054b, B:343:0x0554, B:371:0x0555, B:372:0x055e), top: B:2:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.libraries.video.media.VideoMetaData b(android.content.Context r35, android.net.Uri r36, defpackage.vuw r37) {
        /*
            Method dump skipped, instructions count: 1423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vux.b(android.content.Context, android.net.Uri, vuw):com.google.android.libraries.video.media.VideoMetaData");
    }

    private static boolean c(dfm dfmVar) {
        return g(dfmVar) && dfmVar.m().l() != null;
    }

    private static boolean d(dfm dfmVar) {
        return e(dfmVar) && dfmVar.l().l() != null;
    }

    private static boolean e(dfm dfmVar) {
        return dfmVar.l() != null;
    }

    private static boolean f(dfm dfmVar) {
        return e(dfmVar) && dfmVar.l().n() != null;
    }

    private static boolean g(dfm dfmVar) {
        return dfmVar.m() != null;
    }
}
