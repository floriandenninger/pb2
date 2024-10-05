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
import defpackage.auze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SubmitSurveyCommandOuterClass$SubmitSurveyCommand extends aonm implements aooz {
    public static final SubmitSurveyCommandOuterClass$SubmitSurveyCommand a;
    private static volatile aopf f;
    public static final aonk submitSurveyCommand;
    public auze b;
    public String c = "";
    public boolean d;
    public boolean e;
    private int g;

    static {
        SubmitSurveyCommandOuterClass$SubmitSurveyCommand submitSurveyCommandOuterClass$SubmitSurveyCommand = new SubmitSurveyCommandOuterClass$SubmitSurveyCommand();
        a = submitSurveyCommandOuterClass$SubmitSurveyCommand;
        aonm.registerDefaultInstance(SubmitSurveyCommandOuterClass$SubmitSurveyCommand.class, submitSurveyCommandOuterClass$SubmitSurveyCommand);
        submitSurveyCommand = aonm.newSingularGeneratedExtension(apxf.a, submitSurveyCommandOuterClass$SubmitSurveyCommand, submitSurveyCommandOuterClass$SubmitSurveyCommand, null, 288174649, aoqn.MESSAGE, SubmitSurveyCommandOuterClass$SubmitSurveyCommand.class);
    }

    private SubmitSurveyCommandOuterClass$SubmitSurveyCommand() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"g", "b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new SubmitSurveyCommandOuterClass$SubmitSurveyCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (SubmitSurveyCommandOuterClass$SubmitSurveyCommand.class) {
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
