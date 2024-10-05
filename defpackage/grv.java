package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import com.google.protos.youtube.api.innertube.MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand;
import com.google.protos.youtube.api.innertube.MultiReelDismissalRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class grv implements aaha {
    private final lvc a;

    public grv(lvc lvcVar) {
        this.a = lvcVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        amkq.E(apxfVar.pY(MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.multiReelDismissalEndpointCommand));
        aulq aulqVar = ((MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand) apxfVar.pX(MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.multiReelDismissalEndpointCommand)).b;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        final atht athtVar = (atht) ahbj.n(aulqVar, MultiReelDismissalRendererOuterClass.multiReelDismissalRenderer);
        Map map2 = (Map) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", Map.class);
        if (map2 != null) {
            final mtx mtxVar = (mtx) yjj.u(map2, "multiReelDismissalCallback", mtx.class);
            aulq[] aulqVarArr = (aulq[]) yjj.u(map2, "reelItemRenderers", aulq[].class);
            List list = (List) yjj.u(map2, "reelDismissalInfo", List.class);
            if (aulqVarArr == null || mtxVar == null || list == null) {
                return;
            }
            final lvc lvcVar = this.a;
            mi miVar = lvcVar.g;
            if (miVar == null || !miVar.isShowing()) {
                lvcVar.d.mM().d(acsb.b(57929), apxfVar, null);
                lvcVar.i = list;
                lvcVar.h.clear();
                lvcVar.f.clear();
                View inflate = LayoutInflater.from(lvcVar.a).inflate(R.layout.multi_reel_dismissal, (ViewGroup) null, false);
                TextView textView = (TextView) inflate.findViewById(R.id.multi_reel_dismissal_title);
                TextView textView2 = (TextView) inflate.findViewById(R.id.multi_reel_dismissal_sub_title);
                Button button = (Button) inflate.findViewById(R.id.multi_reel_dismissal_done_button);
                RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.multi_reel_dismissal_items);
                recyclerView.af(new LinearLayoutManager(1));
                if ((athtVar.b & 1) != 0) {
                    aqygVar = athtVar.c;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                textView.setText(ajcq.b(aqygVar));
                if ((athtVar.b & 2) != 0) {
                    aqygVar2 = athtVar.d;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                } else {
                    aqygVar2 = null;
                }
                textView2.setText(ajcq.b(aqygVar2));
                ArrayList arrayList = new ArrayList();
                for (aulq aulqVar2 : aulqVarArr) {
                    ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = (ReelItemRendererOuterClass$ReelItemRenderer) aulqVar2.pX(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer);
                    if (aulqVar2.pY(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer) && (reelItemRendererOuterClass$ReelItemRenderer.b & 2097152) != 0) {
                        List list2 = lvcVar.i;
                        aujt aujtVar = reelItemRendererOuterClass$ReelItemRenderer.s;
                        if (aujtVar == null) {
                            aujtVar = aujt.a;
                        }
                        if (!list2.contains(aujtVar)) {
                            arrayList.add(reelItemRendererOuterClass$ReelItemRenderer);
                        }
                    }
                }
                recyclerView.ac(new lvb(lvcVar, arrayList, athtVar));
                aulq aulqVar3 = athtVar.g;
                if (aulqVar3 == null) {
                    aulqVar3 = aulq.a;
                }
                final apmg apmgVar = (apmg) aulqVar3.pX(ButtonRendererOuterClass.buttonRenderer);
                if ((apmgVar.b & 256) != 0) {
                    aqygVar3 = apmgVar.i;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                } else {
                    aqygVar3 = null;
                }
                button.setText(ajcq.b(aqygVar3));
                lvcVar.d.mM().D(new acqx(apmgVar.t));
                lvcVar.d.mM().u(new acqx(apmgVar.t), null);
                button.setOnClickListener(new View.OnClickListener() { // from class: luy
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HashMap hashMap;
                        lvc lvcVar2 = lvc.this;
                        mtx mtxVar2 = mtxVar;
                        atht athtVar2 = athtVar;
                        apmg apmgVar2 = apmgVar;
                        lvcVar2.g.dismiss();
                        if (lvcVar2.h.size() > 0) {
                            ArrayList arrayList2 = new ArrayList();
                            for (aujt aujtVar2 : lvcVar2.h) {
                                if (aujtVar2 != null) {
                                    arrayList2.add(aujtVar2.b);
                                }
                            }
                            if (arrayList2.isEmpty()) {
                                hashMap = null;
                            } else {
                                hashMap = new HashMap();
                                hashMap.put("feedback_token", arrayList2);
                            }
                            if (hashMap != null) {
                                mtxVar2.a(lvcVar2.h);
                                aahd aahdVar = lvcVar2.c;
                                aong aongVar = (aong) apxf.a.createBuilder();
                                aone createBuilder = aqwl.a.createBuilder();
                                if ((athtVar2.b & 32) != 0) {
                                    apxf apxfVar2 = athtVar2.h;
                                    if (apxfVar2 == null) {
                                        apxfVar2 = apxf.a;
                                    }
                                    createBuilder.copyOnWrite();
                                    aqwl aqwlVar = (aqwl) createBuilder.instance;
                                    apxfVar2.getClass();
                                    aony aonyVar = aqwlVar.f;
                                    if (!aonyVar.c()) {
                                        aqwlVar.f = aonm.mutableCopy(aonyVar);
                                    }
                                    aqwlVar.f.add(apxfVar2);
                                }
                                aongVar.e(FeedbackEndpointOuterClass.feedbackEndpoint, (aqwl) createBuilder.build());
                                aahdVar.c((apxf) aongVar.build(), hashMap);
                            }
                            aone createBuilder2 = asib.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            asib asibVar = (asib) createBuilder2.instance;
                            asibVar.b |= 1;
                            asibVar.c = true;
                            asib asibVar2 = (asib) createBuilder2.build();
                            aone createBuilder3 = asht.a.createBuilder();
                            createBuilder3.copyOnWrite();
                            asht ashtVar = (asht) createBuilder3.instance;
                            asibVar2.getClass();
                            ashtVar.q = asibVar2;
                            ashtVar.c |= 1;
                            asht ashtVar2 = (asht) createBuilder3.build();
                            for (byte[] bArr : lvcVar2.f.values()) {
                                if (bArr != null) {
                                    lvcVar2.d.mM().w(new acqx(bArr), ashtVar2);
                                }
                            }
                            if ((apmgVar2.b & 1048576) != 0) {
                                lvcVar2.d.mM().I(3, new acqx(apmgVar2.t), null);
                            }
                        }
                    }
                });
                mh mhVar = new mh(lvcVar.a, R.style.MultiReelDismissalDialog);
                mhVar.p(inflate);
                lvcVar.g = mhVar.b();
                lvcVar.g.show();
                Window window = lvcVar.g.getWindow();
                window.setLayout(-1, -2);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 17;
                window.setAttributes(attributes);
            }
        }
    }
}
