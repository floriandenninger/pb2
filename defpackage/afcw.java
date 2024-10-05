package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afcw extends afdd {
    private final afde a;
    private final long b;
    private final afqu c;
    private final int d;
    private final aflb e;
    private final Object f;

    public afcw(afde afdeVar, long j, afqu afquVar, int i, aflb aflbVar, Object obj) {
        if (afdeVar == null) {
            throw new NullPointerException("Null eventType");
        }
        this.a = afdeVar;
        this.b = j;
        if (afquVar != null) {
            this.c = afquVar;
            this.d = i;
            if (aflbVar != null) {
                this.e = aflbVar;
                this.f = obj;
                return;
            }
            throw new NullPointerException("Null mediaViewType");
        }
        throw new NullPointerException("Null playerType");
    }

    @Override // defpackage.afdd
    public int a() {
        return this.d;
    }

    @Override // defpackage.afdd
    public long b() {
        return this.b;
    }

    @Override // defpackage.afdd
    public afde c() {
        return this.a;
    }

    @Override // defpackage.afdd
    public aflb d() {
        return this.e;
    }

    @Override // defpackage.afdd
    public afqu e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof afdd) {
            afdd afddVar = (afdd) obj;
            if (this.a.equals(afddVar.c()) && this.b == afddVar.b() && this.c.equals(afddVar.e()) && this.d == afddVar.a() && this.e.equals(afddVar.d()) && ((obj2 = this.f) != null ? obj2.equals(afddVar.f()) : afddVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.afdd
    public Object f() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        int hashCode2 = (((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        Object obj = this.f;
        return hashCode2 ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 128 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Event{eventType=");
        sb.append(valueOf);
        sb.append(", elapsedMillis=");
        sb.append(j);
        sb.append(", playerType=");
        sb.append(valueOf2);
        sb.append(", surfaceHashCode=");
        sb.append(i);
        sb.append(", mediaViewType=");
        sb.append(valueOf3);
        sb.append(", additionalInfo=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
