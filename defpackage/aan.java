package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aan extends aam {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent d(String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // defpackage.aam
    public final /* synthetic */ Intent a(Context context, Object obj) {
        return d((String[]) obj);
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        if (i != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        int length = stringArrayExtra.length;
        for (int i2 = 0; i2 < length; i2++) {
            hashMap.put(stringArrayExtra[i2], Boolean.valueOf(intArrayExtra[i2] == 0));
        }
        return hashMap;
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ clu c(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        if (strArr == null || (strArr.length) == 0) {
            return new clu(Collections.emptyMap());
        }
        adz adzVar = new adz();
        boolean z = true;
        for (String str : strArr) {
            int c = aih.c(context, str);
            boolean z2 = c != 0;
            adzVar.put(str, Boolean.valueOf(c == 0));
            z &= !z2;
        }
        if (z) {
            return new clu(adzVar);
        }
        return null;
    }
}
