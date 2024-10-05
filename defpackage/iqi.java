package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class iqi extends iqw implements axql {
    private volatile axps h;
    private final Object i = new Object();
    public boolean g = false;

    public iqi() {
        addOnContextAvailableListener(new iqh(this));
    }

    @Override // defpackage.zv, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.u(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.axql
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final axps lL() {
        if (this.h == null) {
            synchronized (this.i) {
                if (this.h == null) {
                    this.h = new axps(this);
                }
            }
        }
        return this.h;
    }
}
