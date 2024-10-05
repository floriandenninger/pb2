package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mze {
    public final boolean a;
    public final amru b;
    public final amru c;

    public mze(boolean z, amru amruVar, amru amruVar2) {
        this.a = z;
        if (amruVar == null) {
            throw new NullPointerException("Null invalidInputCommands");
        }
        this.b = amruVar;
        if (amruVar2 != null) {
            this.c = amruVar2;
            return;
        }
        throw new NullPointerException("Null validationErrors");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mze) {
            mze mzeVar = (mze) obj;
            if (this.a == mzeVar.a && amkq.aV(this.b, mzeVar.b) && amkq.aV(this.c, mzeVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 77 + String.valueOf(valueOf2).length());
        sb.append("FormValidationResult{isValid=");
        sb.append(z);
        sb.append(", invalidInputCommands=");
        sb.append(valueOf);
        sb.append(", validationErrors=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public mze() {
    }
}
