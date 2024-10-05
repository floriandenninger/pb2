package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vnw extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ EditablePhotoView a;

    public vnw(EditablePhotoView editablePhotoView) {
        this.a = editablePhotoView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            EditablePhotoView editablePhotoView = this.a;
            if (!editablePhotoView.k) {
                editablePhotoView.r.a(new awns(36).f(), this.a);
            }
        }
        this.a.k = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.a.s.isInProgress() && !this.a.h && Math.abs(motionEvent2.getEventTime() - this.a.l) > axxp.a.get().d()) {
            EditablePhotoView editablePhotoView = this.a;
            editablePhotoView.n = true;
            float f3 = -f;
            float f4 = -f2;
            editablePhotoView.p.set(editablePhotoView.o);
            editablePhotoView.b.mapRect(editablePhotoView.p);
            float f5 = editablePhotoView.c.left;
            float f6 = editablePhotoView.c.right;
            float f7 = editablePhotoView.p.left;
            float f8 = editablePhotoView.p.right;
            float f9 = f6 - f5;
            float max = f8 - f7 < f9 ? f5 + ((f9 - (f8 + f7)) / 2.0f) : Math.max(f6 - f8, Math.min(f5 - f7, f3));
            float f10 = editablePhotoView.c.top;
            float f11 = editablePhotoView.c.bottom;
            float f12 = editablePhotoView.p.top;
            float f13 = editablePhotoView.p.bottom;
            float f14 = f11 - f10;
            editablePhotoView.b.postTranslate(max, f13 - f12 < f14 ? f10 + ((f14 - (f13 + f12)) / 2.0f) : Math.max(f11 - f13, Math.min(f10 - f12, f4)));
            editablePhotoView.invalidate();
            editablePhotoView.g();
        }
        return true;
    }
}
