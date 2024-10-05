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
import defpackage.asaq;
import defpackage.asce;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetSurveyCommandOuterClass$GetSurveyCommand extends aonm implements aooz {
    public static final GetSurveyCommandOuterClass$GetSurveyCommand a;
    private static volatile aopf d;
    public static final aonk getSurveyCommand;
    public asce b;
    public int c;
    private int e;

    static {
        GetSurveyCommandOuterClass$GetSurveyCommand getSurveyCommandOuterClass$GetSurveyCommand = new GetSurveyCommandOuterClass$GetSurveyCommand();
        a = getSurveyCommandOuterClass$GetSurveyCommand;
        aonm.registerDefaultInstance(GetSurveyCommandOuterClass$GetSurveyCommand.class, getSurveyCommandOuterClass$GetSurveyCommand);
        getSurveyCommand = aonm.newSingularGeneratedExtension(apxf.a, getSurveyCommandOuterClass$GetSurveyCommand, getSurveyCommandOuterClass$GetSurveyCommand, null, 284673439, aoqn.MESSAGE, GetSurveyCommandOuterClass$GetSurveyCommand.class);
    }

    private GetSurveyCommandOuterClass$GetSurveyCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"e", "b", "c", asaq.e});
            case NEW_MUTABLE_INSTANCE:
                return new GetSurveyCommandOuterClass$GetSurveyCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (GetSurveyCommandOuterClass$GetSurveyCommand.class) {
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
