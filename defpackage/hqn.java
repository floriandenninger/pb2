package defpackage;

import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.CroppedVideoWithPreviewView;
import com.google.android.libraries.youtube.edit.preview.TrimVideoControllerView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hqn extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ hqo a;

    public hqn(hqo hqoVar) {
        this.a = hqoVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        hql hqlVar;
        hqo hqoVar = this.a;
        if (!hqoVar.g || (hqlVar = hqoVar.b) == null) {
            return false;
        }
        hqlVar.a(f);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        String string;
        hql hqlVar = this.a.b;
        if (hqlVar != null) {
            acsc c = acsb.c(97091);
            hqw hqwVar = (hqw) hqlVar;
            jqr jqrVar = hqwVar.aF;
            if (jqrVar != null) {
                jqrVar.a(c).b();
            }
            TrimVideoControllerView trimVideoControllerView = hqwVar.b;
            if (!trimVideoControllerView.h && !hqwVar.a.y) {
                trimVideoControllerView.p();
                hqwVar.aj = !hqwVar.aS();
                CroppedVideoWithPreviewView q = hqwVar.q();
                boolean aS = hqwVar.aS();
                Resources qX = hqwVar.qX();
                if (aS) {
                    string = qX.getString(R.string.shorts_a11y_video_preview_tap_to_pause);
                } else {
                    string = qX.getString(R.string.shorts_a11y_video_preview_tap_to_play);
                }
                q.setContentDescription(string);
            }
        }
        return true;
    }
}
