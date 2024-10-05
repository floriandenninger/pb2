package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ows extends owu {
    private final Integer a;
    private final Object b;
    private final owv c;

    public ows(Integer num, Object obj, owv owvVar) {
        this.a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = obj;
        if (owvVar != null) {
            this.c = owvVar;
            return;
        }
        throw new NullPointerException("Null priority");
    }

    @Override // defpackage.owu
    public owv a() {
        return this.c;
    }

    @Override // defpackage.owu
    public Integer b() {
        return this.a;
    }

    @Override // defpackage.owu
    public Object c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof owu) {
            owu owuVar = (owu) obj;
            Integer num = this.a;
            if (num != null ? num.equals(owuVar.b()) : owuVar.b() == null) {
                if (this.b.equals(owuVar.c()) && this.c.equals(owuVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Event{code=");
        sb.append(valueOf);
        sb.append(", payload=");
        sb.append(valueOf2);
        sb.append(", priority=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public int hashCode() {
        Integer num = this.a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
