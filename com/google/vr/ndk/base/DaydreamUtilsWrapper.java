package com.google.vr.ndk.base;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import defpackage.axfq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DaydreamUtilsWrapper {
    public DaydreamCompatibility getComponentDaydreamCompatibility(Context context) {
        ComponentName l = axfq.l(context);
        if (l != null) {
            return DaydreamUtils.getComponentDaydreamCompatibility(context, l);
        }
        return new DaydreamCompatibility();
    }

    public boolean isDaydreamActivity(Activity activity) {
        return isDaydreamComponent(activity);
    }

    public boolean isDaydreamComponent(Context context) {
        return getComponentDaydreamCompatibility(context).supportsDaydream();
    }

    public boolean isDaydreamPhone(Context context) {
        return DaydreamUtils.isDaydreamPhone(context);
    }

    public boolean isDaydreamRequiredComponent(Context context) {
        return getComponentDaydreamCompatibility(context).requiresDaydream();
    }
}
