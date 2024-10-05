package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import com.google.protos.youtube.api.innertube.DecoratedPlayerBarRendererOuterClass;
import com.google.protos.youtube.api.innertube.HeatMarkerRendererOuterClass;
import com.google.protos.youtube.api.innertube.HeatmapRendererOuterClass;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kls extends fks implements fgk, kig, ypd {
    private final ahtp a;
    private final ahtf b;
    private final ypa c;
    private final fgm d;
    private final Context e;

    public kls(fln flnVar, ypa ypaVar, ahtp ahtpVar, fgm fgmVar, ahtf ahtfVar, Context context) {
        super(flnVar);
        this.c = ypaVar;
        this.a = ahtpVar;
        this.d = fgmVar;
        this.b = ahtfVar;
        this.e = context;
    }

    @Override // defpackage.fgk
    public final void g(fhf fhfVar) {
        ahtp ahtpVar = this.a;
        ahtpVar.d.clear();
        for (ahyo ahyoVar : ahtpVar.a.keySet()) {
            ahtpVar.f(null, ahyoVar, 1, (TimelineMarker) ahtpVar.b.get(ahyoVar));
        }
        ahtpVar.c.clear();
        ahtpVar.b.clear();
        ahtpVar.e.clear();
        ahtpVar.f.clear();
        ahtpVar.j = Optional.empty();
        ahtpVar.i = Optional.empty();
        ahtpVar.g.a(amru.q());
    }

    @Override // defpackage.kig
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        this.a.k = ControlsOverlayStyle.a(controlsOverlayStyle);
    }

    @Override // defpackage.flm
    public final void kG() {
        this.c.m(this);
        this.a.l(ahyo.CHAPTER, this.b);
        this.a.l(ahyo.TIMESTAMP_MARKER, this.b);
        this.d.h(this);
    }

    @Override // defpackage.flm
    public final void kH() {
        this.c.g(this);
        this.a.i(ahyo.CHAPTER, this.b);
        this.a.i(ahyo.TIMESTAMP_MARKER, this.b);
        this.d.d(this);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        Class[] clsArr;
        Optional empty;
        apxf apxfVar;
        String str;
        TimelineMarker timelineMarker;
        String str2;
        apxf apxfVar2;
        apxf apxfVar3;
        String str3;
        if (i == -1) {
            return new Class[]{ahdv.class};
        }
        if (i == 0) {
            WatchNextResponseModel a = ((ahdv) obj).a();
            if (a == null) {
                return null;
            }
            atzr atzrVar = a.i;
            if (atzrVar != null) {
                aulq aulqVar = atzrVar.q;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                aqit aqitVar = (aqit) aulqVar.pX(DecoratedPlayerBarRendererOuterClass.decoratedPlayerBarRenderer);
                aulq aulqVar2 = aqitVar.c;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                if (aulqVar2.pY(DecoratedPlayerBarRendererOuterClass.multiMarkersPlayerBarRenderer)) {
                    aulq aulqVar3 = aqitVar.c;
                    if (aulqVar3 == null) {
                        aulqVar3 = aulq.a;
                    }
                    aqiw aqiwVar = (aqiw) aulqVar3.pX(DecoratedPlayerBarRendererOuterClass.multiMarkersPlayerBarRenderer);
                    for (Map.Entry entry : Collections.unmodifiableMap(aqiwVar.d).entrySet()) {
                        if ((((aqis) entry.getValue()).b & 2) != 0) {
                            apxfVar = ((aqis) entry.getValue()).f;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                        } else {
                            apxfVar = null;
                        }
                        aqis aqisVar = (aqis) entry.getValue();
                        int size = aqisVar.c.size();
                        TimelineMarker[] timelineMarkerArr = new TimelineMarker[size];
                        int i2 = 0;
                        while (i2 < size) {
                            aqir aqirVar = (aqir) ((aulq) aqisVar.c.get(i2)).pX(DecoratedPlayerBarRendererOuterClass.chapterRenderer);
                            int i3 = i2 + 1;
                            aqir aqirVar2 = i3 < size ? (aqir) ((aulq) aqisVar.c.get(i3)).pX(DecoratedPlayerBarRendererOuterClass.chapterRenderer) : null;
                            long j = aqirVar.d;
                            long j2 = aqirVar2 != null ? aqirVar2.d : Long.MAX_VALUE;
                            if ((aqirVar.b & 8) != 0) {
                                apxf apxfVar4 = aqirVar.e;
                                if (apxfVar4 == null) {
                                    apxfVar4 = apxf.a;
                                }
                                apxfVar3 = apxfVar4;
                            } else {
                                apxfVar3 = null;
                            }
                            aqyg aqygVar = aqirVar.c;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                            if (aqygVar.c.size() > 0) {
                                aqyg aqygVar2 = aqirVar.c;
                                if (aqygVar2 == null) {
                                    aqygVar2 = aqyg.a;
                                }
                                str3 = ((aqyi) aqygVar2.c.get(0)).c;
                            } else {
                                str3 = null;
                            }
                            int i4 = i2;
                            timelineMarkerArr[i4] = new TimelineMarker(j, j2, i4, str3, apxfVar3);
                            i2 = i3;
                        }
                        if (size > 0) {
                            this.a.k((String) entry.getKey(), ahyo.CHAPTER, timelineMarkerArr, apxfVar);
                        }
                        aqis aqisVar2 = (aqis) entry.getValue();
                        int size2 = aqisVar2.d.size();
                        TimelineMarker[] timelineMarkerArr2 = new TimelineMarker[size2];
                        int i5 = 0;
                        while (i5 < size2) {
                            aqiu aqiuVar = (aqiu) ((aulq) aqisVar2.d.get(i5)).pX(DecoratedPlayerBarRendererOuterClass.markerRenderer);
                            long j3 = aqiuVar.d;
                            aqyg aqygVar3 = aqiuVar.c;
                            if (aqygVar3 == null) {
                                aqygVar3 = aqyg.a;
                            }
                            if (aqygVar3.c.size() > 0) {
                                aqyg aqygVar4 = aqiuVar.c;
                                if (aqygVar4 == null) {
                                    aqygVar4 = aqyg.a;
                                }
                                str2 = ((aqyi) aqygVar4.c.get(0)).c;
                            } else {
                                str2 = null;
                            }
                            if ((aqiuVar.b & 8) != 0) {
                                apxf apxfVar5 = aqiuVar.e;
                                if (apxfVar5 == null) {
                                    apxfVar5 = apxf.a;
                                }
                                apxfVar2 = apxfVar5;
                            } else {
                                apxfVar2 = null;
                            }
                            int i6 = i5;
                            timelineMarkerArr2[i6] = new TimelineMarker(j3, j3, i5, str2, apxfVar2);
                            i5 = i6 + 1;
                        }
                        if (size2 > 0) {
                            this.a.k((String) entry.getKey(), ahyo.TIMESTAMP_MARKER, timelineMarkerArr2, apxfVar);
                        }
                        String str4 = (String) entry.getKey();
                        aqis aqisVar3 = (aqis) entry.getValue();
                        if ((aqisVar3.b & 1) != 0) {
                            aulq aulqVar4 = aqisVar3.e;
                            if (aulqVar4 == null) {
                                aulqVar4 = aulq.a;
                            }
                            if (aulqVar4.pY(HeatmapRendererOuterClass.heatmapRenderer)) {
                                aulq aulqVar5 = aqisVar3.e;
                                if (aulqVar5 == null) {
                                    aulqVar5 = aulq.a;
                                }
                                ardz ardzVar = (ardz) aulqVar5.pX(HeatmapRendererOuterClass.heatmapRenderer);
                                int size3 = ardzVar.e.size();
                                ArrayList arrayList = new ArrayList(size3);
                                for (int i7 = 0; i7 < size3; i7++) {
                                    ardy ardyVar = (ardy) ((aulq) ardzVar.e.get(i7)).pX(HeatMarkerRendererOuterClass.heatMarkerRenderer);
                                    float y = yjk.y((float) ardyVar.d, 0.0f, 1.0f);
                                    if ((ardyVar.b & 8) == 0) {
                                        long j4 = ardyVar.c;
                                        timelineMarker = new TimelineMarker(j4, j4, 0, null, null, y);
                                    } else {
                                        long j5 = ardyVar.c;
                                        apxf apxfVar6 = ardyVar.e;
                                        if (apxfVar6 == null) {
                                            apxfVar6 = apxf.a;
                                        }
                                        timelineMarker = new TimelineMarker(j5, j5, 0, null, apxfVar6, y);
                                    }
                                    arrayList.add(timelineMarker);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (aulq aulqVar6 : ardzVar.f) {
                                    if (aulqVar6.pY(avgw.a)) {
                                        avgv avgvVar = (avgv) aulqVar6.pX(avgw.a);
                                        aqyg aqygVar5 = avgvVar.e;
                                        if (aqygVar5 == null) {
                                            aqygVar5 = aqyg.a;
                                        }
                                        if (aqygVar5.c.size() > 0) {
                                            aqyg aqygVar6 = avgvVar.e;
                                            if (aqygVar6 == null) {
                                                aqygVar6 = aqyg.a;
                                            }
                                            str = ((aqyi) aqygVar6.c.get(0)).c;
                                        } else {
                                            str = "";
                                        }
                                        ahtl ahtlVar = new ahtl();
                                        ahtlVar.c = Long.valueOf(avgvVar.d);
                                        ahtlVar.a = Long.valueOf(avgvVar.b);
                                        ahtlVar.b = Long.valueOf(avgvVar.c);
                                        arfr b = arfr.b(avgvVar.f);
                                        if (b == null) {
                                            b = arfr.UNKNOWN;
                                        }
                                        if (b != null) {
                                            ahtlVar.e = b;
                                            if (str != null) {
                                                ahtlVar.d = str;
                                                Long l = ahtlVar.a;
                                                if (l != null && ahtlVar.b != null && ahtlVar.c != null && ahtlVar.d != null && ahtlVar.e != null) {
                                                    arrayList2.add(new ahtm(l.longValue(), ahtlVar.b.longValue(), ahtlVar.c.longValue(), ahtlVar.d, ahtlVar.e));
                                                } else {
                                                    StringBuilder sb = new StringBuilder();
                                                    if (ahtlVar.a == null) {
                                                        sb.append(" decorationVisibilityStartMillis");
                                                    }
                                                    if (ahtlVar.b == null) {
                                                        sb.append(" decorationVisibilityEndMillis");
                                                    }
                                                    if (ahtlVar.c == null) {
                                                        sb.append(" decorationTimeMillis");
                                                    }
                                                    if (ahtlVar.d == null) {
                                                        sb.append(" label");
                                                    }
                                                    if (ahtlVar.e == null) {
                                                        sb.append(" icon");
                                                    }
                                                    String valueOf = String.valueOf(sb);
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                                                    sb2.append("Missing required properties:");
                                                    sb2.append(valueOf);
                                                    throw new IllegalStateException(sb2.toString());
                                                }
                                            } else {
                                                throw new NullPointerException("Null label");
                                            }
                                        } else {
                                            throw new NullPointerException("Null icon");
                                        }
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    DisplayMetrics displayMetrics = this.e.getResources().getDisplayMetrics();
                                    ajpu ajpuVar = new ajpu(ahtg.a(displayMetrics));
                                    ajpuVar.b(yjk.K(displayMetrics, ardzVar.b));
                                    ajpuVar.c(yjk.K(displayMetrics, ardzVar.c));
                                    ajpuVar.d(ardzVar.d);
                                    this.a.n(str4, ahyo.HEATMAP_MARKER, new ahth(arrayList, arrayList2, ajpuVar.a()), apxfVar);
                                }
                            }
                        }
                        String str5 = (String) entry.getKey();
                        aqis aqisVar4 = (aqis) entry.getValue();
                        if ((aqisVar4.b & 4) != 0) {
                            ahtp ahtpVar = this.a;
                            apxf apxfVar7 = aqisVar4.g;
                            if (apxfVar7 == null) {
                                apxfVar7 = apxf.a;
                            }
                            ahtpVar.d(str5, apxfVar7);
                        }
                    }
                    ahtp ahtpVar2 = this.a;
                    if ((aqiwVar.b & 1) != 0) {
                        aqiy aqiyVar = aqiwVar.c;
                        if (aqiyVar == null) {
                            aqiyVar = aqiy.a;
                        }
                        empty = Optional.of(aqiyVar.b);
                    } else {
                        empty = Optional.empty();
                    }
                    clsArr = null;
                    if (!TextUtils.equals((CharSequence) empty.orElse(null), (CharSequence) ahtpVar2.i.orElse(null))) {
                        ahtpVar2.i = empty;
                        ahtpVar2.e(true, empty);
                        return null;
                    }
                    return clsArr;
                }
            }
            clsArr = null;
            return clsArr;
        }
        StringBuilder sb3 = new StringBuilder(32);
        sb3.append("unsupported op code: ");
        sb3.append(i);
        throw new IllegalStateException(sb3.toString());
    }

    @Override // defpackage.kig
    public final /* synthetic */ void m(fhg fhgVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nA(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nB(zcp zcpVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nC(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nD(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nF(ControlsState controlsState) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nX(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nY(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nz(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void r(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void s(boolean z) {
    }
}
