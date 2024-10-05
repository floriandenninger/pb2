package defpackage;

import android.os.Looper;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fmj implements ahto {
    final /* synthetic */ fmt a;

    public fmj(fmt fmtVar) {
        this.a = fmtVar;
    }

    @Override // defpackage.ahto
    public final void b(ahyo ahyoVar) {
        this.a.invalidate();
    }

    @Override // defpackage.ahto
    public final void nr(ahyo ahyoVar, boolean z) {
        if (ahyoVar == ahyo.CHAPTER) {
            this.a.invalidate();
            return;
        }
        if (ahyoVar != ahyo.TIMESTAMP_MARKER) {
            return;
        }
        fmt fmtVar = this.a;
        if (fmtVar.n != z) {
            fmtVar.n = z;
            if (z) {
                fmtVar.i.cancel();
                this.a.i.start();
            }
        }
        this.a.invalidate();
    }

    @Override // defpackage.ahto
    public final void nx(TimelineMarker timelineMarker, final TimelineMarker timelineMarker2, ahyo ahyoVar, int i) {
        if (ahyoVar != ahyo.CHAPTER) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.a.z(timelineMarker2);
        } else {
            this.a.post(new Runnable() { // from class: fmi
                @Override // java.lang.Runnable
                public final void run() {
                    fmj fmjVar = fmj.this;
                    fmjVar.a.z(timelineMarker2);
                }
            });
        }
    }
}
