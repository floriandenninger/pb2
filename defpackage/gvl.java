package defpackage;

import com.google.protos.youtube.api.innertube.AddRendererToItemSectionActionOuterClass;
import com.google.protos.youtube.api.innertube.AddToToastActionOuterClass$AddToToastAction;
import com.google.protos.youtube.api.innertube.CloseSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand;
import com.google.protos.youtube.api.innertube.CloseSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand;
import com.google.protos.youtube.api.innertube.CommentSectionRendererOuterClass;
import com.google.protos.youtube.api.innertube.CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand;
import com.google.protos.youtube.api.innertube.RemoveRendererFromItemSectionActionOuterClass;
import com.google.protos.youtube.api.innertube.ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint;
import com.google.protos.youtube.api.innertube.ReplaceItemSectionHeaderActionOuterClass;
import com.google.protos.youtube.api.innertube.ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction;
import com.google.protos.youtube.api.innertube.ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction;
import com.google.protos.youtube.api.innertube.ToggleConversationActionOuterClass$ToggleConversationAction;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gvl implements aaha {
    public static final /* synthetic */ int a = 0;
    private final ypa b;
    private final /* synthetic */ int c;

    public gvl(ypa ypaVar, int i) {
        this.c = i;
        this.b = ypaVar;
    }

    public gvl(ypa ypaVar, int i, byte[] bArr) {
        this.c = i;
        ypaVar.getClass();
        this.b = ypaVar;
    }

    public gvl(ypa ypaVar, int i, char[] cArr) {
        this.c = i;
        ypaVar.getClass();
        this.b = ypaVar;
    }

    public gvl(ypa ypaVar, int i, short[] sArr) {
        this.c = i;
        ypaVar.getClass();
        this.b = ypaVar;
    }

    public gvl(ypa ypaVar, int i, int[] iArr) {
        this.c = i;
        ypaVar.getClass();
        this.b = ypaVar;
    }

    public gvl(ypa ypaVar, int i, boolean[] zArr) {
        this.c = i;
        ypaVar.getClass();
        this.b = ypaVar;
    }

    public gvl(ypa ypaVar, int i, float[] fArr) {
        this.c = i;
        ypaVar.getClass();
        this.b = ypaVar;
    }

    public gvl(ypa ypaVar, int i, byte[][] bArr) {
        this.c = i;
        ypaVar.getClass();
        this.b = ypaVar;
    }

    public gvl(ypa ypaVar, int i, char[][] cArr) {
        this.c = i;
        ypaVar.getClass();
        this.b = ypaVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        Object pX;
        boolean z = false;
        atnz atnzVar = null;
        switch (this.c) {
            case 0:
                if (apxfVar.pY(CloseSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand.closeSponsorshipsDialogCommand)) {
                    this.b.f(new yid());
                    return;
                }
                return;
            case 1:
                if (apxfVar.pY(ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.replaceCompanionEndpoint)) {
                    this.b.d(new wnd(((ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint) apxfVar.pX(ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.replaceCompanionEndpoint)).b));
                    return;
                }
                return;
            case 2:
                this.b.d(izk.a((ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction) apxfVar.pX(ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.showChannelNotificationPreferenceDialogAction)));
                return;
            case 3:
                this.b.d(apxfVar.pX(ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.showSubscribePromoAction));
                return;
            case 4:
                if (apxfVar.pY(CloseSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand.closeSuggestedPlaylistVideosSheetCommand)) {
                    this.b.d(new kwj());
                    return;
                }
                return;
            case 5:
                Object s = yjj.s(map, "show_search_contents_command_key");
                if (s == null) {
                    s = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
                }
                ypa ypaVar = this.b;
                if ((s instanceof Boolean) && ((Boolean) s).booleanValue()) {
                    z = true;
                }
                ypaVar.d(lcz.a(z));
                return;
            case 6:
                aozs aozsVar = apxfVar.pY(AddRendererToItemSectionActionOuterClass.addRendererToItemSectionAction) ? (aozs) apxfVar.pX(AddRendererToItemSectionActionOuterClass.addRendererToItemSectionAction) : null;
                if (aozsVar == null) {
                    zga.b("AddRendererToItemSectionActionResolver received an action other than AddRendererToItemSectionAction.");
                    return;
                }
                int i = aozsVar.b;
                if ((i & 1) == 0) {
                    zga.b("AddRendererToItemSectionAction has no renderer.");
                    return;
                }
                if ((i & 2) != 0) {
                    aulq aulqVar = aozsVar.c;
                    if (aulqVar == null) {
                        aulqVar = aulq.a;
                    }
                    if (aulqVar.pY(ElementRendererOuterClass.elementRenderer)) {
                        pX = ajds.a((aqrf) aulqVar.pX(ElementRendererOuterClass.elementRenderer));
                    } else if (aulqVar.pY(CommentSectionRendererOuterClass.commentThreadRenderer)) {
                        pX = aulqVar.pX(CommentSectionRendererOuterClass.commentThreadRenderer);
                    } else {
                        zga.b("AddRendererToItemSectionAction contains an unsupported renderer.");
                        return;
                    }
                    this.b.e(aozsVar.d, new aach(pX, 0));
                    return;
                }
                zga.b("AddRendererToItemSectionAction has no target item section.");
                return;
            case 7:
                CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint = (CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint) apxfVar.pX(CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.commentsStreamReloadEndpoint);
                aqan aqanVar = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c;
                if (aqanVar == null) {
                    aqanVar = aqan.a;
                }
                if ((aqanVar.b & 1) != 0) {
                    xph xphVar = (xph) yjj.u(map, "sectionController", xph.class);
                    if (xphVar == null) {
                        this.b.f(new xrn(commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint));
                        return;
                    }
                    int ax = aobq.ax(commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.d);
                    if (ax == 0) {
                        ax = 1;
                    }
                    int i2 = ax - 1;
                    if (i2 == 1) {
                        aqan aqanVar2 = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c;
                        if (aqanVar2 == null) {
                            aqanVar2 = aqan.a;
                        }
                        aulm aulmVar = aqanVar2.c;
                        if (aulmVar == null) {
                            aulmVar = aulm.a;
                        }
                        xphVar.lz(aulmVar, null);
                        return;
                    }
                    if (i2 != 2) {
                        aqan aqanVar3 = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c;
                        if (aqanVar3 == null) {
                            aqanVar3 = aqan.a;
                        }
                        aulm aulmVar2 = aqanVar3.c;
                        if (aulmVar2 == null) {
                            aulmVar2 = aulm.a;
                        }
                        xphVar.lt(ahbj.o(aulmVar2));
                        return;
                    }
                    aqan aqanVar4 = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c;
                    if (aqanVar4 == null) {
                        aqanVar4 = aqan.a;
                    }
                    aulm aulmVar3 = aqanVar4.c;
                    if (aulmVar3 == null) {
                        aulmVar3 = aulm.a;
                    }
                    xphVar.r(aulmVar3, Math.max(0, commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.f));
                    return;
                }
                return;
            case 8:
                final aulo auloVar = apxfVar.pY(RemoveRendererFromItemSectionActionOuterClass.removeRendererFromItemSectionAction) ? (aulo) apxfVar.pX(RemoveRendererFromItemSectionActionOuterClass.removeRendererFromItemSectionAction) : null;
                if (auloVar == null) {
                    zga.b("RemoveRendererFromItemSectionActionResolver received an action other than RemoveRendererFromItemSectionAction.");
                    return;
                } else {
                    if (auloVar.b == 1) {
                        this.b.d(aacl.a(new ammy() { // from class: xrb
                            /* JADX WARN: Removed duplicated region for block: B:10:0x005c A[RETURN] */
                            /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
                            @Override // defpackage.ammy
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final boolean a(java.lang.Object r5) {
                                /*
                                    r4 = this;
                                    aulo r0 = defpackage.aulo.this
                                    int r1 = defpackage.gvl.a
                                    boolean r1 = r5 instanceof defpackage.ajds
                                    r2 = 0
                                    if (r1 != 0) goto La
                                    goto L5d
                                La:
                                    ajds r5 = (defpackage.ajds) r5
                                    aqrf r5 = r5.a
                                    byte[] r5 = defpackage.ajdx.a(r5)
                                    if (r5 != 0) goto L16
                                L14:
                                    r5 = 0
                                    goto L4b
                                L16:
                                    aomw r1 = defpackage.ajdx.a     // Catch: java.lang.Throwable -> L14
                                    awos r3 = defpackage.awos.a     // Catch: java.lang.Throwable -> L14
                                    aonm r5 = defpackage.aonm.parseFrom(r3, r5, r1)     // Catch: java.lang.Throwable -> L14
                                    awos r5 = (defpackage.awos) r5     // Catch: java.lang.Throwable -> L14
                                    awqd r5 = r5.c     // Catch: java.lang.Throwable -> L14
                                    if (r5 != 0) goto L26
                                    awqd r5 = defpackage.awqd.a     // Catch: java.lang.Throwable -> L14
                                L26:
                                    aonk r1 = defpackage.awob.b     // Catch: java.lang.Throwable -> L14
                                    java.lang.Object r5 = r5.pX(r1)     // Catch: java.lang.Throwable -> L14
                                    awob r5 = (defpackage.awob) r5     // Catch: java.lang.Throwable -> L14
                                    awog r5 = r5.e     // Catch: java.lang.Throwable -> L14
                                    if (r5 != 0) goto L34
                                    awog r5 = defpackage.awog.a     // Catch: java.lang.Throwable -> L14
                                L34:
                                    byte[] r5 = r5.toByteArray()
                                    aomk r5 = defpackage.aomk.O(r5)
                                    boolean r1 = r5.E()
                                    if (r1 == 0) goto L43
                                    goto L14
                                L43:
                                    int r5 = r5.n()
                                    int r5 = defpackage.aoqp.a(r5)
                                L4b:
                                    int r1 = r0.b
                                    r3 = 1
                                    if (r1 != r3) goto L59
                                    java.lang.Object r0 = r0.c
                                    java.lang.Integer r0 = (java.lang.Integer) r0
                                    int r0 = r0.intValue()
                                    goto L5a
                                L59:
                                    r0 = 0
                                L5a:
                                    if (r5 != r0) goto L5d
                                    return r3
                                L5d:
                                    return r2
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.xrb.a(java.lang.Object):boolean");
                            }
                        }));
                        return;
                    }
                    return;
                }
            case 9:
                if (!apxfVar.pY(ReplaceItemSectionHeaderActionOuterClass.replaceItemSectionHeaderAction)) {
                    zga.b("ReplaceItemSectionHeaderActionResolver receives an unknown command");
                    return;
                }
                auma aumaVar = (auma) apxfVar.pX(ReplaceItemSectionHeaderActionOuterClass.replaceItemSectionHeaderAction);
                int i3 = aumaVar.b;
                if ((i3 & 1) == 0) {
                    zga.b("ReplaceItemSectionHeaderAction doesn't contain a new header");
                    return;
                }
                if ((i3 & 2) == 0) {
                    zga.b("ReplaceItemSectionHeaderAction doesn't contain the target item section");
                    return;
                }
                ypa ypaVar2 = this.b;
                String str = aumaVar.d;
                askb askbVar = aumaVar.c;
                if (askbVar == null) {
                    askbVar = askb.a;
                }
                ypaVar2.e(str, new aacn(askbVar));
                return;
            case 10:
                AddToToastActionOuterClass$AddToToastAction addToToastActionOuterClass$AddToToastAction = (AddToToastActionOuterClass$AddToToastAction) apxfVar.pX(AddToToastActionOuterClass$AddToToastAction.addToToastAction);
                aozx aozxVar = addToToastActionOuterClass$AddToToastAction.b;
                if (aozxVar == null) {
                    aozxVar = aozx.a;
                }
                if ((aozxVar.b & 2) == 0) {
                    aozx aozxVar2 = addToToastActionOuterClass$AddToToastAction.b;
                    if (aozxVar2 == null) {
                        aozxVar2 = aozx.a;
                    }
                    if ((aozxVar2.b & 1) != 0) {
                        aozx aozxVar3 = addToToastActionOuterClass$AddToToastAction.b;
                        if (aozxVar3 == null) {
                            aozxVar3 = aozx.a;
                        }
                        atnzVar = aozxVar3.c;
                        if (atnzVar == null) {
                            atnzVar = atnz.a;
                        }
                    }
                    this.b.d(aaci.d(atnzVar, map));
                    return;
                }
                ypa ypaVar3 = this.b;
                aozx aozxVar4 = addToToastActionOuterClass$AddToToastAction.b;
                if (aozxVar4 == null) {
                    aozxVar4 = aozx.a;
                }
                atnc atncVar = aozxVar4.d;
                if (atncVar == null) {
                    atncVar = atnc.a;
                }
                ypaVar3.d(aaci.c(atncVar, map));
                return;
            case 11:
                Object s2 = yjj.s(map, "com.google.android.libraries.youtube.innertube.action.HideEnclosingAction.tag");
                if (s2 == null) {
                    s2 = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
                }
                if (s2 == null) {
                    zga.l(String.valueOf(getClass().getName()).concat(": attempted to route with null tag"));
                    return;
                } else {
                    this.b.d(aacj.a(s2));
                    return;
                }
            case 12:
                final HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand = (HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand) apxfVar.pX(HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.hideItemSectionVideosByIdCommand);
                if ((hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.b & 1) != 0) {
                    this.b.d(aacl.a(new ammy() { // from class: aack
                        @Override // defpackage.ammy
                        public final boolean a(Object obj) {
                            HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand2 = HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.this;
                            int i4 = gvl.a;
                            String str2 = hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand2.c;
                            if (obj instanceof aqdb) {
                                return str2.equals(((aqdb) obj).c);
                            }
                            return false;
                        }
                    }));
                    return;
                }
                return;
            case 13:
                this.b.d(abix.a(ammv.i(yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag")), (ToggleConversationActionOuterClass$ToggleConversationAction) apxfVar.pX(ToggleConversationActionOuterClass$ToggleConversationAction.toggleConversationAction)));
                return;
            case 14:
                Object s3 = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
                if (s3 instanceof akjb) {
                    akjb akjbVar = (akjb) s3;
                    Object obj = akjbVar.b;
                    if (!akjbVar.a) {
                        this.b.d(new akjr());
                    }
                    s3 = obj;
                }
                if (s3 != null) {
                    this.b.d(aacl.b(s3));
                    return;
                }
                return;
            default:
                Object s4 = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
                if (s4 instanceof akjb) {
                    s4 = ((akjb) s4).b;
                }
                if (s4 != null) {
                    this.b.d(aacl.b(s4));
                    return;
                }
                return;
        }
    }
}
