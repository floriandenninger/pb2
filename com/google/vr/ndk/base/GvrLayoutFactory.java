package com.google.vr.ndk.base;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.andb;
import defpackage.awxs;
import defpackage.axhd;
import defpackage.axhh;
import defpackage.axia;
import defpackage.axib;
import defpackage.axih;
import defpackage.axii;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GvrLayoutFactory {
    public static axib create(Context context) {
        axib tryCreateFromVrCorePackage = tryCreateFromVrCorePackage(context);
        if (tryCreateFromVrCorePackage != null) {
            return tryCreateFromVrCorePackage;
        }
        if (GvrApi.usingShimLibrary()) {
            throw new IllegalStateException("Client shim failed to load GvrLayout from VrCore.");
        }
        return createFromCurrentPackage(context);
    }

    private static axib createFromCurrentPackage(Context context) {
        return new GvrLayoutImplWrapper(new GvrLayoutImpl(context));
    }

    private static axib tryCreateFromVrCorePackage(Context context) {
        if ("com.google.vr.vrcore".equalsIgnoreCase(context.getPackageName())) {
            return createFromCurrentPackage(context);
        }
        if (context instanceof axhd) {
            throw new IllegalArgumentException("VrContextWrapper only supported within VrCore.");
        }
        if (!GvrApi.usingDynamicLibrary(context)) {
            return null;
        }
        andb params = SdkConfigurationReader.getParams(context);
        if (((params.bitField0_ & 1024) != 0 && params.allowDynamicJavaLibraryLoading_) || GvrApi.usingShimLibrary()) {
            try {
                if (VrCoreUtils.getVrCoreClientApiVersion(context) < 17) {
                    return null;
                }
                try {
                    Context g = awxs.g(context);
                    axii h = awxs.h(context);
                    axih a = ObjectWrapper.a(g);
                    axih a2 = ObjectWrapper.a(context);
                    Parcel pn = h.pn();
                    ecr.i(pn, a);
                    ecr.i(pn, a2);
                    Parcel po = h.po(5, pn);
                    axib asInterface = axia.asInterface(po.readStrongBinder());
                    po.recycle();
                    if (asInterface == null) {
                        Log.w("GvrLayoutFactory", "GvrLayout creation from VrCore failed.");
                    }
                    return asInterface;
                } catch (Exception e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                    sb.append("Failed to load GvrLayout from VrCore:\n  ");
                    sb.append(valueOf);
                    Log.e("GvrLayoutFactory", sb.toString());
                }
            } catch (axhh unused) {
            }
        }
        return null;
    }
}
