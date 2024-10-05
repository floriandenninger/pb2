package com.google.vr.sdk.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Distortion {
    private float[] coefficients;
    private static final float[] CARDBOARD_V2_2_COEFFICIENTS = {0.34f, 0.55f};
    private static final float[] CARDBOARD_V1_COEFFICIENTS = {0.441f, 0.156f};

    public Distortion() {
        this.coefficients = (float[]) CARDBOARD_V2_2_COEFFICIENTS.clone();
    }

    public static Distortion parseFromProtobuf(List list) {
        float[] fArr = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            fArr[i] = ((Float) list.get(i)).floatValue();
        }
        Distortion distortion = new Distortion();
        distortion.setCoefficients(fArr);
        return distortion;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Distortion) {
            return Arrays.equals(this.coefficients, ((Distortion) obj).coefficients);
        }
        return false;
    }

    public void setCoefficients(float[] fArr) {
        this.coefficients = fArr != null ? (float[]) fArr.clone() : new float[0];
    }

    public List toProtobufAsList() {
        ArrayList arrayList = new ArrayList(this.coefficients.length);
        int i = 0;
        while (true) {
            float[] fArr = this.coefficients;
            if (i >= fArr.length) {
                return arrayList;
            }
            arrayList.add(Float.valueOf(fArr[i]));
            i++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n  coefficients: [");
        int i = 0;
        while (true) {
            float[] fArr = this.coefficients;
            if (i < fArr.length) {
                sb.append(Float.toString(fArr[i]));
                if (i < this.coefficients.length - 1) {
                    sb.append(", ");
                }
                i++;
            } else {
                sb.append("],\n}");
                return sb.toString();
            }
        }
    }

    public Distortion(Distortion distortion) {
        setCoefficients(distortion.coefficients);
    }
}
