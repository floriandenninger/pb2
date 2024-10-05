package com.google.vr.cardboard;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import com.google.vr.ndk.base.SdkConfigurationReader;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.Preferences$UserPrefs;
import defpackage.aomw;
import defpackage.aoob;
import defpackage.awxr;
import defpackage.axfp;
import defpackage.axfq;
import defpackage.axhe;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class VrParamsProviderJni {
    private static void a(long j, DisplayMetrics displayMetrics, float f, int i) {
        nativeUpdateNativeDisplayParamsPointer(j, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.xdpi, displayMetrics.ydpi, f, i);
    }

    private static native void nativeUpdateNativeDisplayParamsPointer(long j, int i, int i2, float f, float f2, float f3, int i3);

    private static byte[] readDeviceParams(Context context) {
        axhe h = awxr.h(context);
        CardboardDevice$DeviceParams b = h.b();
        h.f();
        if (b == null) {
            return null;
        }
        return b.toByteArray();
    }

    private static void readDisplayParams(Context context, long j) {
        int b;
        int c;
        int i = 0;
        if (context == null) {
            Log.w("VrParamsProviderJni", "Missing context for phone params lookup. Results may be invalid.");
            a(j, Resources.getSystem().getDisplayMetrics(), axfq.e(null), 0);
            return;
        }
        axhe h = awxr.h(context);
        Display$DisplayParams d = h.d();
        h.f();
        Display i2 = axfq.i(context);
        DisplayMetrics h2 = axfq.h(i2, d);
        float e = axfq.e(d);
        axfp b2 = axfq.b(i2);
        if (b2 != null) {
            if (context.getResources().getConfiguration().orientation == 1) {
                b = b2.d();
                c = b2.a();
            } else {
                b = b2.b();
                c = b2.c();
            }
            i = c + b;
        }
        a(j, h2, e, i);
    }

    private static byte[] readSdkConfigurationParams(Context context) {
        return SdkConfigurationReader.getParams(context).toByteArray();
    }

    private static byte[] readUserPrefs(Context context) {
        axhe h = awxr.h(context);
        Preferences$UserPrefs e = h.e();
        h.f();
        if (e == null) {
            return null;
        }
        return e.toByteArray();
    }

    private static boolean writeDeviceParams(Context context, byte[] bArr) {
        CardboardDevice$DeviceParams parseFrom;
        axhe h = awxr.h(context);
        if (bArr != null) {
            try {
                try {
                    parseFrom = CardboardDevice$DeviceParams.parseFrom(bArr, aomw.b());
                } catch (aoob e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                    sb.append("Error parsing protocol buffer: ");
                    sb.append(valueOf);
                    Log.w("VrParamsProviderJni", sb.toString());
                    h.f();
                    return false;
                }
            } catch (Throwable th) {
                h.f();
                throw th;
            }
        } else {
            parseFrom = null;
        }
        boolean g = h.g(parseFrom);
        h.f();
        return g;
    }
}
