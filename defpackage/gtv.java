package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gtv implements aaha, ykj {
    private static final Pattern a = Pattern.compile("(?i)android-app://([^/]+)/?(?:([^/]+)/([^/?#]*)(.+)?)?");
    private static final Pattern b = Pattern.compile("(?i)https://play.google.com/apps/launch\\?id=([^/]+)/?(?:([^/]+)/([^/?#]*)(.+)?)?");
    private final aahd c;
    private final PackageManager d;
    private final wzq e;
    private final eul f;
    private final Context g;
    private final ykz h;

    public gtv(wzq wzqVar, eul eulVar, ykz ykzVar, aahd aahdVar, Context context) {
        wzqVar.getClass();
        this.e = wzqVar;
        eulVar.getClass();
        this.f = eulVar;
        this.h = ykzVar;
        aahdVar.getClass();
        this.c = aahdVar;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        this.d = packageManager;
        this.g = context;
    }

    @Override // defpackage.ykj
    public final void kD(int i, int i2, Intent intent) {
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.aaha
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kE(defpackage.apxf r9, java.util.Map r10) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gtv.kE(apxf, java.util.Map):void");
    }
}
