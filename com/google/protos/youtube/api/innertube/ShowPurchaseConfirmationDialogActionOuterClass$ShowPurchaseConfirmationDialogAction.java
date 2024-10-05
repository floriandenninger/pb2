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
import defpackage.auue;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction extends aonm implements aooz {
    public static final ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction a;
    private static volatile aopf b;
    public static final aonk showPurchaseConfirmationDialogAction;
    private int c;
    private auue d;
    private byte e = 2;

    static {
        ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction showPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction = new ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction();
        a = showPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction;
        aonm.registerDefaultInstance(ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.class, showPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction);
        showPurchaseConfirmationDialogAction = aonm.newSingularGeneratedExtension(apxf.a, showPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction, showPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction, null, 116405387, aoqn.MESSAGE, ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.class);
    }

    private ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
