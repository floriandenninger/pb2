package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.google.android.libraries.youtube.edit.common.AutoValue_DeviceLocalFile;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.youtube.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zoj {
    static final amru a = amru.v("_id", "_size", "_data", "_display_name", "duration");
    static final amru b = amru.u("_id", "_size", "_data", "_display_name");
    public static final amru c = amru.w("_id", "_size", "_data", "_display_name", "date_modified", "mime_type");
    static final amru d = amru.x("_id", "_size", "_data", "_display_name", "duration", "date_modified", "mime_type");
    private final ContentResolver e;
    private final Resources f;

    public zoj(Context context) {
        context.getClass();
        this.e = context.getContentResolver();
        this.f = context.getResources();
    }

    private static Uri f(int i) {
        return i(i) ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }

    private final DeviceLocalFile g(Cursor cursor, int i, int i2, int i3, int i4, int i5, int i6) {
        long j;
        long j2 = i2 >= 0 ? cursor.getLong(i2) : 0L;
        String string = i3 >= 0 ? cursor.getString(i3) : "";
        if (TextUtils.isEmpty(string)) {
            if (i(i)) {
                string = this.f.getString(R.string.gallery_video_display_name_default);
            } else {
                string = this.f.getString(R.string.gallery_image_display_name_default);
            }
        }
        long j3 = i4 >= 0 ? cursor.getLong(i4) : 0L;
        String string2 = i5 >= 0 ? cursor.getString(i5) : "";
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        Uri withAppendedId = ContentUris.withAppendedId(f(i), j2);
        long j4 = i6 >= 0 ? cursor.getLong(i6) : 0L;
        File file = new File(string2);
        try {
            j = file.lastModified();
        } catch (SecurityException e) {
            zga.d("Security exception while trying to get last modified timestamp for a file.", e);
            j = 0;
        }
        long j5 = j >= 0 ? j : 0L;
        zoi i7 = DeviceLocalFile.i();
        i7.e(j2);
        i7.h(withAppendedId);
        i7.b(string);
        i7.a = file.getParent();
        i7.g(j3);
        i7.c(j4);
        i7.f(j5);
        i7.d(i);
        return i7.a();
    }

    private final List h(int i) {
        Cursor cursor;
        int i2;
        int i3 = 0;
        try {
            cursor = this.e.query(f(i), i(i) ? (String[]) a.toArray(new String[0]) : (String[]) b.toArray(new String[0]), null, null, null);
        } catch (SQLiteException | IllegalArgumentException | SecurityException e) {
            zga.d("Error while trying to query content resolver for local media.", e);
            cursor = null;
        }
        Cursor cursor2 = cursor;
        if (cursor2 == null) {
            return amru.q();
        }
        amru.q();
        try {
            ArrayList arrayList = new ArrayList();
            try {
                int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("_display_name");
                int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("_size");
                int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("_data");
                if (i == 0) {
                    i2 = cursor2.getColumnIndexOrThrow("duration");
                } else {
                    i3 = i;
                    i2 = -1;
                }
                while (cursor2.moveToNext()) {
                    DeviceLocalFile g = g(cursor2, i3, columnIndexOrThrow, columnIndexOrThrow2, columnIndexOrThrow3, columnIndexOrThrow4, i2);
                    if (g != null && ((AutoValue_DeviceLocalFile) g).b != null && ((AutoValue_DeviceLocalFile) g).c > 0) {
                        arrayList.add(g);
                    }
                }
            } catch (IllegalArgumentException e2) {
                zga.d("Error while trying to get column indexes from cursor.", e2);
            }
            return arrayList;
        } finally {
            cursor2.close();
        }
    }

    private static boolean i(int i) {
        return i == 0;
    }

    public final DeviceLocalFile a(Cursor cursor, int i) {
        if (cursor != null && cursor.moveToFirst()) {
            try {
                return g(cursor, i, cursor.getColumnIndexOrThrow("_id"), cursor.getColumnIndexOrThrow("_display_name"), cursor.getColumnIndexOrThrow("_size"), cursor.getColumnIndexOrThrow("_data"), i == 0 ? cursor.getColumnIndexOrThrow("duration") : -1);
            } catch (IllegalArgumentException e) {
                zga.d("Error while trying to get column indexes from cursor.", e);
            }
        }
        return null;
    }

    public final DeviceLocalFile b() {
        return a(e(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, (String[]) d.toArray(new String[0])), 0);
    }

    public final List c(int i) {
        List h;
        amru.q();
        if (i == 3) {
            h = h(0);
            h.addAll(h(1));
        } else {
            h = h(i);
        }
        Collections.sort(h, unt.g);
        return h;
    }

    public final Map d(int i) {
        HashMap hashMap = new HashMap();
        for (DeviceLocalFile deviceLocalFile : c(i)) {
            String g = deviceLocalFile.g();
            if (!hashMap.containsKey(g)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(deviceLocalFile);
                hashMap.put(g, arrayList);
            } else {
                ((List) hashMap.get(g)).add(deviceLocalFile);
            }
        }
        return hashMap;
    }

    public final Cursor e(Uri uri, String[] strArr) {
        Cursor cursor = null;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Bundle bundle = new Bundle();
                bundle.putString("android:query-arg-sort-columns", "date_modified");
                bundle.putInt("android:query-arg-sort-direction", 1);
                bundle.putInt("android:query-arg-limit", 1);
                cursor = this.e.query(uri, strArr, bundle, null);
            } else {
                ContentResolver contentResolver = this.e;
                StringBuilder sb = new StringBuilder(26);
                sb.append("date_modified");
                sb.append(" DESC");
                sb.append(" LIMIT 1");
                cursor = contentResolver.query(uri, strArr, null, null, sb.toString());
            }
        } catch (SQLiteException | IllegalArgumentException | SecurityException e) {
            zga.d("Error while trying to query content resolver.", e);
        }
        return cursor;
    }
}
