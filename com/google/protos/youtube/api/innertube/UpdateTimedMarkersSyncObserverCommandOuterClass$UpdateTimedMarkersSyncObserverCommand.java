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
public final class UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand extends aonm implements aooz {
    public static final UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand a;
    private static volatile aopf g;
    public static final aonk updateTimedMarkersSyncObserverCommand;
    public int b;
    public boolean c;
    public apxf f;
    private byte h = 2;
    public String d = "";
    public String e = "";

    static {
        UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand = new UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand();
        a = updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand;
        aonm.registerDefaultInstance(UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.class, updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand);
        updateTimedMarkersSyncObserverCommand = aonm.newSingularGeneratedExtension(apxf.a, updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand, updateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand, null, 376871121, aoqn.MESSAGE, UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.class);
    }

    private UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.class) {
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
