package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aigh {
    public final int a;
    public final int b;

    public aigh() {
    }

    public aigh(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    public static aigg a() {
        aigg aiggVar = new aigg();
        aiggVar.b(0);
        aiggVar.b = 1;
        return aiggVar;
    }

    public final atww b() {
        aone createBuilder = atww.a.createBuilder();
        int i = this.a;
        if (i > 0) {
            createBuilder.copyOnWrite();
            atww atwwVar = (atww) createBuilder.instance;
            atwwVar.b |= 1;
            atwwVar.c = i;
        }
        int i2 = this.b;
        if (i2 != 1) {
            createBuilder.copyOnWrite();
            atww atwwVar2 = (atww) createBuilder.instance;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            atwwVar2.d = i3;
            atwwVar2.b |= 2;
        }
        return (atww) createBuilder.build();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aigh)) {
            return false;
        }
        aigh aighVar = (aigh) obj;
        int i = this.b;
        int i2 = aighVar.b;
        if (i != 0) {
            return i == i2 && this.a == aighVar.a;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return ((i ^ 1000003) * 1000003) ^ this.a;
        }
        throw null;
    }

    public final String toString() {
        int i = this.b;
        String num = i != 0 ? Integer.toString(i - 1) : "null";
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(num.length() + 84);
        sb.append("PrefetchPlaybackContextWrapper{prefetchReason=");
        sb.append(num);
        sb.append(", playbackBeginsInSeconds=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
