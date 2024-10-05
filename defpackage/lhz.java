package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class lhz extends ml implements axql {
    private volatile axps b;
    private final Object c = new Object();
    public boolean a = false;

    public lhz() {
        addOnContextAvailableListener(new lhy(this));
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
    /* renamed from: ok, reason: merged with bridge method [inline-methods] */
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
}
