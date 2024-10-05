package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zif extends ContentObserver {
    public static final Uri a = Settings.System.CONTENT_URI;
    public final ContentResolver b;
    public final Handler c;
    public final AtomicInteger d;
    public Integer e;
    public anhy f;
    private final AudioManager g;

    public zif(Context context, Handler handler) {
        super(handler);
        this.d = new AtomicInteger();
        this.g = (AudioManager) context.getSystemService("audio");
        this.b = context.getContentResolver();
        this.c = handler;
    }

    public final synchronized void a() {
        this.e = Integer.valueOf(this.g.getStreamVolume(3));
    }

    @Override // android.database.ContentObserver
    public final synchronized void onChange(boolean z) {
        a();
    }
}
