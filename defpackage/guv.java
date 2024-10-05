package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand;
import com.google.protos.youtube.api.innertube.ClickLoggingWrapperCommandOuterClass;
import com.google.protos.youtube.api.innertube.WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class guv implements aaha {
    private final aahd a;
    private final acqz b;
    private final /* synthetic */ int c;

    public guv(aahd aahdVar, acqz acqzVar, int i) {
        this.c = i;
        this.a = aahdVar;
        this.b = acqzVar;
    }

    public guv(acqz acqzVar, aahd aahdVar, int i) {
        this.c = i;
        this.b = acqzVar;
        this.a = aahdVar;
    }

    private static View b(View view) {
        if (view.getTag(R.id.elements_image) instanceof awpf) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View b = b(viewGroup.getChildAt(i));
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aone createBuilder;
        View view;
        View b;
        int i = this.c;
        avgg avggVar = null;
        if (i == 0) {
            if (apxfVar.pY(AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand.adsVisualElementLoggingWrapperCommand)) {
                AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand = (AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand) apxfVar.pX(AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand.adsVisualElementLoggingWrapperCommand);
                apxg apxgVar = apxfVar.e;
                if (apxgVar == null) {
                    apxgVar = apxg.a;
                }
                if (apxgVar.pY(asit.a)) {
                    createBuilder = ((asht) apxgVar.pX(asit.a)).toBuilder();
                } else {
                    createBuilder = asht.a.createBuilder();
                }
                if (adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand.e && apxgVar.pY(ashl.b)) {
                    ashl ashlVar = (ashl) apxgVar.pX(ashl.b);
                    createBuilder.copyOnWrite();
                    asht ashtVar = (asht) createBuilder.instance;
                    ashlVar.getClass();
                    ashtVar.w = ashlVar;
                    ashtVar.c |= 8192;
                }
                asht ashtVar2 = (asht) createBuilder.build();
                if (adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand.d) {
                    this.b.mM().I(3, new acqx(apxfVar.c), true != asht.a.equals(ashtVar2) ? ashtVar2 : null);
                }
                if ((adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand.b & 1) != 0) {
                    apxf apxfVar2 = adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand.c;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    if (!asht.a.equals(ashtVar2)) {
                        aong aongVar = (aong) apxfVar2.toBuilder();
                        aong aongVar2 = (aong) apxg.a.createBuilder();
                        aongVar2.e(asit.a, ashtVar2);
                        apxg apxgVar2 = (apxg) aongVar2.build();
                        aongVar.copyOnWrite();
                        apxf apxfVar3 = (apxf) aongVar.instance;
                        apxgVar2.getClass();
                        apxfVar3.e = apxgVar2;
                        apxfVar3.b |= 2;
                        apxfVar2 = (apxf) aongVar.build();
                    }
                    this.a.c(apxfVar2, map);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 1) {
            if (apxfVar.pY(ClickLoggingWrapperCommandOuterClass.clickLoggingWrapperCommand)) {
                aptp aptpVar = (aptp) apxfVar.pX(ClickLoggingWrapperCommandOuterClass.clickLoggingWrapperCommand);
                if ((aptpVar.b & 2) == 0) {
                    if (aptpVar.c) {
                        this.b.mM().I(3, new acqx(apxfVar.c), null);
                        return;
                    }
                    return;
                } else {
                    Map k = acrc.k(map, aptpVar.c);
                    aahd aahdVar = this.a;
                    apxf apxfVar4 = aptpVar.d;
                    if (apxfVar4 == null) {
                        apxfVar4 = apxf.a;
                    }
                    aahdVar.c(apxfVar4, k);
                    return;
                }
            }
            return;
        }
        if (apxfVar.pY(WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.watchNextWatchEndpointMutationCommand)) {
            apxf apxfVar5 = ((WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand) apxfVar.pX(WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.watchNextWatchEndpointMutationCommand)).b;
            if (apxfVar5 == null) {
                apxfVar5 = apxf.a;
            }
            if (map != null && (view = (View) map.get("com.google.android.libraries.youtube.rendering.elements.sender_view")) != null && (b = b(view)) != null) {
                map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", b);
                Object tag = b.getTag(R.id.elements_image);
                if (tag instanceof awpf) {
                    aong aongVar3 = (aong) avgg.a.createBuilder();
                    for (awph awphVar : ((awpf) tag).c) {
                        aone createBuilder2 = avgf.a.createBuilder();
                        String str = true != (awphVar.c == 1 ? (String) awphVar.d : "").startsWith("//") ? "" : "https:";
                        String valueOf = String.valueOf(awphVar.c == 1 ? (String) awphVar.d : "");
                        String concat = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
                        createBuilder2.copyOnWrite();
                        avgf avgfVar = (avgf) createBuilder2.instance;
                        concat.getClass();
                        avgfVar.b |= 1;
                        avgfVar.c = concat;
                        int i2 = awphVar.e;
                        createBuilder2.copyOnWrite();
                        avgf avgfVar2 = (avgf) createBuilder2.instance;
                        avgfVar2.b |= 2;
                        avgfVar2.d = i2;
                        int i3 = awphVar.f;
                        createBuilder2.copyOnWrite();
                        avgf avgfVar3 = (avgf) createBuilder2.instance;
                        avgfVar3.b |= 4;
                        avgfVar3.e = i3;
                        aongVar3.cB(createBuilder2);
                    }
                    avggVar = (avgg) aongVar3.build();
                }
                map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", avggVar);
            }
            this.a.c(this.b.mM().h(apxfVar5), map);
        }
    }
}
