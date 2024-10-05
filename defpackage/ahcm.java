package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahcm {
    private final aeqn a;
    private final String b;

    public ahcm(aeqn aeqnVar, String str) {
        this.a = aeqnVar;
        this.b = str;
    }

    public aeqn a() {
        return this.a;
    }

    public String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(valueOf).length());
        sb.append("MediaCuePointEvent cpn=");
        sb.append(str);
        sb.append(", cuepoint=");
        sb.append(valueOf);
        return sb.toString();
    }
}
