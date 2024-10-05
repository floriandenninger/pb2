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
import defpackage.apew;
import defpackage.apud;
import defpackage.aqyg;
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PasswordAuthRendererOuterClass$PasswordAuthRenderer extends aonm implements aooz {
    public static final PasswordAuthRendererOuterClass$PasswordAuthRenderer a;
    private static volatile aopf n;
    public static final aonk passwordAuthRenderer;
    public int b;
    public aqyg c;
    public int e;
    public boolean f;
    public aqyg g;
    public aqyg h;
    public aqyg j;
    public apud k;
    public aulq l;
    public int m;
    private aota o;
    private byte p = 2;
    public aony d = emptyProtobufList();
    public aomf i = aomf.b;

    static {
        PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer = new PasswordAuthRendererOuterClass$PasswordAuthRenderer();
        a = passwordAuthRendererOuterClass$PasswordAuthRenderer;
        aonm.registerDefaultInstance(PasswordAuthRendererOuterClass$PasswordAuthRenderer.class, passwordAuthRendererOuterClass$PasswordAuthRenderer);
        passwordAuthRenderer = aonm.newSingularGeneratedExtension(aulq.a, passwordAuthRendererOuterClass$PasswordAuthRenderer, passwordAuthRendererOuterClass$PasswordAuthRenderer, null, 196176225, aoqn.MESSAGE, PasswordAuthRendererOuterClass$PasswordAuthRenderer.class);
    }

    private PasswordAuthRendererOuterClass$PasswordAuthRenderer() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0007\u0001ᐉ\u0000\u0002Л\u0003င\u0001\u0004ဇ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bည\u0006\tᐉ\u0007\nဉ\b\u000bᐉ\t\fဌ\n", new Object[]{"b", "c", "d", aqyg.class, "e", "f", "g", "h", "o", "i", "j", "k", "l", "m", apew.i});
            case NEW_MUTABLE_INSTANCE:
                return new PasswordAuthRendererOuterClass$PasswordAuthRenderer();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (PasswordAuthRendererOuterClass$PasswordAuthRenderer.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
