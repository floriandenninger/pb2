package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apxf;
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand extends aonm implements aooz {
    public static final ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand a;
    private static volatile aopf f;
    public static final aonk showSponsorshipsEngagementPanelCommand;
    public int b;
    public aulq d;
    public apxf e;
    private byte g = 2;
    public String c = "";

    static {
        ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand = new ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand();
        a = showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand;
        aonm.registerDefaultInstance(ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.class, showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand);
        showSponsorshipsEngagementPanelCommand = aonm.newSingularGeneratedExtension(apxf.a, showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand, showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand, null, 200394150, aoqn.MESSAGE, ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.class);
    }

    private ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ဈ\u0000", new Object[]{"b", "d", "e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
