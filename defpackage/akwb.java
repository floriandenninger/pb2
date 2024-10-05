package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akwb {
    public final Context a;
    public final StorageManager b;
    private final ContentResolver c;

    public akwb(Context context) {
        this.a = context;
        this.c = context.getContentResolver();
        this.b = (StorageManager) context.getSystemService("storage");
    }

    public static File b(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
        if (TextUtils.isEmpty(string)) {
            zga.m("StorageVolumeUtil", "Path is null");
            return null;
        }
        return new File(string);
    }

    public static boolean c(Uri uri) {
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 29 && !Environment.isExternalStorageLegacy();
    }

    public static int e(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        if ("unknown".equals(str)) {
            return 4;
        }
        return ("mounted".equals(str) || "mounted_ro".equals(str)) ? 2 : 3;
    }

    public static void f(aone aoneVar, File file, File file2) {
        int e = e(Environment.getExternalStorageState(file));
        aoneVar.copyOnWrite();
        akzt akztVar = (akzt) aoneVar.instance;
        akzt akztVar2 = akzt.a;
        akztVar.d = e - 1;
        akztVar.b |= 2;
        if (e == 2 || e == 3) {
            file2.getAbsolutePath().contains(file.getAbsolutePath());
            String absolutePath = file.getAbsolutePath();
            aoneVar.copyOnWrite();
            akzt akztVar3 = (akzt) aoneVar.instance;
            absolutePath.getClass();
            akztVar3.b |= 4;
            akztVar3.e = absolutePath;
            boolean isExternalStorageRemovable = Environment.isExternalStorageRemovable(file);
            aoneVar.copyOnWrite();
            akzt akztVar4 = (akzt) aoneVar.instance;
            akztVar4.b |= 8;
            akztVar4.f = isExternalStorageRemovable;
        }
    }

    public final Cursor a(Uri uri) {
        long parseId = ContentUris.parseId(uri);
        ContentResolver contentResolver = this.c;
        Uri contentUri = MediaStore.Files.getContentUri("external");
        String[] strArr = new String[1];
        strArr[0] = Build.VERSION.SDK_INT >= 29 ? "volume_name" : "_data";
        Cursor query = contentResolver.query(contentUri, strArr, "_id = ?", new String[]{String.valueOf(parseId)}, null);
        if (query == null) {
            return null;
        }
        if (query.moveToFirst()) {
            return query;
        }
        query.close();
        return null;
    }

    public final void g(aone aoneVar, StorageVolume storageVolume) {
        int e = e(storageVolume.getState());
        aoneVar.copyOnWrite();
        akzt akztVar = (akzt) aoneVar.instance;
        akzt akztVar2 = akzt.a;
        akztVar.d = e - 1;
        akztVar.b |= 2;
        if (e == 2 || e == 3) {
            String uuid = storageVolume.getUuid();
            if (TextUtils.isEmpty(uuid)) {
                uuid = storageVolume.getDescription(this.a);
            }
            aoneVar.copyOnWrite();
            akzt akztVar3 = (akzt) aoneVar.instance;
            uuid.getClass();
            akztVar3.b |= 4;
            akztVar3.e = uuid;
            boolean isRemovable = storageVolume.isRemovable();
            aoneVar.copyOnWrite();
            akzt akztVar4 = (akzt) aoneVar.instance;
            akztVar4.b |= 8;
            akztVar4.f = isRemovable;
        }
    }
}
