package defpackage;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.youtube.R;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gzp implements amnv {
    private final /* synthetic */ int u;
    public static final /* synthetic */ gzp t = new gzp(20);
    public static final /* synthetic */ gzp s = new gzp(19);
    public static final /* synthetic */ gzp r = new gzp(18);
    public static final /* synthetic */ gzp q = new gzp(17);
    public static final /* synthetic */ gzp p = new gzp(16);
    public static final /* synthetic */ gzp o = new gzp(15);
    public static final /* synthetic */ gzp n = new gzp(14);
    public static final /* synthetic */ gzp m = new gzp(13);
    public static final /* synthetic */ gzp l = new gzp(12);
    public static final /* synthetic */ gzp k = new gzp(11);
    public static final /* synthetic */ gzp j = new gzp(10);
    public static final /* synthetic */ gzp i = new gzp(9);
    public static final /* synthetic */ gzp h = new gzp(8);
    public static final /* synthetic */ gzp g = new gzp(7);
    public static final /* synthetic */ gzp f = new gzp(6);
    public static final /* synthetic */ gzp e = new gzp(5);
    public static final /* synthetic */ gzp d = new gzp(4);
    public static final /* synthetic */ gzp c = new gzp(3);
    public static final /* synthetic */ gzp b = new gzp(2);
    public static final /* synthetic */ gzp a = new gzp(0);

    public /* synthetic */ gzp(int i2) {
        this.u = i2;
    }

    @Override // defpackage.amnv
    public final Object get() {
        switch (this.u) {
            case 0:
                return false;
            case 1:
                if (Build.VERSION.SDK_INT >= 26) {
                    return amru.x(new ywd(Integer.toString(1), R.string.subscriptions_notifications_channel, 4, true, false), new ywd(Integer.toString(2), R.string.livestream_notifications_channel, 4, true, true), new ywd(Integer.toString(3), R.string.comments_notifications_channel, 3, true, false), new ywd(Integer.toString(5), R.string.recommended_notifications_channel, 2, true, false), new ywd(Integer.toString(6), R.string.updates_notifications_channel, 2, true, false), new ywd(Integer.toString(7), R.string.lock_screen_notifications_channel, 2, false, false), new ywd(Integer.toString(90), R.string.feedback_notifications_channel, 2, false, false));
                }
                return amru.q();
            case 2:
            case 3:
            case 4:
                return false;
            case 5:
                return cos.b(R.anim.fade_in_elements);
            case 6:
                HandlerThread handlerThread = new HandlerThread("ProtoDataStore-Message-Handler");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case 7:
                return tyo.T();
            case 8:
                return ury.a();
            case 9:
                return amlr.a;
            case 10:
                return anaf.D(Executors.newSingleThreadScheduledExecutor(pkr.e));
            case 11:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                int i2 = runningAppProcessInfo.importance;
                return Boolean.valueOf(runningAppProcessInfo.importance >= 400);
            case 12:
                return false;
            case 13:
                return new dfd();
            case 14:
                return new dfq();
            case 15:
                return qmq.d;
            case 16:
                return amlr.a;
            case 17:
                return ajm.a();
            case 18:
                return yvn.IMMEDIATE;
            case 19:
                return yvn.NORMAL;
            default:
                return yvn.NORMAL;
        }
    }
}
