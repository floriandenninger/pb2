package defpackage;

import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.view.MenuItem;
import android.view.View;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class hm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(MediaSession.QueueItem queueItem) {
        return queueItem.getQueueId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MediaDescription b(MediaSession.QueueItem queueItem) {
        return queueItem.getDescription();
    }

    @Deprecated
    public static View c(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static long e(ByteBuffer byteBuffer) {
        return byteBuffer.getInt() & 4294967295L;
    }

    public static void f(int i, ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + i);
    }

    public void d() {
    }
}
