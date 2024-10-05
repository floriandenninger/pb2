package defpackage;

import com.google.android.libraries.youtube.mdx.FeatureFlagsImpl;
import com.google.android.libraries.youtube.mdx.notification.LivingRoomNotificationRequestManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abbr implements ynk {
    private final /* synthetic */ int v;
    public static final /* synthetic */ abbr u = new abbr(20);
    public static final /* synthetic */ abbr t = new abbr(19);
    public static final /* synthetic */ abbr s = new abbr(18);
    public static final /* synthetic */ abbr r = new abbr(17);
    public static final /* synthetic */ abbr q = new abbr(16);
    public static final /* synthetic */ abbr p = new abbr(15);
    public static final /* synthetic */ abbr o = new abbr(14);
    public static final /* synthetic */ abbr n = new abbr(13);
    public static final /* synthetic */ abbr m = new abbr(12);
    public static final /* synthetic */ abbr l = new abbr(11);
    public static final /* synthetic */ abbr k = new abbr(10);
    public static final /* synthetic */ abbr j = new abbr(9);
    public static final /* synthetic */ abbr i = new abbr(8);
    public static final /* synthetic */ abbr h = new abbr(7);
    public static final /* synthetic */ abbr g = new abbr(6);
    public static final /* synthetic */ abbr f = new abbr(5);
    public static final /* synthetic */ abbr e = new abbr(4);
    public static final /* synthetic */ abbr d = new abbr(3);
    public static final /* synthetic */ abbr c = new abbr(2);
    public static final /* synthetic */ abbr b = new abbr(1);
    public static final /* synthetic */ abbr a = new abbr(0);

    private /* synthetic */ abbr(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ynk
    /* renamed from: b */
    public final void a(Throwable th) {
        switch (this.v) {
            case 0:
                zga.d("Failed to save the attribution data.", th);
                return;
            case 1:
                int i2 = abad.b;
                return;
            case 2:
                zga.d("Failed to clear last exception.", th);
                return;
            case 3:
                afsi.c(2, 12, "Failed to save the updated Heartbeat index.", th);
                return;
            case 4:
                afsi.c(2, 12, "Failed to reset heartbeat.", th);
                return;
            case 5:
                afsi.c(2, 12, "Failed to reset heartbeat.", th);
                return;
            case 6:
                acqt.J(th);
                return;
            case 7:
                FeatureFlagsImpl.q();
                return;
            case 8:
                FeatureFlagsImpl.r();
                return;
            case 9:
                acut.a(th);
                return;
            case 10:
                acvs.c(th);
                return;
            case 11:
                zga.d("Failed to read scan config", th);
                return;
            case 12:
                zga.d("Failed to read scan config", th);
                return;
            case 13:
                zga.f(acyc.k, "Error saving devices to storage.", th);
                return;
            case 14:
                zga.f(acyc.k, "Error saving devices to storage.", th);
                return;
            case 15:
                zga.f(acyc.k, "Error saving sessions to storage.", th);
                return;
            case 16:
                zga.d("Failed to get the descriptor.", th);
                return;
            case 17:
                adds.a(th);
                return;
            case 18:
                zga.f(adgr.a, "Error while attempting to store the remoteId.", th);
                return;
            case 19:
                zga.f(adgr.a, "Error while attempting to store the remoteId.", th);
                return;
            default:
                LivingRoomNotificationRequestManager.i(th);
                return;
        }
    }

    @Override // defpackage.zfi
    public final /* synthetic */ void a(Object obj) {
        switch (this.v) {
            case 0:
                zga.d("Failed to save the attribution data.", (Throwable) obj);
                return;
            case 1:
                int i2 = abad.b;
                return;
            case 2:
                zga.d("Failed to clear last exception.", (Throwable) obj);
                return;
            case 3:
                afsi.c(2, 12, "Failed to save the updated Heartbeat index.", (Throwable) obj);
                return;
            case 4:
                afsi.c(2, 12, "Failed to reset heartbeat.", (Throwable) obj);
                return;
            case 5:
                afsi.c(2, 12, "Failed to reset heartbeat.", (Throwable) obj);
                return;
            case 6:
                acqt.J((Throwable) obj);
                return;
            case 7:
                FeatureFlagsImpl.q();
                return;
            case 8:
                FeatureFlagsImpl.r();
                return;
            case 9:
                acut.a((Throwable) obj);
                return;
            case 10:
                acvs.c((Throwable) obj);
                return;
            case 11:
                zga.d("Failed to read scan config", (Throwable) obj);
                return;
            case 12:
                zga.d("Failed to read scan config", (Throwable) obj);
                return;
            case 13:
                zga.f(acyc.k, "Error saving devices to storage.", (Throwable) obj);
                return;
            case 14:
                zga.f(acyc.k, "Error saving devices to storage.", (Throwable) obj);
                return;
            case 15:
                zga.f(acyc.k, "Error saving sessions to storage.", (Throwable) obj);
                return;
            case 16:
                zga.d("Failed to get the descriptor.", (Throwable) obj);
                return;
            case 17:
                adds.a((Throwable) obj);
                return;
            case 18:
                zga.f(adgr.a, "Error while attempting to store the remoteId.", (Throwable) obj);
                return;
            case 19:
                zga.f(adgr.a, "Error while attempting to store the remoteId.", (Throwable) obj);
                return;
            default:
                LivingRoomNotificationRequestManager.i((Throwable) obj);
                return;
        }
    }
}
