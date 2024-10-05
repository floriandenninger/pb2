package defpackage;

import com.google.android.odml.image.ImageProperties;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aloc extends ImageProperties {
    private final int a;
    private final int b;

    public aloc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageProperties) {
            ImageProperties imageProperties = (ImageProperties) obj;
            if (this.a == imageProperties.a() && this.b == imageProperties.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(65);
        sb.append("ImageProperties{imageFormat=");
        sb.append(i);
        sb.append(", storageType=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
