package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpt implements aala {
    public static final aalb a = new atps();
    public final atpu b;
    private final aakv c;

    public atpt(atpu atpuVar, aakv aakvVar) {
        this.b = atpuVar;
        this.c = aakvVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        amsvVar.j(getActionProtoModel().a());
        return amsvVar.g();
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.b.e;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        return new atpr(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof atpt) && this.b.equals(((atpt) obj).b);
    }

    public atpq getActionProto() {
        atpq atpqVar = this.b.f;
        return atpqVar == null ? atpq.a : atpqVar;
    }

    public atpp getActionProtoModel() {
        atpq atpqVar = this.b.f;
        if (atpqVar == null) {
            atpqVar = atpq.a;
        }
        return atpp.b(atpqVar).f(this.c);
    }

    public List getChildActionIds() {
        return this.b.i;
    }

    public Long getEnqueueTimeNs() {
        atpu atpuVar = this.b;
        return Long.valueOf(atpuVar.c == 11 ? ((Long) atpuVar.d).longValue() : 0L);
    }

    public Long getEnqueueTimeSec() {
        atpu atpuVar = this.b;
        return Long.valueOf(atpuVar.c == 3 ? ((Long) atpuVar.d).longValue() : 0L);
    }

    public Boolean getHasChildActionFailed() {
        return Boolean.valueOf(this.b.m);
    }

    public String getParentActionId() {
        return this.b.h;
    }

    public List getPostreqActionIds() {
        return this.b.k;
    }

    public String getPrereqActionId() {
        return this.b.j;
    }

    public Integer getRetryScheduleIndex() {
        return Integer.valueOf(this.b.l);
    }

    public String getRootActionId() {
        return this.b.g;
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("OfflineOrchestrationActionWrapperEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
