package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vdd {
    public static final amnm a = amnm.c(".");

    public static vdc a(Context context) {
        return new vdc(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return TextUtils.equals(str, "*.lease");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(String str) {
        return str.endsWith(".lease");
    }
}
