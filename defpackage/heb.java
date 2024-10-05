package defpackage;

import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class heb implements hov {
    final /* synthetic */ hel a;

    public heb(hel helVar) {
        this.a = helVar;
    }

    @Override // defpackage.hov
    public final void a(int[] iArr) {
        ci C;
        hmg hmgVar;
        MultiSegmentCameraProgressIndicator multiSegmentCameraProgressIndicator = this.a.aA;
        if (multiSegmentCameraProgressIndicator != null) {
            if (iArr != null) {
                for (int i : iArr) {
                    amkq.E(i >= 0);
                }
            }
            multiSegmentCameraProgressIndicator.e = iArr;
            multiSegmentCameraProgressIndicator.b = 0;
            multiSegmentCameraProgressIndicator.c = -1;
            multiSegmentCameraProgressIndicator.d = true;
            multiSegmentCameraProgressIndicator.postInvalidate();
        }
        this.a.ap.d = hoz.d(iArr);
        hel helVar = this.a;
        if (helVar.aW && (hmgVar = helVar.aj) != null) {
            hmgVar.h = hoz.d(iArr);
            if (hmgVar.e && hmgVar.d) {
                hmgVar.d();
            }
        }
        hel helVar2 = this.a;
        hoz hozVar = helVar2.ap;
        if (hozVar.d > helVar2.c && hozVar.c != helVar2.d) {
            hds.a(helVar2.aB, helVar2.av.getResources().getString(R.string.shorts_selected_duration_title, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.a.d))), this.a.av);
            hel helVar3 = this.a;
            helVar3.aN(helVar3.d);
        }
        this.a.aW();
        hel helVar4 = this.a;
        if (!helVar4.aU || (C = helVar4.C()) == null) {
            return;
        }
        C.runOnUiThread(new Runnable() { // from class: hea
            @Override // java.lang.Runnable
            public final void run() {
                hcq hcqVar = heb.this.a.aD;
                if (hcqVar != null) {
                    hcqVar.d(true);
                }
            }
        });
    }

    @Override // defpackage.hov
    public final void b(int i) {
        this.a.aQ(i);
    }

    @Override // defpackage.hov
    public final void c(boolean z) {
        boolean d = jqr.d(this.a.aH, z);
        this.a.aH.setVisibility(true != z ? 4 : 0);
        if (d) {
            hel helVar = this.a;
            if (helVar.aS) {
                hfq a = helVar.bi.a(acsb.c(96650));
                a.h(z);
                a.g();
            }
        }
    }

    @Override // defpackage.hov
    public final void d(boolean z) {
        hdt hdtVar = this.a.ax;
        hdtVar.a();
        hdtVar.c(z, fkc.D(hdtVar.a));
    }
}
