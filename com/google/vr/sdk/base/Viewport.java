package com.google.vr.sdk.base;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Viewport {
    public int height;
    public int width;
    public int x;
    public int y;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Viewport)) {
            return false;
        }
        Viewport viewport = (Viewport) obj;
        return this.x == viewport.x && this.y == viewport.y && this.width == viewport.width && this.height == viewport.height;
    }

    public int hashCode() {
        return ((Integer.valueOf(this.x).hashCode() ^ Integer.valueOf(this.y).hashCode()) ^ Integer.valueOf(this.width).hashCode()) ^ Integer.valueOf(this.height).hashCode();
    }

    public void setGLViewport() {
        GLES20.glViewport(this.x, this.y, this.width, this.height);
    }

    public void setViewport(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        int i = this.x;
        StringBuilder sb2 = new StringBuilder(18);
        sb2.append("  x: ");
        sb2.append(i);
        sb2.append(",\n");
        sb.append(sb2.toString());
        int i2 = this.y;
        StringBuilder sb3 = new StringBuilder(18);
        sb3.append("  y: ");
        sb3.append(i2);
        sb3.append(",\n");
        sb.append(sb3.toString());
        int i3 = this.width;
        StringBuilder sb4 = new StringBuilder(22);
        sb4.append("  width: ");
        sb4.append(i3);
        sb4.append(",\n");
        sb.append(sb4.toString());
        int i4 = this.height;
        StringBuilder sb5 = new StringBuilder(23);
        sb5.append("  height: ");
        sb5.append(i4);
        sb5.append(",\n");
        sb.append(sb5.toString());
        sb.append("}");
        return sb.toString();
    }
}
