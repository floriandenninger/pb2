package com.google.cardboard.sdk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GvrDeviceParamsProvider {
    private static final String DEVICE_PARAMS_SETTING = "device_params";
    private static final String TAG = "GvrDeviceParamsProvider";
    private static final String VRCORE_AUTHORITY = "com.google.vr.vrcore.settings";

    private GvrDeviceParamsProvider() {
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x009e: MOVE (r8 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:43:0x009e */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] readDeviceParams(android.content.Context r9) {
        /*
            java.lang.String r0 = "Error reading params from ContentProvider"
            android.content.ContentResolver r9 = r9.getContentResolver()
            java.lang.String r1 = "com.google.vr.vrcore.settings"
            android.content.ContentProviderClient r9 = r9.acquireContentProviderClient(r1)
            r8 = 0
            if (r9 == 0) goto La8
            android.net.Uri$Builder r2 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L87 android.os.RemoteException -> L89 java.lang.IllegalArgumentException -> L8b android.database.CursorIndexOutOfBoundsException -> L8d
            r2.<init>()     // Catch: java.lang.Throwable -> L87 android.os.RemoteException -> L89 java.lang.IllegalArgumentException -> L8b android.database.CursorIndexOutOfBoundsException -> L8d
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)     // Catch: java.lang.Throwable -> L87 android.os.RemoteException -> L89 java.lang.IllegalArgumentException -> L8b android.database.CursorIndexOutOfBoundsException -> L8d
            android.net.Uri$Builder r1 = r2.authority(r1)     // Catch: java.lang.Throwable -> L87 android.os.RemoteException -> L89 java.lang.IllegalArgumentException -> L8b android.database.CursorIndexOutOfBoundsException -> L8d
            java.lang.String r2 = "device_params"
            android.net.Uri$Builder r1 = r1.path(r2)     // Catch: java.lang.Throwable -> L87 android.os.RemoteException -> L89 java.lang.IllegalArgumentException -> L8b android.database.CursorIndexOutOfBoundsException -> L8d
            android.net.Uri r1 = r1.build()     // Catch: java.lang.Throwable -> L87 android.os.RemoteException -> L89 java.lang.IllegalArgumentException -> L8b android.database.CursorIndexOutOfBoundsException -> L8d
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r9
            r3 = r1
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L87 android.os.RemoteException -> L89 java.lang.IllegalArgumentException -> L8b android.database.CursorIndexOutOfBoundsException -> L8d
            if (r2 == 0) goto L54
            boolean r3 = r2.moveToFirst()     // Catch: android.os.RemoteException -> L81 java.lang.IllegalArgumentException -> L83 android.database.CursorIndexOutOfBoundsException -> L85 java.lang.Throwable -> L9d
            if (r3 == 0) goto L54
            r1 = 0
            byte[] r1 = r2.getBlob(r1)     // Catch: android.os.RemoteException -> L81 java.lang.IllegalArgumentException -> L83 android.database.CursorIndexOutOfBoundsException -> L85 java.lang.Throwable -> L9d
            if (r1 != 0) goto L4d
            java.lang.String r1 = com.google.cardboard.sdk.GvrDeviceParamsProvider.TAG     // Catch: android.os.RemoteException -> L81 java.lang.IllegalArgumentException -> L83 android.database.CursorIndexOutOfBoundsException -> L85 java.lang.Throwable -> L9d
            android.util.Log.e(r1, r0)     // Catch: android.os.RemoteException -> L81 java.lang.IllegalArgumentException -> L83 android.database.CursorIndexOutOfBoundsException -> L85 java.lang.Throwable -> L9d
            r2.close()
            r9.close()
            return r8
        L4d:
            r2.close()
            r9.close()
            return r1
        L54:
            java.lang.String r3 = com.google.cardboard.sdk.GvrDeviceParamsProvider.TAG     // Catch: android.os.RemoteException -> L81 java.lang.IllegalArgumentException -> L83 android.database.CursorIndexOutOfBoundsException -> L85 java.lang.Throwable -> L9d
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: android.os.RemoteException -> L81 java.lang.IllegalArgumentException -> L83 android.database.CursorIndexOutOfBoundsException -> L85 java.lang.Throwable -> L9d
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch: android.os.RemoteException -> L81 java.lang.IllegalArgumentException -> L83 android.database.CursorIndexOutOfBoundsException -> L85 java.lang.Throwable -> L9d
            int r4 = r4.length()     // Catch: android.os.RemoteException -> L81 java.lang.IllegalArgumentException -> L83 android.database.CursorIndexOutOfBoundsException -> L85 java.lang.Throwable -> L9d
            int r4 = r4 + 50
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L81 java.lang.IllegalArgumentException -> L83 android.database.CursorIndexOutOfBoundsException -> L85 java.lang.Throwable -> L9d
            r5.<init>(r4)     // Catch: android.os.RemoteException -> L81 java.lang.IllegalArgumentException -> L83 android.database.CursorIndexOutOfBoundsException -> L85 java.lang.Throwable -> L9d
            java.lang.String r4 = "Invalid params result from ContentProvider query: "
            r5.append(r4)     // Catch: android.os.RemoteException -> L81 java.lang.IllegalArgumentException -> L83 android.database.CursorIndexOutOfBoundsException -> L85 java.lang.Throwable -> L9d
            r5.append(r1)     // Catch: android.os.RemoteException -> L81 java.lang.IllegalArgumentException -> L83 android.database.CursorIndexOutOfBoundsException -> L85 java.lang.Throwable -> L9d
            java.lang.String r1 = r5.toString()     // Catch: android.os.RemoteException -> L81 java.lang.IllegalArgumentException -> L83 android.database.CursorIndexOutOfBoundsException -> L85 java.lang.Throwable -> L9d
            android.util.Log.e(r3, r1)     // Catch: android.os.RemoteException -> L81 java.lang.IllegalArgumentException -> L83 android.database.CursorIndexOutOfBoundsException -> L85 java.lang.Throwable -> L9d
            if (r2 == 0) goto L7d
            r2.close()
        L7d:
            r9.close()
            return r8
        L81:
            r1 = move-exception
            goto L8f
        L83:
            r1 = move-exception
            goto L8f
        L85:
            r1 = move-exception
            goto L8f
        L87:
            r0 = move-exception
            goto L9f
        L89:
            r1 = move-exception
            goto L8e
        L8b:
            r1 = move-exception
            goto L8e
        L8d:
            r1 = move-exception
        L8e:
            r2 = r8
        L8f:
            java.lang.String r3 = com.google.cardboard.sdk.GvrDeviceParamsProvider.TAG     // Catch: java.lang.Throwable -> L9d
            android.util.Log.e(r3, r0, r1)     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto L99
            r2.close()
        L99:
            r9.close()
            return r8
        L9d:
            r0 = move-exception
            r8 = r2
        L9f:
            if (r8 == 0) goto La4
            r8.close()
        La4:
            r9.close()
            throw r0
        La8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cardboard.sdk.GvrDeviceParamsProvider.readDeviceParams(android.content.Context):byte[]");
    }
}
