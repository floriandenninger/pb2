package defpackage;

import android.content.Context;
import com.google.vr.sdk.base.HeadsetSelector;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahoe extends ajxo {
    final HeadsetSelector.HeadsetInfo a;

    public ahoe(Context context, HeadsetSelector.HeadsetInfo headsetInfo) {
        super(context, headsetInfo.getDisplayName());
        this.a = headsetInfo;
    }
}
