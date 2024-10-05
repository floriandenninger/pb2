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
public final class AccountUnlinkCommandOuterClass$AccountUnlinkCommand extends aonm implements aooz {
    public static final AccountUnlinkCommandOuterClass$AccountUnlinkCommand a;
    public static final aonk accountUnlinkCommand;
    private static volatile aopf f;
    public int b;
    public apxf c;
    public apxf d;
    private apxf g;
    private byte h = 2;
    public String e = "";

    static {
        AccountUnlinkCommandOuterClass$AccountUnlinkCommand accountUnlinkCommandOuterClass$AccountUnlinkCommand = new AccountUnlinkCommandOuterClass$AccountUnlinkCommand();
        a = accountUnlinkCommandOuterClass$AccountUnlinkCommand;
        aonm.registerDefaultInstance(AccountUnlinkCommandOuterClass$AccountUnlinkCommand.class, accountUnlinkCommandOuterClass$AccountUnlinkCommand);
        accountUnlinkCommand = aonm.newSingularGeneratedExtension(apxf.a, accountUnlinkCommandOuterClass$AccountUnlinkCommand, accountUnlinkCommandOuterClass$AccountUnlinkCommand, null, 194259476, aoqn.MESSAGE, AccountUnlinkCommandOuterClass$AccountUnlinkCommand.class);
    }

    private AccountUnlinkCommandOuterClass$AccountUnlinkCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new AccountUnlinkCommandOuterClass$AccountUnlinkCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (AccountUnlinkCommandOuterClass$AccountUnlinkCommand.class) {
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
