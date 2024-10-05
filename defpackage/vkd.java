package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vkd {
    private final tcm a;

    public vkd() {
    }

    public vkd(tcm tcmVar) {
        this.a = tcmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vkd) {
            return this.a.equals(((vkd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("PhotoPickerFifeModel{fifeModel=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
