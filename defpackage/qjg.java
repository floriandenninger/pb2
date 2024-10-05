package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class qjg extends BasePendingResult {
    private qlb a;
    public final boolean c;
    final /* synthetic */ qjk d;

    public qjg(qjk qjkVar) {
        this(qjkVar, false);
    }

    public static final qjh d(Status status) {
        return new qjf(status, 0);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ qom a(Status status) {
        return d(status);
    }

    public abstract void b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final qlb c() {
        if (this.a == null) {
            this.a = new qje(this);
        }
        return this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjg(qjk qjkVar, boolean z) {
        super((qof) null);
        this.d = qjkVar;
        this.c = z;
    }
}
