package defpackage;

import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInControllerImpl;
import com.google.android.libraries.youtube.offline.ui.DownloadNetworkSelectionDialogPreference;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adpt implements zfi {
    private final /* synthetic */ int n;
    public static final /* synthetic */ adpt m = new adpt(12);
    public static final /* synthetic */ adpt l = new adpt(11);
    public static final /* synthetic */ adpt k = new adpt(10);
    public static final /* synthetic */ adpt j = new adpt(9);
    public static final /* synthetic */ adpt i = new adpt(8);
    public static final /* synthetic */ adpt h = new adpt(7);
    public static final /* synthetic */ adpt g = new adpt(6);
    public static final /* synthetic */ adpt f = new adpt(5);
    public static final /* synthetic */ adpt e = new adpt(4);
    public static final /* synthetic */ adpt d = new adpt(3);
    public static final /* synthetic */ adpt c = new adpt(2);
    public static final /* synthetic */ adpt b = new adpt(1);
    public static final /* synthetic */ adpt a = new adpt(0);

    private /* synthetic */ adpt(int i2) {
        this.n = i2;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        switch (this.n) {
            case 0:
                int i2 = adqc.E;
                zga.d("Failed to store smart remote disconnect tip shown flag", (Throwable) obj);
                return;
            case 1:
                int i3 = adqc.E;
                return;
            case 2:
                int i4 = adqc.E;
                zga.d("Failed to store privacy dialog shown flag.", (Throwable) obj);
                return;
            case 3:
                zga.f(TvSignInControllerImpl.a, "Failed to retrieve TV sign in data.", (Throwable) obj);
                return;
            case 4:
                agtv agtvVar = (agtv) obj;
                CountDownLatch countDownLatch = agvx.a;
                agtvVar.getClass();
                agtvVar.g();
                return;
            case 5:
                agtv agtvVar2 = (agtv) obj;
                CountDownLatch countDownLatch2 = agvx.a;
                agtvVar2.getClass();
                agtvVar2.c();
                return;
            case 6:
                int i5 = DownloadNetworkSelectionDialogPreference.f;
                zga.d("Failed to update OfflineModuleSettingsSchema", (Throwable) obj);
                return;
            case 7:
                zga.d("Error updating vr mode first time use in store", (Throwable) obj);
                return;
            case 8:
                return;
            case 9:
                return;
            case 10:
                return;
            case 11:
                return;
            default:
                return;
        }
    }
}
