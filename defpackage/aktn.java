package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aktn {
    public final String a;
    public final avdh b;

    public aktn(String str, avdh avdhVar) {
        this.a = str;
        this.b = avdhVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a != null) {
            sb.append("pcen:");
            sb.append(this.a);
        }
        if (this.b != null) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append("tag:");
            sb.append(this.b.c);
        }
        return sb.toString();
    }
}
