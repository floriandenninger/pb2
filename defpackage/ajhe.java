package defpackage;

import android.text.TextUtils;
import java.util.EnumMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajhe {
    private static final amru N;
    private static final amru O;
    private static final amru P;
    private static final amru Q;
    private static final amru R;
    public static final amru a;
    public static final Map b;
    public final boolean A;
    public final float B;
    public final boolean C;
    public final boolean D;
    public final int E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final float f60J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    private final amrz S;
    private final boolean T;
    private final int U;
    private final boolean V;
    private final boolean W;
    private final boolean X;
    public final int c;
    public final int d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final float i;
    public final String j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        ajho a2 = ajho.a(1, ajgu.g, ajgy.j, ajgs.k);
        ajho a3 = ajho.a(false, ajgt.b, ajgx.t, ajgs.d);
        ajho a4 = ajho.a(false, ajgu.c, ajgy.b, ajgs.f);
        ajho a5 = ajho.a(false, ajgt.l, ajgx.u, ajgs.e);
        ajho a6 = ajho.a(false, ajgt.q, ajgy.d, ajgs.i);
        ajho a7 = ajho.a(4, ajgu.i, ajgy.c, ajgs.h);
        ajho a8 = ajho.a(false, ajgt.m, ajgy.a, ajgs.g);
        ajho a9 = ajho.a(false, ajgt.a, ajgy.e, ajgs.j);
        ajho a10 = ajho.a(false, ajgt.u, ajgx.r, ajgs.a);
        ajho a11 = ajho.a(false, ajgt.n, ajgx.j, ajgz.e);
        ajho a12 = ajho.a(true, ajgt.i, ajgy.k, ajgs.p);
        ajho a13 = ajho.a(false, ajgt.t, ajgx.o, ajgz.j);
        Float valueOf = Float.valueOf(0.0f);
        N = amru.A(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, ajho.a(false, ajgt.o, ajgx.k, ajgz.f), ajho.a(Float.valueOf(4.0f), ajgu.d, ajgx.b, ajgs.q), ajho.a(false, ajgt.s, ajgx.n, ajgz.i), ajho.a(false, ajgt.p, ajgx.l, ajgz.g), ajho.a(0, ajgu.j, ajgx.h, ajgz.c), ajho.a(true, ajgu.b, ajgx.p, ajgz.k), ajho.a(true, ajgt.j, ajgx.e, ajgs.u), ajho.a(true, ajgt.r, ajgx.m, ajgz.h), ajho.a(true, ajgu.a, ajgx.q, ajgs.b), ajho.a(false, ajgt.d, ajgx.c, ajgs.s), ajho.a(false, ajgt.c, ajgx.a, ajgs.r), ajho.a(false, ajgt.f, ajgy.i, ajgs.o), new ajho(valueOf, ajgu.e, ajgy.g, ajgs.m, wgw.t), ajho.a("{\"NativeLibLoading\":0.1,\"PbToFb\":0.0,\"FirstRootPreparation\":0.002,\"NativeLibChecking\":0.025,\"FirstRootMeasurement\":0.002,\"TemplateResolution\":3.0E-4,\"FirstRootMaterialization\":0.002,\"TemplateFetching\":3.0E-4,\"ComponentMaterialization\":3.0E-4}", ajgu.k, ajgx.i, ajgz.d), ajho.a(1, ajgu.h, ajgy.f, ajgs.l), ajho.a(false, ajgt.e, ajgy.h, ajgs.n), ajho.a(valueOf, ajgu.f, ajgx.g, ajgz.a), ajho.a(false, ajgt.h, ajgx.d, ajgs.t), ajho.a(false, ajgt.g, ajgx.f, ajgz.b), ajho.a(false, ajgt.k, ajgx.s, ajgs.c));
        O = amru.z(ajhh.c("litho_layout_thread_pool_multiplier", Float.valueOf(1.0f), ajgv.g), ajhh.c("use_arena_eko_processor", true, ajgv.d), ajhh.c("support_elements_command_extension", true, ajgv.c), ajhh.c("use_elements_logging_contract", true, ajgv.e), ajhh.d("android_image_client", 2, ajgv.i, amrz.l("glide_framework", 1, "yt_downloader", 2)), ajhh.c("litho_set_layout_thread_pool_on_rb", false, ajgv.a), ajhh.c("eko_processor_max_lru_cache_size", 30, ajgv.h), ajhh.d("thumbnail_resolution_type", 0, ajgv.j, amrz.n("default", 0, "high_resolution_all", 1, "high_resolution_center_crop", 2, "high_resolution_on_center_crop_ratio", 3)), ajhh.c("use_entities_config_resolver_v2", true, ajgv.f), ajhh.c("setup_default_properties", false, ajgv.b));
        ajhh c = ajhh.c("litho_init_range", 4, ajgw.e);
        Float valueOf2 = Float.valueOf(0.5f);
        a = amru.A(c, ajhh.c("litho_range_ratio", valueOf2, ajgw.c), ajhh.c("recycler_view_item_prefetch", true, ajgv.o), ajhh.c("recycler_view_fixed_size", true, ajgv.n), ajhh.c("recycler_view_disable_view_cache", true, ajgv.m), ajhh.c("use_incremental_mount_for_rb", true, ajgv.s), ajhh.c("use_legacy_visible", false, ajgv.t), ajhh.c("use_size_spec_youtube_element", false, ajgv.u), ajhh.c("use_async_presenter_preparation", false, ajgv.p), ajhh.c("async_prepare_init_range", 4, ajgw.d), ajhh.c("async_prepare_range_ratio", valueOf2, ajgw.a), ajhh.c("use_incremental_mount_for_async_prepare", true, ajgv.r), ajhh.c("use_flatbuffer_runtime", false, ajgv.q), ajhh.c("rebind_after_detach", false, ajgv.l), ajhh.c("horizontal_collection_touch_interceptor", false, ajgv.k), ajhh.c("use_swipe_to_camera_local_config", true, ajgw.b));
        amru s = amru.s(ajhh.c("use_incremental_mount_for_rb", false, ajgv.s), ajhh.c("use_incremental_mount_for_async_prepare", false, ajgv.r));
        P = s;
        amru s2 = amru.s(ajhh.c("use_incremental_mount_for_rb", false, ajgv.s), ajhh.c("use_incremental_mount_for_async_prepare", false, ajgv.r));
        Q = s2;
        amru r = amru.r(ajhh.c("horizontal_collection_touch_interceptor", true, ajgv.k));
        R = r;
        EnumMap enumMap = new EnumMap(ajhb.class);
        b = enumMap;
        enumMap.put((EnumMap) ajhb.ENGAGEMENT, (ajhb) s);
        enumMap.put((EnumMap) ajhb.WATCH, (ajhb) s2);
        enumMap.put((EnumMap) ajhb.HOME, (ajhb) r);
    }

    public ajhe() {
    }

    public ajhe(amrz amrzVar, int i, int i2, float f, boolean z, boolean z2, boolean z3, boolean z4, float f2, String str, int i3, boolean z5, int i4, boolean z6, boolean z7, int i5, boolean z8, boolean z9, boolean z10, boolean z11, int i6, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, float f3, boolean z19, boolean z20, int i7, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, float f4, boolean z28, boolean z29, boolean z30) {
        this.S = amrzVar;
        this.c = i;
        this.d = i2;
        this.e = f;
        this.f = z;
        this.T = z2;
        this.g = z3;
        this.h = z4;
        this.i = f2;
        this.j = str;
        this.k = i3;
        this.l = z5;
        this.U = i4;
        this.m = z6;
        this.n = z7;
        this.o = i5;
        this.p = z8;
        this.q = z9;
        this.r = z10;
        this.s = z11;
        this.t = i6;
        this.u = z12;
        this.v = z13;
        this.w = z14;
        this.x = z15;
        this.y = z16;
        this.z = z17;
        this.A = z18;
        this.B = f3;
        this.C = z19;
        this.D = z20;
        this.E = i7;
        this.V = z21;
        this.F = z22;
        this.G = z23;
        this.W = z24;
        this.H = z25;
        this.I = z26;
        this.X = z27;
        this.f60J = f4;
        this.K = z28;
        this.L = z29;
        this.M = z30;
    }

    public static ajhe b(aadw aadwVar) {
        apwy b2 = aadwVar.b();
        if (b2 == null) {
            return c().a();
        }
        ajha c = c();
        aulu auluVar = b2.l;
        if (auluVar == null) {
            auluVar = aulu.a;
        }
        String str = auluVar.h;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                amru amruVar = O;
                int i = ((amvj) amruVar).c;
                for (int i2 = 0; i2 < i; i2++) {
                    ajhh ajhhVar = (ajhh) amruVar.get(i2);
                    try {
                        ajhhVar.b(jSONObject, c, "");
                    } catch (ajhg | JSONException e) {
                        String str2 = ajhhVar.a;
                        afsi.c(2, 23, str2.length() != 0 ? "Error parsing ElementsLaunchConfig".concat(str2) : new String("Error parsing ElementsLaunchConfig"), e);
                    }
                }
                EnumMap enumMap = new EnumMap(ajhb.class);
                for (ajhb ajhbVar : ajhb.values()) {
                    ajhc a2 = ajhd.a(ajhbVar);
                    d(a2, jSONObject, null);
                    d(a2, jSONObject, ajhbVar);
                    aulu auluVar2 = b2.l;
                    if (auluVar2 == null) {
                        auluVar2 = aulu.a;
                    }
                    if (auluVar2.i) {
                        a2.b(true);
                    }
                    a2.c = ajhbVar;
                    enumMap.put((EnumMap) ajhbVar, (ajhb) a2.a());
                }
                c.b(enumMap);
            } catch (JSONException e2) {
                afsi.c(2, 23, "Error parsing ElementsLaunchConfig", e2);
            }
        }
        aulu auluVar3 = b2.l;
        if (auluVar3 == null) {
            auluVar3 = aulu.a;
        }
        amru amruVar2 = N;
        int i3 = ((amvj) amruVar2).c;
        for (int i4 = 0; i4 < i3; i4++) {
            ajho ajhoVar = (ajho) amruVar2.get(i4);
            try {
                if (ajhoVar.d.a(auluVar3)) {
                    Object a3 = ajhoVar.c.a(auluVar3);
                    ammy ammyVar = ajhoVar.e;
                    if (ammyVar != null && !ammyVar.a(a3)) {
                        String valueOf = String.valueOf(a3);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                        sb.append("Value outside of constraint: ");
                        sb.append(valueOf);
                        throw new ajhn(sb.toString());
                    }
                    ajhoVar.b.a(c, a3);
                }
            } catch (ajhn e3) {
                afsi.c(2, 23, "Error parsing Mendel ElementsLaunchConfig", e3);
            }
        }
        return c.a();
    }

    public static ajha c() {
        ajha ajhaVar = new ajha();
        amru amruVar = O;
        int i = ((amvj) amruVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ajhh) amruVar.get(i2)).a(ajhaVar);
        }
        amru amruVar2 = N;
        int i3 = ((amvj) amruVar2).c;
        for (int i4 = 0; i4 < i3; i4++) {
            ajho ajhoVar = (ajho) amruVar2.get(i4);
            ajhoVar.b.a(ajhaVar, ajhoVar.a);
        }
        EnumMap enumMap = new EnumMap(ajhb.class);
        for (ajhb ajhbVar : ajhb.values()) {
            ajhc a2 = ajhd.a(ajhbVar);
            a2.c = ajhbVar;
            enumMap.put((EnumMap) ajhbVar, (ajhb) a2.a());
        }
        ajhaVar.b(enumMap);
        return ajhaVar;
    }

    public static void d(ajhc ajhcVar, JSONObject jSONObject, ajhb ajhbVar) {
        String str = ajhbVar != null ? ajhbVar.k : "";
        amru amruVar = a;
        int i = ((amvj) amruVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ajhh ajhhVar = (ajhh) amruVar.get(i2);
            try {
                ajhhVar.b(jSONObject, ajhcVar, str);
            } catch (ajhg | JSONException e) {
                String str2 = ajhhVar.a;
                afsi.c(2, 23, str2.length() != 0 ? "Error parsing ElementsLaunchConfig.SurfaceConfig.".concat(str2) : new String("Error parsing ElementsLaunchConfig.SurfaceConfig."), e);
            }
        }
    }

    public final ajhd a(ajhb ajhbVar) {
        return (ajhd) this.S.get(ajhbVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajhe) {
            ajhe ajheVar = (ajhe) obj;
            if (this.S.equals(ajheVar.S) && this.c == ajheVar.c && this.d == ajheVar.d && Float.floatToIntBits(this.e) == Float.floatToIntBits(ajheVar.e) && this.f == ajheVar.f && this.T == ajheVar.T && this.g == ajheVar.g && this.h == ajheVar.h && Float.floatToIntBits(this.i) == Float.floatToIntBits(ajheVar.i) && this.j.equals(ajheVar.j) && this.k == ajheVar.k && this.l == ajheVar.l && this.U == ajheVar.U && this.m == ajheVar.m && this.n == ajheVar.n && this.o == ajheVar.o && this.p == ajheVar.p && this.q == ajheVar.q && this.r == ajheVar.r && this.s == ajheVar.s && this.t == ajheVar.t && this.u == ajheVar.u && this.v == ajheVar.v && this.w == ajheVar.w && this.x == ajheVar.x && this.y == ajheVar.y && this.z == ajheVar.z && this.A == ajheVar.A && Float.floatToIntBits(this.B) == Float.floatToIntBits(ajheVar.B) && this.C == ajheVar.C && this.D == ajheVar.D && this.E == ajheVar.E && this.V == ajheVar.V && this.F == ajheVar.F && this.G == ajheVar.G && this.W == ajheVar.W && this.H == ajheVar.H && this.I == ajheVar.I && this.X == ajheVar.X && Float.floatToIntBits(this.f60J) == Float.floatToIntBits(ajheVar.f60J) && this.K == ajheVar.K && this.L == ajheVar.L && this.M == ajheVar.M) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.S.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ Float.floatToIntBits(this.e)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.T ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.i)) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ this.U) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003) ^ this.o) * 1000003) ^ (true != this.p ? 1237 : 1231)) * 1000003) ^ (true != this.q ? 1237 : 1231)) * 1000003) ^ (true != this.r ? 1237 : 1231)) * 1000003) ^ (true != this.s ? 1237 : 1231)) * 1000003) ^ this.t) * 1000003) ^ (true != this.u ? 1237 : 1231)) * 1000003) ^ (true != this.v ? 1237 : 1231)) * 1000003) ^ (true != this.w ? 1237 : 1231)) * 1000003) ^ (true != this.x ? 1237 : 1231)) * 1000003) ^ (true != this.y ? 1237 : 1231)) * 1000003) ^ (true != this.z ? 1237 : 1231)) * 1000003) ^ (true != this.A ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.B)) * 1000003) ^ (true != this.C ? 1237 : 1231)) * 1000003) ^ (true != this.D ? 1237 : 1231)) * 1000003) ^ this.E) * 1000003) ^ (true != this.V ? 1237 : 1231)) * 1000003) ^ (true != this.F ? 1237 : 1231)) * 1000003) ^ (true != this.G ? 1237 : 1231)) * 1000003) ^ (true != this.W ? 1237 : 1231)) * 1000003) ^ (true != this.H ? 1237 : 1231)) * 1000003) ^ (true != this.I ? 1237 : 1231)) * 1000003) ^ (true != this.X ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.f60J)) * 1000003) ^ (true != this.K ? 1237 : 1231)) * 1000003) ^ (true != this.L ? 1237 : 1231)) * 1000003) ^ (true == this.M ? 1231 : 1237);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.S);
        int i = this.c;
        int i2 = this.d;
        float f = this.e;
        boolean z = this.f;
        boolean z2 = this.T;
        boolean z3 = this.g;
        boolean z4 = this.h;
        float f2 = this.i;
        String str = this.j;
        int i3 = this.k;
        boolean z5 = this.l;
        int i4 = this.U;
        boolean z6 = this.m;
        boolean z7 = this.n;
        int i5 = this.o;
        boolean z8 = this.p;
        boolean z9 = this.q;
        boolean z10 = this.r;
        boolean z11 = this.s;
        int i6 = this.t;
        boolean z12 = this.u;
        boolean z13 = this.v;
        boolean z14 = this.w;
        boolean z15 = this.x;
        boolean z16 = this.y;
        boolean z17 = this.z;
        boolean z18 = this.A;
        float f3 = this.B;
        boolean z19 = this.C;
        boolean z20 = this.D;
        int i7 = this.E;
        boolean z21 = this.V;
        boolean z22 = this.F;
        boolean z23 = this.G;
        boolean z24 = this.W;
        boolean z25 = this.H;
        boolean z26 = this.I;
        boolean z27 = this.X;
        float f4 = this.f60J;
        boolean z28 = this.K;
        boolean z29 = this.L;
        boolean z30 = this.M;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1611 + String.valueOf(str).length());
        sb.append("ElementsLaunchConfig{surfaceConfigMap=");
        sb.append(valueOf);
        sb.append(", elementsImageClient=");
        sb.append(i);
        sb.append(", ekoReleaseChannel=");
        sb.append(i2);
        sb.append(", lithoPoolMultiplier=");
        sb.append(f);
        sb.append(", lithoPoolOnRB=");
        sb.append(z);
        sb.append(", useArenaEkoProcessor=");
        sb.append(z2);
        sb.append(", supportElementsCommandExtension=");
        sb.append(z3);
        sb.append(", enableElementsPerformanceMetric=");
        sb.append(z4);
        sb.append(", elementsPerformanceMetricSampleRate=");
        sb.append(f2);
        sb.append(", elementsPerformanceMetricSubSampleRate=");
        sb.append(str);
        sb.append(", elementsPerformanceMetricPipeline=");
        sb.append(i3);
        sb.append(", useElementsLoggingContract=");
        sb.append(z5);
        sb.append(", ekoProcessorMaxLruCacheSize=");
        sb.append(i4);
        sb.append(", useEntitiesConfigResolverV2=");
        sb.append(z6);
        sb.append(", defaultProperties=");
        sb.append(z7);
        sb.append(", thumbnailResolutionType=");
        sb.append(i5);
        sb.append(", androidHorizontalCollectionSwipeProtectorV2=");
        sb.append(z8);
        sb.append(", useStateUpdateReconciliation=");
        sb.append(z9);
        sb.append(", lithoLayoutCanMoveBetweenThreads=");
        sb.append(z10);
        sb.append(", androidUseClipBounds=");
        sb.append(z11);
        sb.append(", lithoPoolMaxSize=");
        sb.append(i6);
        sb.append(", lithoRecyclerBinderOnBindViewHolderListener=");
        sb.append(z12);
        sb.append(", useDynamicProps=");
        sb.append(z13);
        sb.append(", useGlobalLegacyVisible=");
        sb.append(z14);
        sb.append(", reportMissingImageSources=");
        sb.append(z15);
        sb.append(", useFullTreeVisibilityMode=");
        sb.append(z16);
        sb.append(", sectionsConfigurationUseBackgroundChangeSets=");
        sb.append(z17);
        sb.append(", enableIntersectionObserver=");
        sb.append(z18);
        sb.append(", collectionRangeRatio=");
        sb.append(f3);
        sb.append(", useExecutorLithoHandler=");
        sb.append(z19);
        sb.append(", useCompositeDisposableForCommands=");
        sb.append(z20);
        sb.append(", materializationBloatMs=");
        sb.append(i7);
        sb.append(", useImprovedTruncationClickableArea=");
        sb.append(z21);
        sb.append(", useEstimatedViewportCount=");
        sb.append(z22);
        sb.append(", enableNonContainerPadding=");
        sb.append(z23);
        sb.append(", useImprovedTruncationClickableAreaAllVersions=");
        sb.append(z24);
        sb.append(", disableNotifyDataSetChangedOnOrientationChange=");
        sb.append(z25);
        sb.append(", disableMountOnConfigurationChange=");
        sb.append(z26);
        sb.append(", enableElementsPbToFbMetric=");
        sb.append(z27);
        sb.append(", imagePrefetchRangeRatio=");
        sb.append(f4);
        sb.append(", enableHorizontalSwipeProtectorForShorts=");
        sb.append(z28);
        sb.append(", enableHorizontalFadedScrim=");
        sb.append(z29);
        sb.append(", enableVerticalFadedScrim=");
        sb.append(z30);
        sb.append("}");
        return sb.toString();
    }
}
