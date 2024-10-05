package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mht implements aaha {
    public final mhg a;
    private final acqz b;
    private final azrw c;

    public mht(mhg mhgVar, acqz acqzVar, azrw azrwVar) {
        this.a = mhgVar;
        this.b = acqzVar;
        this.c = azrwVar;
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
        View view;
        View b;
        avgg avggVar;
        if (apxfVar.pY(InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.inlineMutedWatchEndpointMutationCommand)) {
            apxf apxfVar2 = ((InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand) apxfVar.pX(InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.inlineMutedWatchEndpointMutationCommand)).b;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            if (map != null && (view = (View) map.get("com.google.android.libraries.youtube.rendering.elements.sender_view")) != null && (b = b(view)) != null) {
                map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", b);
                Object tag = b.getTag(R.id.elements_image);
                if (tag instanceof awpf) {
                    aong aongVar = (aong) avgg.a.createBuilder();
                    for (awph awphVar : ((awpf) tag).c) {
                        aone createBuilder = avgf.a.createBuilder();
                        String str = true != (awphVar.c == 1 ? (String) awphVar.d : "").startsWith("//") ? "" : "https:";
                        String valueOf = String.valueOf(awphVar.c == 1 ? (String) awphVar.d : "");
                        String concat = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
                        createBuilder.copyOnWrite();
                        avgf avgfVar = (avgf) createBuilder.instance;
                        concat.getClass();
                        avgfVar.b = 1 | avgfVar.b;
                        avgfVar.c = concat;
                        int i = awphVar.e;
                        createBuilder.copyOnWrite();
                        avgf avgfVar2 = (avgf) createBuilder.instance;
                        avgfVar2.b |= 2;
                        avgfVar2.d = i;
                        int i2 = awphVar.f;
                        createBuilder.copyOnWrite();
                        avgf avgfVar3 = (avgf) createBuilder.instance;
                        avgfVar3.b |= 4;
                        avgfVar3.e = i2;
                        aongVar.cB(createBuilder);
                    }
                    avggVar = (avgg) aongVar.build();
                } else {
                    avggVar = null;
                }
                map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", avggVar);
            }
            awdp awdpVar = (awdp) apxfVar2.pX(WatchEndpointOuterClass.watchEndpoint);
            gow n = gox.n();
            n.i = 4;
            n.d = apxfVar2;
            n.b = awdpVar.d;
            final gox a = n.a();
            if (this.a.b(a, (aahd) this.c.get(), this.b.mM(), map, new ajog() { // from class: mhs
                @Override // defpackage.ajog
                public final void oh(Map map2) {
                    mht mhtVar = mht.this;
                    mhtVar.a.a(a, map2);
                }
            })) {
                return;
            }
            ((aahd) this.c.get()).c(this.b.mM().h(apxfVar2), map);
        }
    }
}
