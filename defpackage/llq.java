package defpackage;

import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class llq implements zfi {
    private final /* synthetic */ int v;
    public static final /* synthetic */ llq u = new llq(20);
    public static final /* synthetic */ llq t = new llq(19);
    public static final /* synthetic */ llq s = new llq(18);
    public static final /* synthetic */ llq r = new llq(17);
    public static final /* synthetic */ llq q = new llq(16);
    public static final /* synthetic */ llq p = new llq(15);
    public static final /* synthetic */ llq o = new llq(14);
    public static final /* synthetic */ llq n = new llq(13);
    public static final /* synthetic */ llq m = new llq(12);
    public static final /* synthetic */ llq l = new llq(11);
    public static final /* synthetic */ llq k = new llq(10);
    public static final /* synthetic */ llq j = new llq(9);
    public static final /* synthetic */ llq i = new llq(8);
    public static final /* synthetic */ llq h = new llq(7);
    public static final /* synthetic */ llq g = new llq(6);
    public static final /* synthetic */ llq f = new llq(5);
    public static final /* synthetic */ llq e = new llq(4);
    public static final /* synthetic */ llq d = new llq(3);
    public static final /* synthetic */ llq c = new llq(2);
    public static final /* synthetic */ llq b = new llq(1);
    public static final /* synthetic */ llq a = new llq(0);

    private /* synthetic */ llq(int i2) {
        this.v = i2;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        switch (this.v) {
            case 0:
                acsa acsaVar = OfflinePrefsFragment.c;
                zga.d("Failed to update OfflineModuleSettingsSchema", (Throwable) obj);
                return;
            case 1:
                acsa acsaVar2 = OfflinePrefsFragment.c;
                zga.d("Failed to store disableBackgroundAudioSettingsDialog.", (Throwable) obj);
                return;
            case 2:
                zga.d("Failed to store disableBackgroundAudioSettingsDialog.", (Throwable) obj);
                return;
            case 3:
                zga.d("accountIdResolver.get() failed", (Throwable) obj);
                afsi.b(2, 25, "[Clockwork][SettingsMenuItem] accountIdResolver.get() failed. ");
                return;
            case 4:
                zga.d("Error updating timeout prefs", (Throwable) obj);
                return;
            case 5:
                zga.d("accountIdResolver.get() failed", (Throwable) obj);
                return;
            case 6:
                zga.d("Failed to update theme data to store.", (Throwable) obj);
                return;
            case 7:
                zga.d("accountIdResolver.get() failed", (Throwable) obj);
                return;
            case 8:
                zga.d("Failed to update theme data to store.", (Throwable) obj);
                return;
            case 9:
                Throwable th = (Throwable) obj;
                if (th == null || th.getMessage() == null) {
                    return;
                }
                zga.b(th.getMessage());
                return;
            case 10:
                zga.d("Failed to update theme data to store.", (Throwable) obj);
                return;
            case 11:
                zga.d("Failed to update theme data to store.", (Throwable) obj);
                return;
            case 12:
                zga.d("accountIdResolver.get() failed", (Throwable) obj);
                return;
            case 13:
                zga.d("Failed to update mealbar shown in datastore", (Throwable) obj);
                return;
            case 14:
                zga.d("failed to update top bar in data store", (Throwable) obj);
                return;
            case 15:
                zga.d("Failed to update setting store.", (Throwable) obj);
                return;
            case 16:
                zga.d("accountIdResolver.get() failed", (Throwable) obj);
                return;
            case 17:
                zga.d("accountIdResolver.get() failed", (Throwable) obj);
                return;
            case 18:
                long j2 = oax.a;
                zga.d("FloatyBarTutorialSettingsStore error getting data", (Throwable) obj);
                return;
            case 19:
                long j3 = oax.a;
                zga.d("FloatyBarTutorialSettingsStore error storing schema ", (Throwable) obj);
                return;
            default:
                zga.d("Picture-in-picture mode request failed.", (Throwable) obj);
                return;
        }
    }
}
