package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uzj {
    public static final int a;
    public static final ClipData b;

    static {
        a = Build.VERSION.SDK_INT > 22 ? 67108864 : 0;
        b = ClipData.newIntent("", new Intent());
    }

    public static Intent a(Intent intent, int i) {
        boolean z = true;
        amkq.F((i & 95) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        amkq.F(intent.getComponent() != null, "Must set component on Intent.");
        if (c(0, 1)) {
            amkq.F(!c(i, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !c(i, 67108864)) {
                z = false;
            }
            amkq.F(z, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !c(i, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!c(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!c(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!c(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!c(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(b);
            }
        }
        return intent2;
    }

    public static PendingIntent b(Context context, Intent intent, int i) {
        return PendingIntent.getActivity(context, 0, a(intent, i), i);
    }

    private static boolean c(int i, int i2) {
        return (i & i2) == i2;
    }
}
