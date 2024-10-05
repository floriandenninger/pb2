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
public final class DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand extends aonm implements aooz {
    public static final DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand a;
    private static volatile aopf d;
    public static final aonk dismissBrowseElementsBottomSheetCommand;
    public int b;
    public apxf c;
    private byte e = 2;

    static {
        DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand dismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand = new DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand();
        a = dismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand;
        aonm.registerDefaultInstance(DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand.class, dismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand);
        dismissBrowseElementsBottomSheetCommand = aonm.newSingularGeneratedExtension(apxf.a, dismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand, dismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand, null, 373014159, aoqn.MESSAGE, DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand.class);
    }

    private DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand.class) {
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
