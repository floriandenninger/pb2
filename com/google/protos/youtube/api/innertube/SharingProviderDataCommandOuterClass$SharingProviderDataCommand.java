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
public final class SharingProviderDataCommandOuterClass$SharingProviderDataCommand extends aonm implements aooz {
    public static final SharingProviderDataCommandOuterClass$SharingProviderDataCommand a;
    private static volatile aopf g;
    public static final aonk sharingProviderDataCommand;
    public int b;
    public boolean d;
    public apxf e;
    public apxf f;
    private byte h = 2;
    public String c = "";

    static {
        SharingProviderDataCommandOuterClass$SharingProviderDataCommand sharingProviderDataCommandOuterClass$SharingProviderDataCommand = new SharingProviderDataCommandOuterClass$SharingProviderDataCommand();
        a = sharingProviderDataCommandOuterClass$SharingProviderDataCommand;
        aonm.registerDefaultInstance(SharingProviderDataCommandOuterClass$SharingProviderDataCommand.class, sharingProviderDataCommandOuterClass$SharingProviderDataCommand);
        sharingProviderDataCommand = aonm.newSingularGeneratedExtension(apxf.a, sharingProviderDataCommandOuterClass$SharingProviderDataCommand, sharingProviderDataCommandOuterClass$SharingProviderDataCommand, null, 377332428, aoqn.MESSAGE, SharingProviderDataCommandOuterClass$SharingProviderDataCommand.class);
    }

    private SharingProviderDataCommandOuterClass$SharingProviderDataCommand() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new SharingProviderDataCommandOuterClass$SharingProviderDataCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (SharingProviderDataCommandOuterClass$SharingProviderDataCommand.class) {
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
