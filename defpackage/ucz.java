package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ucz {
    public final amru a;
    public final int b;

    public ucz() {
    }

    public ucz(int i, amru amruVar) {
        this.b = i;
        this.a = amruVar;
    }

    public static ucz a(List list) {
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            z = true;
        }
        amkq.O(z, "Must provide at least one activity intent.");
        return new ucz(1, amru.o(list));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ucz) {
            ucz uczVar = (ucz) obj;
            if (this.b == uczVar.b) {
                amru amruVar = this.a;
                amru amruVar2 = uczVar.a;
                if (amruVar != null ? amkq.aV(amruVar, amruVar2) : amruVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.b ^ 1000003) * 1000003;
        amru amruVar = this.a;
        return i ^ (amruVar == null ? 0 : amruVar.hashCode());
    }

    public final String toString() {
        String str = this.b != 1 ? "BACKGROUND" : "APP_ACTIVITY";
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(str.length() + 46 + String.valueOf(valueOf).length());
        sb.append("ClickBehavior{behaviorType=");
        sb.append(str);
        sb.append(", activityIntents=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
