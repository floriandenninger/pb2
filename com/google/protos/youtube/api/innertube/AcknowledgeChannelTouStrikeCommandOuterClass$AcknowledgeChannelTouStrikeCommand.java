package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apst;
import defpackage.apxf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand extends aonm implements aooz {
    public static final AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand a;
    public static final aonk acknowledgeChannelTouStrikeCommand;
    private static volatile aopf c;
    public apst b;
    private int d;

    static {
        AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand acknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand = new AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand();
        a = acknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand;
        aonm.registerDefaultInstance(AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.class, acknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand);
        acknowledgeChannelTouStrikeCommand = aonm.newSingularGeneratedExtension(apxf.a, acknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand, acknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand, null, 230421059, aoqn.MESSAGE, AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.class);
    }

    private AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.class) {
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
