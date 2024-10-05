package defpackage;

import android.media.MediaMetadataRetriever;
import android.system.Os;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hcr implements Callable {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ hcr(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        if (i == 0) {
            String str = this.a;
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            return extractMetadata == null ? amlr.a : ammv.i(mediaMetadataRetriever.getFrameAtTime(TimeUnit.MILLISECONDS.toMicros(Long.parseLong(extractMetadata)), 3));
        }
        if (i == 1) {
            String str2 = this.a;
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            mediaMetadataRetriever2.setDataSource(str2);
            return mediaMetadataRetriever2.extractMetadata(32) == null ? amlr.a : ammv.i(mediaMetadataRetriever2.getFrameAtIndex(Integer.parseInt(r0) - 1));
        }
        return Os.lstat(this.a);
    }
}
