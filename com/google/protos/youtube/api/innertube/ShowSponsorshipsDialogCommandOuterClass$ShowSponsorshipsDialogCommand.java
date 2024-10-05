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
public final class ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand extends aonm implements aooz {
    public static final ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand a;
    private static volatile aopf c;
    public static final aonk showSponsorshipsDialogCommand;
    public apxf b;
    private int d;
    private byte e = 2;

    static {
        ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand = new ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand();
        a = showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand;
        aonm.registerDefaultInstance(ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.class, showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand);
        showSponsorshipsDialogCommand = aonm.newSingularGeneratedExtension(apxf.a, showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand, showSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand, null, 209133170, aoqn.MESSAGE, ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.class);
    }

    private ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.class) {
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
