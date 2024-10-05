package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aejl {
    static final zgd a = aapf.c;
    static final zgd b = aapf.d;
    private static final ammr k = ammr.b(",");
    public final aejf c;
    public final afcu d;
    public final aaoz e;
    public final ysy f;
    public final azrw g;
    public final String h;
    public final anib i;
    public final afhs j;
    private final adxr l;

    public aejl(adyl adylVar, aejf aejfVar, afcu afcuVar, aaoz aaozVar, ysy ysyVar, afhs afhsVar, azrw azrwVar, String str, anib anibVar) {
        this.l = adylVar;
        this.c = aejfVar;
        this.d = afcuVar;
        this.e = aaozVar;
        this.f = ysyVar;
        this.j = afhsVar;
        this.g = azrwVar;
        this.h = str;
        this.i = anibVar;
    }

    private static boolean b(adxr adxrVar, String str, List list, long j) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (adxrVar.g(str, ((Integer) it.next()).intValue(), null, TimeUnit.MILLISECONDS.toMicros(j), 0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri a(defpackage.aeje r6, android.net.Uri r7, defpackage.aeie r8, defpackage.aely r9, java.lang.String r10, java.util.List r11, defpackage.aaox r12) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aejl.a(aeje, android.net.Uri, aeie, aely, java.lang.String, java.util.List, aaox):android.net.Uri");
    }
}
