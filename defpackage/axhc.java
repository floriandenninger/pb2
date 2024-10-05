package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axhc {
    static {
        String str = axgn.a;
    }

    public static void a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent();
        intent.setAction("com.google.vrtoolkit.cardboard.CONFIGURE").addFlags(268435456);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        Integer num = null;
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String str = resolveInfo.activityInfo.packageName;
            if (awxr.k(str)) {
                int i = resolveInfo.priority;
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
                    int i2 = applicationInfo != null ? applicationInfo.flags : 0;
                    if ((i2 & 1) != 0 || (i2 & 128) != 0) {
                        i++;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (num == null) {
                    num = Integer.valueOf(i);
                } else if (i > num.intValue()) {
                    num = Integer.valueOf(i);
                    arrayList.clear();
                } else if (i >= num.intValue()) {
                }
                Intent intent2 = new Intent(intent);
                intent2.setClassName(str, resolveInfo.activityInfo.name);
                arrayList.add(intent2);
            }
        }
        List j = awxr.j(context);
        if ((j == null || j.isEmpty()) && Build.VERSION.SDK_INT >= 23 && context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            Activity k = axfq.k(context);
            if (k == null) {
                Log.w(axgn.a, "An Activity Context is required, aborting storage permission request.");
            } else {
                k.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 239);
            }
        }
        if (arrayList.isEmpty()) {
            axfn axfnVar = new axfn(context, 3);
            AlertDialog.Builder c = c(context);
            c.setTitle(R.string.vr_gvr_dialog_title).setMessage(R.string.dialog_message_no_cardboard).setPositiveButton(R.string.go_to_playstore_button, axfnVar).setNegativeButton(R.string.cancel_button, (DialogInterface.OnClickListener) null);
            d(context, c.create());
            return;
        }
        if (arrayList.size() == 1) {
            intent = (Intent) arrayList.get(0);
        }
        context.startActivity(intent);
    }

    public static AlertDialog b(Context context, Runnable runnable) {
        axfn axfnVar = new axfn(context, 2);
        AlertDialog.Builder c = c(context);
        c.setTitle(R.string.dialog_title_incompatible_phone).setMessage(R.string.dialog_message_incompatible_phone).setCancelable(false).setPositiveButton(R.string.dialog_button_open_help_center, axfnVar).setNegativeButton(R.string.dialog_button_got_it, new hgs(19));
        if (runnable != null) {
            c.setOnCancelListener(new axhb(runnable));
        }
        AlertDialog create = c.create();
        create.setCanceledOnTouchOutside(false);
        d(context, create);
        return create;
    }

    private static AlertDialog.Builder c(Context context) {
        return new AlertDialog.Builder(context, R.style.GvrDialogTheme);
    }

    private static void d(Context context, AlertDialog alertDialog) {
        alertDialog.getWindow().setFlags(8, 8);
        alertDialog.show();
        Activity k = axfq.k(context);
        if (k != null) {
            alertDialog.getWindow().getDecorView().setSystemUiVisibility(k.getWindow().getDecorView().getSystemUiVisibility());
        }
        alertDialog.getWindow().clearFlags(8);
    }
}
