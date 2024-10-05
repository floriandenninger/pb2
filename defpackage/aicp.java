package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aicp {
    public final float a;
    public final float b;
    public final Duration c;

    public aicp(float f, float f2, Duration duration) {
        this.a = f;
        this.b = f2;
        if (duration == null) {
            throw new NullPointerException("Null duration");
        }
        this.c = duration;
    }

    public static aicp a(float f, float f2, Duration duration) {
        boolean z = f >= 0.0f && f <= 1.0f;
        Float valueOf = Float.valueOf(f);
        amkq.J(z, "input is not a valid opacity: %s", valueOf);
        amkq.J(f2 >= 0.0f && f2 <= 1.0f, "input is not a valid opacity: %s", valueOf);
        amkq.J(duration.toMillis() >= 0, "duration is negative: %s", duration);
        return new aicp(f, f2, duration);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aicp) {
            aicp aicpVar = (aicp) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(aicpVar.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(aicpVar.b) && this.c.equals(aicpVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 83);
        sb.append("AlphaAnimationStep{startAlpha=");
        sb.append(f);
        sb.append(", endAlpha=");
        sb.append(f2);
        sb.append(", duration=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public aicp() {
    }
}
