package com.google.vr.sdk.base;

import android.opengl.Matrix;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FieldOfView {
    private float bottom;
    private float left;
    private float right;
    private float top;

    public FieldOfView() {
        this.left = 60.0f;
        this.right = 60.0f;
        this.bottom = 60.0f;
        this.top = 60.0f;
    }

    public FieldOfView(float f, float f2, float f3, float f4) {
        setAngles(f, f2, f3, f4);
    }

    public static FieldOfView parseFromProtobuf(List list) {
        if (list.size() != 4) {
            return null;
        }
        return new FieldOfView(((Float) list.get(0)).floatValue(), ((Float) list.get(1)).floatValue(), ((Float) list.get(2)).floatValue(), ((Float) list.get(3)).floatValue());
    }

    public void copy(FieldOfView fieldOfView) {
        this.left = fieldOfView.left;
        this.right = fieldOfView.right;
        this.bottom = fieldOfView.bottom;
        this.top = fieldOfView.top;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldOfView)) {
            return false;
        }
        FieldOfView fieldOfView = (FieldOfView) obj;
        return this.left == fieldOfView.left && this.right == fieldOfView.right && this.bottom == fieldOfView.bottom && this.top == fieldOfView.top;
    }

    public float getBottom() {
        return this.bottom;
    }

    public float getLeft() {
        return this.left;
    }

    public float getRight() {
        return this.right;
    }

    public float getTop() {
        return this.top;
    }

    public void setAngles(float f, float f2, float f3, float f4) {
        this.left = f;
        this.right = f2;
        this.bottom = f3;
        this.top = f4;
    }

    public void toPerspectiveMatrix(float f, float f2, float[] fArr, int i) {
        if (fArr.length < 16) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        Matrix.frustumM(fArr, 0, ((float) (-Math.tan(Math.toRadians(this.left)))) * 0.1f, ((float) Math.tan(Math.toRadians(this.right))) * 0.1f, ((float) (-Math.tan(Math.toRadians(this.bottom)))) * 0.1f, ((float) Math.tan(Math.toRadians(this.top))) * 0.1f, 0.1f, 20000.0f);
    }

    public List toProtobufAsList() {
        return Arrays.asList(Float.valueOf(this.left), Float.valueOf(this.right), Float.valueOf(this.bottom), Float.valueOf(this.top));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        float f = this.left;
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("  left: ");
        sb2.append(f);
        sb2.append(",\n");
        sb.append(sb2.toString());
        float f2 = this.right;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("  right: ");
        sb3.append(f2);
        sb3.append(",\n");
        sb.append(sb3.toString());
        float f3 = this.bottom;
        StringBuilder sb4 = new StringBuilder(27);
        sb4.append("  bottom: ");
        sb4.append(f3);
        sb4.append(",\n");
        sb.append(sb4.toString());
        float f4 = this.top;
        StringBuilder sb5 = new StringBuilder(24);
        sb5.append("  top: ");
        sb5.append(f4);
        sb5.append(",\n");
        sb.append(sb5.toString());
        sb.append("}");
        return sb.toString();
    }

    public FieldOfView(FieldOfView fieldOfView) {
        copy(fieldOfView);
    }
}
