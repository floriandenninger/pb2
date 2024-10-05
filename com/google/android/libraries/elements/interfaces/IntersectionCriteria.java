package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class IntersectionCriteria {
    final boolean isIncreasing;
    final float ratio;

    public IntersectionCriteria(float f, boolean z) {
        this.ratio = f;
        this.isIncreasing = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IntersectionCriteria)) {
            return false;
        }
        IntersectionCriteria intersectionCriteria = (IntersectionCriteria) obj;
        return this.ratio == intersectionCriteria.ratio && this.isIncreasing == intersectionCriteria.isIncreasing;
    }

    public boolean getIsIncreasing() {
        return this.isIncreasing;
    }

    public float getRatio() {
        return this.ratio;
    }

    public int hashCode() {
        return ((Float.floatToIntBits(this.ratio) + 527) * 31) + (this.isIncreasing ? 1 : 0);
    }

    public String toString() {
        float f = this.ratio;
        boolean z = this.isIncreasing;
        StringBuilder sb = new StringBuilder(62);
        sb.append("IntersectionCriteria{ratio=");
        sb.append(f);
        sb.append(",isIncreasing=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
