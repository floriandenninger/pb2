package org.chromium.base;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import defpackage.ayeq;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ApkAssets {
    public static long[] open(String str, String str2) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            try {
                Context context = ayeq.a;
                if (!TextUtils.isEmpty(str2) && BundleUtils.c(context, str2)) {
                    context = BundleUtils.a(context, str2);
                }
                assetFileDescriptor = context.getAssets().openNonAssetFd(str);
                long[] jArr = {assetFileDescriptor.getParcelFileDescriptor().detachFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength()};
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException e) {
                        Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e);
                    }
                }
                return jArr;
            } catch (IOException e2) {
                if (!e2.getMessage().equals("") && !e2.getMessage().equals(str)) {
                    Log.e("ApkAssets", "Error while loading asset " + str + ": " + e2);
                }
                long[] jArr2 = {-1, -1, -1};
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException e3) {
                        Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e3);
                    }
                }
                return jArr2;
            }
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e4) {
                    Log.e("ApkAssets", "Unable to close AssetFileDescriptor", e4);
                }
            }
            throw th;
        }
    }
}
