package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uts {
    public Float a;
    public int b;

    public final utt a() {
        Float f;
        int i = this.b;
        if (i == 0 || (f = this.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == 0) {
                sb.append(" enablement");
            }
            if (this.a == null) {
                sb.append(" samplingProbability");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        utt uttVar = new utt(i, f.floatValue());
        float f2 = uttVar.a;
        boolean z = false;
        if (f2 >= 0.0f && f2 <= 1.0f) {
            z = true;
        }
        amkq.O(z, "Probability shall be between 0 and 1.");
        return uttVar;
    }

    public final void b(boolean z) {
        this.b = true != z ? 2 : 3;
    }

    public final uqf c() {
        Float f;
        int i = this.b;
        if (i == 0 || (f = this.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == 0) {
                sb.append(" enablement");
            }
            if (this.a == null) {
                sb.append(" startupSamplePercentage");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        uqf uqfVar = new uqf(i, f.floatValue());
        float f2 = uqfVar.a;
        boolean z = false;
        if (f2 > 0.0f && f2 <= 100.0f) {
            z = true;
        }
        amkq.F(z, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        return uqfVar;
    }

    public final void d(float f) {
        this.a = Float.valueOf(f);
    }

    public final void e(boolean z) {
        this.b = true != z ? 2 : 3;
    }
}
