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
public final class ProfileCardCommandOuterClass$ProfileCardCommand extends aonm implements aooz {
    public static final ProfileCardCommandOuterClass$ProfileCardCommand a;
    private static volatile aopf f;
    public static final aonk profileCardCommand;
    public boolean d;
    private int g;
    public String b = "";
    public String c = "";
    public String e = "";

    static {
        ProfileCardCommandOuterClass$ProfileCardCommand profileCardCommandOuterClass$ProfileCardCommand = new ProfileCardCommandOuterClass$ProfileCardCommand();
        a = profileCardCommandOuterClass$ProfileCardCommand;
        aonm.registerDefaultInstance(ProfileCardCommandOuterClass$ProfileCardCommand.class, profileCardCommandOuterClass$ProfileCardCommand);
        profileCardCommand = aonm.newSingularGeneratedExtension(apxf.a, profileCardCommandOuterClass$ProfileCardCommand, profileCardCommandOuterClass$ProfileCardCommand, null, 214503604, aoqn.MESSAGE, ProfileCardCommandOuterClass$ProfileCardCommand.class);
    }

    private ProfileCardCommandOuterClass$ProfileCardCommand() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"g", "b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new ProfileCardCommandOuterClass$ProfileCardCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (ProfileCardCommandOuterClass$ProfileCardCommand.class) {
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
