package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.litho.ComponentHost;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class djl extends dha {
    public SparseArray a;

    public djl() {
        super("HostComponent");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static djl a() {
        return new djl();
    }

    @Override // defpackage.dhk
    protected final int F() {
        return 45;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final dkt I() {
        return doa.m ? new dio() : super.I();
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return new ComponentHost(new dhe(context));
    }

    @Override // defpackage.dhk
    protected final void S(dhe dheVar, Object obj) {
        ((ComponentHost) obj).setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void W(dhe dheVar, Object obj) {
        ComponentHost componentHost = (ComponentHost) obj;
        if (componentHost.isPressed()) {
            componentHost.setPressed(false);
        }
    }

    @Override // defpackage.dhk
    protected final boolean ai(dha dhaVar, dha dhaVar2) {
        return true;
    }

    @Override // defpackage.dhk
    public final int aj() {
        return 3;
    }

    @Override // defpackage.dha
    /* renamed from: e */
    public final boolean f(dha dhaVar) {
        return this == dhaVar;
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }

    @Override // defpackage.dha
    public final SparseArray g() {
        return this.a;
    }

    @Override // defpackage.dha
    public final boolean u() {
        return this.a != null;
    }
}
