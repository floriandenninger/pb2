package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class goj {
    private arhn a;
    private aric b;
    private arhr c;
    private arib d;

    public final gok a() {
        aric aricVar;
        arhr arhrVar;
        arib aribVar;
        arhn arhnVar = this.a;
        if (arhnVar == null || (aricVar = this.b) == null || (arhrVar = this.c) == null || (aribVar = this.d) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" inlineAudioControlUIStyle");
            }
            if (this.b == null) {
                sb.append(" inlineScrubbingUIStyle");
            }
            if (this.c == null) {
                sb.append(" inlinePlaybackFullScreenUIStyle");
            }
            if (this.d == null) {
                sb.append(" inlinePlaybackTriggerStyle");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new gok(arhnVar, aricVar, arhrVar, aribVar);
    }

    public final void b(arhn arhnVar) {
        if (arhnVar == null) {
            throw new NullPointerException("Null inlineAudioControlUIStyle");
        }
        this.a = arhnVar;
    }

    public final void c(arhr arhrVar) {
        if (arhrVar == null) {
            throw new NullPointerException("Null inlinePlaybackFullScreenUIStyle");
        }
        this.c = arhrVar;
    }

    public final void d(arib aribVar) {
        if (aribVar == null) {
            throw new NullPointerException("Null inlinePlaybackTriggerStyle");
        }
        this.d = aribVar;
    }

    public final void e(aric aricVar) {
        if (aricVar == null) {
            throw new NullPointerException("Null inlineScrubbingUIStyle");
        }
        this.b = aricVar;
    }
}
