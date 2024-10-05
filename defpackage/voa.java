package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class voa extends ml implements axql, axqh {
    private volatile axps a;
    private final Object b = new Object();
    public boolean r = false;

    public voa() {
        addOnContextAvailableListener(new vnz(this));
    }

    @Override // defpackage.zv, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.u(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.axqh
    public final boolean h() {
        return this.r;
    }

    @Override // defpackage.axql
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
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
