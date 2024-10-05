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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CommerceActionCommandOuterClass$CommerceActionCommand extends aonm implements aooz {
    public static final CommerceActionCommandOuterClass$CommerceActionCommand a;
    public static final aonk commerceActionCommand;
    private static volatile aopf i;
    public int b;
    public apxf f;
    public apxf g;
    public boolean h;
    private byte j = 2;
    public String c = "";
    public String d = "";
    public aony e = aonm.emptyProtobufList();

    static {
        CommerceActionCommandOuterClass$CommerceActionCommand commerceActionCommandOuterClass$CommerceActionCommand = new CommerceActionCommandOuterClass$CommerceActionCommand();
        a = commerceActionCommandOuterClass$CommerceActionCommand;
        aonm.registerDefaultInstance(CommerceActionCommandOuterClass$CommerceActionCommand.class, commerceActionCommandOuterClass$CommerceActionCommand);
        commerceActionCommand = aonm.newSingularGeneratedExtension(apxf.a, commerceActionCommandOuterClass$CommerceActionCommand, commerceActionCommandOuterClass$CommerceActionCommand, null, 354960961, aoqn.MESSAGE, CommerceActionCommandOuterClass$CommerceActionCommand.class);
    }

    private CommerceActionCommandOuterClass$CommerceActionCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0002\u0001ဈ\u0001\u0002\u001a\u0003ᐉ\u0003\u0004ဇ\u0004\u0005ᐉ\u0002\u0006ဈ\u0000", new Object[]{"b", "d", "e", "g", "h", "f", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new CommerceActionCommandOuterClass$CommerceActionCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (CommerceActionCommandOuterClass$CommerceActionCommand.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
