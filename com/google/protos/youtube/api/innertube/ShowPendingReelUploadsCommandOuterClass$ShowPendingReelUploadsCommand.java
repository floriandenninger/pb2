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
public final class ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand extends aonm implements aooz {
    public static final ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand a;
    private static volatile aopf e;
    public static final aonk showPendingReelUploadsCommand;
    public int b;
    public aulq c;
    public apxf d;
    private byte f = 2;

    static {
        ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand = new ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand();
        a = showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand;
        aonm.registerDefaultInstance(ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.class, showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand);
        showPendingReelUploadsCommand = aonm.newSingularGeneratedExtension(apxf.a, showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand, showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand, null, 291405045, aoqn.MESSAGE, ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.class);
    }

    private ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
