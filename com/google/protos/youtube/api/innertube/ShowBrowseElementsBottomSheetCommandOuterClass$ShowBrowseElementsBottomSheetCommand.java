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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand extends aonm implements aooz {
    public static final ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand a;
    private static volatile aopf f;
    public static final aonk showBrowseElementsBottomSheetCommand;
    public apxf b;
    public aqyg c;
    private int g;
    private aqyg h;
    private byte i = 2;
    public float d = 1.0f;
    public float e = 1.0f;

    static {
        ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand = new ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand();
        a = showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand;
        aonm.registerDefaultInstance(ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.class, showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand);
        showBrowseElementsBottomSheetCommand = aonm.newSingularGeneratedExtension(apxf.a, showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand, showBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand, null, 372633595, aoqn.MESSAGE, ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.class);
    }

    private ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"g", "b", "c", "h", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.class) {
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
