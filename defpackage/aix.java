package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aix {
    private static final Comparator a = new uo(4);

    public static ajf a(Context context, aiy aiyVar, CancellationSignal cancellationSignal) {
        Cursor cursor;
        Uri withAppendedId;
        int i;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = aiyVar.a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        }
        if (!resolveContentProvider.packageName.equals(aiyVar.b)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + aiyVar.b);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        Collections.sort(arrayList, a);
        List list = aiyVar.d;
        if (list == null) {
            list = ej.j(resources, aiyVar.e);
        }
        int i2 = 0;
        loop1: while (true) {
            cursor = null;
            if (i2 >= list.size()) {
                resolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) list.get(i2));
            Collections.sort(arrayList2, a);
            if (arrayList.size() == arrayList2.size()) {
                while (i < arrayList.size()) {
                    i = Arrays.equals((byte[]) arrayList.get(i), (byte[]) arrayList2.get(i)) ? i + 1 : 0;
                }
                break loop1;
            }
            i2++;
        }
        if (resolveContentProvider == null) {
            return ajf.a(1, null);
        }
        String str2 = resolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        try {
            cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aiyVar.c}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i3 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i4 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    arrayList3.add(new ajg(withAppendedId, i4, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i3));
                }
            }
            return ajf.a(0, (ajg[]) arrayList3.toArray(new ajg[0]));
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
