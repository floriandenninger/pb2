package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anya {
    private static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Can't wrap try/catch for region: R(67:1|(2:2|3)|(64:7|8|(3:196|197|(67:199|(60:201|(1:203)|11|(1:13)|14|(1:16)|17|(51:19|(1:182)|23|24|(1:26)|27|(1:29)(2:172|(1:177)(1:176))|30|(1:32)|33|(1:35)(5:160|(1:162)|163|(1:165)(1:171)|(1:167)(2:168|(1:170)))|(1:37)(6:139|(4:142|(2:149|150)(1:152)|151|140)|155|156|(1:158)|159)|38|(1:40)(1:138)|(1:42)|43|(1:45)|46|(1:48)|49|(31:133|(1:137)|(1:53)|54|(27:128|(1:132)|(1:58)|59|(23:125|(1:127)|(1:63)|64|(19:121|122|(1:68)|69|(3:111|112|(16:114|(1:116)|117|(1:73)|74|(4:97|98|99|(2:101|(10:103|(3:78|(1:84)(1:82)|83)|85|(1:87)|88|(1:90)|91|(1:93)|94|95)(2:104|105))(2:106|107))|76|(0)|85|(0)|88|(0)|91|(0)|94|95)(2:118|119))|71|(0)|74|(0)|76|(0)|85|(0)|88|(0)|91|(0)|94|95)|66|(0)|69|(0)|71|(0)|74|(0)|76|(0)|85|(0)|88|(0)|91|(0)|94|95)|61|(0)|64|(0)|66|(0)|69|(0)|71|(0)|74|(0)|76|(0)|85|(0)|88|(0)|91|(0)|94|95)|56|(0)|59|(0)|61|(0)|64|(0)|66|(0)|69|(0)|71|(0)|74|(0)|76|(0)|85|(0)|88|(0)|91|(0)|94|95)|51|(0)|54|(0)|56|(0)|59|(0)|61|(0)|64|(0)|66|(0)|69|(0)|71|(0)|74|(0)|76|(0)|85|(0)|88|(0)|91|(0)|94|95)|183|(2:191|192)|(49:190|24|(0)|27|(0)(0)|30|(0)|33|(0)(0)|(0)(0)|38|(0)(0)|(0)|43|(0)|46|(0)|49|(0)|51|(0)|54|(0)|56|(0)|59|(0)|61|(0)|64|(0)|66|(0)|69|(0)|71|(0)|74|(0)|76|(0)|85|(0)|88|(0)|91|(0)|94|95)|23|24|(0)|27|(0)(0)|30|(0)|33|(0)(0)|(0)(0)|38|(0)(0)|(0)|43|(0)|46|(0)|49|(0)|51|(0)|54|(0)|56|(0)|59|(0)|61|(0)|64|(0)|66|(0)|69|(0)|71|(0)|74|(0)|76|(0)|85|(0)|88|(0)|91|(0)|94|95)|204|(62:206|(1:208)|11|(0)|14|(0)|17|(0)|183|(1:185)|191|192|(1:188)|190|24|(0)|27|(0)(0)|30|(0)|33|(0)(0)|(0)(0)|38|(0)(0)|(0)|43|(0)|46|(0)|49|(0)|51|(0)|54|(0)|56|(0)|59|(0)|61|(0)|64|(0)|66|(0)|69|(0)|71|(0)|74|(0)|76|(0)|85|(0)|88|(0)|91|(0)|94|95)(1:217)|209|(3:211|(1:213)(1:215)|214)|216|11|(0)|14|(0)|17|(0)|183|(0)|191|192|(0)|190|24|(0)|27|(0)(0)|30|(0)|33|(0)(0)|(0)(0)|38|(0)(0)|(0)|43|(0)|46|(0)|49|(0)|51|(0)|54|(0)|56|(0)|59|(0)|61|(0)|64|(0)|66|(0)|69|(0)|71|(0)|74|(0)|76|(0)|85|(0)|88|(0)|91|(0)|94|95))|10|11|(0)|14|(0)|17|(0)|183|(0)|191|192|(0)|190|24|(0)|27|(0)(0)|30|(0)|33|(0)(0)|(0)(0)|38|(0)(0)|(0)|43|(0)|46|(0)|49|(0)|51|(0)|54|(0)|56|(0)|59|(0)|61|(0)|64|(0)|66|(0)|69|(0)|71|(0)|74|(0)|76|(0)|85|(0)|88|(0)|91|(0)|94|95)|221|8|(0)|10|11|(0)|14|(0)|17|(0)|183|(0)|191|192|(0)|190|24|(0)|27|(0)(0)|30|(0)|33|(0)(0)|(0)(0)|38|(0)(0)|(0)|43|(0)|46|(0)|49|(0)|51|(0)|54|(0)|56|(0)|59|(0)|61|(0)|64|(0)|66|(0)|69|(0)|71|(0)|74|(0)|76|(0)|85|(0)|88|(0)|91|(0)|94|95) */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x018a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x018b, code lost:
    
        r0 = java.lang.String.valueOf(r0);
        r13 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r13.append("Couldn't get own application info: ");
        r13.append(r0);
        android.util.Log.w("FirebaseMessaging", r13.toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0492 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x043b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.anxz a(android.content.Context r17, defpackage.anyx r18) {
        /*
            Method dump skipped, instructions count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anya.a(android.content.Context, anyx):anxz");
    }

    static boolean b(anyx anyxVar) {
        return anyxVar.h("google.c.a.e");
    }

    private static int c() {
        return a.incrementAndGet();
    }

    private static Integer d(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i == 0) {
            return null;
        }
        try {
            return Integer.valueOf(aih.d(context, i));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    private static boolean e(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }

    private static int f() {
        return Build.VERSION.SDK_INT >= 23 ? 1140850688 : 1073741824;
    }
}
