package com.google.protos.youtube.api.innertube;

import defpackage.aomf;
import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aony;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.aota;
import defpackage.apxf;
import defpackage.aqyg;
import defpackage.aulq;
import defpackage.aweb;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand extends aonm implements aooz {
    public static final ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand a;
    private static volatile aopf k;
    public static final aonk showWebViewDialogCommand;
    public boolean c;
    public aqyg e;
    public aulq f;
    public boolean g;
    public boolean h;
    public int i;
    private int l;
    private aota m;
    private byte n = 2;
    public String b = "";
    public aony d = emptyProtobufList();
    public aomf j = aomf.b;

    static {
        ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand = new ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand();
        a = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;
        aonm.registerDefaultInstance(ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.class, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand);
        showWebViewDialogCommand = aonm.newSingularGeneratedExtension(apxf.a, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand, null, 243963315, aoqn.MESSAGE, ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.class);
    }

    private ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0004\u0001ဈ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ဇ\u0001\u0005Л\u0006ᐉ\u0007\u0007ည\b\bဇ\u0004\tဌ\u0006\nဇ\u0005", new Object[]{"l", "b", "e", "f", "c", "d", apxf.class, "m", "j", "g", "i", aweb.c, "h"});
            case NEW_MUTABLE_INSTANCE:
                return new ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
