package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyw implements cyx {
    private final /* synthetic */ int a;

    public cyw(int i) {
        this.a = i;
    }

    @Override // defpackage.cyx
    public final /* synthetic */ void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        int i = this.a;
        if (i == 0) {
            mediaMetadataRetriever.setDataSource(new cyv((ByteBuffer) obj));
        } else if (i == 1) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        } else {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }
    }
}
