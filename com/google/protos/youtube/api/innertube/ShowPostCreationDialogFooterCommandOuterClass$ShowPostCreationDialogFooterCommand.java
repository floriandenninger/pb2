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
public final class ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand extends aonm implements aooz {
    public static final ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand a;
    private static volatile aopf d;
    public static final aonk showPostCreationDialogFooterCommand;
    public int b;
    public aulq c;
    private byte e = 2;

    static {
        ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand showPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand = new ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand();
        a = showPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand;
        aonm.registerDefaultInstance(ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.class, showPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand);
        showPostCreationDialogFooterCommand = aonm.newSingularGeneratedExtension(apxf.a, showPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand, showPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand, null, 369262379, aoqn.MESSAGE, ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.class);
    }

    private ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.class) {
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
