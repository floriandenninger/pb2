package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ktb extends kta {
    private final boolean a;
    private final avaz b;
    private final int c;

    public ktb(boolean z, avaz avazVar, int i) {
        this.a = z;
        this.b = avazVar;
        this.c = i;
    }

    @Override // defpackage.kta
    public int a() {
        return this.c;
    }

    @Override // defpackage.kta
    public avaz d() {
        return this.b;
    }

    @Override // defpackage.kta
    public boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kta) {
            kta ktaVar = (kta) obj;
            if (this.a == ktaVar.e() && this.b.equals(ktaVar.d()) && this.c == ktaVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        int i = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 86);
        sb.append("ActionEnabledStateEvent{isEnabled=");
        sb.append(z);
        sb.append(", actionRenderer=");
        sb.append(valueOf);
        sb.append(", animationAction=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
