package org.chromium.net.impl;

import android.content.Context;
import defpackage.baic;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class NativeCronetProvider extends CronetProvider {
    public NativeCronetProvider(Context context) {
        super(context);
    }

    @Override // org.chromium.net.CronetProvider
    public final CronetEngine.Builder createBuilder() {
        return new ExperimentalCronetEngine.Builder(new baic(this.mContext));
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof NativeCronetProvider) && this.mContext.equals(((NativeCronetProvider) obj).mContext));
    }

    @Override // org.chromium.net.CronetProvider
    public final String getName() {
        return CronetProvider.PROVIDER_NAME_APP_PACKAGED;
    }

    @Override // org.chromium.net.CronetProvider
    public final String getVersion() {
        return "95.0.4621.2";
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{NativeCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public final boolean isEnabled() {
        return true;
    }
}
