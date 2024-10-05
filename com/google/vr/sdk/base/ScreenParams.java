package com.google.vr.sdk.base;

import android.util.DisplayMetrics;
import android.view.Display;
import com.google.vr.sdk.proto.Display$DisplayParams;
import defpackage.axfq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ScreenParams {
    private float borderSizeMeters;
    private int height;
    private int width;
    private float xMetersPerPixel;
    private float yMetersPerPixel;

    public ScreenParams(Display display) {
        DisplayMetrics g = axfq.g(display);
        this.xMetersPerPixel = axfq.f(g.xdpi);
        this.yMetersPerPixel = axfq.f(g.ydpi);
        this.width = g.widthPixels;
        this.height = g.heightPixels;
        this.borderSizeMeters = axfq.e(null);
        int i = this.height;
        int i2 = this.width;
        if (i > i2) {
            this.width = i;
            this.height = i2;
            float f = this.xMetersPerPixel;
            this.xMetersPerPixel = this.yMetersPerPixel;
            this.yMetersPerPixel = f;
        }
    }

    public static ScreenParams fromProto(Display display, Display$DisplayParams display$DisplayParams) {
        if (display$DisplayParams == null) {
            return null;
        }
        ScreenParams screenParams = new ScreenParams(display);
        if (display$DisplayParams.hasXPpi()) {
            screenParams.xMetersPerPixel = axfq.f(display$DisplayParams.getXPpi());
        }
        if (display$DisplayParams.hasYPpi()) {
            screenParams.yMetersPerPixel = axfq.f(display$DisplayParams.getYPpi());
        }
        screenParams.borderSizeMeters = axfq.e(display$DisplayParams);
        return screenParams;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScreenParams)) {
            return false;
        }
        ScreenParams screenParams = (ScreenParams) obj;
        return this.width == screenParams.width && this.height == screenParams.height && this.xMetersPerPixel == screenParams.xMetersPerPixel && this.yMetersPerPixel == screenParams.yMetersPerPixel && this.borderSizeMeters == screenParams.borderSizeMeters;
    }

    public float getBorderSizeMeters() {
        return this.borderSizeMeters;
    }

    public int getHeight() {
        return this.height;
    }

    public float getHeightMeters() {
        return this.height * this.yMetersPerPixel;
    }

    public int getWidth() {
        return this.width;
    }

    public float getWidthMeters() {
        return this.width * this.xMetersPerPixel;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        int i = this.width;
        StringBuilder sb2 = new StringBuilder(22);
        sb2.append("  width: ");
        sb2.append(i);
        sb2.append(",\n");
        sb.append(sb2.toString());
        int i2 = this.height;
        StringBuilder sb3 = new StringBuilder(23);
        sb3.append("  height: ");
        sb3.append(i2);
        sb3.append(",\n");
        sb.append(sb3.toString());
        float f = this.xMetersPerPixel;
        StringBuilder sb4 = new StringBuilder(39);
        sb4.append("  x_meters_per_pixel: ");
        sb4.append(f);
        sb4.append(",\n");
        sb.append(sb4.toString());
        float f2 = this.yMetersPerPixel;
        StringBuilder sb5 = new StringBuilder(39);
        sb5.append("  y_meters_per_pixel: ");
        sb5.append(f2);
        sb5.append(",\n");
        sb.append(sb5.toString());
        float f3 = this.borderSizeMeters;
        StringBuilder sb6 = new StringBuilder(39);
        sb6.append("  border_size_meters: ");
        sb6.append(f3);
        sb6.append(",\n");
        sb.append(sb6.toString());
        sb.append("}");
        return sb.toString();
    }

    public ScreenParams(ScreenParams screenParams) {
        this.width = screenParams.width;
        this.height = screenParams.height;
        this.xMetersPerPixel = screenParams.xMetersPerPixel;
        this.yMetersPerPixel = screenParams.yMetersPerPixel;
        this.borderSizeMeters = screenParams.borderSizeMeters;
    }
}
