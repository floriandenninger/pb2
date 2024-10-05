package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qmy extends qmz {
    private static final Object e = new Object();
    public static final qmy a = new qmy();
    public static final int b = qmz.c;

    public final Dialog a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return b(activity, i, new qsb(i(activity, i, "d"), activity, i2), onCancelListener);
    }

    public final Dialog b(Context context, int i, qsd qsdVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(qsa.d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = qsa.c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, qsdVar);
        }
        String g = qsa.g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    public final void c(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ci) {
                dd supportFragmentManager = ((ci) activity).getSupportFragmentManager();
                qno qnoVar = new qno();
                qip.az(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                qnoVar.ae = dialog;
                if (onCancelListener != null) {
                    qnoVar.af = onCancelListener;
                }
                qnoVar.qh(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        qmv qmvVar = new qmv();
        qip.az(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        qmvVar.a = dialog;
        if (onCancelListener != null) {
            qmvVar.b = onCancelListener;
        }
        qmvVar.show(fragmentManager, str);
    }

    public final void d(Context context, int i) {
        e(context, i, j(context, i, "n"));
    }

    public final void e(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            new qmx(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String f = qsa.f(context, i);
        String e2 = qsa.e(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        qip.an(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        dy dyVar = new dy(context);
        dyVar.w = true;
        dyVar.g(true);
        dyVar.k(f);
        dx dxVar = new dx();
        dxVar.c(e2);
        dyVar.s(dxVar);
        if (oba.ad(context)) {
            qip.av(true);
            dyVar.r(context.getApplicationInfo().icon);
            dyVar.k = 2;
            if (oba.ae(context)) {
                dyVar.e(com.google.android.youtube.R.drawable.common_full_open_on_phone, resources.getString(com.google.android.youtube.R.string.common_open_on_phone), pendingIntent);
            } else {
                dyVar.g = pendingIntent;
            }
        } else {
            dyVar.r(R.drawable.stat_sys_warning);
            dyVar.u(resources.getString(com.google.android.youtube.R.string.common_google_play_services_notification_ticker));
            dyVar.w(System.currentTimeMillis());
            dyVar.g = pendingIntent;
            dyVar.j(e2);
        }
        if (oba.aa()) {
            qip.av(oba.aa());
            synchronized (e) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String b2 = qsa.b(context);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", b2, 4));
            } else if (!b2.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(b2);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            dyVar.E = "com.google.android.gms.availability";
        }
        Notification b3 = dyVar.b();
        if (i == 1 || i == 2 || i == 3) {
            qnm.b.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, b3);
    }

    public final void f(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a2 = a(activity, i, i2, onCancelListener);
        if (a2 == null) {
            return;
        }
        c(activity, a2, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
