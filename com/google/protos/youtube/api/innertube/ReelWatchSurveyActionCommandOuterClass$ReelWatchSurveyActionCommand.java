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
import defpackage.aujj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand extends aonm implements aooz {
    public static final ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand a;
    private static volatile aopf d;
    public static final aonk reelWatchSurveyActionCommand;
    public String b = "";
    public int c;
    private int e;

    static {
        ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand reelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand = new ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand();
        a = reelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand;
        aonm.registerDefaultInstance(ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.class, reelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand);
        reelWatchSurveyActionCommand = aonm.newSingularGeneratedExtension(apxf.a, reelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand, reelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand, null, 326347078, aoqn.MESSAGE, ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.class);
    }

    private ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"e", "b", "c", aujj.u});
            case NEW_MUTABLE_INSTANCE:
                return new ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.class) {
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
