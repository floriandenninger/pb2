package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class elj extends vcc implements axql {
    private volatile axps a;
    private final Object b = new Object();

    public elj() {
        addOnContextAvailableListener(new eli(this));
    }

    @Override // defpackage.axql
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final axps lL() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = b();
                }
            }
        }
        return this.a;
    }

    protected axps b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
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
