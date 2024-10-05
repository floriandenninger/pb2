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
import defpackage.atbk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ModifyReportFormCommandOuterClass$ModifyReportFormCommand extends aonm implements aooz {
    public static final ModifyReportFormCommandOuterClass$ModifyReportFormCommand a;
    private static volatile aopf c;
    public static final aonk modifyReportFormCommand;
    public int b;
    private int d;

    static {
        ModifyReportFormCommandOuterClass$ModifyReportFormCommand modifyReportFormCommandOuterClass$ModifyReportFormCommand = new ModifyReportFormCommandOuterClass$ModifyReportFormCommand();
        a = modifyReportFormCommandOuterClass$ModifyReportFormCommand;
        aonm.registerDefaultInstance(ModifyReportFormCommandOuterClass$ModifyReportFormCommand.class, modifyReportFormCommandOuterClass$ModifyReportFormCommand);
        modifyReportFormCommand = aonm.newSingularGeneratedExtension(apxf.a, modifyReportFormCommandOuterClass$ModifyReportFormCommand, modifyReportFormCommandOuterClass$ModifyReportFormCommand, null, 171313789, aoqn.MESSAGE, ModifyReportFormCommandOuterClass$ModifyReportFormCommand.class);
    }

    private ModifyReportFormCommandOuterClass$ModifyReportFormCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "b", atbk.t});
            case NEW_MUTABLE_INSTANCE:
                return new ModifyReportFormCommandOuterClass$ModifyReportFormCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (ModifyReportFormCommandOuterClass$ModifyReportFormCommand.class) {
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
