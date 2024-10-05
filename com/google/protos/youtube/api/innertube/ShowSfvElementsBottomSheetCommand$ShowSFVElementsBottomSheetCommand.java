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
import defpackage.aqyg;
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand extends aonm implements aooz {
    public static final ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand a;
    private static volatile aopf f;
    public static final aonk showSfvElementsBottomSheetCommand;
    public aulq b;
    public aqyg c;
    private int g;
    private byte h = 2;
    public float d = 1.0f;
    public float e = 1.0f;

    static {
        ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand = new ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand();
        a = showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand;
        aonm.registerDefaultInstance(ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.class, showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand);
        showSfvElementsBottomSheetCommand = aonm.newSingularGeneratedExtension(apxf.a, showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand, showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand, null, 324622913, aoqn.MESSAGE, ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.class);
    }

    private ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"g", "b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.class) {
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
