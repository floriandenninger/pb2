package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sev {
    public final sez a;
    public final Executor b;
    public final Executor c;
    public final CronetEngine d;
    public final sbv e;
    private final Executor f;

    public sev(sbv sbvVar, sez sezVar, Executor executor, Executor executor2, Executor executor3, CronetEngine cronetEngine) {
        if (sbvVar == null) {
            throw new NullPointerException("Null API");
        }
        this.e = sbvVar;
        this.a = sezVar;
        if (executor != null) {
            this.f = executor;
            if (executor2 != null) {
                this.b = executor2;
                if (executor3 != null) {
                    this.c = executor3;
                    if (cronetEngine != null) {
                        this.d = cronetEngine;
                        return;
                    }
                    throw new NullPointerException("Null cronetEngine");
                }
                throw new NullPointerException("Null lightweightExecutor");
            }
            throw new NullPointerException("Null backgroundExecutor");
        }
        throw new NullPointerException("Null mainExecutor");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sev) {
            sev sevVar = (sev) obj;
            if (this.e.equals(sevVar.e) && this.a.equals(sevVar.a) && this.f.equals(sevVar.f) && this.b.equals(sevVar.b) && this.c.equals(sevVar.c) && this.d.equals(sevVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.a);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.b);
        String valueOf5 = String.valueOf(this.c);
        String valueOf6 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 104 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("FaceViewerContext{API=");
        sb.append(valueOf);
        sb.append(", model=");
        sb.append(valueOf2);
        sb.append(", mainExecutor=");
        sb.append(valueOf3);
        sb.append(", backgroundExecutor=");
        sb.append(valueOf4);
        sb.append(", lightweightExecutor=");
        sb.append(valueOf5);
        sb.append(", cronetEngine=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }

    public sev() {
    }
}
