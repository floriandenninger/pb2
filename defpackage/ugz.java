package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ugz {
    public final uiz a;
    public final View.OnClickListener b;
    public final tyo c;

    public ugz() {
    }

    public ugz(tyo tyoVar, uiz uizVar, View.OnClickListener onClickListener, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.c = tyoVar;
        this.a = uizVar;
        this.b = onClickListener;
    }

    public final boolean equals(Object obj) {
        uiz uizVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ugz) {
            ugz ugzVar = (ugz) obj;
            if (this.c.equals(ugzVar.c) && ((uizVar = this.a) != null ? uizVar.equals(ugzVar.a) : ugzVar.a == null) && this.b.equals(ugzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() ^ 1000003) * 1000003;
        uiz uizVar = this.a;
        return ((hashCode ^ (uizVar == null ? 0 : uizVar.hashCode())) * (-721379959)) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.a);
        String valueOf3 = String.valueOf(this.b);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 84 + length2 + "null".length() + String.valueOf(valueOf3).length());
        sb.append("AccountLayer{accountConverter=");
        sb.append(valueOf);
        sb.append(", avatarRetriever=");
        sb.append(valueOf2);
        sb.append(", avatarImageLoader=");
        sb.append("null");
        sb.append(", onAddAccount=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
