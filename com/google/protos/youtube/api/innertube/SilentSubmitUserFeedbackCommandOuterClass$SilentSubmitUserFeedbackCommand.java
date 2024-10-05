package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aoot;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apxf;
import defpackage.auut;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand extends aonm implements aooz {
    public static final SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand a;
    private static volatile aopf d;
    public static final aonk silentSubmitUserFeedbackCommand;
    private int e;
    public aoot c = aoot.a;
    public String b = "";

    static {
        SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand = new SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand();
        a = silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand;
        aonm.registerDefaultInstance(SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.class, silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand);
        silentSubmitUserFeedbackCommand = aonm.newSingularGeneratedExtension(apxf.a, silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand, silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand, null, 193239995, aoqn.MESSAGE, SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.class);
    }

    private SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဈ\u0000\u00022", new Object[]{"e", "b", "c", auut.a});
            case NEW_MUTABLE_INSTANCE:
                return new SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.class) {
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
