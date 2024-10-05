package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xrr extends xtz {
    private final amru a;

    public xrr(amru amruVar) {
        if (amruVar == null) {
            throw new NullPointerException("Null removedImages");
        }
        this.a = amruVar;
    }

    @Override // defpackage.xtz
    public amru a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xtz) {
            return amkq.aV(this.a, ((xtz) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("ImagesRemovedEvent{removedImages=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
