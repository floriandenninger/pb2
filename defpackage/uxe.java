package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uxe implements amnv {
    public static final /* synthetic */ int a = 0;
    private static volatile ansv h = new ansv(uxd.a);
    private final String b;
    private final String c;
    private final Object d;
    private final uwg e;
    private final Object f = new Object();
    private final Map g = new HashMap();

    public uxe(String str, String str2, Object obj, uwg uwgVar) {
        obj.getClass();
        this.b = str;
        this.c = str2;
        this.d = obj;
        this.e = uwgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a A[Catch: all -> 0x018c, TRY_LEAVE, TryCatch #5 {, blocks: (B:9:0x000f, B:11:0x0015, B:13:0x0019, B:14:0x0020, B:16:0x002d, B:17:0x0063, B:19:0x006a, B:20:0x006f, B:22:0x00a0, B:24:0x00ae, B:26:0x00c1, B:27:0x00c3, B:37:0x00dd, B:38:0x00de, B:40:0x00ee, B:44:0x0129, B:47:0x0131, B:58:0x0143, B:59:0x0144, B:61:0x014a, B:69:0x015b, B:72:0x0167, B:74:0x0171, B:75:0x017c, B:76:0x0176, B:64:0x0183, B:65:0x0185, B:66:0x018a, B:79:0x0103, B:82:0x0110, B:84:0x011a, B:85:0x0125, B:86:0x011f, B:49:0x0132, B:51:0x0136, B:52:0x013c, B:53:0x013e, B:29:0x00c4, B:31:0x00c8, B:32:0x00d9), top: B:8:0x000f, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0183 A[Catch: all -> 0x018c, TryCatch #5 {, blocks: (B:9:0x000f, B:11:0x0015, B:13:0x0019, B:14:0x0020, B:16:0x002d, B:17:0x0063, B:19:0x006a, B:20:0x006f, B:22:0x00a0, B:24:0x00ae, B:26:0x00c1, B:27:0x00c3, B:37:0x00dd, B:38:0x00de, B:40:0x00ee, B:44:0x0129, B:47:0x0131, B:58:0x0143, B:59:0x0144, B:61:0x014a, B:69:0x015b, B:72:0x0167, B:74:0x0171, B:75:0x017c, B:76:0x0176, B:64:0x0183, B:65:0x0185, B:66:0x018a, B:79:0x0103, B:82:0x0110, B:84:0x011a, B:85:0x0125, B:86:0x011f, B:49:0x0132, B:51:0x0136, B:52:0x013c, B:53:0x013e, B:29:0x00c4, B:31:0x00c8, B:32:0x00d9), top: B:8:0x000f, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(final defpackage.uvi r15) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uxe.b(uvi):java.lang.Object");
    }

    public final Object a(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        return b(uvi.a(applicationContext));
    }

    @Override // defpackage.amnv
    public final Object get() {
        uvi.b = true;
        Context context = uvi.a;
        if (context != null) {
            return b(uvi.a(context));
        }
        if (uvi.c == null) {
            uvi.c = new Exception();
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
