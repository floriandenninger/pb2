package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajag {
    public azrw a;
    public String b;
    public aryi c;
    public apxf d;
    public arya e;
    public atxz f;

    public final ajah a() {
        String str;
        azrw azrwVar = this.a;
        if (azrwVar == null || (str = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" isDeadProvider");
            }
            if (this.b == null) {
                sb.append(" videoId");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ajah(azrwVar, str, this.c, this.d, this.e, this.f);
    }
}
