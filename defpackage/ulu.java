package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ulu extends umc {
    private final qom a;
    private final Status b;

    public ulu(qom qomVar, Status status) {
        if (qomVar != null) {
            this.a = qomVar;
            if (status != null) {
                this.b = status;
                return;
            }
            throw new NullPointerException("Null status");
        }
        throw new NullPointerException("Null result");
    }

    @Override // defpackage.umc
    public final qom a() {
        return this.a;
    }

    @Override // defpackage.umc
    public final Status b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof umc) {
            umc umcVar = (umc) obj;
            if (this.a.equals(umcVar.a()) && this.b.equals(umcVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
