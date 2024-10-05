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
import defpackage.auqy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand extends aonm implements aooz {
    public static final UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand a;
    private static volatile aopf g;
    public static final aonk updateShareSheetCommand;
    public int b;
    public apxf f;
    private byte h = 2;
    public String c = "";
    public int d = 1;
    public String e = "";

    static {
        UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand updateShareSheetCommandOuterClass$UpdateShareSheetCommand = new UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand();
        a = updateShareSheetCommandOuterClass$UpdateShareSheetCommand;
        aonm.registerDefaultInstance(UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand.class, updateShareSheetCommandOuterClass$UpdateShareSheetCommand);
        updateShareSheetCommand = aonm.newSingularGeneratedExtension(apxf.a, updateShareSheetCommandOuterClass$UpdateShareSheetCommand, updateShareSheetCommandOuterClass$UpdateShareSheetCommand, null, 387863284, aoqn.MESSAGE, UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand.class);
    }

    private UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", auqy.e, "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand.class) {
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
