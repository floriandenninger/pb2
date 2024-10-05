package com.google.vr.sdk.base;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ImplementationSelector {
    public static CardboardViewApi createCardboardViewApi(Context context) {
        return new CardboardViewNativeImpl(context);
    }
}
