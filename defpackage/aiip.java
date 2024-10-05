package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiip {
    public final PlaybackStartDescriptor a;
    public final aigd b;
    public final String c;
    public final boolean d;

    public aiip(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar, String str, boolean z) {
        this.a = playbackStartDescriptor;
        if (aigdVar == null) {
            throw new NullPointerException("Null playbackStartParameters");
        }
        this.b = aigdVar;
        this.c = str;
        this.d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aiip a(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar, String str, boolean z) {
        return new aiip(playbackStartDescriptor, aigdVar, str, z);
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiip) {
            aiip aiipVar = (aiip) obj;
            if (this.a.equals(aiipVar.a) && this.b.equals(aiipVar.b) && ((str = this.c) != null ? str.equals(aiipVar.c) : aiipVar.c == null) && this.d == aiipVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return ((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (-1)) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        boolean z = this.d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 150 + String.valueOf(valueOf2).length() + String.valueOf(str).length());
        sb.append("PlayerFetcherDescriptor{playbackStartDescriptor=");
        sb.append(valueOf);
        sb.append(", playbackStartParameters=");
        sb.append(valueOf2);
        sb.append(", cpn=");
        sb.append(str);
        sb.append(", dataExpiredForSeconds=-1, synchronousRequestCreation=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public aiip() {
    }
}
