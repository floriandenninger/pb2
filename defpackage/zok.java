package defpackage;

import android.content.Context;
import android.media.MediaActionSound;
import android.media.MediaMetadataRetriever;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zok {
    public final axpg a;
    private final axpg b;
    private final Context c;
    private long d;

    public zok(axpg axpgVar, axpg axpgVar2, Context context) {
        this.a = axpgVar;
        this.b = axpgVar2;
        this.c = context;
    }

    public final long a() {
        ((MediaActionSound) this.a.get()).play(2);
        long j = this.d;
        if (j > 0) {
            return j;
        }
        this.d = 500L;
        try {
            Uri parse = Uri.parse("/system/media/audio/ui/VideoRecord.ogg");
            MediaMetadataRetriever mediaMetadataRetriever = (MediaMetadataRetriever) this.b.get();
            mediaMetadataRetriever.setDataSource(this.c, parse);
            this.d = Math.max(Long.parseLong(mediaMetadataRetriever.extractMetadata(9)) + 150, 500L);
        } catch (RuntimeException unused) {
        }
        return this.d;
    }
}
