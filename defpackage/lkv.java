package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class lkv extends llz implements axql {
    private volatile axps b;
    private final Object c = new Object();
    public boolean a = false;

    public lkv() {
        addOnContextAvailableListener(new lku(this));
    }

    @Override // defpackage.axql
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final axps lL() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = f();
                }
            }
        }
        return this.b;
    }

    protected axps f() {
        throw null;
    }

    @Override // defpackage.zv, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.u(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }
}
