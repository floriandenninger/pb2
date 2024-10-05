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
public final class ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand extends aonm implements aooz {
    public static final ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand a;
    private static volatile aopf e;
    public static final aonk showAccountLinkDialogFromDeepLinkCommand;
    public int b;
    public apxf c;
    public long d;
    private byte f = 2;

    static {
        ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand = new ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand();
        a = showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand;
        aonm.registerDefaultInstance(ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.class, showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand);
        showAccountLinkDialogFromDeepLinkCommand = aonm.newSingularGeneratedExtension(apxf.a, showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand, showAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand, null, 370101185, aoqn.MESSAGE, ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.class);
    }

    private ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.class) {
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
