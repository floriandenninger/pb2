package org.chromium.base;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import defpackage.ayeq;
import defpackage.badx;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ContentUriUtils {
    private static final Object a = new Object();

    private ContentUriUtils() {
    }

    private static AssetFileDescriptor a(String str) {
        ContentResolver contentResolver = ayeq.a.getContentResolver();
        Uri parse = Uri.parse(str);
        try {
            if (c(parse)) {
                String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
                if (streamTypes != null && streamTypes.length > 0) {
                    AssetFileDescriptor openTypedAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(parse, streamTypes[0], null);
                    if (openTypedAssetFileDescriptor == null || openTypedAssetFileDescriptor.getStartOffset() == 0) {
                        return openTypedAssetFileDescriptor;
                    }
                    try {
                        openTypedAssetFileDescriptor.close();
                    } catch (IOException unused) {
                    }
                    throw new SecurityException("Cannot open files with non-zero offset type.");
                }
            } else {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
                if (openFileDescriptor != null) {
                    return new AssetFileDescriptor(openFileDescriptor, 0L, -1L);
                }
            }
        } catch (Exception e) {
            badx.f("ContentUriUtils", "Cannot open content uri: %s", str, e);
        }
        return null;
    }

    private static boolean b(Cursor cursor) {
        int columnIndex;
        return Build.VERSION.SDK_INT >= 24 && (columnIndex = cursor.getColumnIndex("flags")) >= 0 && (cursor.getLong(columnIndex) & 512) != 0;
    }

    private static boolean c(Uri uri) {
        if (uri != null && DocumentsContract.isDocumentUri(ayeq.a, uri)) {
            try {
                Cursor query = ayeq.a.getContentResolver().query(uri, null, null, null, null);
                if (query != null) {
                    try {
                        if (query.getCount() > 0) {
                            query.moveToFirst();
                            boolean b = b(query);
                            query.close();
                            return b;
                        }
                    } finally {
                        try {
                            query.close();
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (query != null) {
                }
            } catch (NullPointerException unused2) {
            }
        }
        return false;
    }

    public static boolean contentUriExists(String str) {
        AssetFileDescriptor a2 = a(str);
        boolean z = a2 != null;
        if (a2 != null) {
            try {
                a2.close();
            } catch (IOException unused) {
            }
        }
        return z;
    }

    public static boolean delete(String str) {
        return ayeq.a.getContentResolver().delete(Uri.parse(str), null, null) > 0;
    }

    public static String getContentUriFromFilePath(String str) {
        try {
            new File(str);
            synchronized (a) {
            }
            return null;
        } catch (IllegalArgumentException e) {
            badx.d("ContentUriUtils", "Cannot retrieve content uri from file: %s", str, e);
            return null;
        }
    }

    public static String getMimeType(String str) {
        ContentResolver contentResolver = ayeq.a.getContentResolver();
        Uri parse = Uri.parse(str);
        if (c(parse)) {
            String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
            if (streamTypes == null || streamTypes.length <= 0) {
                return null;
            }
            return streamTypes[0];
        }
        return contentResolver.getType(parse);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0072, code lost:
    
        if (r0 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String maybeGetDisplayName(java.lang.String r12) {
        /*
            android.net.Uri r6 = android.net.Uri.parse(r12)
            r7 = 0
            r8 = 0
            android.content.Context r0 = defpackage.ayeq.a     // Catch: java.lang.Exception -> L7d
            java.lang.String r9 = "_display_name"
            java.lang.String r10 = ""
            if (r6 != 0) goto Lf
            goto L75
        Lf:
            android.content.ContentResolver r11 = r0.getContentResolver()     // Catch: java.lang.Exception -> L7d
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r11
            r1 = r6
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.NullPointerException -> L75 java.lang.Exception -> L7d
            if (r0 == 0) goto L72
            int r1 = r0.getCount()     // Catch: java.lang.Throwable -> L6d
            if (r1 <= 0) goto L72
            r0.moveToFirst()     // Catch: java.lang.Throwable -> L6d
            int r1 = r0.getColumnIndex(r9)     // Catch: java.lang.Throwable -> L6d
            r2 = -1
            if (r1 != r2) goto L33
        L2f:
            r0.close()     // Catch: java.lang.NullPointerException -> L75 java.lang.Exception -> L7d
            goto L75
        L33:
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L6d
            boolean r2 = b(r0)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L68
        */
        //  java.lang.String r2 = "*/*"
        /*
            java.lang.String[] r2 = r11.getStreamTypes(r6, r2)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L68
            int r3 = r2.length     // Catch: java.lang.Throwable -> L6d
            if (r3 <= 0) goto L68
            android.webkit.MimeTypeMap r3 = android.webkit.MimeTypeMap.getSingleton()     // Catch: java.lang.Throwable -> L6d
            r2 = r2[r8]     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = r3.getExtensionFromMimeType(r2)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L68
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r3.<init>()     // Catch: java.lang.Throwable -> L6d
            r3.append(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "."
            r3.append(r1)     // Catch: java.lang.Throwable -> L6d
            r3.append(r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L6d
        L68:
            r0.close()     // Catch: java.lang.NullPointerException -> L75 java.lang.Exception -> L7d
            r10 = r1
            goto L75
        L6d:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L71
        L71:
            throw r1     // Catch: java.lang.NullPointerException -> L75 java.lang.Exception -> L7d
        L72:
            if (r0 == 0) goto L75
            goto L2f
        L75:
            boolean r12 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> L7d
            if (r12 == 0) goto L7c
            return r7
        L7c:
            return r10
        L7d:
            r0 = move-exception
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r8] = r12
            r12 = 1
            r1[r12] = r0
            java.lang.String r12 = "ContentUriUtils"
            java.lang.String r0 = "Cannot open content uri: %s"
            defpackage.badx.f(r12, r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.ContentUriUtils.maybeGetDisplayName(java.lang.String):java.lang.String");
    }

    public static int openContentUriForRead(String str) {
        AssetFileDescriptor a2 = a(str);
        if (a2 != null) {
            return a2.getParcelFileDescriptor().detachFd();
        }
        return -1;
    }
}
