package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lla {
    public final CharSequence a;
    public final CharSequence b;
    public final amrz c;
    public final amru d;
    public final amru e;

    public lla(CharSequence charSequence, CharSequence charSequence2, amrz amrzVar, amru amruVar, amru amruVar2) {
        this.a = charSequence;
        this.b = charSequence2;
        if (amrzVar == null) {
            throw new NullPointerException("Null summaryValues");
        }
        this.c = amrzVar;
        if (amruVar != null) {
            this.d = amruVar;
            if (amruVar2 != null) {
                this.e = amruVar2;
                return;
            }
            throw new NullPointerException("Null entryValues");
        }
        throw new NullPointerException("Null entries");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lla) {
            lla llaVar = (lla) obj;
            CharSequence charSequence = this.a;
            if (charSequence != null ? charSequence.equals(llaVar.a) : llaVar.a == null) {
                CharSequence charSequence2 = this.b;
                if (charSequence2 != null ? charSequence2.equals(llaVar.b) : llaVar.b == null) {
                    if (this.c.equals(llaVar.c) && amkq.aV(this.d, llaVar.d) && amkq.aV(this.e, llaVar.e)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 76 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("InlineSettingsData{title=");
        sb.append(valueOf);
        sb.append(", summary=");
        sb.append(valueOf2);
        sb.append(", summaryValues=");
        sb.append(valueOf3);
        sb.append(", entries=");
        sb.append(valueOf4);
        sb.append(", entryValues=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = ((charSequence == null ? 0 : charSequence.hashCode()) ^ 1000003) * 1000003;
        CharSequence charSequence2 = this.b;
        return ((((((hashCode ^ (charSequence2 != null ? charSequence2.hashCode() : 0)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public lla() {
    }
}
