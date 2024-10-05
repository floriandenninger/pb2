package defpackage;

import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qpv {
    public final qox a;
    public final Feature b;

    public qpv(qox qoxVar, Feature feature) {
        this.a = qoxVar;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof qpv)) {
            qpv qpvVar = (qpv) obj;
            if (qar.j(this.a, qpvVar.a) && qar.j(this.b, qpvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        qar.l("key", this.a, arrayList);
        qar.l("feature", this.b, arrayList);
        return qar.k(arrayList, this);
    }
}
