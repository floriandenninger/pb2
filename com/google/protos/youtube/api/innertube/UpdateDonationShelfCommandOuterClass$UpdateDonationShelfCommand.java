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
public final class UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand extends aonm implements aooz {
    public static final UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand a;
    private static volatile aopf c;
    public static final aonk updateDonationShelfCommand;
    public aulq b;
    private int d;
    private aulq e;
    private byte f = 2;

    static {
        UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand updateDonationShelfCommandOuterClass$UpdateDonationShelfCommand = new UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand();
        a = updateDonationShelfCommandOuterClass$UpdateDonationShelfCommand;
        aonm.registerDefaultInstance(UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.class, updateDonationShelfCommandOuterClass$UpdateDonationShelfCommand);
        updateDonationShelfCommand = aonm.newSingularGeneratedExtension(apxf.a, updateDonationShelfCommandOuterClass$UpdateDonationShelfCommand, updateDonationShelfCommandOuterClass$UpdateDonationShelfCommand, null, 219123099, aoqn.MESSAGE, UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.class);
    }

    private UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"d", "b", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.class) {
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
