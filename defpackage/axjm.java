package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axjm {
    public amnv a = amkq.y(null);
    public final amup b = ampf.u();
    public final amsv c = amsx.i();

    public axjm() {
        a(axjo.a(axio.VP8, "OMX.qcom."));
        a(axjo.a(axio.VP9, "OMX.qcom."));
        a(axjo.a(axio.H264, "OMX.qcom."));
        a(axjo.a(axio.H265X, "OMX.qcom."));
        a(axjo.a(axio.VP8, "OMX.Exynos."));
        a(axjo.a(axio.VP9, "OMX.Exynos."));
        a(axjo.a(axio.H264, "OMX.Exynos."));
        a(axjo.a(axio.H265X, "OMX.Exynos."));
        a(axjo.a(axio.VP8, "c2.exynos."));
        a(axjo.a(axio.VP9, "c2.exynos."));
        a(axjo.a(axio.H264, "c2.exynos."));
        a(axjo.a(axio.H265X, "c2.exynos."));
        a(axjo.a(axio.VP8, "OMX.Intel."));
        a(axjo.a(axio.VP8, "OMX.Nvidia."));
    }

    public final void a(axip axipVar) {
        amkq.E(1 == (axipVar.b & 1));
        amkq.E((axipVar.b & 2) != 0);
        amup amupVar = this.b;
        axio b = axio.b(axipVar.c);
        if (b == null) {
            b = axio.UNKNOWN;
        }
        amupVar.p(b, axipVar);
    }
}
