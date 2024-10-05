package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qny extends Exception {
    private final adz a;

    public qny(adz adzVar) {
        this.a = adzVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (qox qoxVar : this.a.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.a.get(qoxVar);
            qip.an(connectionResult);
            z &= !connectionResult.c();
            String a = qoxVar.a();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(a.length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
