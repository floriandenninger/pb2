package defpackage;

import android.content.res.Resources;
import android.view.ScaleGestureDetector;
import com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vnv extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    final /* synthetic */ EditablePhotoView a;

    public vnv(EditablePhotoView editablePhotoView) {
        this.a = editablePhotoView;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        EditablePhotoView editablePhotoView = this.a;
        float a = editablePhotoView.a();
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        float min = Math.min(Math.max(a * scaleFactor, editablePhotoView.i), editablePhotoView.j) / editablePhotoView.a();
        editablePhotoView.b.postScale(min, min, focusX, focusY);
        editablePhotoView.p.set(editablePhotoView.o);
        editablePhotoView.b.mapRect(editablePhotoView.p);
        float f = editablePhotoView.c.left;
        float f2 = editablePhotoView.c.right;
        float f3 = editablePhotoView.p.left;
        float f4 = editablePhotoView.p.right;
        float f5 = f2 - f;
        float f6 = 0.0f;
        float f7 = f4 - f3 < f5 ? f + ((f5 - (f4 + f3)) / 2.0f) : f3 > f ? f - f3 : f4 < f2 ? f2 - f4 : 0.0f;
        float f8 = editablePhotoView.c.top;
        float f9 = editablePhotoView.c.bottom;
        float f10 = editablePhotoView.p.top;
        float f11 = editablePhotoView.p.bottom;
        float f12 = f9 - f8;
        if (f11 - f10 < f12) {
            f6 = f8 + ((f12 - (f11 + f10)) / 2.0f);
        } else if (f10 > f8) {
            f6 = f8 - f10;
        } else if (f11 < f9) {
            f6 = f9 - f11;
        }
        editablePhotoView.b.postTranslate(f7, f6);
        editablePhotoView.invalidate();
        editablePhotoView.g();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        EditablePhotoView editablePhotoView = this.a;
        editablePhotoView.h = editablePhotoView.g == 2;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        float a;
        EditablePhotoView editablePhotoView = this.a;
        boolean z = editablePhotoView.h;
        editablePhotoView.k = !z;
        if (z) {
            editablePhotoView.r.a(new awns(13).f(), this.a);
        } else {
            editablePhotoView.r.a(tgc.b().f(), this.a);
        }
        EditablePhotoView editablePhotoView2 = this.a;
        Resources resources = editablePhotoView2.getResources();
        Object[] objArr = new Object[1];
        if (axxp.e()) {
            a = this.a.b();
        } else {
            a = this.a.a();
        }
        objArr[0] = Float.valueOf(a);
        editablePhotoView2.setContentDescription(resources.getString(R.string.op3_edit_photo_a11y_label, objArr));
    }
}
