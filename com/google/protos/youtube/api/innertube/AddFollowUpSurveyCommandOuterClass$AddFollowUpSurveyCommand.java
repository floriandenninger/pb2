package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aony;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apxf;
import defpackage.aqyg;
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand extends aonm implements aooz {
    public static final AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand a;
    public static final aonk addFollowUpSurveyCommand;
    private static volatile aopf e;
    public int b;
    public aqyg d;
    private byte f = 2;
    public aony c = emptyProtobufList();

    static {
        AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand = new AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand();
        a = addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand;
        aonm.registerDefaultInstance(AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.class, addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand);
        addFollowUpSurveyCommand = aonm.newSingularGeneratedExtension(apxf.a, addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand, addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand, null, 194801007, aoqn.MESSAGE, AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.class);
    }

    private AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"b", "c", aulq.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
