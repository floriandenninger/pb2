package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eyp extends eyr {
    private final String a;
    private final aulm b;

    public eyp(String str, aulm aulmVar) {
        if (str == null) {
            throw new NullPointerException("Null sectionId");
        }
        this.a = str;
        if (aulmVar != null) {
            this.b = aulmVar;
            return;
        }
        throw new NullPointerException("Null reloadContinuationData");
    }

    @Override // defpackage.eyr
    public aulm a() {
        return this.b;
    }

    @Override // defpackage.eyr
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eyr) {
            eyr eyrVar = (eyr) obj;
            if (this.a.equals(eyrVar.b()) && this.b.equals(eyrVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + String.valueOf(valueOf).length());
        sb.append("SectionReloadEvent{sectionId=");
        sb.append(str);
        sb.append(", reloadContinuationData=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
