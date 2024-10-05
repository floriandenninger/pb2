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
public final class AccountLinkCommandOuterClass$AccountLinkCommand extends aonm implements aooz {
    public static final AccountLinkCommandOuterClass$AccountLinkCommand a;
    public static final aonk accountLinkCommand;
    private static volatile aopf g;
    public int b;
    public apxf c;
    public apxf d;
    private apxf h;
    private byte i = 2;
    public String e = "";
    public aony f = aonm.emptyProtobufList();

    static {
        AccountLinkCommandOuterClass$AccountLinkCommand accountLinkCommandOuterClass$AccountLinkCommand = new AccountLinkCommandOuterClass$AccountLinkCommand();
        a = accountLinkCommandOuterClass$AccountLinkCommand;
        aonm.registerDefaultInstance(AccountLinkCommandOuterClass$AccountLinkCommand.class, accountLinkCommandOuterClass$AccountLinkCommand);
        accountLinkCommand = aonm.newSingularGeneratedExtension(apxf.a, accountLinkCommandOuterClass$AccountLinkCommand, accountLinkCommandOuterClass$AccountLinkCommand, null, 194259413, aoqn.MESSAGE, AccountLinkCommandOuterClass$AccountLinkCommand.class);
    }

    private AccountLinkCommandOuterClass$AccountLinkCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0006\u001a", new Object[]{"b", "c", "d", "e", "h", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new AccountLinkCommandOuterClass$AccountLinkCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (AccountLinkCommandOuterClass$AccountLinkCommand.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
