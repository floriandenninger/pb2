package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class mbm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static mbm e(ammv ammvVar, ammv ammvVar2, ammv ammvVar3, ammv ammvVar4) {
        return new mbc(ammvVar, ammvVar2, ammvVar3, ammvVar4);
    }

    public abstract ammv a();

    public abstract ammv b();

    public abstract ammv c();

    public abstract ammv d();

    public boolean f() {
        return a().h() || b().h();
    }

    public final String toString() {
        return String.format("{previousSelectedIndex=%s, currentSelectedIndex=%s, previousSelectedLayerableFilterFormData=%s currentSelectedLayerableFilterFormData=%s}", d(), a(), c(), b());
    }
}
