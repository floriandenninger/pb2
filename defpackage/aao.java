package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aao extends aam {
    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        return aan.d(new String[]{(String) obj});
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        int[] intArrayExtra;
        if (intent == null || i != -1 || (intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS")) == null || intArrayExtra.length == 0) {
            return false;
        }
        return Boolean.valueOf(intArrayExtra[0] == 0);
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ clu c(Context context, Object obj) {
        String str = (String) obj;
        if (str == null) {
            return new clu(false);
        }
        if (aih.c(context, str) != 0) {
            return null;
        }
        return new clu(true);
    }
}
