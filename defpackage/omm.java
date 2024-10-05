package defpackage;

import android.os.Binder;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class omm implements Runnable {
    private final /* synthetic */ int l;
    public static final /* synthetic */ omm k = new omm(18);
    public static final /* synthetic */ omm j = new omm(17);
    public static final /* synthetic */ omm i = new omm(8);
    public static final /* synthetic */ omm h = new omm(7);
    public static final /* synthetic */ omm g = new omm(6);
    public static final /* synthetic */ omm f = new omm(5);
    public static final /* synthetic */ omm e = new omm(4);
    public static final /* synthetic */ omm d = new omm(3);
    public static final /* synthetic */ omm c = new omm(2);
    public static final /* synthetic */ omm b = new omm(1);
    public static final /* synthetic */ omm a = new omm(0);

    public /* synthetic */ omm(int i2) {
        this.l = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.l;
        if (i2 == 0) {
            gfo.a();
            return;
        }
        if (i2 == 3) {
            Binder.flushPendingCommands();
            return;
        }
        if (i2 == 4) {
            throw new RuntimeException("Someone quit the @LightweightExecutor looper");
        }
        if (i2 == 5) {
            sgf.D();
            return;
        }
        if (i2 == 6) {
            String str = uhf.ae;
            return;
        }
        if (i2 == 7) {
            String str2 = ExpressSignInLayout.a;
        } else if (i2 == 17) {
            PermissionDescriptor[] permissionDescriptorArr = LiveCreationActivity.c;
        } else {
            if (i2 != 18) {
                return;
            }
            long j2 = acjl.a;
        }
    }
}
