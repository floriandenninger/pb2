package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gpz implements aaha {
    private final Activity a;
    private final ypa b;
    private final etz c;
    private final fcv d;
    private final aaea e;
    private final aloh f;

    public gpz(Activity activity, ypa ypaVar, etz etzVar, aloh alohVar, fcv fcvVar, aaea aaeaVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = activity;
        this.b = ypaVar;
        this.c = etzVar;
        this.f = alohVar;
        this.d = fcvVar;
        this.e = aaeaVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aswb aswbVar = this.e.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        acsx a = aswbVar.ah ? this.d.a() : null;
        aifz d = PlaybackStartDescriptor.d();
        d.a = apxfVar;
        PlaybackStartDescriptor a2 = d.a();
        fli fliVar = (fli) yjj.u(map, "PLAYBACK_START_DESCRIPTOR_MUTATOR", fli.class);
        if (fliVar != null) {
            fliVar.a(a2);
        }
        int i = 0;
        int intValue = ((Integer) yjj.t(map, "com.google.android.apps.youtube.app.endpoint.flags", 0)).intValue();
        Bundle bundle = (Bundle) yjj.u(map, "com.google.android.libraries.youtube.innertube.bundle", Bundle.class);
        boolean z = (intValue & 32) != 0;
        boolean booleanValue = ((Boolean) yjj.t(map, "force_fullscreen", false)).booleanValue();
        boolean booleanValue2 = ((Boolean) yjj.t(map, "OVERRIDE_EXIT_FULLSCREEN_TO_MAXIMIZED", false)).booleanValue();
        boolean z2 = (intValue & 2) != 0;
        int i2 = intValue & 1;
        boolean z3 = (intValue & 8) != 0;
        fhc b = fhd.b();
        WatchDescriptor watchDescriptor = new WatchDescriptor(a2);
        watchDescriptor.e(z2);
        watchDescriptor.f(z3);
        watchDescriptor.d(booleanValue);
        if (i2 != 0 && bundle != null) {
            watchDescriptor.c(bundle);
        }
        b.f(watchDescriptor);
        b.b(booleanValue2);
        b.g((View) yjj.s(map, "VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY"));
        b.a = (avgg) yjj.t(map, "VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", avgg.a);
        b.c(z);
        if (a2.a.z || ((Boolean) yjj.t(map, "ALLOW_RELOAD", false)).booleanValue()) {
            i = 3;
        } else if (!a2.t() && a2.c() > 0) {
            i = 2;
        }
        b.d(i);
        b.e(((Boolean) yjj.t(map, "START_SHUFFLED", false)).booleanValue());
        fhd a3 = b.a();
        this.b.d(new fea());
        etz etzVar = this.c;
        if (etzVar != null) {
            etzVar.m(a3, Optional.ofNullable(a));
            return;
        }
        Intent r = this.f.r();
        r.setFlags(67108864);
        r.putExtra("watch", a3.a);
        this.a.startActivity(r);
    }
}
