package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class gwm extends ml implements axql {
    private volatile axps a;
    private final Object b = new Object();
    public boolean c = false;

    public gwm() {
        addOnContextAvailableListener(new gwl(this));
    }

    @Override // defpackage.axql
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final axps lL() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new axps(this);
                }
            }
        }
        return this.a;
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
