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
import defpackage.aweb;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WebviewAuthCommand$WebViewAuthCommand extends aonm implements aooz {
    public static final WebviewAuthCommand$WebViewAuthCommand a;
    private static volatile aopf e;
    public static final aonk webViewAuthCommand;
    public int b;
    public int c;
    public String d = "";

    static {
        WebviewAuthCommand$WebViewAuthCommand webviewAuthCommand$WebViewAuthCommand = new WebviewAuthCommand$WebViewAuthCommand();
        a = webviewAuthCommand$WebViewAuthCommand;
        aonm.registerDefaultInstance(WebviewAuthCommand$WebViewAuthCommand.class, webviewAuthCommand$WebViewAuthCommand);
        webViewAuthCommand = aonm.newSingularGeneratedExtension(apxf.a, webviewAuthCommand$WebViewAuthCommand, webviewAuthCommand$WebViewAuthCommand, null, 386457349, aoqn.MESSAGE, WebviewAuthCommand$WebViewAuthCommand.class);
    }

    private WebviewAuthCommand$WebViewAuthCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", aweb.d, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new WebviewAuthCommand$WebViewAuthCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (WebviewAuthCommand$WebViewAuthCommand.class) {
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
