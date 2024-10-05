package defpackage;

import android.util.Size;
import android.view.SurfaceHolder;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sdm implements SurfaceHolder.Callback {
    final /* synthetic */ sdo a;

    public sdm(sdo sdoVar) {
        this.a = sdoVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        sdn sdnVar = this.a.e;
        Size size = new Size(i2, i3);
        final scu scuVar = (scu) sdnVar;
        final int rotation = scuVar.a.getDisplay().getRotation();
        if (rotation == 1) {
            rotation = 3;
        } else if (rotation == 3) {
            rotation = 1;
        }
        scv scvVar = scuVar.c;
        Size a = scv.a(size, rotation);
        float width = a.getWidth() / a.getHeight();
        amru amruVar = scvVar.a;
        int size2 = amruVar.size();
        Size size3 = null;
        float f = 1.0f;
        for (int i4 = 0; i4 < size2; i4++) {
            Size size4 = (Size) amruVar.get(i4);
            float width2 = size4.getWidth() / size4.getHeight();
            float abs = Math.abs(width2 - width);
            if (size4.getWidth() >= scvVar.b.getWidth() && size4.getHeight() >= scvVar.b.getHeight() && width2 < 1.8f && (size3 == null || (abs <= f && size4.getWidth() <= size3.getWidth() && size4.getHeight() <= size3.getHeight()))) {
                size3 = size4;
                f = abs;
            }
        }
        if (size3 == null) {
            size3 = scvVar.b;
        }
        final Size a2 = scv.a(size3, rotation);
        scuVar.b(new Runnable() { // from class: scq
            @Override // java.lang.Runnable
            public final void run() {
                scu scuVar2 = scu.this;
                Size size5 = a2;
                int i5 = rotation;
                scuVar2.k = size5;
                scuVar2.m = i5;
            }
        });
        aogf aogfVar = this.a.c;
        int width3 = a2.getWidth();
        int height = a2.getHeight();
        aogfVar.a = width3;
        aogfVar.b = height;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
