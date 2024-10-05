package defpackage;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aru {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.MediaStyle a() {
        return new Notification.MediaStyle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification.MediaStyle b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (iArr != null) {
            e(mediaStyle, iArr);
        }
        if (mediaSessionCompat$Token != null) {
            c(mediaStyle, (MediaSession.Token) mediaSessionCompat$Token.b);
        }
        return mediaStyle;
    }

    static void c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    static void e(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }

    public static String f(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
