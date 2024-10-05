package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ubn {
    public final String a;
    public final boolean b;

    public ubn() {
    }

    public ubn(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final aogy a() {
        aone createBuilder = aogy.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        aogy aogyVar = (aogy) createBuilder.instance;
        str.getClass();
        aogyVar.b |= 1;
        aogyVar.c = str;
        int i = true != this.b ? 2 : 3;
        createBuilder.copyOnWrite();
        aogy aogyVar2 = (aogy) createBuilder.instance;
        aogyVar2.d = i - 1;
        aogyVar2.b |= 2;
        return (aogy) createBuilder.build();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ubn) {
            ubn ubnVar = (ubn) obj;
            if (this.a.equals(ubnVar.a) && this.b == ubnVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
        sb.append("ChimeNotificationChannelGroup{id=");
        sb.append(str);
        sb.append(", blocked=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
