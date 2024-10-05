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
public final class DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand extends aonm implements aooz {
    public static final DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand a;
    private static volatile aopf d;
    public static final aonk dismissSfvElementsBottomSheetCommand;
    public int b;
    public apxf c;
    private byte e = 2;

    static {
        DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand dismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand = new DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand();
        a = dismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand;
        aonm.registerDefaultInstance(DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.class, dismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand);
        dismissSfvElementsBottomSheetCommand = aonm.newSingularGeneratedExtension(apxf.a, dismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand, dismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand, null, 323826788, aoqn.MESSAGE, DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.class);
    }

    private DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.class) {
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
