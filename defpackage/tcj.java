package defpackage;

import android.graphics.Bitmap;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tcj implements FrameSequenceDrawable.BitmapProvider, ctd {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final FrameSequence b;
    private final ctm c;
    private final LinkedList d = new LinkedList();

    public tcj(FrameSequence frameSequence, ctm ctmVar) {
        this.b = frameSequence;
        this.c = ctmVar;
    }

    @Override // defpackage.ctd
    public final int a() {
        double width = this.b.getWidth() * this.b.getHeight();
        double frameCount = this.b.getFrameCount();
        Double.isNaN(frameCount);
        Double.isNaN(width);
        return (int) (width * ((frameCount * 0.06d) + 16.0d));
    }

    @Override // android.support.rastermill.FrameSequenceDrawable.BitmapProvider
    public final Bitmap acquireBitmap(int i, int i2) {
        return this.c.a(i, i2, a);
    }

    @Override // defpackage.ctd
    public final Class b() {
        return FrameSequenceDrawable.class;
    }

    @Override // defpackage.ctd
    public final /* bridge */ /* synthetic */ Object c() {
        FrameSequenceDrawable frameSequenceDrawable = new FrameSequenceDrawable(this.b, this);
        this.d.add(frameSequenceDrawable);
        return frameSequenceDrawable;
    }

    @Override // defpackage.ctd
    public final void e() {
        while (!this.d.isEmpty()) {
            FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) this.d.poll();
            if (!frameSequenceDrawable.isDestroyed()) {
                frameSequenceDrawable.destroy();
            }
        }
    }

    @Override // android.support.rastermill.FrameSequenceDrawable.BitmapProvider
    public final void releaseBitmap(Bitmap bitmap) {
        this.c.d(bitmap);
    }
}
