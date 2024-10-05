package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ytu extends yts {
    public final azrw a;
    public final azrw b;
    public final azrw c;
    public final yry d;
    public volatile transient boolean e;
    public volatile transient whl f;
    private final ynx g;

    public ytu() {
    }

    public ytu(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, ynx ynxVar, yry yryVar) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.g = ynxVar;
        this.d = yryVar;
    }

    @Override // defpackage.yts
    public final ynx a() {
        throw null;
    }

    @Override // defpackage.yts
    public final azrw b() {
        throw null;
    }

    @Override // defpackage.yts
    public final azrw c() {
        throw null;
    }

    @Override // defpackage.yts
    public final azrw d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ytu) {
            ytu ytuVar = (ytu) obj;
            if (this.a.equals(ytuVar.a) && this.b.equals(ytuVar.b) && this.c.equals(ytuVar.c) && this.g.equals(ytuVar.g) && this.d.equals(ytuVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 120 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("CronetHttpClientConfig{cronetEngineProvider=");
        sb.append(valueOf);
        sb.append(", headerDecoratorProvider=");
        sb.append(valueOf2);
        sb.append(", uriRewriter=");
        sb.append(valueOf3);
        sb.append(", commonConfigs=");
        sb.append(valueOf4);
        sb.append(", httpClientConfig=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
