package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class iqg extends iqw implements axql {
    private volatile axps g;
    private final Object h = new Object();
    public boolean x = false;

    public iqg() {
        addOnContextAvailableListener(new iqf(this));
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
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final axps lL() {
        if (this.g == null) {
            synchronized (this.h) {
                if (this.g == null) {
                    this.g = new axps(this);
                }
            }
        }
        return this.g;
    }
}
