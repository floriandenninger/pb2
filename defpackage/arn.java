package defpackage;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arn {
    aro a;

    public arn(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.a = new aro(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof arn) {
            return this.a.equals(((arn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public arn(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (!TextUtils.isEmpty(str)) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.a = new aro(str, i, i2, null);
                return;
            } else {
                this.a = new aro(str, i, i2);
                return;
            }
        }
        throw new IllegalArgumentException("packageName should be nonempty");
    }
}
