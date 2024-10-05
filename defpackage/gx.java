package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gx extends Handler {
    boolean a;
    final /* synthetic */ gy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(gy gyVar, Looper looper) {
        super(looper);
        this.b = gyVar;
        this.a = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.a) {
            switch (message.what) {
                case 1:
                    hn.c(message.getData());
                    return;
                case 2:
                    this.b.b((PlaybackStateCompat) message.obj);
                    return;
                case 3:
                    this.b.a((MediaMetadataCompat) message.obj);
                    return;
                case 4:
                    return;
                case 5:
                    return;
                case 6:
                    return;
                case 7:
                    hn.c((Bundle) message.obj);
                    return;
                case 8:
                    this.b.c();
                    return;
                case 9:
                    ((Integer) message.obj).intValue();
                    return;
                case 10:
                default:
                    return;
                case 11:
                    ((Boolean) message.obj).booleanValue();
                    return;
                case 12:
                    ((Integer) message.obj).intValue();
                    return;
            }
        }
    }
}
