package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avjs implements aala {
    public static final aalb a = new avjr();
    public final aakv b;
    public final avjt c;

    public avjs(avjt avjtVar, aakv aakvVar) {
        this.c = avjtVar;
        this.b = aakvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        if (this.c.h.size() > 0) {
            amsvVar.j(this.c.h);
        }
        if (this.c.m.size() > 0) {
            amsvVar.j(this.c.m);
        }
        amxe it = ((amru) getStreamProgressModels()).iterator();
        while (it.hasNext()) {
            amsvVar.j(auyq.a());
        }
        return amsvVar.g();
    }

    @Override // defpackage.aakt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final avjq e() {
        return new avjq(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.c.d;
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof avjs) && this.c.equals(((avjs) obj).c);
    }

    public String getCotn() {
        return this.c.i;
    }

    public Long getEnqueuedTimestampMs() {
        return Long.valueOf(this.c.j);
    }

    public avjp getFailureReason() {
        avjp b = avjp.b(this.c.g);
        return b == null ? avjp.TRANSFER_FAILURE_REASON_UNKNOWN : b;
    }

    public Boolean getIsRefresh() {
        return Boolean.valueOf(this.c.o);
    }

    public atrx getMaximumDownloadQuality() {
        atrx b = atrx.b(this.c.k);
        return b == null ? atrx.UNKNOWN_FORMAT_TYPE : b;
    }

    public String getPreferredAudioTrack() {
        return this.c.l;
    }

    public List getStreamProgress() {
        return this.c.f;
    }

    public List getStreamProgressModels() {
        amrp amrpVar = new amrp();
        Iterator it = this.c.f.iterator();
        while (it.hasNext()) {
            amrpVar.h(auyq.b((auyr) it.next()).e());
        }
        return amrpVar.g();
    }

    public Integer getTransferRetryCount() {
        return Integer.valueOf(this.c.n);
    }

    public avjo getTransferState() {
        avjo b = avjo.b(this.c.e);
        return b == null ? avjo.TRANSFER_STATE_UNKNOWN : b;
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("TransferEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
