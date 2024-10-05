package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.aqyg;
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer extends aonm implements aooz {
    public static final PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer a;
    private static volatile aopf f;
    public static final aonk passwordBiometricAuthRenderer;
    public int b;
    public aulq c;
    public aqyg d;
    public boolean e;
    private byte g = 2;

    static {
        PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer = new PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer();
        a = passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer;
        aonm.registerDefaultInstance(PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.class, passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer);
        passwordBiometricAuthRenderer = aonm.newSingularGeneratedExtension(aulq.a, passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer, passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer, null, 310393920, aoqn.MESSAGE, PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.class);
    }

    private PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.class) {
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
