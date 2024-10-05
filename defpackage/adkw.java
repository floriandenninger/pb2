package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum adkw {
    LAUNCH_CAST_FAIL_TIMEOUT(R.string.error_connecting_to_screen, false),
    LAUNCH_FAIL_DEVICE_BUSY(R.string.error_youtube_device_busy, true),
    LAUNCH_FAIL_NEEDS_INSTALL(R.string.error_youtube_tv_needs_install, false),
    LAUNCH_FAIL_TIMEOUT(R.string.error_connecting_to_screen, true),
    LOUNGE_SERVER_CONNECTION_ERROR(R.string.error_connecting_to_screen, true),
    NETWORK(R.string.error_network, true),
    UNPLAYABLE(R.string.error_unplayable_reason_unknown, true),
    UNKNOWN(R.string.mdx_error_generic, false);

    public final int i;
    public final boolean j;

    adkw(int i, boolean z) {
        this.i = i;
        this.j = z;
    }

    @Override // java.lang.Enum
    public final String toString() {
        String name = name();
        boolean z = this.j;
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 35);
        sb.append("RemoteError [name=");
        sb.append(name);
        sb.append(", canRetry=");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }
}
