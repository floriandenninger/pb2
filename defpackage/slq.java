package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class slq {
    public final Object a;

    public slq() {
    }

    public slq(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof slq)) {
            return false;
        }
        Object obj2 = this.a;
        Object obj3 = ((slq) obj).a;
        if (obj2 == null) {
            return obj3 == null;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.a;
        return (obj == null ? 0 : obj.hashCode()) ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("BottomSheetData{interactionLogger=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
