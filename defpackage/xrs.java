package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xrs extends xub {
    private final amru a;

    public xrs(amru amruVar) {
        if (amruVar == null) {
            throw new NullPointerException("Null setImages");
        }
        this.a = amruVar;
    }

    @Override // defpackage.xub
    public amru a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xub) {
            return amkq.aV(this.a, ((xub) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("ImagesSetEvent{setImages=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
