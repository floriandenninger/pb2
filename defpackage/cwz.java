package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwz implements ImageDecoder.OnHeaderDecodedListener {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ cpw d;
    final /* synthetic */ cxu e;
    final /* synthetic */ cqo f;
    final /* synthetic */ cxa g;

    public cwz(cxa cxaVar, int i, int i2, boolean z, cpw cpwVar, cxu cxuVar, cqo cqoVar) {
        this.g = cxaVar;
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = cpwVar;
        this.e = cxuVar;
        this.f = cqoVar;
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.g.a.c(this.a, this.b, this.c, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == cpw.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new cwy());
        Size size = imageInfo.getSize();
        int i = this.a;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.b;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float a = this.e.a(size.getWidth(), size.getHeight(), i, i2);
        imageDecoder.setTargetSize(Math.round(size.getWidth() * a), Math.round(a * size.getHeight()));
        if (this.f != null) {
            if (Build.VERSION.SDK_INT < 28) {
                if (Build.VERSION.SDK_INT >= 26) {
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                    return;
                }
                return;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get((this.f == cqo.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
