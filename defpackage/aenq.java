package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aenq {
    public final apks a;
    public final ByteBuffer b;

    public aenq(apks apksVar, ByteBuffer byteBuffer) {
        if (apksVar == null) {
            throw new NullPointerException("Null bandwidthModelConfig");
        }
        this.a = apksVar;
        if (byteBuffer != null) {
            this.b = byteBuffer;
            return;
        }
        throw new NullPointerException("Null tfliteModel");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aenq) {
            aenq aenqVar = (aenq) obj;
            if (this.a.equals(aenqVar.a) && this.b.equals(aenqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49 + String.valueOf(valueOf2).length());
        sb.append("ModelConfigs{bandwidthModelConfig=");
        sb.append(valueOf);
        sb.append(", tfliteModel=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public aenq() {
    }
}
