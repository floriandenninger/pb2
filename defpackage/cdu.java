package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdu implements Runnable {
    private static final String a = ajbh.S("ForceStopRunnable");
    private static final long b = TimeUnit.DAYS.toMillis(3650);
    private final Context c;
    private final caj d;
    private int e = 0;

    public cdu(Context context, caj cajVar) {
        this.c = context.getApplicationContext();
        this.d = cajVar;
    }

    public static void a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent b2 = b(context, true != aij.f() ? 134217728 : 167772160);
        long currentTimeMillis = System.currentTimeMillis() + b;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, b2);
        }
    }

    private static PendingIntent b(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x025c, code lost:
    
        defpackage.ajbh.X().T(new java.lang.Throwable[0]);
        r3 = r16.d;
        defpackage.bzt.b(r3.d, r3.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x025a, code lost:
    
        if (r3 == false) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02cc A[Catch: all -> 0x0308, TRY_LEAVE, TryCatch #17 {all -> 0x0308, blocks: (B:3:0x0004, B:5:0x0013, B:7:0x0041, B:9:0x004e, B:11:0x0054, B:13:0x0066, B:15:0x006e, B:16:0x007f, B:18:0x0088, B:20:0x0073, B:21:0x00c2, B:22:0x00ca, B:24:0x00d0, B:29:0x00e4, B:31:0x00ea, B:32:0x00fe, B:34:0x0105, B:35:0x011c, B:38:0x0111, B:42:0x0126, B:44:0x012f, B:164:0x0133, B:48:0x014c, B:57:0x01b1, B:62:0x01bc, B:64:0x01cc, B:67:0x01d6, B:73:0x01fa, B:76:0x0205, B:102:0x0213, B:81:0x021d, B:85:0x0228, B:87:0x022e, B:90:0x0235, B:92:0x023b, B:97:0x0282, B:94:0x024a, B:100:0x025c, B:106:0x0274, B:145:0x02c4, B:147:0x02cc, B:150:0x02ee, B:156:0x02f4, B:157:0x0307, B:110:0x0250, B:130:0x02a7, B:131:0x02aa, B:169:0x001d), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0211  */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdu.run():void");
    }
}
