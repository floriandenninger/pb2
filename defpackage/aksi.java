package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum aksi {
    BATTERY_SAMPLING("batteryCapturerSamplingCounter", abxm.m, aksh.b),
    SCROLL_TRACKER_SAMPLING("scroll_tracker_when_to_sample_counter", abxm.p, afrl.r),
    ELEMENT_PERF_SAMPLING("element_performance_metric_sample", abxm.n, aksh.a),
    STREAMZ_DEFAULT_IMAGE_CLIENT_SAMPLING("streamz_default_image_client", abxm.q, afrl.s),
    STREAMZ_SIZED_IMAGE_CLIENT_SAMPLING("streamz_sized_image_client", abxm.s, afrl.u),
    STREAMZ_GLIDE_SAMPLING("streamz_glide_image_manager", abxm.r, afrl.t),
    NETWORK_BASELINE_SAMPLING("network_baseline_sampling_key", abxm.o, aksh.c);

    public final String h;
    public final ykq i;
    public final ykr j;

    aksi(String str, ykq ykqVar, ykr ykrVar) {
        this.h = str;
        this.i = ykqVar;
        this.j = ykrVar;
    }
}
