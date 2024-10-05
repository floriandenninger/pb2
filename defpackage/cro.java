package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cro implements crq {
    private static final String[] a = {"_data"};
    private final ContentResolver b;

    public cro(ContentResolver contentResolver) {
        this.b = contentResolver;
    }

    @Override // defpackage.crq
    public final Cursor a(Uri uri) {
        return this.b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
    }
}
