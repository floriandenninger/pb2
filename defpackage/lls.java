package defpackage;

import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lls implements afwx {
    final /* synthetic */ String a;
    final /* synthetic */ Boolean b;
    final /* synthetic */ OfflinePrefsFragment c;

    public lls(OfflinePrefsFragment offlinePrefsFragment, String str, Boolean bool) {
        this.c = offlinePrefsFragment;
        this.a = str;
        this.b = bool;
    }

    public static /* synthetic */ void d(Throwable th) {
        zga.d("Failed to store cross device offline device name.", th);
    }

    public static /* synthetic */ void e(Throwable th) {
        zga.d("Failed to store cross device offline device state.", th);
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.c.aM(R.string.pref_cross_device_offline_error);
        this.c.ol("cross_device_offline").G(true);
    }

    @Override // defpackage.cnl
    public final /* synthetic */ void kZ(Object obj) {
        ynm.k(this.c.ai.a.b(new fjz(this.a, 1)), angq.a, jun.s, llr.a);
        ynm.k(this.c.ai.a.b(new eou(this.b.booleanValue(), 4)), angq.a, jun.t, llr.c);
        this.c.aM(R.string.pref_cross_device_offline_success);
        this.c.ol("cross_device_offline").G(true);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
