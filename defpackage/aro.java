package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aro {
    private String a;
    private int b;
    private int c;

    public aro(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public aro(String str, int i, int i2, byte[] bArr) {
        this(str, i, i2);
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aro)) {
            return false;
        }
        aro aroVar = (aro) obj;
        return (this.b < 0 || aroVar.b < 0) ? TextUtils.equals(this.a, aroVar.a) && this.c == aroVar.c : TextUtils.equals(this.a, aroVar.a) && this.b == aroVar.b && this.c == aroVar.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
