package defpackage;

import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aibw {
    public final boolean a;
    public final Duration b;
    public final Optional c;
    public final boolean d;

    public aibw(boolean z, Duration duration, Optional optional, boolean z2) {
        this.a = z;
        if (duration == null) {
            throw new NullPointerException("Null seekDuration");
        }
        this.b = duration;
        this.c = optional;
        this.d = z2;
    }

    public static aibw a(Duration duration) {
        return new aibw(false, duration, Optional.empty(), false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibw) {
            aibw aibwVar = (aibw) obj;
            if (this.a == aibwVar.a && this.b.equals(aibwVar.b) && this.c.equals(aibwVar.c) && this.d == aibwVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true == this.d ? 1231 : 1237);
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        boolean z2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 99 + String.valueOf(valueOf2).length());
        sb.append("ChapterSeekResult{isSeekingToChapterStart=");
        sb.append(z);
        sb.append(", seekDuration=");
        sb.append(valueOf);
        sb.append(", seekText=");
        sb.append(valueOf2);
        sb.append(", isOverlayCentered=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }

    public aibw() {
    }
}
