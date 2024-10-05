package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adsf extends acxf implements axql {
    private volatile axps b;
    private final Object c = new Object();
    public boolean a = false;

    public adsf() {
        addOnContextAvailableListener(new adse(this));
    }

    @Override // defpackage.zv, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.u(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.axql
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final axps lL() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = new axps(this);
                }
            }
        }
        return this.b;
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }
}
