package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kmm extends ContentObserver {
    public static final Uri a = Settings.System.CONTENT_URI;
    private final int b;
    private final int c;
    private final AudioManager d;
    private final aypm e;

    public kmm(Context context, aypm aypmVar) {
        super(new Handler());
        this.e = aypmVar;
        this.c = 3;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.d = audioManager;
        this.b = audioManager.getStreamVolume(3);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        int streamVolume = this.b - this.d.getStreamVolume(this.c);
        if (streamVolume != 0) {
            this.e.d(Integer.valueOf(streamVolume));
        }
    }
}
