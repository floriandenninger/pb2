package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uya implements Serializable {
    private static final long serialVersionUID = 1;
    public boolean c;
    public boolean e;
    public boolean g;
    public int a = 0;
    public long b = 0;
    public String d = "";
    public boolean f = false;
    public int h = 1;
    public final String i = "";
    private final String j = "";

    public final boolean equals(Object obj) {
        uya uyaVar;
        if (!(obj instanceof uya) || (uyaVar = (uya) obj) == null) {
            return false;
        }
        if (this == uyaVar) {
            return true;
        }
        return this.a == uyaVar.a && this.b == uyaVar.b && this.d.equals(uyaVar.d) && this.f == uyaVar.f && this.h == uyaVar.h && this.i.equals(uyaVar.i) && this.j.equals(uyaVar.j);
    }

    public final int hashCode() {
        return ((((((((((((((((this.a + 2173) * 53) + Long.valueOf(this.b).hashCode()) * 53) + this.d.hashCode()) * 53) + (true != this.f ? 1237 : 1231)) * 53) + this.h) * 53) + this.i.hashCode()) * 53) + 5) * 53) + this.j.hashCode()) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Country Code: ");
        sb.append(this.a);
        sb.append(" National Number: ");
        sb.append(this.b);
        if (this.e && this.f) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.g) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.h);
        }
        if (this.c) {
            sb.append(" Extension: ");
            sb.append(this.d);
        }
        return sb.toString();
    }
}
