package defpackage;

import android.util.Rational;
import com.google.android.apps.youtube.app.common.ui.pip.DefaultPipController;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ept implements zfi {
    private final /* synthetic */ int v;
    public static final /* synthetic */ ept u = new ept(20);
    public static final /* synthetic */ ept t = new ept(19);
    public static final /* synthetic */ ept s = new ept(18);
    public static final /* synthetic */ ept r = new ept(17);
    public static final /* synthetic */ ept q = new ept(16);
    public static final /* synthetic */ ept p = new ept(15);
    public static final /* synthetic */ ept o = new ept(14);
    public static final /* synthetic */ ept n = new ept(13);
    public static final /* synthetic */ ept m = new ept(12);
    public static final /* synthetic */ ept l = new ept(11);
    public static final /* synthetic */ ept k = new ept(10);
    public static final /* synthetic */ ept j = new ept(9);
    public static final /* synthetic */ ept i = new ept(8);
    public static final /* synthetic */ ept h = new ept(7);
    public static final /* synthetic */ ept g = new ept(6);
    public static final /* synthetic */ ept f = new ept(5);
    public static final /* synthetic */ ept e = new ept(4);
    public static final /* synthetic */ ept d = new ept(3);
    public static final /* synthetic */ ept c = new ept(2);
    public static final /* synthetic */ ept b = new ept(1);
    public static final /* synthetic */ ept a = new ept(0);

    private /* synthetic */ ept(int i2) {
        this.v = i2;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        switch (this.v) {
            case 0:
                zga.d("accountIdResolver.get() failed", (Throwable) obj);
                return;
            case 1:
                String valueOf = String.valueOf((Throwable) obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Error reading incognito_promotion_already_shown.");
                sb.append(valueOf);
                zga.b(sb.toString());
                return;
            case 2:
                zga.d("accountIdResolver.get() failed", (Throwable) obj);
                return;
            case 3:
                Duration duration = evg.a;
                zga.d("accountIdResolver.get() failed", (Throwable) obj);
                return;
            case 4:
                zga.d("Failed to disable offline button poor connectivity tooltip disabled.", (Throwable) obj);
                return;
            case 5:
                zga.d("Failed to update offline stream snackbar impressions and offline stream snackbar last shown.", (Throwable) obj);
                return;
            case 6:
                zga.d("Failed to read notification settings.", (Throwable) obj);
                return;
            case 7:
                zga.d("Failed to set active state and notify listeners", (Throwable) obj);
                return;
            case 8:
                Rational rational = DefaultPipController.a;
                zga.d("Exception when trying to fetch pip setting", (Throwable) obj);
                return;
            case 9:
                int i2 = gpy.c;
                zga.d("accountIdResolver.get() failed", (Throwable) obj);
                afsi.b(2, 25, "[Clockwork][AppSettingsCommandResolver] accountIdResolver.get() failed.");
                return;
            case 10:
                acsc acscVar = hda.a;
                return;
            case 11:
                acsc acscVar2 = hda.a;
                return;
            case 12:
                int i3 = hfn.a;
                zga.d("accountIdResolver.get() failed", (Throwable) obj);
                afsi.b(2, 25, "[Clockwork][ShortsCreationCommandResolver] accountIdResolver.get() failed.");
                return;
            case 13:
                pom pomVar = (pom) obj;
                if (pomVar != null) {
                    pomVar.Q();
                    pomVar.M(null);
                    pomVar.C(0, 0);
                    return;
                }
                return;
            case 14:
                pom pomVar2 = (pom) obj;
                if (pomVar2 != null) {
                    pomVar2.z(false);
                    return;
                }
                return;
            case 15:
                pom pomVar3 = (pom) obj;
                if (pomVar3 == null || pomVar3.h()) {
                    return;
                }
                pomVar3.T();
                return;
            case 16:
                zga.b("EffectsControlInputStateManager load enhance value from data store failed");
                return;
            case 17:
                amru amruVar = hmc.a;
                zga.b("Can't write to ProtoDataStore");
                return;
            case 18:
                amru amruVar2 = hmc.a;
                return;
            case 19:
                int i4 = htu.ax;
                zga.d("Failed to load PDS", (Throwable) obj);
                return;
            default:
                int i5 = htu.ax;
                zga.d("Can't write to ProtoDataStore", (Throwable) obj);
                return;
        }
    }
}
