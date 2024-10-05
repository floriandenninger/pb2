package defpackage;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agis {
    public static final String[] a = {"video_id", "itag", "storage_id", "merkle_level", "block_index", "digest", "hash_state", "matches_bytes_on_disk"};
    public final agik b;
    public final List c = new ArrayList();

    public agis(agik agikVar) {
        this.b = agikVar;
    }

    public final ContentValues a(agne agneVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("video_id", agneVar.a);
        contentValues.put("itag", Integer.valueOf(agneVar.b));
        contentValues.put("storage_id", agneVar.c);
        contentValues.put("merkle_level", Integer.valueOf(agneVar.d));
        contentValues.put("block_index", Integer.valueOf(agneVar.e));
        contentValues.put("digest", agneVar.f);
        contentValues.put("hash_state", agneVar.g);
        contentValues.put("matches_bytes_on_disk", Boolean.valueOf(agneVar.h));
        return contentValues;
    }
}
