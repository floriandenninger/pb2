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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand extends aonm implements aooz {
    public static final HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand a;
    private static volatile aopf d;
    public static final aonk hideItemSectionVideosByIdCommand;
    public int b;
    public String c = "";

    static {
        HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand = new HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand();
        a = hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand;
        aonm.registerDefaultInstance(HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.class, hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand);
        hideItemSectionVideosByIdCommand = aonm.newSingularGeneratedExtension(apxf.a, hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand, hideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand, null, 228198035, aoqn.MESSAGE, HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.class);
    }

    private HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
