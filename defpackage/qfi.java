package defpackage;

import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qfi {
    public final long a;
    private final int b = 0;
    private final boolean c = false;
    private final JSONObject d = null;

    public qfi(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfi)) {
            return false;
        }
        qfi qfiVar = (qfi) obj;
        if (this.a == qfiVar.a) {
            int i = qfiVar.b;
            boolean z = qfiVar.c;
            JSONObject jSONObject = qfiVar.d;
            if (qar.j(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), 0, false, null});
    }
}
