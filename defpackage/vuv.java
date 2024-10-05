package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vuv {
    public Boolean a;
    private Boolean b;
    private Boolean c;
    private Boolean d;

    public final vuw a() {
        Boolean bool = this.b;
        if (bool == null || this.c == null || this.a == null || this.d == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" enableExtractorValidation");
            }
            if (this.c == null) {
                sb.append(" allowMetadataTracks");
            }
            if (this.a == null) {
                sb.append(" allowMultipleVideoTracks");
            }
            if (this.d == null) {
                sb.append(" useShortestTrackForDuration");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new vuw(bool.booleanValue(), this.c.booleanValue(), this.a.booleanValue(), this.d.booleanValue());
    }

    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.d = Boolean.valueOf(z);
    }
}
