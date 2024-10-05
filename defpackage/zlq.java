package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class zlq extends ml implements axql {
    private volatile axps a;
    private final Object b = new Object();
    public boolean m = false;

    public zlq() {
        addOnContextAvailableListener(new zlp(this));
    }

    @Override // defpackage.zv, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.u(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.axql
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
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

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }
}
