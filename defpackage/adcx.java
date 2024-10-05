package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcx {
    public final adle a;

    public adcx() {
    }

    public adcx(adle adleVar) {
        this.a = adleVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static adcw a() {
        return new adcw();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adcx)) {
            return false;
        }
        adle adleVar = this.a;
        adle adleVar2 = ((adcx) obj).a;
        if (adleVar == null) {
            return adleVar2 == null;
        }
        return adleVar.equals(adleVar2);
    }

    public final int hashCode() {
        adle adleVar = this.a;
        return (adleVar == null ? 0 : adleVar.hashCode()) ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
        sb.append("SelectedRouteProperties{initialPlaybackDescriptor=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
