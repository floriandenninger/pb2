package defpackage;

import android.app.Application;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class tes extends ContentObserver {
    public final ContentResolver a;
    public boolean b;
    public double c;
    private final AudioManager d;

    public tes(Application application, Handler handler) {
        super(handler);
        this.d = (AudioManager) application.getSystemService("audio");
        this.a = application.getContentResolver();
    }

    public final double a() {
        int streamMaxVolume = this.d.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0) {
            return 0.0d;
        }
        double streamVolume = this.d.getStreamVolume(3);
        double d = streamMaxVolume;
        Double.isNaN(streamVolume);
        Double.isNaN(d);
        return Math.min(streamVolume / d, 1.0d);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.c = a();
    }
}
