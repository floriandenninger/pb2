package com.google.protos.youtube.api.innertube;

import defpackage.aomf;
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
public final class OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand extends aonm implements aooz {
    public static final OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand a;
    private static volatile aopf c;
    public static final aonk openSuperStickerBuyFlowCommand;
    public aomf b = aomf.b;
    private int d;

    static {
        OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand openSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand = new OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand();
        a = openSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand;
        aonm.registerDefaultInstance(OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.class, openSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand);
        openSuperStickerBuyFlowCommand = aonm.newSingularGeneratedExtension(apxf.a, openSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand, openSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand, null, 198340511, aoqn.MESSAGE, OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.class);
    }

    private OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
