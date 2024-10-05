package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zfl {
    public final String a;
    public final String b;
    public final int c;

    public zfl(String str, String str2) {
        this(str, str2, 0);
    }

    public zfl(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public zfl(String str, String str2, int i, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public static zfl a(Context context, int i, Object... objArr) {
        return b(context, 0, i, objArr);
    }

    public static zfl b(Context context, int i, int i2, Object... objArr) {
        return new zfl(context.getString(i2, objArr), c(context, i2, objArr), i);
    }

    public static String c(Context context, int i, Object... objArr) {
        String str;
        if (objArr.length > 0) {
            String valueOf = String.valueOf(TextUtils.join("_", objArr));
            str = valueOf.length() != 0 ? "_".concat(valueOf) : new String("_");
        } else {
            str = "";
        }
        String valueOf2 = String.valueOf(context.getResources().getResourceEntryName(i));
        String valueOf3 = String.valueOf(str);
        return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
    }
}
