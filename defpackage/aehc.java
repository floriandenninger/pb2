package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aehc {
    public final aesa a;
    public final PlayerConfigModel b;
    public final afjf c;

    public aehc(aesa aesaVar, PlayerConfigModel playerConfigModel, afjf afjfVar) {
        if (aesaVar == null) {
            throw new NullPointerException("Null qoeLogger");
        }
        this.a = aesaVar;
        if (playerConfigModel != null) {
            this.b = playerConfigModel;
            if (afjfVar != null) {
                this.c = afjfVar;
                return;
            }
            throw new NullPointerException("Null csiAdapter");
        }
        throw new NullPointerException("Null playerConfigModel");
    }

    public static aehc a(aesa aesaVar, PlayerConfigModel playerConfigModel, afjf afjfVar) {
        return new aehc(aesaVar, playerConfigModel, afjfVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aehc) {
            aehc aehcVar = (aehc) obj;
            if (this.a.equals(aehcVar.a) && this.b.equals(aehcVar.b) && this.c.equals(aehcVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("PlaybackMappedData{qoeLogger=");
        sb.append(valueOf);
        sb.append(", playerConfigModel=");
        sb.append(valueOf2);
        sb.append(", csiAdapter=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public aehc() {
    }
}
