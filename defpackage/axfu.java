package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import com.google.vr.ndk.base.SdkConfigurationReader;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParamsList;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.Preferences$UserPrefs;
import com.google.vr.sdk.proto.SdkConfiguration$SdkConfigurationRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axfu implements axhe {
    private static final String a = "axfu";
    private final ContentProviderClient b;
    private final Uri c;
    private final Uri d;
    private final Uri e;
    private final Uri f;
    private final Uri g;

    public axfu(ContentProviderClient contentProviderClient, String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Authority key must be non-null and non-empty");
        }
        this.b = contentProviderClient;
        this.c = awxr.g(str, "device_params");
        this.d = awxr.g(str, "user_prefs");
        this.e = awxr.g(str, "phone_params");
        this.f = awxr.g(str, "sdk_configuration_params");
        this.g = awxr.g(str, "recent_headsets");
    }

    private final aooy h(aoox aooxVar, Uri uri, String str) {
        byte[] i = i(uri, str);
        if (i == null) {
            return null;
        }
        try {
            return aooxVar.mergeFrom(i).build();
        } catch (aoob e) {
            Log.e(a, "Error reading params from ContentProvider", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final byte[] i(android.net.Uri r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            android.content.ContentProviderClient r1 = r7.b     // Catch: java.lang.Throwable -> L53 android.os.RemoteException -> L55 java.lang.IllegalArgumentException -> L57 android.database.CursorIndexOutOfBoundsException -> L59
            r3 = 0
            r5 = 0
            r6 = 0
            r2 = r8
            r4 = r9
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L53 android.os.RemoteException -> L55 java.lang.IllegalArgumentException -> L57 android.database.CursorIndexOutOfBoundsException -> L59
            if (r9 == 0) goto L23
            boolean r1 = r9.moveToFirst()     // Catch: android.os.RemoteException -> L4d java.lang.IllegalArgumentException -> L4f android.database.CursorIndexOutOfBoundsException -> L51 java.lang.Throwable -> L68
            if (r1 == 0) goto L23
            r8 = 0
            byte[] r8 = r9.getBlob(r8)     // Catch: android.os.RemoteException -> L4d java.lang.IllegalArgumentException -> L4f android.database.CursorIndexOutOfBoundsException -> L51 java.lang.Throwable -> L68
            if (r8 != 0) goto L1f
            r9.close()
            return r0
        L1f:
            r9.close()
            return r8
        L23:
            java.lang.String r1 = defpackage.axfu.a     // Catch: android.os.RemoteException -> L4d java.lang.IllegalArgumentException -> L4f android.database.CursorIndexOutOfBoundsException -> L51 java.lang.Throwable -> L68
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: android.os.RemoteException -> L4d java.lang.IllegalArgumentException -> L4f android.database.CursorIndexOutOfBoundsException -> L51 java.lang.Throwable -> L68
            java.lang.String r2 = java.lang.String.valueOf(r8)     // Catch: android.os.RemoteException -> L4d java.lang.IllegalArgumentException -> L4f android.database.CursorIndexOutOfBoundsException -> L51 java.lang.Throwable -> L68
            int r2 = r2.length()     // Catch: android.os.RemoteException -> L4d java.lang.IllegalArgumentException -> L4f android.database.CursorIndexOutOfBoundsException -> L51 java.lang.Throwable -> L68
            int r2 = r2 + 50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L4d java.lang.IllegalArgumentException -> L4f android.database.CursorIndexOutOfBoundsException -> L51 java.lang.Throwable -> L68
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L4d java.lang.IllegalArgumentException -> L4f android.database.CursorIndexOutOfBoundsException -> L51 java.lang.Throwable -> L68
            java.lang.String r2 = "Invalid params result from ContentProvider query: "
            r3.append(r2)     // Catch: android.os.RemoteException -> L4d java.lang.IllegalArgumentException -> L4f android.database.CursorIndexOutOfBoundsException -> L51 java.lang.Throwable -> L68
            r3.append(r8)     // Catch: android.os.RemoteException -> L4d java.lang.IllegalArgumentException -> L4f android.database.CursorIndexOutOfBoundsException -> L51 java.lang.Throwable -> L68
            java.lang.String r8 = r3.toString()     // Catch: android.os.RemoteException -> L4d java.lang.IllegalArgumentException -> L4f android.database.CursorIndexOutOfBoundsException -> L51 java.lang.Throwable -> L68
            android.util.Log.e(r1, r8)     // Catch: android.os.RemoteException -> L4d java.lang.IllegalArgumentException -> L4f android.database.CursorIndexOutOfBoundsException -> L51 java.lang.Throwable -> L68
            if (r9 == 0) goto L4c
            r9.close()
        L4c:
            return r0
        L4d:
            r8 = move-exception
            goto L5b
        L4f:
            r8 = move-exception
            goto L5b
        L51:
            r8 = move-exception
            goto L5b
        L53:
            r8 = move-exception
            goto L6a
        L55:
            r8 = move-exception
            goto L5a
        L57:
            r8 = move-exception
            goto L5a
        L59:
            r8 = move-exception
        L5a:
            r9 = r0
        L5b:
            java.lang.String r1 = defpackage.axfu.a     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "Error reading params from ContentProvider"
            android.util.Log.e(r1, r2, r8)     // Catch: java.lang.Throwable -> L68
            if (r9 == 0) goto L67
            r9.close()
        L67:
            return r0
        L68:
            r8 = move-exception
            r0 = r9
        L6a:
            if (r0 == 0) goto L6f
            r0.close()
        L6f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axfu.i(android.net.Uri, java.lang.String):byte[]");
    }

    @Override // defpackage.axhe
    public final andb a(SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest) {
        return (andb) h(SdkConfigurationReader.DEFAULT_PARAMS.toBuilder(), this.f, Base64.encodeToString(sdkConfiguration$SdkConfigurationRequest.toByteArray(), 0));
    }

    @Override // defpackage.axhe
    public final CardboardDevice$DeviceParams b() {
        return (CardboardDevice$DeviceParams) h(CardboardDevice$DeviceParams.newBuilder(), this.c, null);
    }

    @Override // defpackage.axhe
    public final CardboardDevice$DeviceParamsList c() {
        return (CardboardDevice$DeviceParamsList) h(CardboardDevice$DeviceParamsList.newBuilder(), this.g, null);
    }

    @Override // defpackage.axhe
    public final Display$DisplayParams d() {
        return (Display$DisplayParams) h(Display$DisplayParams.newBuilder(), this.e, null);
    }

    @Override // defpackage.axhe
    public final Preferences$UserPrefs e() {
        return (Preferences$UserPrefs) h(Preferences$UserPrefs.newBuilder(), this.d, null);
    }

    @Override // defpackage.axhe
    public final void f() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.b.close();
        } else {
            this.b.release();
        }
    }

    @Override // defpackage.axhe
    public final boolean g(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        int update;
        Uri uri = this.c;
        try {
            if (cardboardDevice$DeviceParams == null) {
                update = this.b.delete(uri, null, null);
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", cardboardDevice$DeviceParams.toByteArray());
                update = this.b.update(uri, contentValues, null, null);
            }
            return update > 0;
        } catch (RemoteException e) {
            Log.e(a, "Failed to write params to ContentProvider", e);
            return false;
        } catch (SecurityException e2) {
            Log.e(a, "Insufficient permissions to write params to ContentProvider", e2);
            return false;
        }
    }
}
