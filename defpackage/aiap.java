package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiap {
    public final long a;
    public final aigh b;
    private final boolean c;

    public aiap() {
    }

    public aiap(long j, boolean z, aigh aighVar) {
        this.a = j;
        this.c = z;
        this.b = aighVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiap) {
            aiap aiapVar = (aiap) obj;
            if (this.a == aiapVar.a && this.c == aiapVar.c && this.b.equals(aiapVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.b.hashCode()) * 1000003;
    }

    public final String toString() {
        long j = this.a;
        boolean z = this.c;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 148 + "null".length());
        sb.append("PrefetchPrebufferParameters{mediaDurationMs=");
        sb.append(j);
        sb.append(", enableAutoMediaDuration=");
        sb.append(z);
        sb.append(", prefetchPlaybackContextWrapper=");
        sb.append(valueOf);
        sb.append(", expectedViewport=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }
}
