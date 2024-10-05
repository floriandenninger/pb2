package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aexy extends aexz {
    public final int a;
    public final String b;
    public final int c;
    private final pms d;
    private volatile transient asi e;
    private volatile transient bel f;

    public aexy(int i, int i2, pms pmsVar, String str) {
        if (i == 0) {
            throw new NullPointerException("Null trackRendererType");
        }
        this.c = i;
        this.a = i2;
        this.d = pmsVar;
        this.b = str;
    }

    @Override // defpackage.aexz
    public final int a() {
        return this.a;
    }

    @Override // defpackage.aexz
    public final pms b() {
        return this.d;
    }

    @Override // defpackage.aexz
    public final String c() {
        return this.b;
    }

    @Override // defpackage.aexz
    public final int d() {
        return this.c;
    }

    @Override // defpackage.aexz
    public final asi e() {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = new asi(this.d);
                    if (this.e == null) {
                        throw new NullPointerException("trackGroup() cannot return null");
                    }
                }
            }
        }
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aexz) {
            aexz aexzVar = (aexz) obj;
            if (this.c == aexzVar.d() && this.a == aexzVar.a() && this.d.equals(aexzVar.b()) && ((str = this.b) != null ? str.equals(aexzVar.c()) : aexzVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aexz
    public final bel f() {
        if (this.f == null) {
            synchronized (this) {
                if (this.f == null) {
                    this.f = new bem(e());
                    if (this.f == null) {
                        throw new NullPointerException("trackSelection() cannot return null");
                    }
                }
            }
        }
        return this.f;
    }

    public final int hashCode() {
        int hashCode = (((((this.c ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.d.hashCode()) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String K = adyu.K(this.c);
        int i = this.a;
        String valueOf = String.valueOf(this.d);
        String str = this.b;
        int length = K.length();
        StringBuilder sb = new StringBuilder(length + 94 + String.valueOf(valueOf).length() + String.valueOf(str).length());
        sb.append("FormatAndRendererInformation{trackRendererType=");
        sb.append(K);
        sb.append(", rendererIndex=");
        sb.append(i);
        sb.append(", format=");
        sb.append(valueOf);
        sb.append(", trackId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
